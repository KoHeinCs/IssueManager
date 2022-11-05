package com.aswetaw.issuemanager.application.controller.occupation;

import com.aswetaw.issuemanager.commongeneric.BaseController;
import com.aswetaw.issuemanager.occupation.service.OccupationService;
import com.aswetaw.issuemanager.request.dto.OccupationDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.aswetaw.issuemanager.common.constant.ApiConstant.occupation;

/**
 * @author Hein Htet Aung
 * @created at 05/11/2022
 **/
@RestController
@RequestMapping(occupation)
public class OccupationController extends BaseController<OccupationDTO, Long> {
    public OccupationController(OccupationService occupationService) {
        super(occupationService);
    }
}
