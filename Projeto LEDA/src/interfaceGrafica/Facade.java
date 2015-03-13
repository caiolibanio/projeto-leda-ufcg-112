package interfaceGrafica;

public class Facade {
	private static Facade facade;
	
	public static Facade getInstance() {
		if (facade == null) {
			facade = new Facade();
		}
		return facade;
	}
	

}
