package com.aswetaw.issuemanager.request.mapper;

import com.aswetaw.issuemanager.entities.Branch;
import com.aswetaw.issuemanager.request.dto.BranchDTO;
import org.mapstruct.Mapper;

/**
 * @author Hein Htet Aung
 * @created at 16/10/2022
 **/
@Mapper(componentModel = "spring")
public interface BranchMapper extends BaseMapper<BranchDTO, Branch> {

}
