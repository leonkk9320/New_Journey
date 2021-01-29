public class test1
{
   public static void main(String[] args)
   {
      Node<Integer> head = new Node<Integer>(5,new Node<Integer>(7,(new Node<Integer>(9))));
      for (Node curr = head; curr != null; curr = curr.getNext())
      {
         System.out.println(curr.getItem());
      }
      Node<Integer> addThis = new Node<Integer>(1);
      head = head.addBegin(addThis);
      for (Node curr = head; curr != null; curr = curr.getNext())
      {
         System.out.println(curr.getItem());
      }
   }


}