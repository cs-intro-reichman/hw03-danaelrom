/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String removed = "";
        int n = s.length();
        for(int i = 0; i < n ; i++){
            char check = s.charAt(i);
            if (check == ' ' || removed.indexOf(check) == -1){
                removed = removed + check;  
                 
            }


        }
        return removed;
    }
}
