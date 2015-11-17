// Team Stuyrim - Leo Auyeung, Sungbin Kim, Jason Mohabir
// APCS pd10
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Warrior extends Character {
    public Warrior(String s){
        super(125,100,40,.4);
        super.setName(s);
	}
    
	public void normalize(){
		setStrength(100);
		setDefense(40);
		setAttackrating(.4);
	}
	
    public void specialize(){
		setStrength(STRENGTH+80);
		setDefense(DEFENSE-60);
		setAttackRating(ATTACKRATING + 0.5);
	}
	
	public static String about() {
		return "\nWill you take the path of the \" Warrior \"? \n" + 
	    "Becometh known for thy strength, but prosper in thy humbleness.\n";
	}
}
