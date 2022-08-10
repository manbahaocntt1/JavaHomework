package bai2;
import java.util.Scanner;
public class Student {

	private static Scanner sc= new Scanner (System.in);
	private String  name;
	private int id, age;
	private Address address = new Address();
	private static int x=1;
	Student ()
	{
		id=x++;
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public Address getAddress()
	{
		return address;
		
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public void input()
	{
	
		System.out.println("Nhap ho ten hoc sinh: ");
		name=sc.nextLine();
		System.out.println("Nhap tuoi hoc sinh: ");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap thong tin dia chi: ");
		address.input();

	}
	public void output()
	{
		System.out.println("Ma ID: "+id+"\nHo ten: "+name+"\nTuoi: "+age);
		System.out.print("Dia Chi: ");
		address.output();
	}
}