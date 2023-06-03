package n1exercici5;

public class App {

	public static void main(String[] args) {

		PiValue iface = new PiValue() {
			
			@Override
			public double getPiValue() {
				return 3.1415;
			}
		};
		System.out.println(iface.getPiValue());
		
		PiValue ifaceLambda = () -> 3.1415;
		
		System.out.println(ifaceLambda.getPiValue());
	}
}
