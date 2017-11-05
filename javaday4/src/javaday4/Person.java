package javaday4;

public class Person implements PersonInterface,EmployeeInterface {

	int m= 3;
	int s= 5;
	int x=0;
	public String getPerson(){
		return "aya";
	};
	public void printInfo(){
		System.out.println("name");

	};
	public void getName(String name){
		System.out.println("name");
	}
	int id=1234567;
    public void sumOfTwo(int m, int s){
    	// this.x=this.m+this.s;
    	System.out.println(m+s);
		

    }
	public void printPhone(){
    	System.out.println("phone");
	}



}
