package org.petstore.api.test.util;


import org.codehaus.jackson.map.ObjectMapper;
import org.petstore.api.test.Book;
import org.petstore.api.test.bean.Pet;

import java.io.IOException;

public class JsonConvertor {
    public static void main(String[] args) throws IOException {
        //JsonConvertor jsonConvertor = new JsonConvertor();
        Book book = new Book();
        book.setauthor("TestAuthor");
        book.setcolor("Brown");
        book.setname("Test Book");
        book.setpages(100);
        //jsonConvertor.convertObjectToJsonString(book);

        Pet pet = new Pet();
        convertObjectToJsonString(pet);
        convertObjectToJsonString(book);
        book.hashCode();
    }

    public static String convertObjectToJsonString(Object b1) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonstring = mapper.writeValueAsString(b1);
        System.out.println(jsonstring);
        return jsonstring;
    }

}




