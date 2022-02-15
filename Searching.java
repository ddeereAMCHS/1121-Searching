import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Searching {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a filename: ");
    String filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    int len = Integer.parseInt(fin.nextLine());
    int[] arr = new int[len];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(fin.nextLine());
    }

    System.out.print("Enter a value to search for: ");
    int target = Integer.parseInt(in.nextLine());

    int indexLin = linearSearch(arr, target);
    Arrays.sort(arr);
    int indexLinS = linearSearch(arr, target);
    int indexBin = binarySearch(arr, target);

    System.out.println("Linear search (unsorted): " + indexLin);
    System.out.println("Linear search (sorted): " + indexLinS);
    System.out.println("Binary search: " + indexBin);

  }

  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) { return i; }
    }
    return -1;
  }

  public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
      int middle = (left + right) / 2;
      if (arr[middle] < target) { left = middle + 1; }
      else if (arr[middle] > target) { right = middle - 1; }
      else { return middle; }
    }
    return -1;
  }
}