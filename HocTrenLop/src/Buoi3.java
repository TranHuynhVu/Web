
public class Buoi3 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		char[] b = {'+','-','*','*'};
		String[] cStrings = new String[100];
		int n = 0;
		
		for(int i = 0; i < 4; i++) {
			if(a[i] == '*') {
				cStrings[n] = "a[i]*";
				n++;
			}
		}
		
		System.out.println(cStrings);
		
	}



}
