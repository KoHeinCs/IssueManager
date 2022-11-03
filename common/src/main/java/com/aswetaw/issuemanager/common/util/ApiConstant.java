package com.aswetaw.issuemanager.common.util;

/**
 * @author Hein Htet Aung
 * @created at 31/10/2022
 **/
public class ApiConstant {

    public static final String endPoint = "/api";

    public static final String  create = "/create";
    public static final String  update = "/update";
    public static final String  all =  "/all";
    public static final String  findById = "/find/{id}";
    public static final String  deleteById = "/delete/{id}";

    /**  rest api for branch **/
    public static final String  branch = endPoint+"/branch";

    /**  rest api for branch **/
    public static final String  department = endPoint+"/department";

}
