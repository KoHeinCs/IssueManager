package com.aswetaw.issuemanager.user.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.User;
import com.aswetaw.issuemanager.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
@RequiredArgsConstructor
public class UserService implements BaseService<User, Long> {
    private final UserRepository userRepo;

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void delete(User branch) {
        userRepo.delete(branch);
    }

    @Override
    public User save(User branch) {
        return userRepo.saveAndFlush(branch);
    }
}
