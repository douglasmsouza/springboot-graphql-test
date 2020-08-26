package br.com.dms.springboot.test.graphql.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import br.com.dms.springboot.test.graphql.model.Address;
import br.com.dms.springboot.test.graphql.model.Person;
import lombok.Getter;

@Repository
public class PersonRepository {

    @Getter
    private Collection<Person> people;

    public PersonRepository() {
        this.people = new ArrayList<>();
        this.people.add(new Person(1, "Douglas", 31, "douglas.souza@indyxa.com.br",
                new Address("Brazil", "Blumenau", "SC", "Rua Jose Deeke, 595, apto 502", "89031-400")));

        this.people.add(new Person(2, "Robinho", 36, "robinho@santosfc.com.br",
                new Address("Brazil", "Santos", "SP", "Rua Princesa Isabel", "11070-000")));

        this.people.add(new Person(3, "Rei Pele", 70, "pele@santosfc.com.br",
                new Address("Brazil", "Santos", "SC", "Rua dos mitos", "10101-010")));

        this.people.add(new Person(4, "Neymar", 29, "neymar@psg.br",
                new Address("France", "Paris", "", "Rua Paris", "11111-111")));
    }
}