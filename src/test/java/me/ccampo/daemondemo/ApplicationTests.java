package me.ccampo.daemondemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest(randomPort = true)
public class ApplicationTests {

    private final RestTemplate restTemplate = new TestRestTemplate();

    @Value("${local.server.port}")
    private int port;

    @Test
    public void testHelloWorld() {
        final String response = restTemplate.getForObject("http://localhost:" + port, String.class);
<<<<<<< HEAD
        assertEquals("Hotelbeds Group says Hello World!", response);
=======
        assertEquals("Hello Hotelbeds Group world!", response);
>>>>>>> 817d5b6e70540103bca06833ca75292d7f01a625
    }
}
