package hitungNilai;

import java.util.*;
public class tugasPBOT {
	
	public static void main(String[] args) {
	    float UTS, UAS, Tugas, Nilai_Akhir;	
	    String Nama_Siswa, nilaiHuruf=null;
        Scanner keyboard = new Scanner(System.in);
	    
        System.out.printf("Masukkan Nama Siswa : ");
        Nama_Siswa = keyboard.nextLine();
        
        System.out.println("Masukkan Nilai Tugas : ");
        Tugas = keyboard.nextFloat();
        
        System.out.println("Masukkan Nilai UTS : ");
        UTS = keyboard.nextFloat();
        
        System.out.println("Masukkan Nilai UAS : ");
        UAS = keyboard.nextFloat();
        
        Nilai_Akhir = Tugas * 20/100 + UTS *35/100 + UAS * 45/100;
        	if(Nilai_Akhir>85) {
        		nilaiHuruf="A";
        	}else if(Nilai_Akhir>=75 && Nilai_Akhir<=84) {
        		nilaiHuruf="B";
        	}else if(Nilai_Akhir>=65 && Nilai_Akhir<=74) {
        		nilaiHuruf="C";
        	}else if(Nilai_Akhir>=49 && Nilai_Akhir<=64) {
        		nilaiHuruf="D";
        	}else if(Nilai_Akhir<50) {
        		nilaiHuruf="E";
        	}else {
        		System.out.println("Nilai Tidak Ada");
        	}
        
        System.out.println("=====================================");
        System.out.println("           Tugas PBO Teori           ");
        System.out.println("=====================================");
        System.out.println("Nama Siswa  : "+Nama_Siswa);
        System.out.println("Nilai Tugas : "+Tugas);
        System.out.println("Nilai UTS   : "+UTS);
        System.out.println("Nilai UAS   : "+UAS);
        System.out.println("Nilai Akhir : "+Nilai_Akhir);
        System.out.println("Nilai Huruf : "+nilaiHuruf);
        
	}

}
