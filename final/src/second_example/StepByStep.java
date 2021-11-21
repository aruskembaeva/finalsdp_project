package second_example;

public class StepByStep {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeStep(){
        if(state instanceof MenuState){
            setState(new DeliveryState());
        }
    }


    public void justDoIt(){
        state.justDoIt();
    }
}
