package Assignments.Task2;

import java.util.ArrayList;
import java.util.List;

// Consider this as a REST Controller class where we will
// mange all the api end points for expression evaluation
public class ExpressionEvaluationUsingWebApiController {
    private ExpressionService expressionService;

    public ExpressionEvaluationUsingWebApiController(ExpressionService expressionService){
        this.expressionService = expressionService;
    }


    //@GetMapping("/evaluateExpressions")
    public List<String> solveExpressions(String[] expressions) throws Exception {
        // Evaluate list of expressions and return the out
        List<String> answers = new ArrayList<>();
        for (String expression : expressions) {
            answers.add(this.expressionService.arithmaticOperations(expression) + "");
        }
        return answers;
    }
}
