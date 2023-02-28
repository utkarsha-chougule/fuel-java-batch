class array3 { 
   public static void main(String [] args)
   {
    int []p=new int[100];//initialize array size is 100
	p[0]=10;
	p[1]=20;
	p[2]=30;
	p[3]=40;
	p[4]=50;
	p[5]=60;
	p[6]=70;
	p[7]=80;
	p[8]=90;
	p[9]=100;
	
	for ( int a:p)
		System.out.println(a);//print all array value
	}
 }