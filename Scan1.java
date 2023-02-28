import java.util.Scanner;
class Scan1{
	public static void main (String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter FirstName");
		String f=s.nextLine();
		System.out.println("Enter lastname");
		String l= s.nextLine();
		System.out.println("Enter Your city");
		String c= s.nextLine();
		System.out.println("Enter your current Address");
		String a= s.nextLine();
		
		System.out.println("Enter your Email id");
		String e =s.nextLine();
		System.out.println("Enter your DOB");
		String d =s.nextLine();
		System.out.println("Enter your Degree");
		String q =s.nextLine();
		
		System.out.println("Enter your SKills");
		String z =s.nextLine();
		
		System.out.println("Enter your Contact number");
		long n =s.nextLong();
		
		
		System.out.println("Enter your percentage");
		double p =s.nextDouble();
		
		
		
		System.out.println("--------------------------------");
		System.out.println(f);
		System.out.println(l);
		System.out.println(c);
		System.out.println(a);
		System.out.println(n);
		System.out.println(e);
		System.out.println(d);
		System.out.println(q);
		System.out.println(p);
		System.out.println(z);
		
		
	}
}