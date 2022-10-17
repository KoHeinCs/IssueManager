package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.Occupation;
import com.aswetaw.issuemanager.request.dto.OccupationDTO;
import lombok.Data;
import org.mapstruct.Mapper;

/**
 * @author Hein Htet Aung
 * @created at 17/10/2022
 **/
@Mapper(componentModel = "spring")
public interface OccupationMapper extends BaseMapper<OccupationDTO, Occupation>{
}
