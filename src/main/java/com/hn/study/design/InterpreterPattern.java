package com.hn.study.design;

/**
 * 解释器模式
 *
 * @author Mr.hn
 * 2022/08/09 17:44
 */
public class InterpreterPattern {
    public static void main(String[] args) {
        // 构建表达式：2 + (3 - 1)
        Expression expression = new AddExpression(
                new NumberExpression(2),
                new SubtractExpression(
                        new NumberExpression(3),
                        new NumberExpression(1)
                )
        );

        // 解释并计算表达式的值
        int result = expression.interpret();
        System.out.println("Result: " + result); // 输出: Result: 4
    }

    interface Expression {
        int interpret();
    }

    static class NumberExpression implements Expression {
        private int value;

        public NumberExpression(int value) {
            this.value = value;
        }

        @Override
        public int interpret() {
            return value;
        }
    }


    static class AddExpression implements Expression {
        private Expression leftOperand;
        private Expression rightOperand;

        public AddExpression(Expression leftOperand, Expression rightOperand) {
            this.leftOperand = leftOperand;
            this.rightOperand = rightOperand;
        }

        @Override
        public int interpret() {
            return leftOperand.interpret() + rightOperand.interpret();
        }
    }


    static class SubtractExpression implements Expression {
        private Expression leftOperand;
        private Expression rightOperand;

        public SubtractExpression(Expression leftOperand, Expression rightOperand) {
            this.leftOperand = leftOperand;
            this.rightOperand = rightOperand;
        }

        @Override
        public int interpret() {
            return leftOperand.interpret() - rightOperand.interpret();
        }
    }

}
