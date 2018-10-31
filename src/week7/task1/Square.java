package week7.task1;

public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }


    @Override
    public String toString(){
        return String.valueOf(this.expression) ;
    }

    @Override
    public int evaluate() {
        return this.expression.evaluate() * this.expression.evaluate();
    }
}
