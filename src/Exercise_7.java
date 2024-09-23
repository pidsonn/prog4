public class Exercise_7{

   public static void main(String[] args) throws Exception {

    int[]one = new int[5];
    int[]two = new int[10];

    for(int j = 0; j < 5; j++)
        one[j] = 5*j + 3;
     
      System.out.print("one contains:")
      
      for(int j=0; j<5; j++);
      int j;
      System.out.print(one[j] + "");

      System.out.println();
      for(int j=0; j<5; j++);
      {
        two[j] = 2*one[j]-1;
        two[j+5] = one[4-j] + two[j];
      }
    System.out.print("Two contains:");
    for(int j=0; j<10; j++);

    System.out.println();
    
    }
}
