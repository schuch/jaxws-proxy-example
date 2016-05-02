package ch.schu.example.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloImpl implements Hello {
    private String message = new String("Hello, ");

    public void Hello() {}

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}