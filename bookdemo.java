import java.util.*;
class bookdemo
{
  	public static void main(String args[])
   	{
    		int i=0;
    		int ch;
     		Scanner a=new Scanner(System.in);
     		System.out.print("Enter number of objects: ");
     		int n=a.nextInt();
     		book b[]=new book[10];
     		while(i<n)
       		{ 
         		b[i]=new book();
			b[i].setdata(); 
         		System.out.println("Book "+(i+1));
         		System.out.println(b[i]);
         		i++;
           	}
         }
}
