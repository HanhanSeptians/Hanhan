package Soal1;
import java.util.*;

public class SoalDataTypes {
	    public static void main(String[] args) {
	    int batas, nilai, indeks;	
	        Scanner keyboard = new Scanner(System.in);
	        System.out.printf("Masukkan jumlah nilai yang akan di cek : ");
	        batas = keyboard.nextInt();
	        
	        for (indeks=0; indeks<batas; indeks++){
	            try{
		            System.out.printf("Masukkan Nilai yang akan di cek :");
		            nilai = keyboard.nextInt();
		            System.out.println(nilai+" Can be fitted in");
		            if(nilai>=Byte.MIN_VALUE && nilai<= Byte.MAX_VALUE) System.out.println("* byte");
		            if(nilai>=Short.MIN_VALUE && nilai<= Short.MAX_VALUE) System.out.println("* short");
		            if(nilai>=Integer.MIN_VALUE && nilai<= Integer.MAX_VALUE) System.out.println("* integer");
		            if(nilai>=Long.MIN_VALUE && nilai<= Long.MAX_VALUE) System.out.println("* long");
	            }
	            catch(Exception e) {
	                System.out.println(" Can't be fitted anywhere.");
	            }
	       }
	   }
}
