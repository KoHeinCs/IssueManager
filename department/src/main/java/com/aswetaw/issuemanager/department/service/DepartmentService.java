package com.aswetaw.issuemanager.department.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.department.repository.DepartmentRepository;
import com.aswetaw.issuemanager.entities.Department;
import com.aswetaw.issuemanager.request.dto.DepartmentDTO;
import com.aswetaw.issuemanager.request.mapper.DepartmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
@RequiredArgsConstructor
public class DepartmentService extends BaseService<DepartmentDTO, Long> {
    private final DepartmentRepository departmentRepo;
    private final DepartmentMapper departmentMapper;

    public DepartmentDTO findById(Long id) {
        Optional<Department> departmentOptional = departmentRepo.findById(id);
        if (departmentOptional.isPresent())
            return departmentMapper.toDTO(departmentOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<DepartmentDTO> findAll() {
        List<Department> departmentList = departmentRepo.findAll();
        if (departmentList.isEmpty())
            return Collections.emptyList();
        else
            return departmentMapper.toDTOList(departmentList);
    }

    public void deleteById(Long id) {
        departmentRepo.deleteById(id);
    }

    public void delete(DepartmentDTO departmentDTO) {
        departmentRepo.delete(departmentMapper.toEntity(departmentDTO));
    }

    public DepartmentDTO save(DepartmentDTO departmentDTO) {
        Department department = departmentRepo.saveAndFlush(departmentMapper.toEntity(departmentDTO));
        return departmentMapper.toDTO(department);
    }

    public DepartmentDTO update(Long id, DepartmentDTO departmentDTO) {
        Optional<Department> departmentOptional = departmentRepo.findById(id);
        if (departmentOptional.isPresent()) {
            Department department = departmentOptional.get();
            BeanUtils.copyProperties(departmentDTO, department, "id");
            departmentRepo.save(department);
        }
        // TODO throw id not found exception for modification
        return null;
    }


}
