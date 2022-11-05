package com.aswetaw.issuemanager.occupation.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.Occupation;
import com.aswetaw.issuemanager.occupation.repository.OccupationRepository;
import com.aswetaw.issuemanager.request.dto.OccupationDTO;
import com.aswetaw.issuemanager.request.mapper.OccupationMapper;
import org.springframework.stereotype.Service;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class OccupationService extends BaseService<OccupationDTO, Occupation, Long> {
    private OccupationRepository occupationRepo;
    private OccupationMapper occupationMapper;

    public OccupationService(
            OccupationRepository occupationRepo,
            OccupationMapper occupationMapper
    ) {
        super(occupationRepo, occupationMapper);
    }


}
