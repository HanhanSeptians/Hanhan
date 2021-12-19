package GenericProgramming;

public class ComparableInterface implements Comparable<ComparableInterface>{
	
	private String nama;
	private String NIM;
	
	public ComparableInterface(String nama, String NIM) {
		this.nama = nama;
		this.NIM = NIM;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNIM() {
		return NIM;
	}
	public void setNIM(String nim) {
		this.NIM = nim;
	}
	@Override
	public  int compareTo(ComparableInterface CI) {
		return this.nama.compareTo(CI.nama); 
	}
	
	@Override
	public String toString() {
		return "Mahasiswa{"+"Nama : '"+nama+ '\''+", NIM= '"+NIM+'\''+'}';
	}
}
