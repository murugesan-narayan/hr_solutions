package javapro;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;
class Prime {
    /*
    public void checkPrime(int... num) {
		String str = "";
		for (int n : num) {
			boolean found = true;
			if (n <= 3 && n > 1) {
				str += n + " ";
			} else {
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n % i == 0) {
						found = false;
						break;
					}
				}
				if (found && n != 1) {
					str += n + " ";
				}
			}
		}
		System.out.println(str);
	}
    */
    void checkPrime(int... nums) {
        for (int i : nums) {
            if (isPrime(i)) System.out.print(i+" ");
        }
        System.out.println();
    }
    boolean isPrime(int n) {
        if(n<=1) return false;
        double sqrOfN = Math.sqrt(n);
        for (int i=2; i<=sqrOfN; i++) if(n%i==0) return false;
        return true;
    }
}

public class PrimeChecker {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

