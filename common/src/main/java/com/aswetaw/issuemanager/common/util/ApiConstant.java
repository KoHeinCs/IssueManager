package com.aswetaw.issuemanager.common.util;

/**
 * @author Hein Htet Aung
 * @created at 31/10/2022
 **/
public class ApiConstant {

    public static final String endPoint = "/api";

    /**  rest api for branch **/
    public static final String  branch = endPoint+"/branch";
    public static final String  delete_branch = branch+"/delete";
    public static final String  all_branch = branch+"/all";
    public static final String  find_by_id = branch+"/find";

}
