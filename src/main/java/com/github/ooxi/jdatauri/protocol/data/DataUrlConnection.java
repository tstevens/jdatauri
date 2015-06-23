package com.github.ooxi.jdatauri.protocol.data;

import com.github.ooxi.jdatauri.DataUri;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 */
public class DataUrlConnection extends URLConnection {

    private DataUri dataUri;
    
    public DataUrlConnection(URL url) {
        super(url);
        dataUri = DataUri.parse(url.toString(), StandardCharsets.UTF_8);
    }

    @Override
    public void connect() throws IOException {
        connected = true;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(dataUri.getData());
    }
}
