package thirtydays;

import java.util.Arrays;

public class Day14Scope {
/**
 *
 * //@param elements

Difference(int [] elements){
this.elements=elements;
}

void computeDifference() {
int maxNum = elements[0];
int minNum = maxNum;
for (int i = 1; i < elements.length; i++) {

maxNum=elements[i]>maxNum?elements[i]:maxNum;
minNum=elements[i]>minNum?minNum:elements[i];

}
maximumDifference=Math.abs(maxNum-minNum);
}
 */
static int[] testScores;
public static void main(String[] args) {
    double average = Arrays.stream(testScores).average().getAsDouble();
}
}