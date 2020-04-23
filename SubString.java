import java.util.Scanner;

public class SubString {
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String str =new String();
//	String str1=new String();
	str=sc.nextLine();
//	boolean complete=false;
	int overCount=0;
	int count=0;
	String str2="";
	int k=sc.nextInt();
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			String str1=str.substring(i,j);
			char[] ch1;
			if(str1.length()>=k && (str1.length()%k==0)) {
				str2=str1;
				ch1=str2.toCharArray();
//				for(int ic=0;ic<ch1.length;ic++) {
//					System.out.print(ch1[ic]+ " ");
//				}
//			System.out.println(str1);
			 count =0;
			for(int ik=0;ik<str1.length()-1;ik++) {
				for(int jk=ik+1;jk<str1.length();jk++) {
					if(ch1[ik]!='0') {
					if(ch1[ik]==ch1[jk]) {
						ch1[ik]='0';
						ch1[jk]='0';
						count++;
					}
						
					}
				}
//				ch1[ik]='0';
				System.out.println("count "+count);
//				for(int jk=ik+1;jk<str1.length();jk++) {
//					if(ch1[ik]==ch1[jk]&&ch1[ik]!='0'&&ch1[jk]!='0') {
//						System.out.println("1 "+ch1[ik]+" 2 "+ch1[jk]);
////						ch1[ik]='0';
//						ch1[jk]='0';
//						count++;
//					}
//				}
//				ch1[ik]='0';
//				System.out.println("count "+count);
			}
			if(count==(str1.length()/k) ){
//				if(complete) {
				System.out.println(str1);
					overCount++;
					}
			
			}
		}	
	}
	System.out.println(overCount);
	
	}

}
