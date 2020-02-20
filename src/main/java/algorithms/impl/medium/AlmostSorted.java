package algorithms.impl.medium;

public class AlmostSorted {
    static void almostSorted(int[] arr) {
        boolean notSorted = false;
        boolean swap = false;
        boolean swapCheck = false;
        boolean descending = false;
        int d_start = -1;
        int d_end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (!descending) {
                if (i+1 == arr.length) break;
                if (arr[i+1] >= arr[i])
                    continue;
                if (d_start == -1) {
                    if (i-1 >= 0) { //43, 65, 1, 98, 99, 101
                        if (arr[i+1] < arr[i-1]){
                            notSorted = true;
                            break ;
                        }
                    }
                    descending = true;
                    d_start = i;
                } else if (swapCheck) {
                    if (i+1 == arr.length) {
                        d_end = i+1;
                        swap = true;
                        break;
                    } else if (arr[i+2] > arr[d_start]) {
                        d_end = i+1;
                        arr[i+1] = arr[d_start];
                        swap = true;
                        swapCheck = false;
                    } else {
                        notSorted = true;
                        break;
                    }
                } else {
                    notSorted = true;
                    break;
                }
            } else {
                if (arr[i-1] >= arr[i]) {
                    if (!swap && i == arr.length-1) {
                        d_end = i;
                        if (i == d_start + 1) {
                            swap = true;
                        }
                    }
                    continue;
                } else if (d_start == i-2) {
                    descending = false;
                    swapCheck = true;
                    if (d_start-1 >= 0 && arr[i] > arr[d_start-1]) {  // 1 2 4 3 5 6
                        if (arr[i] > arr[d_start]) {
                            d_end = i-1;
                            swap = true;
                        } else i--;
                        continue;
                    } else {
                        notSorted = true;
                        break;
                    }
                } else if (swap) {
                    notSorted = true;
                    break;
                }
                d_end = i-1;
                //check if reverse is fine
                if (arr[i] >= arr[d_start]) {
                    descending = false;
                    i--;
                } else {
                    notSorted = true;
                    break;
                }
            }
        }
        if (notSorted) {
            System.out.println("no");
        } else {
            System.out.println("yes");
            if (swap)
                System.out.println("swap " + (d_start + 1) + " " + (d_end + 1));
            else
                System.out.println("reverse " + (d_start + 1) + " " + (d_end + 1));
        }
    }

    /*
    def almostSorted(arr):
    sarr=sorted(arr)#sarr is sorted array to compare
    s=[]#list if non matching elements index
    for i in range(len(arr)):#To get list s
        if arr[i]!=sarr[i]:
            s.append(i)
    if len(s)==2:#Two element are misplaced
        if arr[s[0]]==sarr[s[1]] and arr[s[1]==sarr[s[0]]]:
            print('yes ')#^to check if swapping element
            print('swap',s[0]+1,s[1]+1)#sorrt the array
            return
        else:
            print('no')
            return

    for k in range(len(s)):#to cheak if sub-array element
        if arr[s[k]]!=sarr[s[len(s)-1-k]]:#reversed are equal
            print('no')
            return
    else:
        print('yes')#if not returned in for loop reverse
        print('reverse',s[0]+1,s[-1]+1)
        return
     */

}
