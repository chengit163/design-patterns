package com.cit.designpatterns.composite;

public class Main
{
    public static void main(String[] args)
    {
        CatalogComponent linuxCourse = new Course("Linux课程", 100.0D);
        CatalogComponent windowsCourse = new Course("Windows课程", 99.0D);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录", 2);
        CatalogComponent javaSE = new Course("javaSE课程", 55.0D);
        CatalogComponent javaEE = new Course("javaEE课程", 99.0D);
        CatalogComponent javaDesignPattern = new Course("java设计模式", 111.0D);
        javaCourseCatalog.add(javaSE);
        javaCourseCatalog.add(javaEE);
        javaCourseCatalog.add(javaDesignPattern);

        CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录", 1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();

    }
}
