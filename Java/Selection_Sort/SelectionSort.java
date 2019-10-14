// Selection sort implementation program in JAVA
public class SelectionSort {
  public static void main(String[] args)
  {
    // Selection Sort

    // Input Array
    int[] input = new int[]{4,5,7,3,9};
    int minInd;

    // Sort Implementation
    for (int i=0; i<input.length; i++)
    {
      minInd = findMin(input, input.length, i);
      if (i != minInd)
      {
        int temp = input[i];
        input[i] = input[minInd];
        input[minInd] = temp;
      }
    }
    for (int i=0; i<input.length; i++)
    {
      System.out.print(input[i] + " ");
    }
  }

  // Fucntion to find minimum value index in Array
  public static int findMin(int array[],int length, int start)
  {
    int min = array[start];
    int index = start;
    for (int i=start; i<length; i++)
    {
      if (array[i] < min)
      {
        min = array[i];
        index = i;
      }
    }
    return index;
  }
}
