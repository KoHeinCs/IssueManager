package com.aswetaw.issuemanager.common;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 23/10/2022
 **/
public interface BaseService <T,ID>{
    T findById(ID id);
    List<T> findAll();

    void deleteById(ID id);
    void delete(T entity);

    T save(T entity);
}
