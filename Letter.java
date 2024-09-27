public class Letter {
    // instance variables
    private String writer;

    // constructor; since there are no instance variables to initialize,
    // this constructor has no parameters and has an empty body: { }
    public Letter(String writer) { 
        this.writer = writer;
    }
    
    public void writeLetter(String name){
        greeting(name);
        specialMessage();
        closing();
        System.out.println("From, " + writer);
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
    }
}

