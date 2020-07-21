package JAVA;

public class Dog extends Animal{//자식 extends 부모
    public void sleep(){
        System.out.println(this.name+" zzz");
    }
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        //Animal Dog = new Dog;//not vice versa
        dog.sleep();

    }
    
}