package hello;

//This is the Java object that gets served up.
public class Greeting {

    private String hello;

    public Greeting() {
        hello = "world";
    }

    public String getHello() {
        return hello;
    }
}
