import java.util.ArrayList;
public class Area 
{
    private ArrayList<Enemy> enemies;
    private ArrayList<String> items;
    private String description;
    private String name;

    public Area(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    
    public Area()
    {
        this.name = "";
        this.description = "";
    }

    public void addEnemy(Enemy e)
    {
        enemies.add(e);
    }

    public void addItem(String i)
    {
        items.add(i);
    }

    public void setLocation(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String toString()
    {
        return "Name: " + name + "\nDescription: " + description + " enemy name";
    }
}
