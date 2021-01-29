public class Move
{
   private int row,
               col;// set variables
   
   /** Move(int row, int col)
       @param int
       the constructor receives two integers and initializes player object and computer object.
   */
   public Move(int row, int col)
   {
      this.row = row;
      this.col = col;
   }
   
   /** Move(int row, int col)
       @param String
       the constructor changes letters to numbers.
   */
   public Move(String s)
   {
      if(s.charAt(0) == 'A')
         this.row = 0;
      else if(s.charAt(0) == 'B')
         this.row = 1;
      else if(s.charAt(0) == 'C')
         this.row = 2;
      else if(s.charAt(0) == 'D')
         this.row = 3;
      else if(s.charAt(0) == 'E')
         this.row = 4;
      else if(s.charAt(0) == 'F')
         this.row = 5;
      else if(s.charAt(0) == 'G')
         this.row = 6;
      else if(s.charAt(0) == 'H')
         this.row = 7;
      else if(s.charAt(0) == 'I')
         this.row = 8;
      else
         this.row = 9;
         
      if(s.length() == 2)
      {
         if(s.charAt(1) == '1')
            this.col = 0;
         else if(s.charAt(1) == '2')
            this.col = 1;
         else if(s.charAt(1) == '3')
            this.col = 2;
         else if(s.charAt(1) == '4')
            this.col = 3;
         else if(s.charAt(1) == '5')
            this.col = 4;
         else if(s.charAt(1) == '6')
            this.col = 5;
         else if(s.charAt(1) == '7')
            this.col = 6;
         else if(s.charAt(1) == '8')
            this.col = 7;
         else if(s.charAt(1) == '9')
            this.col = 8;
       }else
         this.col = 9;
         
     
   }
   
   /** row()
       @return int
       the method returns integer as the value of the row 
   */
   public int row()
   {
      return row;
   }
   
   /** col()
       @return int
       the method returns integer as the value of the col 
   */
   public int col()
   {
      return col;
   }
   
   /** toString()
       @return String
       the method returns a string made of a letter and a number to indicate the position 
   */
   @Override
   public String toString()
   {
      String s1 = "", 
             s2 = "",
             s3 = "";
      if(row == 0)
         s1 += "A";
      else if(row == 1)
         s1 += "B";
      else if(row == 2)
         s1 += "C";
      else if(row == 3)
         s1 += "D";
      else if(row == 4)
         s1 += "E";
      else if(row == 5)
         s1 += "F";
      else if(row == 6)
         s1 += "G";
      else if(row == 7)
         s1 += "H";
      else if(row == 8)
         s1 += "I";
      else
         s1 += "J";
         
         
      if(col == 0)
         s2 += "1";
      else if(col == 1)
         s2 += "2";
      else if(col == 2)
         s2 += "3";
      else if(col == 3)
         s2 += "4";
      else if(col == 4)
         s2 += "5";
      else if(col == 5)
         s2 += "6";
      else if(col == 6)
         s2 += "7";
      else if(col == 7)
         s2 += "8";
      else if(col == 8)
         s2 += "9";
      else
         s2 += "10";
      
      s3 = s1 + s2;
      return s3;
      
   }
   
}