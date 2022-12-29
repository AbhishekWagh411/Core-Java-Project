package com.Abstract;

import java.util.Scanner;

public class Main {
private static Scanner sc;

public static void main(String[] args) {
	Pay p1= new Ppay(8000, "Abhi", 41100);
	sc = new Scanner(System.in);
	System.out.println("1 : Deposit \n"+ "2 : withdraw \n"+"3 : Show balance");
	System.out.println("Enter which ation needed");
	int x= sc.nextInt();

	if(x==1){
		p1.deposit();
	}else 
		if(x==2){
			p1.withdraw();
	}else
		if(x==3){
		p1.showBalnce();
	}else 
		System.out.println("Not a specific Number");
}
}
