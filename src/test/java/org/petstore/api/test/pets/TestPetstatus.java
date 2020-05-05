package org.petstore.api.test.pets;


import org.junit.Test;
import org.petstore.api.test.util.PetStoreApiTestConstants;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class TestPetstatus implements PetStoreApiTestConstants {
    @Test
    public void testPetid() {
        given()
                .queryParam("status", "sold")
                .when()
                .get(Base_URL + "/pet/findByStatus")
                .then()
                .statusCode(200)
                .body("[0].id", notNullValue())
                .body("[0].category.name", notNullValue());
           //     .body("[0].status", equalTo("sold"));

    }

    @Test
    public void testPetuploadimage() {
        given()
                .pathParam("petId","1143")
                .contentType("multipart/form-data")
                .multiPart(new File("C:\\download.jpg"))
                .when()
                .post(Base_URL+"/pet/{petId}/uploadImage")
                .then()
                .statusCode(200)
                .body("type",notNullValue());
    }
}


