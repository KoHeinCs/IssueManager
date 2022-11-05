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

    private final JpaRepository<E, ID> jpaRepo;
    private final BaseMapper<D, E> baseMapper;


    public D findById(ID id) throws IssueManagerException {
        Optional<E> branchOptional = jpaRepo.findById(id);
        if (branchOptional.isPresent())
            return baseMapper.toDTO(branchOptional.get());
        else
            throw new NotFoundException(MessageConstant.BRANCH_NOT_FOUND_MSG);
    }

    public List<D> findAll() {
        List<E> branchList = (List<E>) jpaRepo.findAll();
        if (branchList.isEmpty())
            return Collections.emptyList();
        else
            return baseMapper.toDTOList(branchList);
    }

    public void deleteById(ID id) {
        jpaRepo.deleteById(id);
    }

    public void delete(D dto) {
        jpaRepo.delete(baseMapper.toEntity(dto));
    }

    public D save(D dto) {
        E entity = jpaRepo.saveAndFlush(baseMapper.toEntity(dto));
        return baseMapper.toDTO(entity);
    }

    public D update(ID id, D dto) throws IssueManagerException {
        Optional<E> branchOptional = jpaRepo.findById(id);
        if (branchOptional.isPresent()) {
            E entity = branchOptional.get();
            BeanUtils.copyProperties(dto, entity, "id");
            return baseMapper.toDTO(jpaRepo.save(entity));
        } else
            throw new NotFoundException(MessageConstant.BRANCH_NOT_FOUND_MSG);
    }

}
