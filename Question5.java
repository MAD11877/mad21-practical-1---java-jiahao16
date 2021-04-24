import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int no = in.nextInt();
    ArrayList<Int> numList = new ArrayList<Int>();
    int mode = 0;
    int highest = 0;
    for (int i = no; i > 0; i--){
      int num = in.nextInt();
      numList.add(num);
    }
    for (int i = 0; i < no; i++){
      int number = numList.get(i);
      int occurence = 0;
      for (int j = 0; j < no; j++){
        if(numList.get(j) == number){
          occurence++;
        }
        if (occurence>highest){
          mode= number;
          highest=occurence;
        }
      }
    }
    System.out.print(mode);
  }
}
