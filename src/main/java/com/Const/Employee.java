package com.Const;

public class Employee 
{
	private Integer id;  
	private String name;  
	private Address address;//Aggregation  
	  
	public Employee() {System.out.println("def cons");}  
	  
	public Employee(Integer id, String name, Address address) 
	{  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show()
	{  
	    System.out.println(id+" "+name+" "+address.toString());  
	    //System.out.println(address.toString());  
	}  
	  
}
