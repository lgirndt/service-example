package de.girndt;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ExampleTest {

    @BeforeClass
    public static void setupClass() {
        RestAssured.baseURI = "http://" + System.getenv("INTEGRATION_HOST_PORT");
    }

    @Test
    public void test_something() {
        assertTrue(true);
    }

    @Test
    public void get_root_should_be_ok() {
        when().get("/").then().statusCode(200);
    }
}
