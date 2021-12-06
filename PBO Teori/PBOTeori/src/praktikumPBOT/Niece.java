package praktikumPBOT;

import java.util.HashMap;
import java.util.Map;

public class Niece implements Comparable<Niece>{
	private String name;
	private int b_Month;
	private int b_Day;
	private Map<Uncle, String> present = new HashMap<Uncle, String>();
	
	public int clearPresent() {
		int total = present.size();
		present.clear();
		return total;
	}
	public void listPresents() {
		System.out.println("Niece " + name);
		for(Map.Entry <Uncle, String> entry: present.entrySet()){
			System.out.println("-");
			
			if(entry.getValue() == null)
				System.out.println("Tidak memberikan Hadiah");
			else
				System.out.println(entry.getKey().getName()+ "Memberikan "+ entry.getValue());
		}
		System.out.println("*****************************************");
		
	}
	public String toString() {
		return name;
	}
	public Map<Uncle, String> getPresent(){
		return present;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getB_Day() {
		return b_Day;
	}
	public int getB_Month() {
		return b_Month;
	}
	public void setB_Day(int b_Day) {
		this.b_Day = b_Day;
	}
	public void setB_Month(int b_Month) {
		this.b_Month = b_Month;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		
		if(getClass()!= obj.getClass()) return false;
		return name.equals(((Niece)obj).name);
	}
	@Override
	
	public int compareTo(Niece o) {
		if(this.b_Month > o.b_Month) return 1;
		if(this.b_Month == o.b_Month)
			return (this.b_Day > o.b_Day ? 1: -1);
		return name.compareTo(o.name);
	}
}
