// import Genre.*;
public abstract class Book {
	public String Title;
	public double Price;
	
		public Book(String title){
			this.Title = title;
			this.get_Price();
		}
		
		abstract void set_Title();
		
		public String get_Title(){
			return Title;
		}
		
		public double get_Price(){
			return Price;
		}
		
		abstract double set_Price();
		
	public static void main (String[] args){
		new NonFiction("science");
	}
}


// public class Fiction extends Book {
	
	// public double setPrice(){
		// return 24.99;
	// }
	
	// public Fiction(String title){
		
	// }
// }

// public class NonFiction extends Book {
	
	// public double setPrice(){
		// return 37.99;
	// }
	
	// public NonFiction(String title){
		// title.getPrice();
	// }
	
// }