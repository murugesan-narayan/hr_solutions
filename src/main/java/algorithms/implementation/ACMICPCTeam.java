package algorithms.implementation;

public class ACMICPCTeam {
    static int[] acmTeam(String[] topic) {
        int maxTopics = 0;
        int maxWays = 0;
        for (int i = 0; i < topic.length -1; i++) {
            for (int j = i+1; j < topic.length; j++) {
                int count = 0;
                for (int k = 0; k < topic[0].length(); k++) {
                    if (topic[i].charAt(k) == '1'
                            || topic[j].charAt(k) == '1')
                        count++;
                }
                if (count > maxTopics) {
                    maxTopics = count;
                    maxWays = 1;
                }  else if (count == maxTopics)
                    maxWays++;
            }
        }
        int[] result = new int[]{maxTopics, maxWays};
        return result;
    }
}
