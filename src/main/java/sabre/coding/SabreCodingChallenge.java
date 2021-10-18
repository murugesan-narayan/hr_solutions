package sabre.coding;

import java.util.List;

public class SabreCodingChallenge {
    //void solution() {
        // Find sum of first elements from each nested list that:
        // Are even numbers AND
        // Have value more than 5
        // Examples:

        // input: [ [2, 4], [7, 9, 11] ], result: 0
        // input: [ [4, 6], [6, 8] ], result: 12
        // input: [ [6, 8], [8, 6] ], result: 14
        // input: [ [8, 6], [8, 6] ], result: 16
        // input: [ [6, 7] ], result: 6
        // input: [ [4, 8, 6], [7], [7, 8, 6] ], result: 16


    //}

    Integer sumOfFirstEvenMoreThan5ValueFromEachList(List<List<Integer>> input ) {
        int sum =0;
        for (List<Integer> sub :
                input) {
            for (int num :
                    sub) {
                if (num>5 && num%2 == 0) {
                    sum+=num;
                    break;
                }
            }
        }

        return sum;
    }

    Integer stream_sumOfFirstEvenMoreThan5ValueFromEachList(List<List<Integer>> input ) {
        return input.stream().map(
                sub -> sub.stream()
                        .filter(num -> num > 5 && num % 2 == 0)
                        .findFirst()).mapToInt(v -> v.orElse(0)).sum();
    }
}
