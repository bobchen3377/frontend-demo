@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK) // Default Http Status Code.
    public String defaultExceptionHandler(HttpServletRequest request, Exception ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE) // Specify your Http Status Code.
    public String defaultRuntimeExceptionHandler(HttpServletRequest request, Exception ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK) // Specify your Http Status Code
    public String nullPointerExceptionHandler(HttpServletRequest request, Exception ex) {
        return ex.getMessage();
    }
}
