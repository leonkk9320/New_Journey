/** Relatable  interface ( can only extend one class, but you can implement as many interfaces as u want)
*/
public interface Relatable
{
   boolean equals(GradeActivity g);
   boolean isGreater(GradeActivity g);
   boolean isLess(GradeActivity g);   
}