package GenericProgramming.App;

import GenericProgramming.GenericMethod;

public class GenMethodApp {

	public static void main(String[] args) {
		String[] namaMatkul = {"Basis Data", "PBO", "Aljabar Linear", "Pancasila", "PPL","PRPL", "Kewirausahaan"};
		
		System.out.println("Mata Kuliah yang Dipelajari : ");
		for (int i=0; i<7 ; i++) {
			System.out.println((i+1+".") + namaMatkul[i]);
		}
		System.out.println("=====================================");
		System.out.println("Jumlah Mata Kuliah yang Dipelajari: "+ GenericMethod.<String> count(namaMatkul));

	}

}
