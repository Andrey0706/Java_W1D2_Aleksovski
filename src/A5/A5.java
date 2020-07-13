package A5;

public class A5 {
    public static void main(String[] args) {
        System.out.println(CelsToFar(0));
        System.out.println(FarsToCels(32));
    }

    public static double CelsToFar(double celsius){
        return celsius*9/5 +32;
    }
    public static double FarsToCels(double fars){
        return (fars-32)*5/9;
    }
}
