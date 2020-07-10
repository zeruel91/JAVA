package JAVA;
public class HelloWorld76 {
    public static void main(String[] args){
        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.replaceAll("h","t"));
        StringBuffer sb = new StringBuffer();
        sb.append("Jump to JAVA");
        sb.insert(0,"hello")
        System.out.println(sb.toString());
        
    }
    
}
//System.out.println(a.indexOf("h"));0에서 시작한다.
//String a = "hello"; 
//System.out.println(a.replaceAll("h","t")); 문자, 문자열 변경
//System.out.println(a.substring(0,4)); 섭스트링 슬라이스 특정부분.
//System.out.println(a.toUpperCase()); 대문자로