package com;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadTextUtil {

    public static String getContents()  {

        String data = "";
        String fileName = "thermopylae.txt";

        URL url = ReadTextUtil.class.getClassLoader().getResource(fileName);

        if (url == null) {
            data = "no text data found";
        }

        try {
            data = Files.readString(Paths.get(url.toURI()), StandardCharsets.UTF_8);
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(ReadTextUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return data;
    }
}

