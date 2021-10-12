package net.htlgkr.sfillip19.Ho2.Bsp4;

import net.htlgkr.sfillip19.Ho2.Bsp4.AbstractCalculator;

import java.util.concurrent.RecursiveTask;

public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator() {
        add=(Number a,Number b) ->{
            Number res=new Number();

            res.setA(a.getA()+b.getA());
            res.setB(a.getB()+b.getB());

            return res;
        };

        subtract=(Number a,Number b) ->{
            Number res=new Number();

            res.setA(a.getA()-b.getA());
            res.setB(a.getB()-b.getB());

            return res;
        };

        multiply=(Number a,Number b)->{
            Number res=new Number();

            res.setA(a.getA()*b.getA());
            res.setB(a.getB()*b.getB());

            return res;
        };

        divide=(Number a,Number b)->{
            Number res=new Number();

            res.setA(a.getA()/b.getA());
            res.setB(a.getB()/b.getB());

            return res;
        };
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
    }

    @Override
    public Number sub(Number a, Number b) {
        return subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a,b);
    }
}
