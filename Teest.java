package JAVA;

public class Teest {
    public int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        int a = 3;
        int b = 4;

        Teest myTest = new Teest();
        int c = myTest.sum(a,b);

        System.out.println(c);
    }
    
}