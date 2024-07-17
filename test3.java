class Counter {
     int count = 0;
  
    public synchronized void increment() {
      count++;
    }
  }
  
  public class test3{
  
    public static void main(String[] args) throws InterruptedException {
      Counter counter = new Counter();
  
      Thread thread1 = new Thread(() -> counter.increment());
      Thread thread2 = new Thread(() -> counter.increment());
  
      thread1.start();
      thread2.start();
  
      thread1.join();
      thread2.join();
  
      System.out.println("Final count: " + counter.count);
    }
  }