public class RationalApp{
    public static void main(String[] args){
        Rational a = new Rational(1,3);
        Rational b = new Rational(1,2);
        Rational c = a.add(b);
        Rational d = a.minus(b);
        Rational e = a.multiply(b);
        Rational f = a.divide(b);
        System.out.println("a = " + a.getRationalToString() + ", b = " + b.getRationalToString());
        System.out.println("足し算:" + c.getRationalToString());
        System.out.println("引き算:" + d.getRationalToString());
        System.out.println("掛け算:" + e.getRationalToString());
        System.out.println("割り算:" + f.getRationalToString());
    }
}

