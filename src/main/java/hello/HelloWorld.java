package hello;

public class HelloWorld {
	private final String message = "Hello World!";
    public static void main(String[] args) {
    	System.out.println(new HelloWorld().getMessage());
    }
    
    private final String getMessage() {
        return message;
    }
}

