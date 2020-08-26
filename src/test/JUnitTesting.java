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
	
	public int sum(int x, int y){
		return x+y;
	}
	
	public String divide(int x, int y){

		if(y!=0) {
			return String.valueOf(x/y);
		} else {
			return "Non è possibile dividere per 0!";
		}
	}
}
