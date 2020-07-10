package JAVA;

public class TV {

    int channel;

    //디폴트 생성자
    public TV() {}

    //생성자
    public TV(int intValue) {
        this.channel = intValue;
    }
    protected void channelUp(){
        channel = channel + 1;
    }
    public void channelDown() {
        channel = channel - 1;
        if (channel < 0) {
            channel = 0;
        }
    }
    public static void main(String args[]){
        TV objTV = new TV(11);
        System.out.println("현재 채널은 " + objTV.channel + "번입니다.");
    }
}