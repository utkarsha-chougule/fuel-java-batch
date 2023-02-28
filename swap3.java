class swap3
{
 public static void main (String []args)
  {
    int a=20;
	int b=30;
	int temp;
//	temp=a;
	//a=b;
	//b=temp;
	//System.out.println("value of b"+b+"   value of a "+a);
	
	a= a^b;
	b=a^b;
	a=a^b;
	System.out.println("value of a is:"+a+"value of b is:"+b);
	
	}
	}
	