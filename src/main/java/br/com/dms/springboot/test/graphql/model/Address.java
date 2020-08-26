package br.com.dms.springboot.test.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String country;
    private String city;
    private String state;
    private String street;
    private String zipCode;

}