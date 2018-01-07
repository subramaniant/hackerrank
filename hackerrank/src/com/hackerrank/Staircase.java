package com.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 * @author subramanian
 *
 */
public class Staircase {

	static void staircase(int n) {
		for(int i=1;i<=n;i++) {
			int rem = n-i;
			for(int k=1;k<=rem;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
	}

}
