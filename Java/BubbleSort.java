// Bubble sort implementation in JAVA
public class BubbleSort{
  public static void main(String[] args)
  {
    // Defining input
    int[] input = new int[]{2,1,6,5,9,8,10,12,14,23};

    // Bubble sort
    for (int i=0; i<input.length; i++)
    {
      for (int j=1; j<input.length; j++)
      {
        if (input[j-1] > input[j])
        {
          int temp = input[j-1];
          input[j-1] = input[j];
          input[j] = temp;
        }
      }
    }

    // Print the input on std output
    for (int i=0; i<input.length; i++)
    {
      System.out.print(input[i] + " ");
    }
  }
}
