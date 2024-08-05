package com.example.coctelesherbario.validation;

import com.example.coctelesherbario.exception.custom.CocktailException;

public class CocktailValidation {

    public static void idValidation(int id) throws Exception{
        if (id <= 0){
            throw new CocktailException("The id cannot be less than 0");
        }
        String idString = Integer.toString(id);
        if (!idString.matches("^[0-9]+(\\.[0-9]+)?$")) {
            throw new CocktailException("The id can only contain numbers");
        }

    }

    public static void priceValidation(float price) throws Exception {
        if (price < 0) {
            throw new CocktailException("The price cannot be less than 0");
        }
        String priceString = Float.toString(price);
        if (!priceString.matches("^[0-9]+(\\.[0-9]+)?$")) {
            throw new CocktailException("The price can only contain numbers");
        }
    }

    public static void nameValidation(String name) throws Exception {
        if (!name.matches("^[a-zA-Z]+$")) {
            throw new CocktailException("The name can only contain letters");
        }
    }

    public static void dueDateValidation(byte dueDate) throws Exception {
        if (dueDate <= 0) {
            throw new CocktailException("The due date must be greater than 0");
        }
        String dueDateString = Byte.toString(dueDate);
        if (!dueDateString.matches("^[0-9]+$")) {
            throw new CocktailException("The due date can only contain numbers.");
        }

    }

}
