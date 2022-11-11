package com.aswetaw.issuemanager.occupation.service;

import com.aswetaw.issuemanager.common.constant.MessageConstant;
import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.Occupation;
import com.aswetaw.issuemanager.exception.IssueManagerException;
import com.aswetaw.issuemanager.exception.NotFoundException;
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

    public final static String developer = "Junior Developer";
    public final static String senior = "Senior Developer";
    public final static String leader = "Team Leader";
    public final static String manager = "Project Manager";
    public final static String tester = "Tester";

    private final OccupationRepository occupationRepo;
    public OccupationService(
            OccupationRepository occupationRepo,
            OccupationMapper occupationMapper) {
        super(occupationRepo, occupationMapper);
        this.occupationRepo = occupationRepo;
    }

    public void init() {
        if (jpaRepo.count() == 0) {
            Occupation occupation1 = new Occupation(developer, "This position holder owns from 1 year to 2 yers experiences");
            Occupation occupation2 = new Occupation(senior, "This position holder owns from 2 year to 4 yers experiences");
            Occupation occupation3 = new Occupation(leader, "This position holder owns from 4 year to 6 yers experiences");
            Occupation occupation4 = new Occupation(manager, "This position holder owns from 6 year to avobe  experiences");
            Occupation occupation5 = new Occupation(tester, "This position holder owns project testing experiences");
            jpaRepo.saveAll(Arrays.asList(occupation1, occupation2, occupation3, occupation4, occupation5));
        }
    }

    public Occupation findByName(String name) throws IssueManagerException {
        return this.occupationRepo.findByName(name).orElseThrow(()->new NotFoundException(MessageConstant.OCCUPATION_NOT_FOUND_MSG+" "+name));
    }


}
