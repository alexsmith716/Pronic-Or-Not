import java.util.Scanner;

// https://github.com/alexsmith716/Pronic-Or-Not
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
		int getInputSquareRoot = (int)Math.sqrt(number);
		int eval = getInputSquareRoot * (getInputSquareRoot + 1);
		return eval == number;
	}

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int number;
		while(true) {
			try {
				System.out.print("Enter Integer To Test If Pronic: ");
				number = scanner.nextInt();
				if(testIfPronic(number)) {
					System.out.println("IS " + number + " Pronic?: " + " >> YES");
				} else {
					System.out.println("IS " + number + " Pronic?: " + " >> NO");
				}
			} catch(java.util.InputMismatchException e) {
				System.out.println("Invalid input! That was not an Integer.");
				scanner.nextLine();
			}
		}
	}
}
