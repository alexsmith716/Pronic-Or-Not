import java.util.Scanner;

// A pronic number (or otherwise called as heteromecic) is a number which is a product of two consecutive integers, that is, a number of the form n(n + 1). Create a function that determines whether a number is pronic or not. 
// a pronic number is a number which is the product of two consecutive integers
// 0, 2, 6, 12, 20, 30, 42, 56, 72, 90 ...
// a pronic number is always even
// so, `n(n + 1)`
// 0  >>> 0x1; >> 0,1
// 2  >>> 1x2; >> 1,2
// 6  >>> 2x3; >> 2,3
// 12 >>> 3x4; >> 3,4
// 20 >>> 4x5; >> 4,5

public class PronicNumber {

	public static boolean testIfPronic(int number) {
		System.out.println("Test If " + number + " Pronic");
		int getInputSquareRoot = (int)Math.sqrt(number);
		System.out.println("getInputSquareRoot " + getInputSquareRoot);
		// square root: a value that multiplied by itself gives the "number"
		// that square root + 1;
		int eval = getInputSquareRoot * (getInputSquareRoot + 1);
		if (eval == number) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int number = 0;
		System.out.print("Enter Integer To Test If Pronic: ");
		number = scanner.nextInt();

		if(testIfPronic(number)) {
			System.out.println("IS " + number + " Pronic?: " + " >> YES");
		} else {
			System.out.println("IS " + number + " Pronic?: " + " >> NO");
		}
		scanner.close();
	}
}
