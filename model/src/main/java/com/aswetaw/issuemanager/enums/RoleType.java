package com.aswetaw.issuemanager.enums;

/**
 * @author Hein Htet Aung
 * @created at 03/07/2022
 **/
public enum RoleType {
    DEVELOPER("developer"),
    LEADER("leader"),
    TESTER("tester"),
    MANAGER("manager"),
    CUSTOMER("customer");

    private String name;
    RoleType(String name){
        this.name = name;
    }

}
