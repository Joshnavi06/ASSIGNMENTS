package com.kodnest.newpatterns;

public class PatternFGHIJ {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 ||i == n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
        
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 || i==n || (j==n&&i==5)||(j==n&&i==6)||(j==n&&i==7)||(j==n&&i==8)||(j==n&&i==9)||(i==5&&j==5)||(i==5&&j==6)||(i==5&&j==7)||(i==5&&j==8)||(i==5&&j==9))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0 || j==n || i == n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if( i==0||i==n||j == n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j == n/2 ||(i==n&&j==1)||(i==n&&j==0)||(i==n&& j==2)||(i==n&&j==3)||(i==n&&j==4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
