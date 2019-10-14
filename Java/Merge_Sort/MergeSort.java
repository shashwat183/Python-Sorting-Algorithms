// Merge Sort in JAVA
public class MergeSort{
  public static void main(String[] args)
  {
    // Defifning input
    int[] input = new int[]{1,5,3,6,8,2,9,10,15,23};

    // Merge sort
    // Recursive Algorithm requires seperate functions for all operations
    input = sort(input);

    for (int i=0; i<input.length; i++)
    {
      System.out.print(input[i] + " ");
    }
  }
  // Sort Function
  public static int[] sort(int[] array)
  {
    // check if array already sorted
    if(array.length < 2)
    {
      return array;
    }
    else
    {
      int length = array.length;
      int leftLength = length/2;
      int rightLength = length - leftLength;
      int[] leftArray = new int[leftLength];
      int[] rightArray = new int[rightLength];
      int k =0;
      for (int i = 0; i<leftLength; i++)
      {
        leftArray[i] = array[k++];
      }
      for (int i = 0; i<rightLength; i++)
      {
        rightArray[i] = array[k++];
      }
      leftArray = sort(leftArray);
      rightArray = sort(rightArray);
      return(combine(leftArray, rightArray));
    }

  }

  public static int[] combine(int[] leftArray, int[] rightArray)
  {
    int length = leftArray.length + rightArray.length;
    int[] combinedArray = new int[length];
    int j = 0, i = 0, index = 0;
    while (i<leftArray.length && j<rightArray.length)
    {
      if (leftArray[i]<rightArray[j])
      combinedArray[index++] = leftArray[i++];
      else
      combinedArray[index++] = rightArray[j++];
    }

    while (i<leftArray.length)
    {
      combinedArray[index++] = leftArray[i++];
    }

    while (j<rightArray.length)
    {
      combinedArray[index++] = rightArray[j++];
    }
    return combinedArray;
  }
}
