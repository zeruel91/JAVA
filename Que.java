package JAVA;

import java.util.*;

public class Que {

    public static void main(String[] args) {
        
        LinkedList<String> ls = new LinkedList<String>();

        ls.offer("홍길동");
        ls.offer("tom");
        ls.offer("someone");
        ls.offer("help");

        System.out.println("Size = " + ls.size());

        while(ls.peek() != null)//읽을값이 있는가?
            System.out.println(ls.poll());//값을 읽어서 출력
        System.out.println("Size = " + ls.size());
    
    }
    
}