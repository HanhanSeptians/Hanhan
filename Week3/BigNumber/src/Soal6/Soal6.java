package Soal6;
import java.math.BigInteger;
import java.util.Scanner;
public class Soal6 {
	public static void main (String[] args) {
		Scanner keyboard= new Scanner(System.in);
		BigInteger a,b;
		a=keyboard.nextBigInteger();
		b=keyboard.nextBigInteger();
		BigInteger value1=a.add(b), value2=a.multiply(b);
		System.out.println(value1);
		System.out.println(value2);
	}
}
