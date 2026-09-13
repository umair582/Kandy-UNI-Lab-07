import java.util.Scanner;
public class lab7q1a{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		double mark1,mark2,mark3,mark4,avg;
		String Grade="invalid";
		int count;
		count = 1;
		while(count<4)
		{
			avg=0.00;
			System.out.println("Student"+count+":");
			System.out.println("Enter the mark1");
			mark1=input.nextDouble();
			System.out.println("Enter the mark2");
			mark2=input.nextDouble();
			System.out.println("Enter the mark3");
			mark3=input.nextDouble();
			System.out.println("Enter the mark4");
			mark4=input.nextDouble();
			
			avg=(mark1+mark2+mark3+mark4)/4.00;
			
			if(avg<0||avg>100)
			{
				System.out.println("invalid");
			}
			else if(avg>75)
			{
				Grade="Distinction";
			}
			else if(avg>50)
			{
				Grade="Credit";
			}
		    else
			{
				Grade="Fail";
			}
			System.out.println("Grade:"+Grade);
			count++;
		}
	}
}
			