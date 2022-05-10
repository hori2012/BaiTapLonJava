package Bai_tap;

import java.util.Scanner;

public class Bai_2_6 {
	// cau a: So ky tu so trong ma tran
	public static int Count_Number(char arr[][], int n, int m) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] >= '0' && arr[i][j] <= '9') {
					count++;
				}
			}
		}
		return count;
	}

	// cau b: chuyen cac ky tu mot cot thanh hoa
	public static char[][] Upper_Character(char arr[][], int n, int m, int column) {

		char answer[][] = new char[n][m];
		answer = arr;
		for (int i = 0; i < n; i++) {
			if (arr[i][column - 1] >= 97 && arr[i][column - 1] <= 122) {
				arr[i][column - 1] = (char) (arr[i][column - 1] - 32);
			}
		}
		return answer;
	}

	// dem so lan xuat hien cua mot ky tu duong cheo chinh
	public static int Count_character(char arr[], char c) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c) {
				count++;
			}
		}
		return count;
	}

	// cau c: tim ky tu xuat hien nhieu nhat tren hai duong cheo
	public static void Character_Multi(char arr[][], int n, int m) {
		int count = 0;
		char answer[] = new char[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i][i];
			count++;
		}
		int j = answer.length - count;
		int right = arr.length - 1, left = 0;
		while (left < arr.length) {
			answer[j] = arr[left][right];
			left += 1;
			right -= 1;
			j++;
		}
		int max_multi = Count_character(answer, answer[0]);
		char c = answer[0];
		for (int i = 1; i < answer.length; i++) {
			if (max_multi < Count_character(answer, answer[i])) {
				max_multi = Count_character(answer, answer[i]);
				c = answer[i];
			}
		}
		System.out.println("" + c + " appears time " + max_multi + "---->>> Most in two diagonal");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char arr[][] = { { '1', '2', 'w', '3' }, { '3', 's', 'd', '3' }, { 'w', 's', 'd', 'e' },
				{ 'e', '4', 'g', 'd' } };
		int n = arr.length;
		int m = arr[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

		// cau a
		System.out.println("Number of numeric character in aray: " + Count_Number(arr, n, m));
		// cau b
		System.out.print("Enter number column : ");
		int column = 3; 
				//sc.nextInt();
		System.out.println("After convert :");
		char answer[][] = Upper_Character(arr, n, m, column);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println("");
		}
		// cau c
		System.out.println("-------------------");
		Character_Multi(arr, n, m);
	}
}
