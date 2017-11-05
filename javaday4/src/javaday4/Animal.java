package javaday4;

public class Animal implements PersonInterface{
	int m= 3;
	int s= 5;
	int x=0;
	public String getPerson(){
		return "mazen";
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

}
