package com.aswetaw.issuemanager.common.util;

/**
 * @author Hein Htet Aung
 * @created at 31/10/2022
 **/
public class ApiConstant {

    public static final String endPoint = "/api";

    public static final String  create = "/create";
    public static final String  update = "/update/{id}";
    public static final String  all =  "/all";
    public static final String  findById = "/find/{id}";
    public static final String  deleteById = "/delete/{id}";

    /**  rest api for branch **/
    public static final String  branch = endPoint+"/branch";

    /**  rest api for department **/
    public static final String  department = endPoint+"/department";

    /**  rest api for issuehistory **/
    public static final String  issuehistory = endPoint+"/issuehistory";

    /**  rest api for issuepriority **/
    public static final String  issuepriority = endPoint+"/issuepriority";

    /**  rest api for issueruntime **/
    public static final String  issueruntime = endPoint+"/issueruntime";

    /**  rest api for issueseverity **/
    public static final String  issueseverity = endPoint+"/issueseverity";

    /**  rest api for project **/
    public static final String  project = endPoint+"/project";

    /**  rest api for role **/
    public static final String  role = endPoint+"/role";

    /**  rest api for role **/
    public static final String  user = endPoint+"/user";


}
