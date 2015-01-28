package com.mycompany.app;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import static org.junit.Assert.assertEquals;

public class PostgresConnectionTestTest {

    @Test
    public void testPostgres() throws Exception {
        URL postgres = new URL("http://development.demo.jelastic.com/REST/webapi/myresource/postgresTest");
        URLConnection yc = postgres.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream(), "UTF-8"));
        String inputLine;
        StringBuilder a = new StringBuilder();
        while ((inputLine = in.readLine()) != null)
            a.append(inputLine);
        in.close();

        assertEquals(a.toString(), "true");
    }
}