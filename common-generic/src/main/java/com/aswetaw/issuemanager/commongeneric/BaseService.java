package com.aswetaw.issuemanager.commongeneric;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 05/11/2022
 **/
public abstract class BaseService<T, ID> {
    protected abstract T findById(ID id);

    protected abstract List<T> findAll();

    protected abstract void deleteById(ID id);

    protected abstract void delete(T entity);

    protected abstract T save(T entity);

    protected abstract T update(ID id, T entity);
}
