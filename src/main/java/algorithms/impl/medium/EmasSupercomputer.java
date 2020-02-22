package algorithms.impl.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class EmasSupercomputer {
    static int twoPluses(String[] grid) {
        List<List<String>> plusList = new ArrayList<>();
        int maxProduct = 0;
        for(int i = 0; i<grid.length; i++){
            char[] chars = grid[i].toCharArray();
            for(int j = 0;j<chars.length; j++){
                findPlus(grid, i, j, plusList);
            }
        }
        for(int i = 0; i< plusList.size(); i++){
            List<String> plus1 = plusList.get(i);
            for(int j = i+1; j<plusList.size();j++){
                List<String> plus2 = plusList.get(j);
                int product = plus1.size() * plus2.size();
                if(!isOverlapping(plus1, plus2) && product > maxProduct){
                    maxProduct = product;
                }

            }
        }
        return maxProduct;
    }

    public static boolean isOverlapping(List<String> big, List<String> small){
        return big.stream().anyMatch(small::contains);
    }

    static Map.Entry<String, List<String>> findMax(Map<String, List<String>> plusMap) {
        return plusMap.entrySet().stream().max(Comparator.comparingInt(e -> e.getValue().size())).get();
    }

    static void findPlus(String[] grid, int i , int j, List<List<String>> plusList){
        List<String> top = findMaxTop(grid, i, j);
        List<String> bottom = findMaxBottom(grid, i, j);
        List<String> left = findMaxLeft(grid, i, j);
        List<String> right = findMaxRight(grid, i, j);

        int min = IntStream.of(top.size(),bottom.size(),left.size(), right.size()).min().getAsInt();
        for(int l = min; l >= 0; l--){
            List<String> edges = new ArrayList<>();
            edges.add(i+""+j);
            for(int k=0; k< l; k++){
                edges.add(top.get(k));
                edges.add(bottom.get(k));
                edges.add(left.get(k));
                edges.add(right.get(k));
            }
            plusList.add(edges);
        }
    }

    static List<String> findMaxTop(String[] grid, int i , int j){
        List<String> edges = new ArrayList<>();
        for(int k = i-1; k>=0; k--){
            if(grid[k].charAt(j) == 'G')
                edges.add(k+""+j);
            else
                break;
        }
        return edges;
    }

    static List<String> findMaxBottom(String[] grid, int i , int j){
        List<String> edges = new ArrayList<>();
        for(int k = i+1; k<grid.length; k++){
            if(grid[k].charAt(j) == 'G')
                edges.add(k+""+j);
            else
                break;
        }
        return edges;
    }

    static List<String> findMaxRight(String[] grid, int i , int j){
        List<String> edges = new ArrayList<>();
        for(int k = j+1; k<grid[0].length(); k++){
            if(grid[i].charAt(k) == 'G')
                edges.add(i+""+k);
            else
                break;
        }
        return edges;
    }

    static List<String> findMaxLeft(String[] grid, int i , int j){
        List<String> edges = new ArrayList<>();
        for(int k = j-1; k>=0; k--){
            if(grid[i].charAt(k) == 'G')
                edges.add(i+""+k);
            else
                break;
        }
        return edges;
    }
}
