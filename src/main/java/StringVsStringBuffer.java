public class StringVsStringBuffer {
    public static String concatenateWithSting(){
        String str="Hello";
        for(int i=0; i<1000; i++){
            str.concat(",How are you?");
        }
        return str;
    }
    public static StringBuffer appendWithStringBuffer(){
        StringBuffer str= new StringBuffer("Hello");
        for(int i=0;i<1000;i++){
            str.append(", How are you?");
        }
        return str;
    }
    public static void main(String []agrs){
        long stTime= System.currentTimeMillis();
        concatenateWithSting();
        System.out.println("time taken by String:" + (System.currentTimeMillis()-stTime) + "ms");
        stTime=System.currentTimeMillis();
        appendWithStringBuffer();
        System.out.println("time taken by StringBuffer:"+ (System.currentTimeMillis()-stTime) + "ms");
    }
}
//StringBuffer is faster and better as it is mutable and does not have to create new instance each time
