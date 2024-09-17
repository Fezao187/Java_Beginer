package listing2_4;
//A Program That Uses the JOptionPane Class to Get User Input
import javax.swing.JOptionPane;
public class DialogApp
{
    public static void main(String[] args)
    {
        String s;
        s = JOptionPane.showInputDialog
                ("Enter an integer:");
        int x = Integer.parseInt(s);
        System.out.println("You entered " + x + ".");
    }
}
