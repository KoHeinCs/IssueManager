package com.aswetaw.issuemanager.commongeneric;

import com.aswetaw.issuemanager.common.constant.MessageConstant;
import com.aswetaw.issuemanager.exception.IssueManagerException;
import com.aswetaw.issuemanager.exception.NotFoundException;
import com.aswetaw.issuemanager.request.mapper.BaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Hein Htet Aung
 * @created at 05/11/2022
 **/
@RequiredArgsConstructor
public abstract class BaseService<D, E, ID extends Serializable> {

    protected final JpaRepository<E, ID> jpaRepo;
    protected final BaseMapper<D, E> baseMapper;


    public D findById(ID id) throws IssueManagerException {
        Optional<E> entityOptional = jpaRepo.findById(id);
        if (entityOptional.isPresent())
            return baseMapper.toDTO(entityOptional.get());
        else
            throw new NotFoundException(MessageConstant.ENTITY_NOT_FOUND_MSG);
    }

    public List<D> findAll() {
        List<E> entityList = (List<E>) jpaRepo.findAll();
        if (entityList.isEmpty())
            return Collections.emptyList();
        else
            return baseMapper.toDTOList(entityList);
    }

    public void deleteById(ID id) throws IssueManagerException{
        if (jpaRepo.existsById(id))
            jpaRepo.deleteById(id);
        else throw new NotFoundException(MessageConstant.ENTITY_NOT_FOUND_MSG);

    }

    public void delete(D dto) {
        jpaRepo.delete(baseMapper.toEntity(dto));
    }

    public D save(D dto) {
        E entity = jpaRepo.saveAndFlush(baseMapper.toEntity(dto));
        return baseMapper.toDTO(entity);
    }

    public D update(ID id, D dto) throws IssueManagerException {
        Optional<E> entityOptional = jpaRepo.findById(id);
        if (entityOptional.isPresent()) {
            E entity = entityOptional.get();
            BeanUtils.copyProperties(dto, entity, "id");
            return baseMapper.toDTO(jpaRepo.save(entity));
        } else
            throw new NotFoundException(MessageConstant.ENTITY_NOT_FOUND_MSG);
    }

}
