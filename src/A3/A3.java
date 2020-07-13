package A3;

public class A3 {
    public static void main(String[] args) {
        String theString = "Hello World";
        String string2 ="Hello World";
        System.out.println(theString.indexOf("W")); //returns the index of the value we enter
        System.out.println(theString.startsWith("He")); //returns true or false depending if the string starts with the line we enter
        System.out.println(theString.compareTo(string2));
        System.out.println(theString.trim()); //eliminates leading and trailing spaces
        System.out.println(theString.replace("l", "p"));
        System.out.println(theString.replaceAll("ll", "pp"));
        String[] theArray = theString.split(" ", 3);
        for(String w:theArray){
            System.out.println(w);
        }

        if (theString.contains("ls")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        if (theString.endsWith("ld")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
