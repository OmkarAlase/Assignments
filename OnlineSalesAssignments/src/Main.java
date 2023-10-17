import Assignments.Task2.ExpressionEvaluationUsingWebApiController;
import Assignments.Task2.ExpressionService;
import Assignments.Task2.ExpressionServiceImpl;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        /*
        Demo of & some unit testcases for expression evaluation.
         */
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
    //------------------------------------------------------------------------------------------------------------------------------

        /*
               Advanced Concurrency Management | Handling huge no.of incoming requests
         */

        /*
         To handle the concurrency & huge number of api calls we will make use of advanced concurrency
         management utility like Executer Service
         */
        ExecutorService executorService = Executors.newFixedThreadPool(50);

        /*
        Here we have created thread pool of size 50 so that our program will create max 50 threads at
        a single point in time regardless of no.of incoming requests.

        If all the threads are buzy then the requests are queued up so that it can be served later once any of these
        threads becomes available.

        Now we will force our class implement runnable interface so that we can pass the reference to thread pool
        for further execution
         */

        executorService.execute(()->{
            try {
                List<String> answers = controller.solveExpressions(expressions);
                System.out.println(answers);
            }
            catch (Exception e){
                System.out.println("Expression evaluation error | please check the input format " + e.getMessage());
            }
        });
    }
}