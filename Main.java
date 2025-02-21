import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<String> yay = new ArrayList<String>();
    yay.add("A");
    yay.add("B");
    yay.add("C");
    yay.add("D");
    yay.add("E");
    yay.add("F");
    yay.add("G");

    ArrayList<Integer> tspmo = new ArrayList<Integer>();
    tspmo.add(1);
    tspmo.add(2);
    tspmo.add(3);
    tspmo.add(4);
    tspmo.add(5);
    tspmo.add(6);
    tspmo.add(7);

    shiftLeft(yay);
    printStatistics(tspmo);
  }

  public static void shiftLeft(ArrayList<String> arr)
  {
    String frontElement = arr.remove(0);
    arr.add(frontElement);
    System.out.println(arr);
  }

  public static void printStatistics(final ArrayList<Integer> arr)
  {
    int maxCount = 0;
    int count = 0;
    double sum = 0;
    int mode = 0;
    int n = 0;

    for (int i = 0; i < arr.size(); i++)
    {
      count = 0;
      sum += arr.get(i);
      n++;

      for (int j = i; j < arr.size(); j++)
      {
        if(arr.get(i).equals(arr.get(j)))
        {
          count++;
        }
      }

      if (count > maxCount)
      {
        mode = arr.get(i);
        count = maxCount;
      }
    }

    System.out.println("Sum: " + sum);
    System.out.println("Mean: " + (sum/n));
    System.out.println("Mode: " + mode);
  }
}
