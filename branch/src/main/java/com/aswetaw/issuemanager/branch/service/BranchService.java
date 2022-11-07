package com.aswetaw.issuemanager.branch.service;

import com.aswetaw.issuemanager.branch.repository.BranchRepository;
import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.entities.Branch;
import com.aswetaw.issuemanager.request.dto.BranchDTO;
import com.aswetaw.issuemanager.request.mapper.BranchMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Hein Htet Aung
 * @created at 15/07/2022
 **/
@Service
public class BranchService extends BaseService<BranchDTO, Branch, Long> {

    public BranchService(BranchRepository branchRepo, BranchMapper branchMapper) {
        super(branchRepo, branchMapper);
    }

    public void init(){
        if (jpaRepo.count()==0){
            Branch branch1 = new Branch("main","this is main branch");
            Branch branch2 = new Branch("uat","this is uat branch");
            Branch branch3 = new Branch("development","this is development branch");
            jpaRepo.saveAll(Arrays.asList(branch1,branch2,branch3));
        }
    }


}
