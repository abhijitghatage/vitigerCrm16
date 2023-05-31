import java.util.Scanner;
class Bag
{
   String colour;
   double price;
   laptop l;
   Scanner sc=new Scanner(System.in);
   public Bag(String c1,double p1)
   {
    colour=c1;
	price=p1;
   }
   public void getLaptopDetails()
   {
	   if(l==null)
		   System.out.println("please first add a laptop");
	   else
	   {
		   System.out.println(l.name);
		   System.out.println(l.price);
	   }
   }
	   public void getBagDetails()
	   {
		   System.out.println(colour);
		   System.out.println(price);

	   }
	   public void addLaptop()
	   {
		   if (l==null)
		   {
			   		   System.out.println("enter name of laptop");
					   String name=sc.next();
					   System.out.println("enter price of laptop");
					   double price=sc.nextDouble();
					   l=new laptop(name,price);
					   System.out.println("laptop is added in the bag");


		   }
		   else
		   {
			   System.out.println("sorry!!!!!! laptop is alredy existed");
			   
		   }
	   }
	   public void removeLaptop()
	   {
		   if(l==null)
		   {
			  System.out.println("please first add Laptop");
		   }
		   else
		   {
		       l=null;
			  System.out.println("laptop is removed now bag is empty");
		   }
	   }
   
}
