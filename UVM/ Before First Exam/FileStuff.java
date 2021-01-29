import java.io.*;
import java.util.Scanner;

public class FileStuff
{
   public static void main(String [] args) throws IOException
   {
     File f = new File("names.txt");
     Scanner infile = new Scanner(f);
     //Scanner infile = new Scanner(new File("names.txt"));
     String line;
     while(infile.hasNext())
     {
        line = infile.nextline();
        System.out.println(line);
     }
         //FileWriter fw = new FileWriter("newfile.text");
     //PrintWriter outfile = new PrintWriter(fw);
     //or
     PrintWriter outfile = new PrintWriter("newfile.txt",true);//true makes txt append on wrong! 
     //FileWriter outfile = new FileWriter("newfile.text",true);
     outfile.print("Line 1");
     outfile.println("more on line 1");
     outfile.println("line 2");
          
     
     
     outfile.close();
   }
}