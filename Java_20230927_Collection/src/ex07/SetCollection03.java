package ex07;

import java.util.*;

class Num{
	private int num;
	public Num(int num) { this.num = num; }
	
	@Override
	public String toString() {	
		return String.valueOf(num) ;    //10  ==> "10"
	}
	
	@Override
	public int hashCode() {
		System.out.println("hash=>");
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals=>");
		
		return  num == ((Num)obj).num ? true : false;
	}
}

public class SetCollection03 {

	public static void main(String[] args) {

		Set<Num> set = new HashSet<>();
		
		set.add(new Num(9));
		set.add(new Num(12));
		set.add(new Num(7));
		set.add(new Num(9));
		
		Iterator<Num> itr = set.iterator();
		
		while(itr.hasNext()) 
			System.out.println(itr.next());
		
		
	}

}
