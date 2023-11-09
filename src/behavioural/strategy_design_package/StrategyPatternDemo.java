package behavioural.strategy_design_package;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.execudeStrategy(10,5));

        Context context1 = new Context(new OperationSubstract());
        System.out.println("10 - 5 = "+context1.execudeStrategy(10,5));

        Context context2 = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+context2.execudeStrategy(10,5));

        Context context3 = new Context(new OperationDivide());
        System.out.println("10 / 5 = "+context3.execudeStrategy(10,5));
    }

}
