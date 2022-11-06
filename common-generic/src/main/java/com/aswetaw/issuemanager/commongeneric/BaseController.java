package com.aswetaw.issuemanager.commongeneric;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.exception.IssueManagerException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

import static com.aswetaw.issuemanager.common.constant.ApiConstant.*;

/**
 * @author Hein Htet Aung
 * @created at 05/11/2022
 **/
@RequiredArgsConstructor
public abstract class BaseController<T, ID extends Serializable> {

    private final BaseService baseService;


    @PostMapping(create)
    private ResponseEntity<Object> create(@RequestBody T dto) {
        return ResponseHandler.createHttpResponse(baseService.save(dto), "New entity was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    private ResponseEntity<Object> update(@PathVariable ID id, @RequestBody T dto) throws IssueManagerException {
        return ResponseHandler.createHttpResponse(baseService.update(id, dto), "Entity was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAll() {
        List<T> dtoList = baseService.findAll();
        return ResponseHandler.createHttpResponse(dtoList, "Requested entities  were given successfully", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getById(@PathVariable("id") ID id) throws IssueManagerException {
        return ResponseHandler.createHttpResponse(baseService.findById(id), "Requested entity was given successfully", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> delete(@PathVariable("id") ID id) throws IssueManagerException{
        baseService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested entity with id =" + id + " was deleted successfully", HttpStatus.OK);
    }


}
