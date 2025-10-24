package dev.jobs.jobapplications.api.service;

import dev.jobs.jobapplications.api.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private List<User> userList;

    public UserService(){
        this.userList = new ArrayList<>();

        User user1 = new User(1, "Pedro", 23, "TESTE");
        User user2 = new User(2, "Joana", 32, "TESTE2");

        userList.addAll(Arrays.asList(user1, user2));
    }
    
    public Optional<User> getUser(Integer id) {
        for (User user : userList ){
            if (Objects.equals(id, user.getId())){
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
