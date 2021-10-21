package asociation;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		HimakomPolban hima = new HimakomPolban("Himakom Politeknik Negeri Bandung");
		Luar_Himpunan luhim = new Luar_Himpunan("Departemen Luar Himpunan");
		Anggota ketua = new Anggota("Muhammad Raffi Kamil");
		Anggota wakilKetua = new Anggota("Muhamad Hasbi Islahi Azam");
		Anggota anggota = new Anggota("Dzakira Fabillah");
		Anggota anggota1 = new Anggota("Gemintang Sangkaji Furqon");
		Anggota anggota2 = new Anggota("Kynara Rissalati Arsy");
		Anggota anggota3 = new Anggota("Mochamad Naufal Ghassani");
		Anggota anggota4 = new Anggota("Mochamad Naufal Dwisatya");
		Anggota anggota5 = new Anggota("Nabil Putra Hadiyani");
		Anggota anggota6 = new Anggota("Pramestya Yohana");
		Anggota anggota7 = new Anggota("Silvia Nurfadilah");
		
		Anggota anggota8 = new Anggota("Diwan Purnama");
		Anggota anggota9 = new Anggota("Faikar Mochammad Ghifari");
		Anggota anggota10 = new Anggota("Hanhan Septian");
		Anggota anggota11 = new Anggota("Hasanah");
		Anggota anggota12= new Anggota("Lubban Ahsanul Jihad");
		Anggota anggota13 = new Anggota("Muhamad Akbar Alfarisi");
		Anggota anggota14 = new Anggota("Muhamad Aryadipura Sasmita Atmaja");
		Anggota anggota15 = new Anggota("Muhamad Rasyid Fadlurrahman");
		Anggota anggota16 = new Anggota("Nisa Hauna Yusriyyah");
		Anggota anggota17 = new Anggota("Ryrie Ceisha Ramadhanty");
		Anggota anggota18 = new Anggota("Thoriq Fadhillah Ajiji");
		
		System.out.println(luhim.getDivisi()+ " Merupakan salahsatu Divisi dari " + hima.getName() +"yang beranggotakan :");
		System.out.println("Ketua       : " + ketua.getName());
		System.out.println("Wakil Ketua : " + wakilKetua.getName());
		System.out.println("1." + anggota.getName());
		System.out.println("2." + anggota1.getName());
		System.out.println("3." + anggota2.getName());
		System.out.println("4." + anggota3.getName());
		System.out.println("5." + anggota4.getName());
		System.out.println("6." + anggota5.getName());
		System.out.println("7." + anggota6.getName());
		System.out.println("8." + anggota7.getName());
		System.out.println("9." + anggota8.getName());
		System.out.println("10." + anggota9.getName());
		System.out.println("11." + anggota10.getName());
		System.out.println("12." + anggota11.getName());
		System.out.println("13." + anggota12.getName());
		System.out.println("14." + anggota13.getName());
		System.out.println("15." + anggota14.getName());
		System.out.println("16." + anggota15.getName());
		System.out.println("17." + anggota16.getName());
		System.out.println("18." + anggota17.getName());
		
	}

}
