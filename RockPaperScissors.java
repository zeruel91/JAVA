public class 가위바위보 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String me = scan.nextLine();
        Random random = new Random();
        int you_int = random.nextInt(3);
        String you = null;
        if(you_int==0) {
            you = "가위";
        }
        else if(you_int==1) {
            you = "바위";
        }
        else {
            you = "보";
        }
System.out.println(you);
        if(me.equals("가위")&&you.equals("보")) {
            System.out.println("승리하셨습니다");
        }
        else if(me.equals("바위")&&you.equals("가위")) {
            System.out.println("승리하셨습니다");
        }
        else if(me.equals("보")&&you.equals("바위")) {
            System.out.println("승리하셨습니다");
        }
        else if(me.equals(you)) {
            System.out.println("비겼습니다");
        }
        else {
            System.out.println("패배하셨습니다.");
        }
    }
}

#Python.
import random
while True:
    user=input("가위바위보를 하세요:")
    if user=='가위':
        if random.choice(["가위","바위","보"])=="가위":
            print("무승부")
        elif random.choice(["가위","바위","보"])=="바위":
            print("패")
        else:
            print("승")
    if user=='바위':
        if random.choice(["가위","바위","보"])=="가위":
            print("승")
        elif random.choice(["가위","바위","보"])=="바위":
            print("무승부")
        else:
            print("패")
    if user=='보':
        if random.choice(["가위","바위","보"])=="가위":
            print("패")
        elif random.choice(["가위","바위","보"])=="바위":
            print("승")
        else:
            print("무승부")
