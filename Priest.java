// Team Stuyrim - Leo Auyeung, Sungbin Kim, Jason Mohabir
// APCS pd10
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Priest extends Character {
    public Priest(String s) {
	super(150, 30, 50, 0.5);
	setName(s);
    }
	
	public void normalize(){
		setStrength(30);
		setDefense(50);
		setAttackrating(0.5);
	}

    public void specialize() {
	setStrength(STRENGTH + 20);
	setHealth(health + 30);
    }
	
	public static String about() {
		return "\nWill you take the path of the \" Priest \"? \n" +
	    "May thy holy spirit guide thou journey.\n"; 
	}
}
