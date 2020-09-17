import java.util.Random;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);
    String[] MonthString = {
      "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
    };
    System.out.println("해당월의 영어단어(3글자)를 입력하시오.");
    System.out.println("");
    int retry;
    int last = -1;
    do{
      int month;
      do {
        month = rand.nextInt(12);
      } while (month == last);
      last = month;
      while (true){
        System.out.print((month+1)+"월");
        String s =stdIn.next();

        if (s.equals(MonthString[month])) break;
        System.out.print("틀렸습니다.");
      }
      System.out.print("정답입니다. 다시한번? 1=yes/0=No");
      retry = stdIn.nextInt();
    } while (retry == 1);

  }
}
