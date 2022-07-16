package com.aswetaw.issuemanager.user.repository;

import com.aswetaw.issuemanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
