package com.xworkz.teacher.internal;

public class SchollName {
    public String name;
    public int number;
    public Subject []subject;
    public SchollName(String name,int number,Subject []subject){
        this.name=name;
        this.number=number;
        this.subject=subject;

    }
    public void displaySchollName(){
        System.out.println("name:"+name);
        System.out.println("number:"+number);
        System.out.println("subject:"+subject);

        displaySubjects();


    }
    public void displaySubjects(){
        for(Subject subjects :subject){
            subjects.displaySubject();
        }
    }
    }
