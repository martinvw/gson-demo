package nl.martinvw.demo.gson.neeo;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {
    private final Gson gson = new Gson();

    @Test
    void testSerialize() throws FileNotFoundException {
        JsonReader reader = new JsonReader(new FileReader("target/test-classes/example.json"));
        Model data = gson.fromJson(reader, Model.class);
        System.out.println(data);
    }
}