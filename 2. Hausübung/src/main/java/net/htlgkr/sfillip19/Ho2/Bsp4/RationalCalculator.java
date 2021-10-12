package net.htlgkr.sfillip19.Ho2.Bsp4;


public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator {
        this.add = (Number a, Number b) -> {
            Number res = new Number();
            if (a.getB() == b.getB()) {
                res.setA(a.getA() + b.getB());
                return res;
            } else {
                int[] values = kgv(a.getB(), b.getB());
            }


        };

        this.multiply=(Number a,Number b)->{
            Number res=new Number();

            res.setA(a.getA()*b.getA());
            res.setB(a.getB()*b.getB());

            return res;
        };

        this.divide=(Number a,Number b) ->{
            Number res=new Number();

            res.setA(a.getA()*b.getB());
            res.setB(a.getB()*b.getA());

            return res;
        };
    }

    @Override
    public net.htlgkr.sfillip19.Ho2.Bsp4.Number add(net.htlgkr.sfillip19.Ho2.Bsp4.Number a, net.htlgkr.sfillip19.Ho2.Bsp4.Number b) {
        return add(a, b);
    }

    @Override
    public net.htlgkr.sfillip19.Ho2.Bsp4.Number sub(net.htlgkr.sfillip19.Ho2.Bsp4.Number a, net.htlgkr.sfillip19.Ho2.Bsp4.Number b) {
        return sub(a,b);
    }

    @Override
    public net.htlgkr.sfillip19.Ho2.Bsp4.Number multiply(net.htlgkr.sfillip19.Ho2.Bsp4.Number a, net.htlgkr.sfillip19.Ho2.Bsp4.Number b) {
        return multiply(a,b);
    }

    @Override
    public net.htlgkr.sfillip19.Ho2.Bsp4.Number divide(net.htlgkr.sfillip19.Ho2.Bsp4.Number a, net.htlgkr.sfillip19.Ho2.Bsp4.Number b) {
        return divide(a,b);
    }

    private double[] kgv(double x, double y) {
        double[] res = null;
        if (x < 0 || y < 0) {

        }
        if (x == y) {
            res = new double[][]{1, 1};
            return res;
        }
        if (x == 1) {
            res = new double[]{y - 1, 1};
            return res;
        }
        if (y == 1) {
            res = new double[]{1, x - 1};
            return res;
        }

        double x1 = x, y1 = y;

        int index_X = 1;
        int index_Y = 1;
        while (x != y) {
            if (x < y) {
                x += x1;
                index_X++;
            } else {
                y += y1;
                index_Y++;
            }
        }
        res = new int[]{index_X, index_Y};

        return res;
    }
}
