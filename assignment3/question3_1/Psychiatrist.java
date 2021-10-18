package question3_1;

public class Psychiatrist extends Moody{
    public Psychiatrist() {
    }

    //asks moody object about its mood
    public void examine(Moody Object){
        System.out.println("How are you feeling today?");
        Object.queryMood();
    };

    //a moody Objects observed to either laugh or cry
    public void observe(Moody Object){
        Object.ExpressFeelings();
        System.out.println("Observation: " + Object.toString());

    };

    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return null;
    };

    @Override
    public String getMood() {
        return null;
    }

    @Override
    public void ExpressFeelings() {

    }
}
