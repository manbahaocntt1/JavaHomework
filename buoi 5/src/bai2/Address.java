package bai2;
import java.util.Scanner;
public class Address {

	private static Scanner sc= new Scanner (System.in);
	private String  district, province;
	private String id;
	public void setProvince(String province)
	{
		this.province=province;
		
	}
	public String getProvince()
	{
		return province;
	}
	public void input()
	{
		System.out.println("Nhap ma id dia chi: ");
		id= sc.nextLine();
		System.out.println("Nhap quan/huyen: ");
		district= sc.nextLine();
		System.out.println("Nhap tinh: ");
		province= sc.nextLine();
		
	}
	public void output()
	{
		System.out.println(id+" / "+district+" / "+province);
		
	}
}
