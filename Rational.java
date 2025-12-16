import java.math.BigInteger;

public class Rational {
    private BigInteger numerator;   // 分子
    private BigInteger denominator; // 分母

    // 分子、分母両方与えた場合のコンストラクタ(BigInteger型)
    public Rational(BigInteger numerator, BigInteger denominator) {
		if (denominator == null) {
			throw new IllegalArgumentException("分母はnullにできません.");
		}
		if (numerator == null) {
			throw new IllegalArgumentException("分子はnullにできません.");
		}
		if (denominator == new BigInteger("0")) {
			throw new IllegalArgumentException("分母は0にできません.");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

    // 分子のみ与えられた場合のコンストラクタ(BigInteger型)
    public Rational(BigInteger numerator){
        this.numerator = numerator;
        this.denominator = BigInteger.ONE;
    }

    // 分子のみ与えられた場合のコンストラクタ(int型)
    public Rational(int numerator){
        Integer n = Integer.valueOf(numerator);
        this.numerator = new BigInteger(n.toString());
        this.denominator = BigInteger.ONE;
    }

    // 分子、分母両方与えた場合のコンストラクタ(int型)
    public Rational(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("分母は0にできません.");
		}
        Integer n = Integer.valueOf(numerator);
        Integer d = Integer.valueOf(denominator);
		this.numerator = new BigInteger(n.toString());
		this.denominator = new BigInteger(d.toString());
	}

    // ゲッター・セッター
    public BigInteger getNumerator(){
        return this.numerator;
    }

    public BigInteger getDenominator(){
        return this.denominator;
    }

    public String getRational(){
        return this.numerator.toString() + "/" + this.denominator.toString();
    }

}
