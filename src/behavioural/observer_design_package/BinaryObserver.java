package behavioural.observer_design_package;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("binary "+Integer.toBinaryString(subject.getState()));
    }
}