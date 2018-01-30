import java.util.Scanner;

public class maxSumOfK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		System.out.println("Enter K:");
		int k=sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<k;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=0;j<n;j++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			sum+=max;
			
		}System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
