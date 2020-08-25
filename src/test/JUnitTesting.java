package test;

public class JUnitTesting {
	public int square(int x) {
		return x*x;
	}

	public int counta(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='A') {
				count++;
			}
		}
		
		return count;
	}
}
