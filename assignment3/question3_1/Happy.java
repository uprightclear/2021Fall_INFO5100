package question3_1;

public class Happy extends Moody{
    public Happy() {
    }

    @Override
    //returns string indicating happy
    public String getMood() {
        return "happy";
    }

    @Override
    //print laughter string “heeehee....hahahah...HAHAHA!!”
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return "Subject laughs a lot";
    };

    @Override
    public void queryMood() {
        System.out.println("I feel happy Today");
    }
}
