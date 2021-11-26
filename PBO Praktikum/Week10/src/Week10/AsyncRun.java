package Week10;


public class AsyncRun implements Runnable {
	@Override
	public void run() {
		try {
		// TODO Auto-generated method stub
		System.out.println("AsyncRun.run on thread " +
		Thread.currentThread().getId());
		throw new ArithmeticException();
		}
		catch(Exception ex){
			System.out.println(" handled 2");
		}
	}
}

