package com.example.tacocloud.domain;
//lombok automatically generates getter/setter methods at runtime
import lombok.Data;
import lombok.RequiredArgsConstructor;
//@data tells lombok to generate all missing methods as well as a constructor hat accepts all final properties as arguments
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
