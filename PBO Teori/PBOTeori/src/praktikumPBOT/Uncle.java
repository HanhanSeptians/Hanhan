package praktikumPBOT;

import java.util.Map;
import java.util.*;

public class Uncle implements Comparable<Uncle> {
	private String name;
	private Map<Niece, String> present = new HashMap<Niece, String>();
	
	public boolean addPresent(Niece recipient, String description) {
		if(!present.containsValue(description) && !recipient.getPresent().containsValue(description) || description == null) {
			present.put(recipient, description);
			recipient.getPresent().put(this, description);
			return true;
		}
		return false;
		
	}
	public void listPresent() {
		System.out.println("Uncle " + this.name);
		for (Map.Entry <Niece, String> entry:present.entrySet()) {
			System.out.println("-");
			if(entry.getValue()==null)
				System.out.println(entry.getKey().getName()+ "tidak mendapatkan hadiah");
			else
				System.out.println(entry.getValue()+ " untuk " + entry.getKey().getName());
		}
		System.out.println("***************************************");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Niece, String> getPresent(){
		return present;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		return name.equals(((Uncle)obj).name);
	}
	@Override
	public int compareTo(Uncle o) {
		return name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return name;
	}
}
