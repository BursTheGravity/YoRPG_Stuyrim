// Team Stuyrim - Leo Auyeung, Sungbin Kim, Jason Mohabir
// APCS pd10
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Rogue extends Character {
    public Rogue(String s){
		super(75,90,30,.9);
		super.setName(s);
	}
	
	public void normalize(){
		setStrength(90);
		setDefense(30);
		setAttackrating(.9);
	}
	
    public void specialize(){
		setStrength(STRENGTH+20);
		setDefense(DEFENSE-10);
		setAttackRating(ATTACKRATING + 1.0);
	}
	
	public static String about() {
		return "\nWill you take the path of the \" Rogue \"? \n" + 
	    "Toust the dagger that shall oust the corrupt. Becometh the weilder of change.\n";
	}
}
