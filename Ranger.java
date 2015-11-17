// Team Stuyrim - Leo Auyeung, Sungbin Kim, Jason Mohabir
// APCS pd10
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Mage extends Character {
    public Mage(String s){
		super(100,75,50,1.0);
		super.setName(s);
	}
	
	public void normalize(){
		setStrength(75);
		setDefense(50);
		setAttackrating(1.0);
	}
	
    public void specialize(){
		setStrength(STRENGTH+60);
		setDefense(DEFENSE-30);
		setAttackRating(ATTACKRATING + 0.5);
	}
	
	public static String about() {
		return "\nWill you take the path of the \" Ranger \"? \n" +
	    "Thy monster will be dead before it sees my arrow.\n";
	}
}
