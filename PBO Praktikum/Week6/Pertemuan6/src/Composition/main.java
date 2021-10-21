package Composition;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		personal kelahiran1 = new personal("Hanhan Septian", "9 September 2001");
		personal kelahiran2 = new personal("M. Radeya Abinaya", "31 Desember 2018");

		List<personal> personals = new ArrayList<personal>();
		personals.add(kelahiran1);
		personals.add(kelahiran2);

		tglKelahiran kelahiran = new tglKelahiran(personals);
		List<personal> var = kelahiran.getPersonal();
			for(personal sVar : var){
				System.out.println("Nama : " + sVar.nama + "\n"+"Tanggal Lahir : " + sVar.tanggalLahir);
			}
	}

}
