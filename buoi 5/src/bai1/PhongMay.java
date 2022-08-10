package bai1;
import java.util.Scanner;
public class PhongMay {

	private static Scanner sc= new Scanner (System.in);
	private String maPhong, tenPhong;
	private double dienTich;
	QuanLy x = new QuanLy ();
	May y=new May ();
	
	public void input()
	{
		System.out.println("Nhap ma phong: ");
		maPhong= sc.nextLine();
		System.out.println("Nhap ten phong: ");
		tenPhong= sc.nextLine();
		System.out.println("Nhap dien tich phong: ");
		dienTich= sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap thong tin quan ly: ");
		x.input();
		System.out.println("Nhap thong tin may: ");
		y.input();
		
		
	}
	public void output()
	{
		System.out.println("\t\t\tTHONG TIN PHONG MAY");
		System.out.println("Ma Phong: "+maPhong+"\t\t Ten Phong: "+tenPhong);
		System.out.println("Dien Tich: "+dienTich);
		System.out.println("Thong tin quan ly:");
		x.output();
		System.out.println();
		y.output();
		
	}

}
