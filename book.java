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

