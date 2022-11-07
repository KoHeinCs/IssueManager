package com.aswetaw.issuemanager.occupation.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.Occupation;
import com.aswetaw.issuemanager.occupation.repository.OccupationRepository;
import com.aswetaw.issuemanager.request.dto.OccupationDTO;
import com.aswetaw.issuemanager.request.mapper.OccupationMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class OccupationService extends BaseService<OccupationDTO, Occupation, Long> {

    public OccupationService(
            OccupationRepository occupationRepo,
            OccupationMapper occupationMapper
    ) {
        super(occupationRepo, occupationMapper);
    }

    public void init() {
        if (jpaRepo.count() == 0) {
            Occupation occupation1 = new Occupation("Junior Developer", "This position holder owns from 1 year to 2 yers experiences");
            Occupation occupation2 = new Occupation("Senior Developer", "This position holder owns from 2 year to 4 yers experiences");
            Occupation occupation3 = new Occupation("Team Leader", "This position holder owns from 4 year to 6 yers experiences");
            Occupation occupation4 = new Occupation("Project Manager", "This position holder owns from 6 year to avobe  experiences");
            Occupation occupation5 = new Occupation("Tester", "This position holder owns project testing experiences");
            jpaRepo.saveAll(Arrays.asList(occupation1, occupation2, occupation3, occupation4, occupation5));
        }
    }


}
