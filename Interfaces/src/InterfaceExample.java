
interface Left {
	 void method();
}

interface Right{
	int method(int i);
}
public class InterfaceExample implements Left , Right{

	@Override
	public int method(int i) {
		return 0;
	}
	
	@Override
	public void method() {
		
	}

}
