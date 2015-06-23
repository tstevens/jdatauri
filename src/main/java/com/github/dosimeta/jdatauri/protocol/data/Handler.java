package com.github.dosimeta.jdatauri.protocol.data;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/**
 */
public class Handler extends URLStreamHandler {
    
    @Override
    protected URLConnection openConnection(URL u) throws IOException {
        return new DataUrlConnection(u);
    }
    
}
