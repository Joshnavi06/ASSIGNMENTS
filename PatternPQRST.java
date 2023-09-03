package com.kodnest.newpatterns;

public class PatternPQRST {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 ||i == n/2||(i==1&&j==n)||(i==2&&j==n)||(i==3&&j==n)||(i==4&&j==n))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 ||i == n/2||(i==1&&j==n)||(i==2&&j==n)||(i==3&&j==n)||(i==4&&j==n)||(i==6&&j==1)||(i==7&&j==2)||(i==8&&j==3)||(i==9&&(j==4)||(i==n&&j==5)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||i == n/2||i==n||(i==1&&j==0)||(i==2&&j==0)||(i==3&&j==0)||(i==4&&j==0)||(i==6&&j==n)||(i==7&&j==n)||(i==8&&j==n)||(i==9&&j==n))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j== n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
	}

}
