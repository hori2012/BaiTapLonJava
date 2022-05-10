package Bai_tap;

import java.util.Scanner;

public class Bai_1_6 {
	// cau a: dem so ky tu thuong trong mang
	public static int Count_Lower_Character(char arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 97 && arr[i] <= 122) {
				count++;
			}
		}
		return count;
	}
	// cau b: kiem tra mot ky tu cho truoc co trong mang khong(khong phan biet hoa thuong)
	public static int Character_Exisis(char arr[], char c) {
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] - 32) == c || (c - 32) == arr[i] || c == arr[i]) {
				//System.out.println(c + " in CharArray !!");
				return 0;
			}
		}
		return -1;
	}
	// cau c: lay ra cac ky tu viet hoa trong mang
	public static char[] Array_Upper(char arr[]) {
		int j = 0;
		char answer[] = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 65 && arr[i] <= 90) {
				answer[j] = arr[i];
				j++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		char arr[] = { 'a', 'D', 'e', 'N', 'r', 'n', 'W', 'J' };
		System.out.println("Number lower character in array : " + Count_Lower_Character(arr));
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter on character : ");
		
		char c = sc.next().charAt(0);
		if(Character_Exisis(arr, c) == 0) {
			System.out.println(c + " in CharArray !!");
		}
		else {
			System.out.println(c + " not exists in CharArray !!");
		}

		System.out.print("Array of upper character : " );
		System.out.println(Array_Upper(arr));
	}
}
