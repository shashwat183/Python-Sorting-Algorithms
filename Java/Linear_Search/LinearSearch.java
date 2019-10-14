// Linear Search algorithm implementation in JAVA
public class LinearSearch {
  public static void main(String[] args)
  {
    // Defining input for search
    int[] input = new int[]{1,2,4,6,5,3,7,9,10}; 
    int toFind = 5;
    int index = -1;

    // Linear search
    for (int i=0; i<input.length; i++)
    {
      if(input[i] == toFind)
      {
        index = i;
      }
    }

    if (index != -1)
    {
      System.out.println("Value found at index: " + index);
    }
    else
    {
      System.out.println("Value not in the input");
    }
  }
}
