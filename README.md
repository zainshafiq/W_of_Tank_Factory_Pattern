# Mock_World_of_Tank_Factory_Pattern

You have a position testing and developing code for the online game World of Tanks. Your recent work with the Factory Design Pattern has given you an idea on how to modify some development and testing code. Your job is to test the algorithm for receiving damage. The basic idea is the penetration value must exceed the armour value in order to cause dame. One algorithm is posted below but feel free to build your own. Given the code below, modify the code to make use of the Factory Design Pattern. This will allow your test code to test the damage algorithm on any type of tank that has been created (as long as the algorithm does not change). Ideally you should be able
to test an unlimited number of tanks and your test code will not change as new tanks are created and need to be tested.

/**
 * 
 * @Reference author : tdouglas U of R
 *
 */
public abstract class Tank {

	private String name;
	private String country;
	private int hitPoints;
	private int armor;
	private int shellDamage;
	protected int currentHealth;
	protected boolean destroyed = false;
	
	
	public void setName(String name){this.name = name;}
	public String getName(){return name;}
	
	public void setCountry(String country){this.country = country;}
	public String getCountry(){return country;}
	
	public void setHitPoints(int hitPoints){this.hitPoints = hitPoints;}
	public int getHitPoints(){return hitPoints;}
	
	public void setArmor(int armor){this.armor = armor;}
	public int getArmor(){return armor;}
	
	public void setShellDamage(int shellDamage){this.shellDamage = shellDamage;}
	public int getShellDamage(){return shellDamage;}
	
	public void setCurrentHealth(int currentHealth){ this.currentHealth = currentHealth;}
	public int getCurrentHealth(){ return currentHealth;}
	
	public boolean getDestroyed(){return destroyed;}
	
	
	public void receiveHit(int damage, int penetration)
	{
		double shotDamage = 0.0;
		double shellPenetration = 0.0;
		
		if(destroyed)
		{
			System.out.println("I am dead..");
			return;
		}
		
		System.out.println("Received Hit..");
		//First check if the damage penetrates the armor.
		if( penetration > getArmor())
		{
				shellPenetration = penetration - getArmor();
				shellPenetration = shellPenetration / 100.0;
				
				shotDamage = (damage * shellPenetration);
				
				if(shotDamage >= currentHealth)
				{
					currentHealth = 0;
					destroyed = true;
					System.out.println("Tank Destroyed !!!");
				}
				else
				{
					currentHealth -= shotDamage;
				}
			
		}
		else
		{
			System.out.println("No penetration...");
		}
		
	}
}

