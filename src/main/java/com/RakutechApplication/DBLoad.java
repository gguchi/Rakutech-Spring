package com.RakutechApplication;

import com.RakutechApplication.model.User;
import com.RakutechApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBLoad implements CommandLineRunner {

    private final UserRepository repository;

    @Autowired
    public DBLoad(UserRepository repository) {
        this.repository = repository;
    }

    public void run(String... strings) throws Exception {
        this.repository.save(new User("email2", "new", "new"));
    }

}
