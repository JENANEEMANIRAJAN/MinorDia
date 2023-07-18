package minorDiag;

import java.util.Scanner;

public class MinorDiag {
 public static int diag(int arr[][], int a) {
	        int i=0, j= a-1;
			int sum = 0; 
			while(i<a && i>=0) {
				sum = sum + arr[j][j];
			}
			return sum;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		for(int i=0; i<a; i++) {
			for (int j=0; j<a; j++) {
				
			arr[i][j] = sc.nextInt();
			
			}
			
		}
		int val = diag(arr, a);
				System.out.println(val);

		}

	

	}


