package lamdas.funcInterfaces;

@FunctionalInterface
public interface SimpleFuncInterface {

	public void doSomeWork();
	
	@Override
	public String toString() ;
	
	default void doOtherWork() {
		System.out.println("I am default takes care of other work.");
	}
}
