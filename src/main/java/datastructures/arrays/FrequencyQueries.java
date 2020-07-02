package datastructures.arrays;

import java.io.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FrequencyQueries {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream("src/main/java/datastructures/arrays/data.txt")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("q = " + q);//1000000
        List<List<Integer>> queries = new ArrayList<>();
        /*for (int i = 0; i < q; i++) {
            String arr[] = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int qt = Integer.parseInt(arr[0]);
            int val = Integer.parseInt(arr[1]);
            List<Integer> list = new ArrayList<>();
            list.add(qt);
            list.add(val);
            queries.add(list);
        }*/
        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        System.out.println("queries.size() = " + queries.size());//1000000
        /*        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1, 1));
        queries.add(Arrays.asList(2, 2));
        queries.add(Arrays.asList(3, 2));
        queries.add(Arrays.asList(1, 1));
        queries.add(Arrays.asList(1, 1));
        queries.add(Arrays.asList(2, 1));
        queries.add(Arrays.asList(3, 2));*/
        LocalDateTime lts = LocalDateTime.now();
        System.out.println("Start: "+lts);

        List<Integer> response = new ArrayList<>();
        Map<Integer, Integer> dataMap = new HashMap<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for(List<Integer> query : queries) {
            int type = query.get(0);
            int num = query.get(1);
            if (type == 1) {
                int currCount = dataMap.getOrDefault(num, 0);
                dataMap.put(num, currCount + 1);
                countMap.put(currCount + 1, countMap.getOrDefault(currCount + 1,0) + 1);
                if (currCount > 0) countMap.put(currCount, countMap.getOrDefault(currCount,0) - 1);
            } else if (type == 2) {
                int currCount = dataMap.getOrDefault(num, 0);
                if (currCount == 0) System.out.println("currCount == 0");
                else if (currCount == 1) {
                    dataMap.remove(num);
                    countMap.put(currCount, countMap.getOrDefault(currCount,0) - 1);
                } else if (currCount > 1) {
                    dataMap.put(num, currCount - 1);
                    countMap.put(currCount, countMap.getOrDefault(currCount,0) - 1);
                    countMap.put(currCount-1, countMap.getOrDefault(currCount-1,0) + 1);
                }
            } else if (type == 3) {
                int found = countMap.getOrDefault(num,0);
                response.add(found>0?1:0);
            }
        }
        LocalDateTime ets = LocalDateTime.now();
        //System.out.println("Start: "+lts);
        System.out.println("End  : "+ets);
        long millis = ChronoUnit.MILLIS.between(lts, ets);
        System.out.println(millis);
        System.out.println("response = " + response);

    }

}
