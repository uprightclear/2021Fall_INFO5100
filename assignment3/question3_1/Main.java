package question3_1;

public class Main {
    public static void main(String[] args) {
        Sad sad = new Sad();
        Happy happy = new Happy();
        Psychiatrist psychiatrist = new Psychiatrist();

        psychiatrist.examine(happy);
        System.out.println();
        psychiatrist.observe(happy);
        System.out.println();
        psychiatrist.examine(sad);
        System.out.println();
        psychiatrist.observe(sad);
    }
}
