// Team Stuyrim - Leo Auyeung, Sungbin Kim, Jason Mohabir
// APCS pd10
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Mage extends Character {
    public Mage(String s){
		super(120,20,40,4.0);
		super.setName(s);
	}
	
	public void normalize(){
		setStrength(20);
		setDefense(40);
		setAttackRating(4.0);
	}
	
    public void specialize(){
		setStrength(STRENGTH+60);
		lowerHP(20);
	}
	
	public static String about() {
		return "\nWill you take the path of the \" Mage \"? \n" + 
	    "Do thou goth the magic in thee? Channel thou mind and let it be\n";
	}
}
