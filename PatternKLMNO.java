package com.kodnest.newpatterns;

public class PatternKLMNO {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||(i==4&&j==1)||(i==3&&j==2)||(i==2&&j==3)||(i==1&&j==4)||(i==0&&j==5)||(i==6&&j==1)||(i==7&&j==2)||(i==8&&j==3)||(i==9&&j==4)||(i==n&&j==5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0 || i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||(i==1&&j==1)||(i==2&&j==2)||(i==3&&j==3)||(i==4&&j==4)||(i==5&&j==5)||(i==4&&j==6)||(i==3&&j==7)||(i==2&&j==8)||(i==1&&j==9)||(i==0&&j==n)||j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0 || j==n||(i==1&&j==1)||(i==2&&j==2)||(i==3&&j==3)||(i==4&&j==4)||(i==5&&j==5)||(i==6&&j==6)||(i==7&&j==7)||(i==8&&j==8)||(i==9&&j==9))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0 || j == n|| i ==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
