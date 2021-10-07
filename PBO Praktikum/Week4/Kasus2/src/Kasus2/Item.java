package Kasus2;

public class Item {
	public String name;
	private Item() {
		this.name = "Ipin";
	}
	public Item(String name) {
		this();
		System.out.println(this.name);
	}
}