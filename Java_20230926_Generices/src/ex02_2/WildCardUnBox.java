package ex02_2;

class Box<T> {
	private T ob;  
	public void set(T ob) { this.ob = ob; }
	public T get() { return this.ob; }  
	
	@Override
	public String toString() { 	return ob.toString(); }
}

class Unboxer{
	                               //하한 제한
	public static void peekBox(Box<? super Integer> box) {  //와일드카드메소드
		System.out.println(box);
	}
}

class Person{
	
}
public class WildCardUnBox {

	public static void main(String[] args) {
		
		Box<Integer> iBox = new Box();
		iBox.set(9999);
		
		Box<Number> nBox = new Box();
		nBox.set(10.3);
		
		Box<Object> bBox = new Box();
		bBox.set("Simple");

		Box<Object> pBox = new Box();
		pBox.set(10.5);
		
		Unboxer.peekBox(pBox);
		
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(nBox);
		Unboxer.peekBox(bBox);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
