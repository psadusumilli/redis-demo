package lamdas.funcInterfaces;

@FunctionalInterface
public interface ComplexFuncInterface extends SimpleFuncInterface {
	
	public void doSomeWork();
	
	default public void doNothing() {
		System.out.println("Do nothing.");
	}

}
