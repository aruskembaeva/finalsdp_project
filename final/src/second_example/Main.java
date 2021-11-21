package second_example;

public class Main {
    public static void main(String[] args) {
        State state = new MenuState();
        StepByStep steps = new StepByStep();

        steps.setState(state);

        for(int i =1;i<3;i++){
            System.out.print(i+") ");
            steps.justDoIt();
            steps.changeStep();
        }
    }
}
