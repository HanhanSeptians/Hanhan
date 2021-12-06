package praktikumPBOT;
import java.util.*;

public class Family {
	private Set<Uncle> uncle;
	private Set<Niece> niece;
	
	public Family(){
		this.uncle = new TreeSet<Uncle>();
		this.niece = new TreeSet<Niece>();
		
	}
	public boolean addNiece(String name, int day, int month){
		Niece temp = new Niece();
		temp.setB_Day(day);
		temp.setB_Month(month);
		temp.setName(name);
		if(niece.add(temp)) {
			updatePresentList();
			return true;
		}
		return false;
		
	}
	public boolean addUncle(String name) {
		Uncle temp = new Uncle();
		temp.setName(name);
		if(uncle.add(temp)) {
			updatePresentList();
			return true;
		}
		return false;
		
	}
	public Niece findNiece(String name) {
		Iterator<Niece> n = niece.iterator();
		while(n.hasNext()) {
			Niece x = n.next();
			if(x.getName().equals(name)) return x;
		}
		return null;
		
	}
	public Uncle findUncle(String name) {
		Iterator<Uncle> u = uncle.iterator();
		while(u.hasNext()) {
			Uncle x = u.next();
			if(x.getName().equals(name)) return x;
		}
		return null;
		
	}
	public void listNieces() {
		System.out.println(niece);
		
	}
	public void listUncles() {
		System.out.println(uncle);
	}
	public void updatePresentList() {
		for(Uncle u : uncle) {
			for (Niece n : niece) {
				if(!u.getPresent().containsKey(n)) {
					u.addPresent(n, null);
				}
			}
		}
	}
}
