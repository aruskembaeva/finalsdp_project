public class StepByStep {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeStep(){
        if(state instanceof DecoratorState){
            setState(new StrategyState());
        }else if(state instanceof StrategyState){
            setState(new TemplateState());
        }
    }


    public void justDoIt(){
        state.justDoIt();
    }
}
