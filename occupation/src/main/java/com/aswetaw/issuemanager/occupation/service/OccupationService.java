package com.aswetaw.issuemanager.occupation.service;

import com.aswetaw.issuemanager.common.BaseService;
import com.aswetaw.issuemanager.entities.Occupation;
import com.aswetaw.issuemanager.occupation.repository.OccupationRepository;
import com.aswetaw.issuemanager.request.dto.OccupationDTO;
import com.aswetaw.issuemanager.request.mapper.OccupationMapper;
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
public class OccupationService extends BaseService<OccupationDTO, Long> {
    private final OccupationRepository occupationRepo;
    private final OccupationMapper occupationMapper;

    public OccupationDTO findById(Long id) {
        Optional<Occupation> occupationOptional = occupationRepo.findById(id);
        if (occupationOptional.isPresent())
            return occupationMapper.toDTO(occupationOptional.get());
            // TODO throw not found exception
        else
            return null;
    }

    public List<OccupationDTO> findAll() {
        List<Occupation> occupationList = occupationRepo.findAll();
        if (occupationList.isEmpty())
            return Collections.emptyList();
        else
            return occupationMapper.toDTOList(occupationList);
    }

    public void deleteById(Long id) {
        occupationRepo.deleteById(id);
    }

    public void delete(OccupationDTO occupationDTO) {
        occupationRepo.delete(occupationMapper.toEntity(occupationDTO));
    }

    public OccupationDTO save(OccupationDTO occupationDTO) {
        Occupation occupation = occupationRepo.saveAndFlush(occupationMapper.toEntity(occupationDTO));
        return occupationMapper.toDTO(occupation);
    }

    public OccupationDTO update(Long id, OccupationDTO occupationDTO) {
        Optional<Occupation> occupationOptional = occupationRepo.findById(id);
        if (occupationOptional.isPresent()) {
            Occupation occupation = occupationOptional.get();
            BeanUtils.copyProperties(occupationDTO, occupation, "id");
            occupationRepo.save(occupation);
        }
        // TODO throw id not found exception for modification
        return null;
    }


}
