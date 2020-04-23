import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        // String str="";
        long sum=0;
        for(int i=0;i<n.length();i++){
            sum+=Integer.parseInt(n.valueOf(n.charAt(i)))*k;
            System.out.println(sum);
        }
        // for(int i=0;i<str.length();i++){
        //     sum+=Integer.parseInt(str.valueOf(str.charAt(i)));
        //     // System.out.println(sum);
        // }
        String s1=String.valueOf(sum);
        // String s1="19";
        if(s1.length()==1){
            return (int)sum;
        }else{
         return superDigit(s1,1);
        }
        // return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
