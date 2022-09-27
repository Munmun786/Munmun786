package problem3.jv;

import java.util.Scanner;

public class Series2 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
			
			//Enter first number value
			int x = input.nextInt();
			int j = 1;
			if(x%2==0) {
				for(int i = 1; i<x ; i++) {
					System.out.print(j);
					System.out.print(',');
				    j=j+2;	
				}

			}
			else {
				for(int i = 1; i<=x ; i++) {
					System.out.print(j);
					System.out.print(',');
				    j=j+2;	
				}
			}
			
			input.close();
		}

	}

