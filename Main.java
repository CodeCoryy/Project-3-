import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int seats[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    String[] names = new String[15];
    
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < names.length; i++)
    {
      System.out.print("\nIdentify yourself:\n\n");
      names[i] = sc.nextLine();
    }

    int i = 0;
    /*while(i < names.length && i < seats.length)
    {
      System.out.println("\n" + names[i] + " is in seat #" + seats[i]);
      i++;
    }
  }
}*/