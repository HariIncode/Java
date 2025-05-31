package String.Basics;

public class Basics {
    public static void main(String[] args) {
        // printing();
        // performance();
        buid();
    }

    static void printing(){
        String s = "This is a String"; // This is Created in the String pool
        String str = new String("This is a String"); // This is created as an object since using new keyword

        System.out.println(s == str); // This Checks the address
        System.out.println(s.equals(str)); // This checks the actual sting

        System.out.println(s.charAt(0)); // Accessing a char at a String

        System.out.println('a'); // Prints the character
        System.out.println('a' + 'd'); // Adds the ASCII value of the chars
        System.out.println("a" + "b"); // Concatenate the String
        System.out.println( (char) ('a' + 3) ); // Typecasting the value
    }

    static void performance(){
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }

        System.out.println(series);
    }

    static void buid(){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        System.out.println(builder);

        builder.deleteCharAt(0);

        System.out.println(builder);
    }
}
