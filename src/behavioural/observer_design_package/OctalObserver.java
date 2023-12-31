package behavioural.observer_design_package;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal "+Integer.toOctalString(subject.getState()));
    }
}
