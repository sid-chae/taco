package com.example.tacocloud.domain;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {
    @NotBlank(message="Name is required")
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-0]$", message="Must be formatted mm/yy")
    private String ccExp;
    @Digits(integer=3, fraction=0, message="invalid cvv")
    private String cvv;


}
