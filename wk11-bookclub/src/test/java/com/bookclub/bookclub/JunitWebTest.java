package com.bookclub.bookclub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class JunitWebTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	//Website testing localhost:8080 -- WEB JUNIT TEST #1
	@Test
	public void testGreeting() throws Exception {
	  ResponseEntity<String> entity = restTemplate
	      .getForEntity("http://localhost:" + this.port + "/", String.class);
	  assertEquals(HttpStatus.OK, entity.getStatusCode());
	}
	//Website testing about.html -- WEB JUNIT TEST #2
	@Test
    public void shouldPassIfStringMatches() throws Exception {
        assertThat(restTemplate.getForObject("http://localhost:" + port + "/",
                String.class)).contains("Login Form");
    }
}