package multithreading.daemon;

public class CompilingCode extends Thread {
	public void run() {
   	 for(int i=1; i<=10; i++) {
   		 System.out.println("CompilingCode");
   		 try {
   			 Thread.sleep(2000);
   		 }catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
    }
}
}
