package com.aswetaw.issuemanager.user.service;

import com.aswetaw.issuemanager.model.User;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
public interface IUserService {
    void create(User user);
    void update(User user);
    void delete(User user);
}
