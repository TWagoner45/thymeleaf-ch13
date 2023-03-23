public class HelloWorld {
    private String message = "Hello World"; //field object high level

    public HelloWorld(String message){ //constructor named after the class no return type
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String aMessage) {
        message = aMessage;
    }

    public void sayHello() { //method

        String message = "Goodbye World"; //local variable method to our object

        System.out.println(this.message);
     //    System.out.println(this.message);  //print message sout short cut. adding 'this' makes it an instance of the class
    }
}
