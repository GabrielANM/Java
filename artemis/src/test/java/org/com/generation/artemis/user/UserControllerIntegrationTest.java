package org.com.generation.artemis.user;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import org.com.generation.artemis.ArtemisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtemisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerIntegrationTest {



    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;

    private String getRootUrl(String path) {
        return "http://localhost:" + port + "/api/v1" + path;
    }

    private String randomStringNome() {

        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        return generatedString;

    }

    private String randomStringEmail() {

        int length = 5;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        return generatedString;
    }

    private String randomStringLogin() {

        int length = 7;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        return generatedString;
    }

    private String randomStringSenha() {

        int length = 12;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        return generatedString;
    }

    Faker faker = new Faker();

    String nome = faker.name().fullName();
    String email = faker.internet().emailAddress();
    String login = faker.name().username();
    String senha = faker.internet().password();

    @Test
    public void save() {
        ResponseEntity<User> postResponse = testRestTemplate.postForEntity(getRootUrl("/users"), UserMock.getUser(), User.class);
        assertNotNull(postResponse);
        assertEquals(201, postResponse.getStatusCodeValue());
    }

    @Test
    public void read() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = testRestTemplate.exchange(getRootUrl("/users"), HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    public void readById() {
        User user = testRestTemplate.getForObject(getRootUrl("/users/1"), User.class);
        assertNotNull(user);
    }

    @Test
    public void update() {
        int id = 1;

        User user = testRestTemplate.getForObject(getRootUrl("/users/" + id), User.class);

        String novoNome = UserMock.getUser().getNome();
        String novoEmail = UserMock.getUser().getEmail();

        user.setNome(novoNome);
        user.setEmail(novoEmail);

        testRestTemplate.put(getRootUrl("/users/" + id), user);

        User newUser = testRestTemplate.getForObject(getRootUrl("/users/" + id), User.class);
        assertEquals(novoNome, newUser.getNome());
        assertEquals(novoEmail, newUser.getEmail());
    }

    @Test
    public void delete() {
        int id = 1;
        User user = testRestTemplate.getForObject(getRootUrl("/users/" + id), User.class);
        assertNotNull(user);
        testRestTemplate.delete(getRootUrl("/users/" + id));
        try {
            user = testRestTemplate.getForObject(getRootUrl("/status/" + id), User.class);
        } catch(final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);

        }

    }

}

