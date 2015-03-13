package commons;

public class Preconditions {

	public static void check(boolean b, String messageError) {
		if(!b) throw new IllegalArgumentException(messageError);
	}
	
	public static void checkNotNull(Object b, String messageError) {
		if(b == null) throw new IllegalArgumentException(messageError);
	}
}
