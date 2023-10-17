package Assignments.Task2;

public class ExpressionServiceImpl implements ExpressionService{
    @Override
    public long arithmaticOperations(String str) throws Exception{
        return (long)Utils.calculate(str);
    }

    @Override
    public double squareRoot(String str) throws Exception {
        // input string format = sqrt(value || expression);
        String valueString = str.split("\\(")[1].split("\\)")[0];
        long ans = this.arithmaticOperations(valueString);
        return Math.sqrt(ans);
    }


}
