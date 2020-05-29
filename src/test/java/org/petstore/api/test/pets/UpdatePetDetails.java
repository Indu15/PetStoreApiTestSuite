package org.petstore.api.test.pets;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.petstore.api.test.util.PetStoreApiTestConstants;

import java.util.Optional;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class UpdatePetDetails implements PetStoreApiTestConstants {

    @Test

    public void FindByPetID() {
        Response response = invokeGet(); /* Calling the method invokeget(); */

        response.body().prettyPrint();
        assertEquals(response.getStatusCode(),200);
        assertEquals(Optional.of(response.getBody().path("id")), Optional.of(1234));
        assertEquals(Optional.of(response.getBody().path("category.id")),Optional.of(10));
        assertEquals(Optional.of(response.getBody().path("category.name")),Optional.of("string"));
        assertEquals(Optional.of(response.getBody().path("name")),Optional.of("doggie"));
        /*assertEquals(Optional.of(response.getBody().path("photoUrls")),Optional.of("string"));
        assertEquals(Optional.of(response.getBody().path("[0].tags.id")),Optional.of(0));*/
        assertEquals(Optional.of(response.getBody().path("category.id")),Optional.of(10));
        assertEquals(Optional.of(response.getBody().path("status")),Optional.of("available"));
        Assert.assertEquals(response.header("Content-Type") /* actual value */, "application/json" /* expected value */);
    }
    @Test
    public   void checkInvalidInput() {

         Response response = given().when() .get(Base_URL + "/pet/0000");
                 response.body().prettyPrint();
                 assertEquals(response.getStatusCode(),404);
                 assertEquals(Optional.of(response.getBody().path("code")), Optional.of(1));
        assertEquals(Optional.of(response.getBody().path("type")), Optional.of("error"));
        assertEquals(Optional.of(response.getBody().path("message")), Optional.of("Pet not found"));
        Assert.assertEquals(response.header("Content-Type"), "application/json");





    }


    private Response invokeGet()  {
        Response response = given().when().get(Base_URL + "/pet/1234");
        return response;
    }

}











