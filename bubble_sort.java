
import java.util.Arrays;

class Main {
  static void bubbleSortAlgorithm(int array[]) {
    int size = array.length;
    
    for (int i = 0; i < size - 1; i++)
    
      for (int j = 0; j < size - i - 1; j++)
      
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
        }
  }
  
  public static void main(String args[]) {
    int[] data = { 10, 14, 8, 17, 2 ,1,4,25};
    
    bubbleSortAlgorithm(data);
    
    System.out.println("The array performing the Bubble Sort Algorithm is:");
    System.out.println(Arrays.toString(data));
  }
}
