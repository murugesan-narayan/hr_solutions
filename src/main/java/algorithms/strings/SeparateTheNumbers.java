package algorithms.strings;

public class SeparateTheNumbers {
    static void separateNumbers(String s) {
        if (s.length()<2) {
            System.out.println("NO");
            return;
        }
        String firstValStr = null;
        boolean isSuper = true;
        for (int i = 1; i <= s.length()/2; i++) {
            firstValStr = s.substring(0,i);
            long firstVal = Long.parseLong(firstValStr);
            long nextVal = firstVal + 1;
            String nextValStr = Long.toString(nextVal);
            int ic = i;
            while (true) {
                int index = s.indexOf(nextValStr, ic);
                if (index != ic) {
                    isSuper = false;
                    break;
                }
                isSuper = true;
                ic = ic + nextValStr.length();
                if (ic > s.length()-1)
                    break;
                nextVal += 1;
                nextValStr = Long.toString(nextVal);
            }
            if (isSuper) break;
        }
        String result = isSuper ? "YES " + firstValStr: "NO";
        System.out.println(result);
    }
}
