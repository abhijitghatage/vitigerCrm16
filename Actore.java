import java.util.Scanner;
class Actore 
{
	String name;
	int id;
    int cno;
	Actore(String s1,int h1,int c1)
	{
		name=s1;
		id=h1;
		cno=c1;
	}

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Name");
	 String a1=sc.next();
	 System.out.println("Enter ID");
	 int a2=sc.nextInt();
	 System.out.println("Enter a  Contact Number");
	 int a3=sc.nextInt();
	 Actore A=new Actore(a1,a2,a3);
	 System.out.println(A.name);
	 System.out.println(A.id);
     System.out.println(A.cno);



	}
}
