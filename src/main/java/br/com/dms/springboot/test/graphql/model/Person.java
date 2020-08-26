package br.com.dms.springboot.test.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    private int id;
    private String name;
    private int age;
    private String email;
    private Address address;

}