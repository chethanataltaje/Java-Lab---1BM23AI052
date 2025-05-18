public class String_Functions {
    public static boolean compareStrings(String str1, String str2){
        return str1.equals(str2);
    }
    public static String copyStrings(String og){
        return new String(og);
    }
    public static String concatenate(String str1, String str2){
        return str1+str2;
    }

    public static void main(String[] args){
        String str1="Hello";
        String str2="hello";
        System.out.println("Are the strings equal?"+ compareStrings(str1,str2));

        String str3="Hehehe";
        String copied= copyStrings(str3);
        System.out.println("Original string: " + str3);
        System.out.println("Copied string: " + copied);

        String str4= concatenate(str1, str3);
        System.out.println("Concatenated string: "+ str4);
    }
}
