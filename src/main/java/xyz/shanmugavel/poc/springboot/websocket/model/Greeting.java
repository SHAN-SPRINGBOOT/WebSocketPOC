package xyz.shanmugavel.poc.springboot.websocket.model;

public class Greeting {

    private String content;

    public Greeting() {
        //noop
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
