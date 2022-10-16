package com.aswetaw.issuemanager.request.mapper;

import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
public interface BaseMapper <D,E>{
    E toEntity(D dto);
    D toDTO(E entity);
    List<E> toEntityList(List<D> dtoList);
    List <D> toDTOList(List<E> entityList);
}
