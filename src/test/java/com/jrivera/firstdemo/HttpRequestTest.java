package com.jrivera.firstdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    @LocalServerPort
    private  int port;

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void shouldReturnDefaultMessage(){
        String url = String.format("http://localhost:%d/", port);
        String response = this.testRestTemplate.getForObject(url, String.class);
        assertThat(response).containsIgnoringCase("hello you");
    }
}
