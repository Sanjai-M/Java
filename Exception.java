public class Exception {
	public static void main(String[] args) {
		int a = 30, b = 0;
		int c = 0;
		
		try {
			//int arr[] = null;
			//System.out.println(arr[4]);/////
			
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occured");
			
		}
		catch (NullPointerException e) {
			System.out.println("Index Not found");
		}
		finally {
			int t1=1,t2=1;
			for (int i = 1; i <= 10; ++i) {
				System.out.print(t1+" ");
	
				int sum = t1 + t2;
				t1 = t2;
				t2 = sum;
			}
			System.out.println(t2);
		}
		
		System.out.println(c);
		System.out.println("End of the program");

	}

}


