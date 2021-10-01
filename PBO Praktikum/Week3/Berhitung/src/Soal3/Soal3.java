package Soal3;

import java.util.*;
public class Soal3 {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
        String userInput;
        int value;
        userInput = keyboard.nextLine();
        String [] nilai = userInput.split(" ");
        int A = Integer.parseInt(nilai[0]);
        int B = Integer.parseInt(nilai[2]);
        if(1<=A && B<=1000) {
	        switch (nilai[1]) {
		        case "+":
		        	value= A+B;
		        	System.out.println(value);
		        	break;
		        case "-":
		        	value= A-B;
		        	System.out.println(value);
		        	break;
		        case "*":
		        	value= A*B;
		        	System.out.println(value);
		        	break;
		        case "/":
		        	value= A/B;
		        	System.out.println(value);
		        	break;
		        case "%":
		        	value= A%B;
		        	System.out.println(value);
		        	break;
		        default:
		        	System.out.println("Tidak ada operator");
		        	break;
	        }
        }else {
        	System.out.println("Tidak Sesuai Aturan");
        }   
	}
}
