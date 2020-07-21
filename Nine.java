package Assignment2;

public class Nine {

	public static void main(String[] args) {
		int space=0;
		for(int i = 6;i>=1;i-- , space++) {
			
			for(int a =0;a<=space;a++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i; j++) {
				System.out.print(j);
			}
			
			
			for(int l=(i-1);l>0;l--) {
				System.out.print(l);
			}
			
			System.out.println();
		}
		
	}

}
