package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testRecipe(){
        Recipe recipe1=new Recipe("Chocolate cake");
        Recipe recipe2=new Recipe("Gulyas leves","eredeti magyar leves");
        assertEquals("Chocolate cake",recipe1.getName());
        assertEquals("Gulyas leves",recipe2.getName());
        assertEquals("eredeti magyar leves",recipe2.getDescription());
    }

    @Test
    void testAddIngredients(){
        Recipe recipe1=new Recipe("Chocolate cake");
        Recipe recipe2=new Recipe("Gulyas leves","eredeti magyar leves");
        recipe2.addIngredient("krumpli","marhahus","repa","pirospaprika");
        assertEquals(4,recipe2.getIngredients().size());
        recipe1.addIngredient("cocoa","sugar","milk");
        assertEquals(3,recipe1.getIngredients().size());
    }
}