package question3_1;

public class Sad extends Moody{
    public Sad() {
    }

    @Override
    //returns string indicating sad
    public String getMood() {
        return "sad";
    }

    @Override
    //print crying string “‘waah’  ‘boo hoo’  ‘weep’ ‘sob’”
    public void ExpressFeelings() {
        System.out.println("‘waah’  ‘boo hoo’  ‘weep’ ‘sob’");
    }

    //returns message about self : “Subject cries a lot”
    public String toString(){
        return "Subject cries a lot";
    };

    @Override
    public void queryMood() {
        System.out.println("I feel sad Today");
    }
}
