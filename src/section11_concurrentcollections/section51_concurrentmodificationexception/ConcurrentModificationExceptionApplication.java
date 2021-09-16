package section11_concurrentcollections.section51_concurrentmodificationexception;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceptionApplication extends Thread{
	
	private static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) throws InterruptedException {
		
		ConcurrentModificationExceptionApplication tchild = new ConcurrentModificationExceptionApplication();
		
		list.add("John");
		list.add("Rohn");
		list.add("Tom");
		list.add("Shiva");
		
		Iterator<String> itr = list.iterator();
		tchild.start();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println("Main thread is iterating -> " + name);
			Thread.sleep(100);
		}
		
	}
	
	public void run(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list.add("Ganesh");
	}
	
	

}
