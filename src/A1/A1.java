package A1;

public class A1 {
    public static void main(String[] args) {
        String hannah ="Did Hannah see bees? Hannah did";
        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        System.out.println("The char. b is at position 15 and we will get it with hannah.charAt(15): " + hannah.charAt(15));

        System.out.println(getCharAtposition(hannah, 4));

    }

    public static String getCharAtposition(String theString, int position){
        return ("The char at position " + position + " is " + theString.charAt(position));
    }
}
