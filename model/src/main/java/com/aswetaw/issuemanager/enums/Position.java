package com.aswetaw.issuemanager.enums;

/**
 * @author Hein Htet Aung
 * @created at 01/07/2022
 **/
public enum Position {
    JUNIOR("Junior"),
    MID_LEVEL("Mid Level"),
    SENIOR("Senior");
    private String name;
    Position(String name){
        this.name = name;
    }
}
