package GenericProgramming.App;

import GenericProgramming.Wildcard;
public class WildcardApp {

	public static void main(String[] args) {
		printValue(new Wildcard<>("Nama : " + "Hanhan Septian"));
		printValue(new Wildcard<>("Usia : "+ 20 +" Tahun"));
		printValue(new Wildcard<>("WNI  : "+ true));

	}
	public static void printValue(Wildcard<?> Wildcard) {
		System.out.println(Wildcard.getWildcard());
	}
}
