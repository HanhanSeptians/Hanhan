package agregation;

public class main {
	public static void main(String[] args) {
		Himakom hima = new Himakom ("Himakom Polban");
		Division div = new Division ("Biro Komunikasi dan Informasi");
		Division div1 = new Division ("Biro Administrasi dan Kesekretariatan");
		Division div2 = new Division ("Biro Keuangan");
		Division div3 = new Division ("Departemen Luar Himpunan");
		Division div4 = new Division ("Departemen PSDA");
		Division div5 = new Division ("Departemen RisetDikti");
		Division div6 = new Division ("Departemen Rohani Islam");
		Division div7 = new Division ("Departemen Seni dan Olahraga");
		Division div8 = new Division ("Unit Teknologi");
		
		System.out.println(hima.getName() + " Memiliki 9 Divisi yaitu :");
		System.out.println("1." + div.getDivName());
		System.out.println("2." + div1.getDivName());
		System.out.println("3." + div2.getDivName());
		System.out.println("4." + div3.getDivName());
		System.out.println("5." + div4.getDivName());
		System.out.println("6." + div5.getDivName());
		System.out.println("7." + div6.getDivName());
		System.out.println("8." + div7.getDivName());
		System.out.println("9." + div8.getDivName());
	}

}
