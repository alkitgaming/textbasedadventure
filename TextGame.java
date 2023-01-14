import java.util.ArrayList;
public class TextGame 
{
    public static void main(String[] args)
    {
        
    }

    public static Area[][] generateBoard(int x, int y, ArrayList<Enemy> enemies, ArrayList<String> items)
    {
        Area[][] board = new Area[x][y];
        for (Enemy e : enemies)
        {
            int randomX = (int) Math.random() * x + 1;
            int randomY = (int) Math.random() * y + 1;
            board[randomX][randomY].addEnemy(e);
        }
        for (String i : items)
        {
            int randomX = (int) Math.random() * x + 1;
            int randomY = (int) Math.random() * y + 1;
            board[randomX][randomY].addItem(i);
        }
        return board;
    }
}
