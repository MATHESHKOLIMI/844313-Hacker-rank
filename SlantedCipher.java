
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SlantedCipher {

    // Complete the pairs function below.
    public String pairs(int n,String str) {
        int as=str.length()/n;
        String rstr="";
        char[][] ch1=new char[n][as];
        char[] ch=str.toCharArray();
        int k=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<as;j++) {
        		if(k<str.length()) {
        			ch1[i][j]=ch[k++];
        			System.out.print(ch1[i][j]);
        		}
        		
        	}
        	System.out.println();
        }
        int kl=0;int cl=0;int tcl=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<as;j++) {
        		
        		if(ch1[kl%n][tcl%as]!='_') {
        			rstr+=ch1[kl%n][tcl%as];
        		}else {
        			rstr+=" ";
        		}
        		kl++;
        		if(kl%n==0) {
        			cl++;
        			tcl=cl;
        		}
        		else {
        		   tcl++;
        		}
        	}
        }
       
    	return rstr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
//        String[] arrItems = scanner.nextLine().split(" ");
    	int n=scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String str=scanner.nextLine();
//        Pairs p=new Pairs();
        SlantedCipher p=new SlantedCipher();
        System.out.println(p.pairs(n,str));
        

        scanner.close();
    }
}
