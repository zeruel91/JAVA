package JAVA;

public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    } 
    public void sleep(){
        System.out.println(this.name+" zzz in house");//sleep 을 덮어씀

    }
    public void sleep(int hour){
        System.out.println(this.name+" zzz in house for " + hour + " hours" );
    }
    public static void main(String[] args){
        HouseDog houseDog = new HouseDog("constructor");//맨 위에 생성자 선언되었기에 이름을 넣어줘야한다.
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(3);//()안에 숫자가 없으면 기존 메소드, 있으면 새로운 매소드
    }
}