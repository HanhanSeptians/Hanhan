package praktikumPBOT;
import java.util.*;
public class main {
	public static void main(String[]args) {
		Family family = new Family();
		family.addNiece("Hanhan", 15, 8);
		family.addNiece("Septian", 9, 4);
		
		family.addUncle("Suhendar");
		family.addUncle("Jajang");
		
		family.listUncles();
		family.listUncles();
		
		Niece Hanhan = family.findNiece("Hanhan");
		Niece Septian= family.findNiece("Septian");
		
		Uncle Suhendar = family.findUncle("Suhendar");
		
		Suhendar.addPresent(Hanhan,"Mobil-mobilan");
		Suhendar.addPresent(Septian,"Miniatur Gitar");
		
		Suhendar.listPresent();
	}

}
