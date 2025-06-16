package Day3;
import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		System.out.print(" ");
		
		Customer c1=new Customer();
		c1.setCustomerName(name);
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		System.out.print(c1);
		
		System.out.print("Enter Customer Id: ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name :");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		
		Customer c2=new Customer(name,city,id);
		System.out.println(c2);
		
		sc.close();
		
		
		
	}

}
