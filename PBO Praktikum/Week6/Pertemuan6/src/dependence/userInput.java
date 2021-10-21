package dependence;

import java.util.Scanner;

public class userInput {
	Scanner scan = new Scanner(System.in);
	
	void input(kirimPesan pesan) {
		System.out.print("kepada :");
		String kepada = scan.nextLine();
		
		System.out.print("Isi pesan :");
		String isiPesan = scan.nextLine();
		
		System.out.print("Kirimkan [y/n]");
		String pilihan = scan.nextLine();
		
		if(pilihan.equalsIgnoreCase("y")) {
			kirimPesan p = new kirimPesan();
			p.kirim(kepada, isiPesan);
		}
	}
}
