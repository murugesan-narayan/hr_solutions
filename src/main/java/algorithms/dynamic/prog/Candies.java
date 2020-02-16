package algorithms.dynamic.prog;

public class Candies {
    static long candies1(int n, int[] arr) {
        long count = 0;
        int prevRatingCandies = 0;
        for (int i = 0; i < n; i++) {
            int rating = arr[i];
            if (i == 0) prevRatingCandies = 1;
            else if (rating > arr[i-1]) prevRatingCandies += 1;
            else if (i < n-1 && rating > arr[i+1]) {
                prevRatingCandies = 2;
            } else prevRatingCandies = 1;
            count += prevRatingCandies;
            System.out.print(prevRatingCandies);
        }
        return count;
    }

    static long candies(int n, int[] arr) {
        int[] candiesArray = new int[n];

        //Declare how much the first person starts with.
        candiesArray[0]=1;
        long sumCandies = 0;

        //Loop forward -->
        for( int i = 1 ; i < n ; i++ ) {
            if( arr[i] > arr[i-1] ){
                candiesArray[i]=candiesArray[i-1]+1;
            } else {
                candiesArray[i]=1;
            }
        }

        //Loop back <--
        for (int i = n-2; i>=0; i--){
            if(arr[i] > arr[i+1] && candiesArray[i] <= candiesArray[i+1]){
                candiesArray[i] = candiesArray[i+1] + 1;
            }
            sumCandies += candiesArray[i];
        }

        sumCandies += candiesArray[n-1];

        return sumCandies;
    }
}
