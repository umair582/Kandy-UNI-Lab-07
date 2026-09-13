import java.util.Scanner;
class lab7q3
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		char pymntmthd='b';
		double discount,subtotal,grandtotal;
		
		
		discount=0.00;
			subtotal=0.00;
			for(int customers=1;customers<=5;customers++)
			{
				System.out.println("customer"+customers+ ":");
				System.out.println("enter the payment method");
		
                   
				   pymntmthd= input.next().charAt(0);
				   
			discount=0.00;
			subtotal=0.00;
			
			if(pymntmthd=='c')
			{System.out.println("enter subtotal");
				subtotal=input.nextDouble();
				discount=subtotal*0.05;
			}
			else if(pymntmthd=='o'){
				System.out.println("enter subtotal");
					subtotal=input.nextDouble();
			discount=0;}
			else
			{
				System.out.println("INVALID");
			}
		
		grandtotal=subtotal-discount;
	                   System.out.println("TOTAL"+grandtotal);
			}
	}
	
	
}

				