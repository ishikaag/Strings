//Program to count the number of characters in a string
public class NoofChars {
    public static int numOfChars(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String str="hello how are you?";
        System.out.println("number of chars are "+numOfChars(str));
    }
}
