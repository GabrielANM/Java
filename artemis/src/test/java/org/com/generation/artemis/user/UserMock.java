package org.com.generation.artemis.user;

import com.github.javafaker.Faker;

import java.util.Locale;

public class UserMock {

    public static User getUser() {
        User userFake = new User();
        Faker faker = new Faker(new Locale("pt-BR"));

        userFake.setNome(faker.name().fullName());
        userFake.setEmail(faker.internet().emailAddress());
        userFake.setLogin(faker.name().username());
        userFake.setSenha(faker.internet().password());

        return userFake;
    }
}
