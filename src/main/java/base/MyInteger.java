package base;

public class MyInteger {
	private int iValue;
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	public int getiValue() {
		return iValue;
	}
	public boolean isEven() {
		if (iValue % 2 == 0) return true;
		return false;
	}
	public boolean isOdd() {
		if (iValue % 2 == 1 ) return true;
		return false;
	}
	public boolean isPrime() {
		for (int i = 2; i*i <= iValue; i++) {
			if (iValue % i == 0)
				return false;
		}return true;
	}
	public static boolean isEven (int n) {
		if (n % 2 == 0) return true;
		return false;
	}
	public static boolean isOdd(int n) {
		if (n % 2 == 1 ) return true;
		return false;
	}
	public static boolean isPrime(int n) {
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0)
				return false;
		}return true;
	}
	public static boolean isEven(MyInteger m) {
		if (m.getiValue() % 2 == 0) 
			return true;
		return false;
	}
	public static boolean isOdd(MyInteger m) {
		if (m.getiValue() % 2 == 1 ) 
			return true;
		return false;
	}
	public static boolean isPrime(MyInteger m) {
		for (int i = 2; i*i <= m.getiValue(); i++) {
			if (m.getiValue() % i == 0)
				return false;
		}return true;
	}
	public boolean equals(int n) {
		if (iValue == n) return true;
		return false;
	}
	public boolean equals(MyInteger m) {
		if (iValue == m.getiValue()) 
			return true;
		return false;
	}
	
}
	
