// Team Stuyrim - Leo Auyeung, Sungbin Kim, Jason Mohabir
// APCS pd10
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Dragonborn extends Character {
    public Dragonborn(String s) {
	super(200,30,70,0.5);
	setName(s);
    }
	
	public void normalize(){
		setStrength(30);
		setDefense(70);
		setAttackrating(0.5);
	}

    public void specialize() {
	setStrength(STRENGTH + 20);
	setDefense(DEFENSE + 30);
    }	
	
	public static String about() {
		return "\nWill you take the path of the \" Dragonborn \"? \n" + 
	    "Fus Ro Dah!\n";
	}
}
