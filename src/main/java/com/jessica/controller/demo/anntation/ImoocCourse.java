package com.jessica.controller.demo.anntation;
@CourseInfoAnnotation(coursename="简直java面试",corsetag = "mainshi",corseprofile = "海陆空")
public class ImoocCourse {
    @PersonInfoAnnotation(name = "翔仔",language = {"java","C++","php"})
    private  String author;
    @CourseInfoAnnotation(coursename="校园商铺",corsetag = "实战",corseprofile = "手把手海陆空",corseIndex = 144)
    public void getCourseInfo(){

    }
}
