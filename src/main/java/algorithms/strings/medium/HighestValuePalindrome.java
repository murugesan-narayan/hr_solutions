package algorithms.strings.medium;

public class HighestValuePalindrome {
    static String highestValuePalindrome(String s, int n, int k) {
        char[] arr = s.toCharArray();
        int x = 0;
        int i = 0;
        int j = n-1;

        while(j>i){
            int num1 = (int)s.charAt(i) - (int)'0';
            int num2 = (int)s.charAt(j) - (int)'0';

            if(num1 == num2){
                i++;
                j--;
            }
            else if(num1 > num2){
                arr[j] = (char)(num1 + (int)'0');
                x++;
                i++;
                j--;
            }
            else{
                arr[i] = (char)(num2 + (int)'0');
                x++;
                i++;
                j--;
            }
        }

        if(x > k)
            return "-1";
        else if(x == k)
            return new String(arr);
        else{
            i = 0;
            j = n-1;
            while(j>i && x<k){
                if(s.charAt(i) == s.charAt(j)){
                    if(x<k-1 && s.charAt(i) != '9'){
                        arr[i] = (char)(9+(int)'0');
                        arr[j] = (char)(9+(int)'0');
                        x = x+2;
                        i++;
                        j--;
                    }
                    else{
                        i++;
                        j--;
                    }
                }
                else{
                    if(arr[i] != '9'){
                        arr[i] = (char)(9+(int)'0');
                        arr[j] = (char)(9+(int)'0');
                        x++;
                        i++;
                        j--;
                    }else{
                        i++;
                        j--;
                    }
                }
            }

            if(x < k){
                if(n%2 != 0){
                    arr[n/2] = (char)(9+(int)'0');
                }
            }
            return new String(arr);
        }
    }
}
