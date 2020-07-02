package eltest;

import java.io.*;
import java.util.*;
import java.util.regex.*;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'ioWrapper' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING route
     *  2. STRING url
     */

    public static String ioWrapper(String route, String url) {
        // Write your code here
        Pattern urlPattern = Pattern.compile("(?<scheme>https?)://(?<host>[^:^/]*)(?<port>:\\d*)?(?<path>/.*)?");
        Matcher urlMatcher = urlPattern.matcher(url);
        String EMPTY_JSON = "{}";
        if (!urlMatcher.find()) {
            System.out.println("Invalid Url!");
            return EMPTY_JSON;
        }
        List<String> responseList = new ArrayList<>();
        responseList.add(getJsonPropertyFormat("scheme", urlMatcher.group("scheme")));
        responseList.add(getJsonPropertyFormat("host", urlMatcher.group("host")));
        String path = urlMatcher.group("path");
        if (path == null) path = "/";
        responseList.add(getJsonPropertyFormat("path", path));

        List<String> paramList = new ArrayList<>();
        List<String> urlPathSplitList = splitPath(path);
        System.out.println("urlPathSplitList = " + urlPathSplitList);
        List<String> routePathSplitList = splitPath(route);
        System.out.println("routePathSplitList = " + routePathSplitList);

        if (urlPathSplitList.size() > routePathSplitList.size()) {
            System.out.println("Invalid Path!(Path Size Mismatch)");
            return EMPTY_JSON;
        }
        for (int i = 0; i < routePathSplitList.size(); i++) {
            String rSplitPath = routePathSplitList.get(i);
            if (rSplitPath.endsWith("[")) rSplitPath = rSplitPath.replace("[", "");
            boolean optionalParam = false;
            if (rSplitPath.startsWith(":") && rSplitPath.endsWith("]")) {
                optionalParam = true;
                rSplitPath = rSplitPath.replace("]", "");
                System.out.println(rSplitPath + " is optional path param!");
            }
            String uSplitPath = null;
            try {
                uSplitPath = urlPathSplitList.get(i);
            } catch (IndexOutOfBoundsException e) {
                if (!optionalParam) {
                    System.out.println("Invalid Path!(Path Missing)");
                    return EMPTY_JSON;
                }
            }
            if (rSplitPath.startsWith(":")) {
                if (optionalParam && uSplitPath == null) continue;
                paramList.add(getJsonPropertyFormat(rSplitPath.substring(1), uSplitPath));
                continue;
            }
            if (!rSplitPath.equals(uSplitPath)) {
                System.out.println("Invalid Path!(Path Not Matching)");
                return EMPTY_JSON;
            }
        }
        String parameters = getJsonObjectFormat(paramList);
        responseList.add("\"parameters\":" + parameters);
        return getJsonObjectFormat(responseList);
    }

    private static String getJsonPropertyFormat(String key, String value) {
        return "\"" + key + "\":\"" + value + "\"";
    }

    private static String getJsonObjectFormat(List<String> list) {
        return "{" + String.join(", ", list) + "}";
    }

    private static List<String> splitPath(String path) {
        String[] urlPathSplitArr = path.split("/");
        return Arrays.stream(urlPathSplitArr).filter((s) -> !s.isEmpty()).collect(toList());
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String route = bufferedReader.readLine();

        String url = bufferedReader.readLine();

        String result = Result.ioWrapper(route, url);
        System.out.println("result = " + result);
        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}



/*
        /
        /:lang
        /:lang/products
        /:lang/products/:id
        /:lang/products/:id/compare/:compareId
        /:lang/products/:id/images[/:imageId]


        /:lang
        https://www.expertlead.com/de

        {"scheme":"https","host":"www.expertlead.com","path":"/de","parameters":{"lang":"de"}}

        http://www.google.com/de/products/5/compare/7
        http://www.google.com/de/products/5/images/1
 */