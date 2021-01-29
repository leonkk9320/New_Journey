
public class ListTester
{

	public static void main(String [] args)
	{
      final int N = 100000;
	   long time1,time2, diff;
      ListInterface<Integer> list1 = new ListArrayBased<>();
      ListInterface<Integer> list2 = new ListReferenceBased<>();
      
   }
   // Traverse list displaying data in each item
   // I surpressed the output for your testing.
	public static void displayList(ListInterface<Integer> list)
	{
		for (int i = 1; i<=list.size();i++)
			//System.out.println(list.get(i));
         list.get(i); 

	
	
	}
}