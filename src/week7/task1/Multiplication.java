package week7.task1;

public class Multiplication extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Multiplication(Expression a , Expression b){
        this.left = a;
        this.right = b;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        return String.valueOf(this.right) +" * " + this.left;
    }

    @Override
    public int evaluate() {
        return this.left.evaluate() * this.right.evaluate();
    }
}
