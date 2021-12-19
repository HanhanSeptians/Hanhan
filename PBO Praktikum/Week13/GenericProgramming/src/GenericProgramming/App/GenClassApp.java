package GenericProgramming.App;

import GenericProgramming.GenericClass;
 
public class GenClassApp {

	public static void main(String[] args) {
		GenericClass<String> StrNama = new GenericClass<String>("Hanhan Septian");
		
		GenericClass<Integer> IntUsia = new GenericClass<Integer>(20);
		
		String  nama =StrNama.getGenClass();
		Integer usia =IntUsia.getGenClass();
		
		System.out.println("Nama Mahasiswa : " + nama);
		System.out.println("Usia Mahasiswa : " + usia);
	}

}
