package multithreading.daemon;

public class DaemonDemo {

	public static void main(String[] args) {
	  TypingCode t1= new TypingCode();
	  SavingCode t2= new SavingCode();
	  CompilingCode t3=new  CompilingCode();
	  
	  // Set Thread as Doemon Thread
	  t2.setDaemon(true);
	  t3.setDaemon(true);
	  
	// Start all Threads 
	  t1.start();
	  t2.start();
	  t3.start();
	 

	}

}
