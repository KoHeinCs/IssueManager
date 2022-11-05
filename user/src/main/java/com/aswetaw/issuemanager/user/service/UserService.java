package com.aswetaw.issuemanager.user.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.User;
import com.aswetaw.issuemanager.request.dto.UserDTO;
import com.aswetaw.issuemanager.request.mapper.UserMapper;
import com.aswetaw.issuemanager.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class UserService extends BaseService<UserDTO,User, Long> {
    private  UserRepository userRepo;
    private  UserMapper userMapper;
    public UserService(UserRepository userRepo,UserMapper userMapper){
        super(userRepo,userMapper);
    }

}
