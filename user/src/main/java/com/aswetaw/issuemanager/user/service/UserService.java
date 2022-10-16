package com.aswetaw.issuemanager.user.service;

import com.aswetaw.issuemanager.entities.User;
import com.aswetaw.issuemanager.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final UserRepository userRepo;

    @Override
    public void create(User user) {
        userRepo.save(user);
    }

    @Override
    public void update(User user) {
        userRepo.save(user);
    }

    @Override
    public void delete(User user) {
        userRepo.delete(user);
    }

    @Override
    public List<User> getAllUsers() {
        return Collections.emptyList();
    }
}
