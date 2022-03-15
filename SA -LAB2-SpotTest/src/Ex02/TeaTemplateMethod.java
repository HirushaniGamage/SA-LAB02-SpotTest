package Ex02;

public class TeaTemplateMethod {

	
	static Beverages beverage = null;
	
	public static void main(String[] args) {
		
		  Beverages tea = new Tea();
	        tea.prepareRecepie();
	        System.out.println("=======================================");
	        Beverages coffee = new Coffee();
	        coffee.prepareRecepie();

	    }
}
