// Team Stuyrim - Leo Auyeung, Sungbin Kim, Jason Mohabir
// APCS pd10
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public abstract class Character {
    
    protected int health, strength, defense;
    protected double attackRating;
    protected String name;
    protected final int STRENGTH, DEFENSE;
    protected final double ATTACKRATING;
	
    // Constructor
    public Character(int hp, int str, int def, double atr){
		setHealth(hp);
		STRENGTH = str;
		DEFENSE = def;
		ATTACKRATING = atr;
		normalize();
	}
	
    // Mutators
    public void setHealth(int n) { health = n;}
    public void setStrength(int n) { strength = n;}
    public void setDefense(int n) { defense = n;}
    public void setAttackRating(double n) { attackRating = n;}
    public void setName(String s) { name = s; }
    
    public boolean isAlive(){
		return ( health > 0 );
	}
	
    // Accessors 
    public int getDefense() {return defense;}
    public int getHealth() {return health;}
    public String getName() {return name;}
	
    public abstract void specialize();
    
    public abstract void normalize();
    
    public void lowerHP(int a){
		if (a < 0) { health = health; }
		else { health -= a; }
	}
	
    public int attack(Character c){
		int damage = (int)((strength * attackRating) - c.getDefense());
		c.lowerHP(damage);
		return damage;
	}
	
    public abstract String about();
}
