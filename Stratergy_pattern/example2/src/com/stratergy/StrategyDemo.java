package com.stratergy;

public class StrategyDemo {
    // client code here
    private static void execute(Stratergy strategy) {
        strategy.solve();
    }

    public static void main( String[] args ) {
        Stratergy[] algorithms = {new FOO(), new BAR()};
        for (Stratergy algorithm : algorithms) {
            execute(algorithm);
        }
    }
}