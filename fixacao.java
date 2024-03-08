import java.util.Locale;

public class fixacao {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		 
		System.out.println("Products");
		System.out.printf("Computer, which is "  + "%.2f%n", price1);
		System.out.printf("Office desk, which price is "  + "%.2f%n", price2);
		System.out.println();
		Locale.setDefault(Locale.US);
		System.out.printf("Record : %d years old, code %d and gender %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places,%.8fn",measure);
		System.out.printf("Rouded (three decimal places): %.3fn",measure);
		System.out.printf("US decimal point: %.3f%n",measure);
	}

}
