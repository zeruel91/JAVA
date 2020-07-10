package JAVA;

import java.util.ArrayList;

public class nine {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        int money = 2000;
        boolean hasCard = true;

        if (money>=3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("money");
        pocket.add("handphone");

        if (pocket.contains("money")){
            System.out.println("get a cab")

        }else {
            System.out.println("fuck you");
        }

    
        

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else {
            if (hasCard) {
                System.out.println("택시를 타고 가라");
            }else {         
                System.out.println("걸어가라");
            }
}
    }
}