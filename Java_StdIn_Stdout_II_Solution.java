import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();
        double myDouble = sc.nextDouble();
        sc.nextLine();
        String myStr = sc.nextLine();
        sc.close();
        
        System.out.println("String: " + myStr);    
        System.out.println("Double: " + myDouble);    
        System.out.println("Int: " + myInt);    
    }
    
}
