package Kasus1;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	public Barang (String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		Stok(stk);
	}
	
	public void Stok(int stok) {
		this.stok += stok;	
	}
	int getStok() {
		return stok;
	}

}
