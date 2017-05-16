package base;

public class MyInteger {
	
	private int iValue;
	
	public MyInteger() {
		
	}
	
	public MyInteger(int ivalue) {
		this();
		this.iValue = ivalue;
	}
	
	private int getiValue() {
		return iValue;
	}
	
	private static boolean isEven(int n) {
		if (n%2 == 0) {
			return true;
		} else
			return false;
	}
	
	private static boolean isOdd(int n) {
		if (n%2 == 1) {
			return true;
		} else
			return false;
	}
	
	private static boolean isPrime(int n) {
		int i;
		for (i = 2; i <= n/2 ; i++) {
			if (n % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isEven() {
		return isEven(iValue);
	}
	
	public boolean isOdd() {
		return isOdd(iValue);
	}
	
	public boolean isPrime() {
		return isPrime(iValue);
	}
	
	public static boolean isEven(MyInteger myint) {
		return isEven(myint.getiValue());
	}
	
	public static boolean isOdd(MyInteger myint) {
		return isOdd(myint.getiValue());
	}
	
	public static boolean isPrime(MyInteger myint) {
		return isPrime(myint.getiValue());
	}

}
