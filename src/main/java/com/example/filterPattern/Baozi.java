package com.example.filterPattern;

/*
* @ClassName Baozi
*@Description TODO
*@Author zhangrui
*@Date 14:28 14:28
*@Version 
* */
public class Baozi {
    private String name;
    private String type;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public Baozi() {
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Baozi(String name, String type, String size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }
}
