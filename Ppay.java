package com.Abstract;

import java.util.Scanner;

public class Ppay extends Pay{
double balance;
String name ;
double upiPin;
private Scanner sc;
private Scanner sc2;
public Ppay(double balance, String name, double upiPin) {
	this.balance = balance;
	this.name = name;
	this.upiPin = upiPin;
}
	boolean authentication() {
		sc = new Scanner(System.in);
		System.out.println("Enter upiPin: ");
		double upiPin=sc.nextDouble();
		if(this.upiPin==upiPin){
			return true;
		}else
			System.out.println("Error");
		return	false;	
}
	double deposit() {
		sc2 = new Scanner(System.in);
		System.out.println("Enter Amount to deposit:");
		double balance = sc2.nextDouble();
		System.out.println(balance+" Amount Deposited Succesfully");
		this.balance= this.balance +balance;
		return this.balance;
}
	double withdraw() {		
		sc2 = new Scanner(System.in);
		System.out.println("Enter Amount to withdraw:");
		double balance= sc2.nextDouble();
		if(authentication())
		System.out.println(balance+" Withdrawn Succesfully");
		this.balance=this.balance-balance;
		
	return this.balance;
}
	double showBalnce(){
		System.out.println("Show Balance: ");
		authentication();
		System.out.println("Balance is: "+this.balance);
	return this.balance;
	}
}


