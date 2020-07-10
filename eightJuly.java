package JAVA; 
import java.util.HashMap; //유틸 불러오기

public class eightJuly {
    public static void main(String args[]) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.get("people"));
        System.out.println(map.containsKey("people"));
        System.out.println(map.remove("people"));
        System.out.println(map.size());
    }
    
}

/* map <- 함수 */