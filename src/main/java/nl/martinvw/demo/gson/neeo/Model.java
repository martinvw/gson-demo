package nl.martinvw.demo.gson.neeo;

import java.util.List;
import java.util.Map;

public class Model {
    private List<Map<String, Map<String, String>>> recipes;

    public List<Map<String, Map<String, String>>> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Map<String, Map<String, String>>> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        return "Model{" +
                "recipes=" + recipes +
                '}';
    }
}
