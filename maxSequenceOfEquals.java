import java.util.Scanner;

public class maxSequenceOfEquals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		
		int[]  arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();	
		}
		int max=0;
		int curr=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				curr++;
			}else {
				if(max<curr) {
				max=curr;}
				curr=1;
			}
			
		}
		if(max<curr) {
			max=curr;}
		System.out.println("The max sequence is:"+max);
		
		// TODO Auto-generated method stub

	}

}
