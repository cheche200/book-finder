package com.ignite.bookfinder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ignite.bookfinder.domain.oreilly.ResultWrapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookFinderApplicationTests {

    @Test
    void parsingJsonTest() {
        List<ResultWrapper> resultWrappers = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<ResultWrapper>> typeReference = new TypeReference<List<ResultWrapper>>() {
        };
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/book.json");

        try {
            resultWrappers = mapper.readValue(inputStream, typeReference);
            System.out.println(resultWrappers.get(0));
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }

        assertFalse(resultWrappers.isEmpty());
        assertTrue(resultWrappers.size() == 1);
        assertEquals("https://www.safaribooksonline.com/api/v1/book/9781492071266/",
                resultWrappers.get(0).getResults().get(0).getId());

    }

}
