package bai1;

import java.util.Scanner;

public class QuanLy {
	private static Scanner sc= new Scanner (System.in);
	private String maQL, hoTen;
	
	public void input()
	{
		System.out.println("Nhap ma quan ly: ");
		maQL= sc.nextLine();
		System.out.println("Nhap ho ten quan ly: ");
		hoTen= sc.nextLine();
		
	}
	public void output()
	{
		System.out.println("Ma quan ly: "+maQL+"\nHo ten: "+hoTen);
	}
	
}
