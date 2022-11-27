package Lec6;

import java.util.Scanner;

public class Char_Data_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch ='a';
		int i =1;
		char ch1 =sc.next().charAt(0);
		ch++;// ch = (char)(ch+1);
		System.out.println(ch);
		ch=(char) (ch+1);
		System.out.println(ch);
	}

}
