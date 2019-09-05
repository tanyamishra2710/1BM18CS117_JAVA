import java.util.*;
class book
{
	String name,author;
	float price;
	int nop;
	book()
	{
		name="";
		author="";
		price=0;
		nop=0;
	}
	void setdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter book name: ");
		name=s.nextLine();
		System.out.println("Enter book author: ");
		author=s.nextLine();
		System.out.println("Enter book price: ");
		price=s.nextFloat();
		System.out.println("Enter number of pages: ");
		nop=s.nextInt();
	}		
	public String toString()
	{
		return ("\nName:" +name+ "\nAuthor:" +author+ "\nPrice:" +price+ "\nNumber of pages:" +nop+ "\n");
	}
}

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
