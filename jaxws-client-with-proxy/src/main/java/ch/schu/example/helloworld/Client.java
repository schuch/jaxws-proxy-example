package ch.schu.example.helloworld;

import java.net.ProxySelector;

import ch.schu.example.hello.HelloImpl;
import ch.schu.example.hello.HelloImplService;

public class Client {

    public static void main(String[] args) {
        
        ProxySelector.setDefault(new MyProxySelector());
        
        HelloImplService service = new HelloImplService();
        HelloImpl hello = service.getHelloImplPort();
        System.out.println(hello.sayHello("Howard Wollowitz"));
    }
    
}
