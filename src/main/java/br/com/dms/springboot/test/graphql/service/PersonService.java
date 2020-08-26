package br.com.dms.springboot.test.graphql.service;

import java.util.List;
import java.util.stream.Collectors;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dms.springboot.test.graphql.model.AddressInput;
import br.com.dms.springboot.test.graphql.model.Person;
import br.com.dms.springboot.test.graphql.repository.PersonRepository;

@Service
public class PersonService implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPerson(String name, int minAge, int maxAge) {
        return personRepository.getPeople()
                .stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .filter(p -> minAge == 0 || p.getAge() >= minAge)
                .filter(p -> maxAge == 0 || p.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public Person addPerson(String name, int age, String email, AddressInput address) {
        Person person = Person.builder()
                .name(name)
                .age(age)
                .email(email)
                .address(address)
                .id(personRepository.getPeople().size() + 1)
                .build();

        personRepository.getPeople().add(person);

        return person;
    }

}