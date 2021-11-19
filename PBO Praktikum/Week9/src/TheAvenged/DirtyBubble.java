package TheAvenged;

public class DirtyBubble extends SuperHero{
	public DirtyBubble(int powerLevel, String name) {
		super(powerLevel, name);
		Power fly = new Flying();
		Power strength=new Strength();
		addPower(fly);
		addPower(strength);
	}

	public void identity() {
		// TODO Auto-generated method stub
		System.out.printf("It's %s, the DirtyBubble! It has the power level of %d\n",this.name,this.powerLevel);
		System.out.println(".....HEED ME.....");
	}
}
