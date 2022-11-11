package com.aswetaw.issuemanager.user.service;

import com.aswetaw.issuemanager.commongeneric.BaseService;
import com.aswetaw.issuemanager.department.service.DepartmentService;
import com.aswetaw.issuemanager.entities.Department;
import com.aswetaw.issuemanager.entities.Occupation;
import com.aswetaw.issuemanager.entities.Role;
import com.aswetaw.issuemanager.entities.User;
import com.aswetaw.issuemanager.exception.IssueManagerException;
import com.aswetaw.issuemanager.occupation.service.OccupationService;
import com.aswetaw.issuemanager.request.dto.UserDTO;
import com.aswetaw.issuemanager.request.mapper.UserMapper;
import com.aswetaw.issuemanager.role.service.RoleService;
import com.aswetaw.issuemanager.user.repository.UserRepository;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Service
public class UserService extends BaseService<UserDTO, User, Long> {
    private final DepartmentService departmentService;
    private final RoleService roleService;
    private final OccupationService occupationService;

    public UserService(UserRepository userRepo, UserMapper userMapper,
                       DepartmentService departmentService, RoleService roleService,
                       OccupationService occupationService) {
        super(userRepo, userMapper);
        this.departmentService = departmentService;
        this.roleService = roleService;
        this.occupationService = occupationService;
    }

    public void init()   {
        try {
            Department lifeDepartment = this.departmentService.findByName("Life Department");

            Occupation developerOccupation = this.occupationService.findByName(OccupationService.developer);
            Occupation seniorOccupation = this.occupationService.findByName(OccupationService.senior);
            Occupation leaderOccupation = this.occupationService.findByName(OccupationService.leader);
            Occupation managerOccupation = this.occupationService.findByName(OccupationService.manager);
            Occupation testerOccupation = this.occupationService.findByName(OccupationService.tester);

            Role developerRole = this.roleService.findByName("developer");
            Role leaderRole = this.roleService.findByName("leader");
            Role testerRole = this.roleService.findByName("tester");
            Role managerRole = this.roleService.findByName("manager");

            User makywe = new User("Ma Kywe", "admin", "emp1", "0987654", "makywe@gmail.com", LocalDateTime.now(), true, true);
            makywe.setDepartment(lifeDepartment);
            makywe.setOccupation(managerOccupation);
            makywe.setRole(managerRole);

            User pyaesone = new User("Ko Pyae Sone", "admin", "emp2", "0987654", "kopyaesone@gmail.com", LocalDateTime.now(), true, true);
            pyaesone.setDepartment(lifeDepartment);
            pyaesone.setOccupation(leaderOccupation);
            pyaesone.setRole(leaderRole);

            User kohein = new User("Ko HeinCs", "admin", "emp3", "0987654", "koheincs@gmail.com", LocalDateTime.now(), true, true);
            kohein.setDepartment(lifeDepartment);
            kohein.setOccupation(seniorOccupation);
            kohein.setRole(developerRole);

            User chawyupar = new User("Ma Chaw Yu Par", "admin", "emp4", "0987654", "chawyupar@gmail.com", LocalDateTime.now(), true, true);
            chawyupar.setDepartment(lifeDepartment);
            chawyupar.setOccupation(developerOccupation);
            chawyupar.setRole(developerRole);

            User yeminkhant = new User("Mg Ye Min Khant", "admin", "emp5", "0987654", "yeminkhant@gmail.com", LocalDateTime.now(), true, true);
            yeminkhant.setDepartment(lifeDepartment);
            yeminkhant.setOccupation(developerOccupation);
            yeminkhant.setRole(developerRole);

            User nayChiNwe = new User("Ma Nay Chi Nwe", "admin", "emp6", "0987654", "naychinwe@gmail.com", LocalDateTime.now(), true, true);
            nayChiNwe.setDepartment(lifeDepartment);
            nayChiNwe.setOccupation(testerOccupation);
            nayChiNwe.setRole(testerRole);

            this.jpaRepo.saveAll(Arrays.asList(makywe, pyaesone, kohein, chawyupar, yeminkhant, nayChiNwe));
        }catch (IssueManagerException exception){

        }

    }

}
