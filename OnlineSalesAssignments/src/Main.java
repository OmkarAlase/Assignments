import Assignments.Task2.ExpressionEvaluationUsingWebApiController;
import Assignments.Task2.ExpressionService;
import Assignments.Task2.ExpressionServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args){
        String[] expressions = {
                "2 * 4 * 4",
                "2 * 5 / 4"
        };
        ExpressionService expressionService = new ExpressionServiceImpl();
        ExpressionEvaluationUsingWebApiController controller = new ExpressionEvaluationUsingWebApiController(expressionService);
        try {
            List<String> answers = controller.solveExpressions(expressions);
            System.out.println(answers);
        }
        catch (Exception e){
            System.out.println("Expression evaluation error | please check the input format " + e.getMessage());
        }
    }
}