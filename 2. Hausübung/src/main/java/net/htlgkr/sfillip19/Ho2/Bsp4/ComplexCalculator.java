package net.htlgkr.sfillip19.Ho2.Bsp4;

import net.htlgkr.sfillip19.Ho2.Bsp4.AbstractCalculator;

public class ComplexCalculator extends AbstractCalculator {

    public ComplexCalculator() {
        add=(Number a,Number b) ->{
            Number res=new Number();

            res.setA(a.getA()+b.getA());
            res.setB(a.getB()+b.getB());

            return res;
        };

        subtract=(Number a,Number b) ->{
            Number res=new Number();

            res.setA(a.getA()-b.getA());
            res.setB(a.getB()+b.getB());

            return res;
        };

        multiply=(Number a,Number b) ->{
            Number res=new Number();

            res.setA((a.getA()*b.getA())+(a.getA()*b.getB()));
            res.setB((a.getB()*b.getA())+(a.getB()*b.getB()));

            return res;
        };

        divide=(Number a,Number b)->{
            Number res=new Number();

            res.setA((a.getA()*b.getA()+(a.getA()*Math.signum(b.getB())));
            res.setB((a.getA()*b.getA())+(a.getA()*Math.signum(b.getB())));

            return res;
        };
    }

    @Override
    public Number add(Number a, Number b) {
        return null;
    }

    @Override
    public Number sub(Number a, Number b) {
        return null;
    }

    @Override
    public Number multiply(Number a, Number b) {
        return null;
    }

    @Override
    public Number divide(Number a, Number b) {
        return null;
    }
}
