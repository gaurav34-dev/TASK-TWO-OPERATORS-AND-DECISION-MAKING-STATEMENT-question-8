import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while(true)
      {
   Scanner input = new Scanner (System.in); 
    System.out.println("ENTER THE CHARACTER");
    char z = input.next().charAt(0);
    if(z=='r'||z=='R'||z=='a'||z=='A'||z=='n'||z=='N'||z=='d'||z=='D'||z=='o'||z=='O'||z=='m'||z=='M')
    {
      System.out.println("FOUND");
      break;
    } 
    else
    {
      System.out.println("NOT FOUND");
    }
    }
  }
}


