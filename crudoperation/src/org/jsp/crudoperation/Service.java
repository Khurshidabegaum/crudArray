package org.jsp.crudoperation;

import java.util.Scanner;

public class Service
{

	Product[] arr;
	int k=0;
	Scanner ip=new Scanner(System.in);
	
	void createDatabase(int size)
	{
		arr=new Product[size];
		System.out.println("data base jas been created with");
	}
	
	void addProduct()
	{
		System.out.println("======Adding Into Database======");
		if(k==arr.length)
		{
			System.out.println("Database is Full");
		}
		else
		{
			System.out.println("enter the product id:");
			int pid =ip.nextInt();
			System.out.println("enter product name:");
			String pname=ip.next();
			System.out.println("Enter Product price");
			double price=ip.nextDouble();
			System.out.println("enter product company");
			String company=ip.next();
			System.out.println("enter the quantity");
			int qt=ip.nextInt();
			Product p=new Product(pid,pname,price,company,qt);
			arr[k]=p;
			k++;
			System.out.println("product had been added into the database...!!");
			
		}
		System.out.println("===========================================");
	}
	void findby()
	{
		System.out.println("===========================");
		System.out.println("enter the id:-");
		int c=0;
		int pid=ip.nextInt();
		for(Product ele:arr)
		{
			System.out.println("pid:"+ele.getPid());
			System.out.println("pname:"+ele.getPname());
			System.out.println("price:"+ele.getPrice());
			System.out.println("Company:"+ele.getCompany());
			System.out.println("qt:"+ele.getQt());
			c++;
			break;
			
		}
		
	
	if(c==0)
	{
		System.out.println("ID Not Found");
	}
	System.out.println("===============================");
	
}
}