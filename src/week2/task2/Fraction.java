package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public int getNumerator()
    {
        return numerator;
    }
    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }
    public int getDenominator()
    {
        return denominator;
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction fr = new Fraction(1,1);
        fr.numerator = this.getNumerator() * other.getDenominator()+ this.getDenominator()*other.getNumerator();
        fr.denominator = this.getDenominator() * other.getDenominator();
      return fr;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction fr = new Fraction(1,1);
        fr.numerator = this.getNumerator() * other.getDenominator() - this.getDenominator()*other.getNumerator();
        fr.denominator = this.getDenominator() * other.getDenominator();
        return fr;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction fr = new Fraction(1,1);
        fr.numerator = this.getNumerator() * other.getNumerator();
        fr.denominator = this.getDenominator() * other.getDenominator();
        return fr;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction fr = new Fraction(1,1);
        fr.numerator = this.getNumerator() * other.getDenominator();
        fr.denominator = this.getDenominator() * other.getNumerator();
        return fr;
    }
    public boolean equals(Object obj)
    {
        if(obj instanceof Fraction)
        {
            Fraction other = (Fraction) obj;
            if(other.getNumerator()*this.getDenominator()==other.getDenominator()*this.getNumerator())
            {
                return true;
            }
            else
                return false;
        }
        return false;
    }

}
