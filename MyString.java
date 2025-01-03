public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
       
        
        int l1 = str1.length();
        int l2 = str2.length();
        

        for (int i = 0; i <= (l1-l2); i++) {
            boolean match = true;
            for (int j = 0; j < l2; j++) {
                if( str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }

                
                }
                if (match){
                    return true;

                
            }
        }
        return false;
        

        
    }
}
