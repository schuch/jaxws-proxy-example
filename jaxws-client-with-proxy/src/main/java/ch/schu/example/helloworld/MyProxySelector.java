package ch.schu.example.helloworld;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.*;
import java.util.*;

public class MyProxySelector extends ProxySelector {

    @Override
    public List<Proxy> select(URI uri) 
    {
        System.out.println("select for " + uri.toString());
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 9999));
        ArrayList<Proxy> list = new ArrayList<Proxy>();
        list.add(proxy);
        return list;   
    }

    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        System.err.println("Connection to " + uri + " failed.");
    }
}