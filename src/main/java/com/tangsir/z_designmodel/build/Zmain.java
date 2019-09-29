package com.tangsir.z_designmodel.build;

public class Zmain {
    public static void main(String[] args) {

        Person.PersonBuild  build = new Person.PersonBuild("李四");
        Person person = build.setAge(11).setSex("难").startBuild();
        System.out.println(person);
    }
}
