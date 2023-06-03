package n1exercici8;

public class App {

	public static void main(String[] args) {

		//Basic way
		Reversing word = new Reversing() {

			@Override
			public String reverse(String input) {
				String reversedInput = "";
				for(int i = input.length()-1; i>=0; i--) {
					reversedInput += input.charAt(i);
				}
				return reversedInput;
			}
		};
		
		//Lambdification
		Reversing word2 = s -> {
							String reversedInput = "";
							for(int i = s.length()-1; i>=0;i--) {
								reversedInput += s.charAt(i);
							}
							return reversedInput;
							};
		
		
		//With StringBuilder()
		Reversing word3 = s -> new StringBuilder(s).reverse().toString();
		
		System.out.println(word.reverse("Hello world."));
		System.out.println(word2.reverse("Hello world."));
		System.out.println(word3.reverse("Hello world."));
	}

}
