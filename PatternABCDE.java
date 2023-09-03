package com.kodnest.newpatterns;

public class PatternABCDE {

	public static void main(String[] args) {
		
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 || j == n|| i == n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if//(j==0 ||(i==0 && j==1)||(i==0&& j==2)||(i==0&& j==3)||(i==0 && j==4)||j==n/2||(i==5 && j==1)||(i==5&& j==2)||(i==5&& j==3)||(i==5 && j==4)|| (i==n && j==1)||(i==n&& j==2)||(i==n&& j==3)||(i==n && j==4))
				(i==0||j==0||i==n/2||j==n||i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 || i == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 || j == n|| i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("========================================");

		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 || i == n|| i == n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
