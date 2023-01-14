import java.util.ArrayList;
public class Hero 
{
    private int x;
    private int y;
    private double health;
    private double armor;
    private ArrayList<String> inventory;

    public Hero(double health, double armor, ArrayList<String> inventory)
    {
        this.health = health;
        this.armor = armor;
        this.inventory = inventory;
    }

    public Hero(double health, double armor)
    {
        this.health = health;
        this.armor = armor;
        this.inventory = new ArrayList<String>();        
    }

    public double calculateDamage()
    {
        return Math.random() * 10 + 5 * this.getSwordCount();
    }

    public void recieveDamage(double damage)
    {
        health -= (1 - armor) * damage;
    }

    public int[] getPosition()
    {
        int[] pos = new int[]{x, y};
        return pos;
    }

    public int getSwordCount()
    {
        int swords = 0;
        for(String s : inventory)
        {
            if (s.equals("Sword"))
            {
                swords++;
            }
        }
        return swords;
    }

}
