package hello;

/**
 * Created by saurabh on 20/10/17.
 * File is used for rest api test code
 * Reference: https://spring.io/guides/gs/rest-service/
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
