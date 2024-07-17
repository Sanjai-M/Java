import java.util.*;

class Main{
	
	public static void main(String[] args){
		
		//Input getting
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a:");
		a=sc.nextInt();
		System.out.printf("enter b:");
		b=sc.nextInt();
		System.out.print("enter c:");
		c=sc.nextInt();

		//ASCII getting
		System.out.print("Enter AScii:");
		char chr=sc.next().charAt(0);
		int as =chr;
		System.out.print("ASCII "+chr + " is :"+as);

		//Right triangle star pattern
		int i,j,row=6;
		for(i=0;i<row;i++){
			for(j=0;j<i;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		//right triangle number pattern
		
		for(i=0;i<row;i++){
			int number=1;
			for(j=0;j<i;j++){
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		

		}
		
		
	}
