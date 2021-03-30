//Program to count number of vowels and consonants in a string
public class VowelsandConsonants {
    public static void main(String agrs[]){
       String str="Supercalifragilisticexpialidocious";
        int vcount=0,ccount=0;
        str=str.toLowerCase();
        for(int i=0; i<str.length();i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u')
                ccount++;
            else
                vcount++;
        }

        System.out.println("number of consonants \n"+ ccount);
        System.out.println("number of vowels \n"+ vcount);

    }


}
