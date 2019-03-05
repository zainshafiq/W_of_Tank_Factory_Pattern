/**
 * 
 */
package ENSE470_Lab1;

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