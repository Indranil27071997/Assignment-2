package beginingJava;
import java.util.*;
public class AscendingArray {
	public static void main(String[] args) {
		int n, t;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers in array:");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.print("Ascending Order of given Array:");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);
	}


	}


