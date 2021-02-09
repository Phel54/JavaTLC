public class trial {

    private String greeting = " ";
    private String target = " ";

    public void setGreeting(String greeting){
        this.greeting = greeting;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String greet(){
        return greeting + " " + target;
    }
    public String greet(String whotogreet){
        return greeting + " " + whotogreet;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getTarget() {
        return target;
    }

    public static void main(String[] args) {


    }
}
