package week7.task1;

public class Numeral extends Expression{
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Numeral(int n){
        this.value = n;
    }
    public Numeral(){
        this.value = 7;
    }
    @Override
    public String toString(){
        return String.valueOf(getValue());
    }
    @Override
    public int evaluate(){
        return getValue();
    }


}
