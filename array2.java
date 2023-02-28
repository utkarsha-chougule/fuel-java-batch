class array2
{
   public static void main(String [] args)
    {  
	  int [] a=new int [7];//initialize array size is 7
	  a[0]=10;
	  a[1]=20;
	  a[2]=30;
	  a[3]=40;
	  a[4]=50;
	  a[5]=60;
	  a[6]=70;
	  for ( int i=0;i<a.length;i++)
	  {
		  if (i==5){    //print upto 5
			  break;
		  }
	   System.out.println(a[i]);
	   }
	   }
	   }