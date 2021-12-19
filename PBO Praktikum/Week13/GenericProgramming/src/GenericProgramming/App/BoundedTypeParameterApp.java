package GenericProgramming.App;

import GenericProgramming.BoundedTypeParameter;

public class BoundedTypeParameterApp {

	public static void main(String[] args) {
		BoundedTypeParameter<Double> nilai1 = new BoundedTypeParameter<>(90.5);
		BoundedTypeParameter<Integer> nilai2 = new BoundedTypeParameter<>(80);

		Double nilaiPBO =nilai1.getBTP();
		Integer nilaiBasdat = nilai2.getBTP();
		System.out.println("Nama Matkul : "+"              Nilai :");
		System.out.println("1. PBO "       +"                     "+nilaiPBO);
		System.out.println("2. BASIS DATA "       +"              "+nilaiBasdat);
		
	}

}
