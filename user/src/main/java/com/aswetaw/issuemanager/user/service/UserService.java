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
@RequiredArgsConstructor
public class UserService extends BaseService<UserDTO, Long> {

    private final UserRepository userRepo;
    private final UserMapper userMapper;

    public UserDTO findById(Long id) {
        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isPresent())
            return userMapper.toDTO(userOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<UserDTO> findAll() {
        List<User> userList = userRepo.findAll();
        if (userList.isEmpty())
            return Collections.emptyList();
        else
            return userMapper.toDTOList(userList);
    }

    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }

    public void delete(UserDTO userDTO) {
        userRepo.delete(userMapper.toEntity(userDTO));
    }

    public UserDTO save(UserDTO userDTO) {
        User user = userRepo.saveAndFlush(userMapper.toEntity(userDTO));
        return userMapper.toDTO(user);
    }

    public UserDTO update(Long id, UserDTO userDTO) {
        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            BeanUtils.copyProperties(userDTO, user, "id");
            userRepo.save(user);
        }
        // TODO throw id not found exception for modification
        return null;
    }


}
