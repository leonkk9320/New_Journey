import java.util.Scanner;
import javax.swing.JOptionPane;
public class Tester{
   public static void main(String[] args){
      //input
      String name;
      name = JOptionPane.showInputDialog("What is your name?");
      String numStr;
      numStr = JOptionPane.showInputDialog("What is your numStr?");
      int num1, num2, num3;
      num1 = Integer.parseInt(numStr);
      numStr = JOptionPane.showInputDialog("What is your numStr?");
      num2 = Integer.parseInt(numStr);
      numStr = JOptionPane.showInputDialog("What is your numStr?");
      num3 = Integer.parseInt(numStr);
      //output
      JOptionPane.showMessageDialog(null,"Hello there "+ name + num1 + num2 +num3);
   }
}