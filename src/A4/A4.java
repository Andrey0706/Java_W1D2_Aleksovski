package A4;

public class A4 {
    public static void main(String[] args) {
        String fullName = "John Doe";
        char firstLetter = fullName.charAt(0);
        int empty = fullName.indexOf(" ");
        char secondLetter = fullName.charAt(empty + 1);
        System.out.println("Initials: " + firstLetter + secondLetter);
    }
}
