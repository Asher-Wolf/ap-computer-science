public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction() {
		numerator = 1;
		denominator = 1;
	}

	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public Fraction add(Fraction other) {

		int num1 = numerator;
		int den1 = denominator;
		int num2 = other.numerator;
		int den2 = other.denominator;

		int commonD = commonDenom(numerator, denominator, other.numerator, other.denominator);

		num1 *= commonD / denominator;
		num2 *= commonD / other.denominator;

		int newNum = num1 + num2;
		int newDen = commonD;


		//int newNum = (numerator*other.denominator) + (other.numerator*denominator);
		//int newDen = denominator*other.denominator;


		Fraction newFrac = new Fraction(newNum, newDen);
		System.out.println(toStrings(newFrac.numerator, newFrac.denominator));
		return newFrac;
	}

	public Fraction mult(Fraction other) {
		int newNum = (numerator*other.numerator);
		int newDen = denominator*other.denominator;

		Fraction newFrac = new Fraction(newNum, newDen);
		System.out.println(toStrings(newNum, newDen));
		return newFrac;
	}

	public String toStrings(int num, int den) {
		return num + "/" + den;
	}

	public int commonDenom(int num1, int den1, int num2 , int den2){

		int x=0;
		int range = den1 * den2;
		int min = 0;
		if (den1 > den2){
			min = den1;
		}
		else {
			min = den2;
		}

		for(x = min; x < range; x++){
			if(x % den1 == 0 && x % den2 ==0){
				break;
			}
		}
		return x;

	}
}
