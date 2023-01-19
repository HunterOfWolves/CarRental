package plpolsl.Model;

/**
 * This is a class which handles exceptions
 * @author Kevin 
 * @version 1.1 14.12.2022
 * @since 1.1
 */
public class Myexceptions extends Exception {
    private String message;
    public Myexceptions(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
