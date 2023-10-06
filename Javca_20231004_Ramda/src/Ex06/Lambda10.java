package Ex06;

interface Eee{
	int sumArr(int[] arr);
}

class Eeee implements Eee{

	@Override
	public int sumArr(int[] arr) {
		int sum=0;
		for(int i : arr)
			sum +=i;
		return sum;
	}
}

public class Lambda10 {
	public static void main(String[] args) {
		
		Eee ee = (int[] arr) ->  {
				int sum=0;
				for(int i : arr)
					sum +=i;
				return sum;
			};
		
		int result = ee.sumArr(new int[]{1,2,3,4,5} );
		System.out.println(result);
	}
}
