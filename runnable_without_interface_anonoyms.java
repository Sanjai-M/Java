class Book extends Thread{
	public void run() {
		for (int i = 1;i<=5;i++) {
			System.out.println("Mango Db");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
class Num extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			
		}
	}
}
public class runnable_without_interface_anonoyms {

	public static void main(String[] args)  throws  InterruptedException{
		Book book = new Book();
		Num num = new Num();
		
		Thread t1 = new Thread(book);
		
		//book.UpdateDB();
		//num.Print();
		t1.start();
		num.start();
		t1.join();
		num.join();
		
		System.out.println("End of the program");
	}

}