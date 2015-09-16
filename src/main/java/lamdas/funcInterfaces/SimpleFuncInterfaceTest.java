package lamdas.funcInterfaces;

public class SimpleFuncInterfaceTest {
	public static void main(String[] args) {
		
		carryOutWork(new SimpleFuncInterface() {
			
			@Override
			public void doSomeWork() {
				System.out.println("Finally I am doing some work");
				
			}
		});
	}
	
	public static void carryOutWork(SimpleFuncInterface sfi) {
		sfi.doSomeWork();
	}
}
