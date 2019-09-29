package com.tangsir.z_designmodel.build;

import lombok.ToString;

import java.util.Date;

/**
 * 利用生成器构造复杂对象
 */
@ToString
public class Person {

    private String name;
    private Integer age;
    private String sex;
    private Date createTime;

    /**
     * 生成器属性构建对象，私有构造器生成器类调用
     * @param build
     */
    private Person (PersonBuild build){
        name = build.name;
        age = build.age;
        sex = build.sex;
        createTime = build.createTime;
    }


    /**
     * 生成器类
     */
    public static class PersonBuild{
            private String name;
            private Integer age;
            private String sex;
            private Date createTime;

            /**
             * 传入必要参数
             */
            public PersonBuild(String name){
                this.name = name;
                this.createTime = new Date();
            }

            /*可选参数*/
            public PersonBuild setAge(Integer age) {
                this.age = age;
                return this;
            }
            /*可选参数*/
            public PersonBuild setSex(String sex) {
                this.sex = sex;
                return this;
            }
            /*开始构造对象，并校验*/
            public Person startBuild(){
                if(age==null)
                    throw new IllegalArgumentException("年龄不能为空");
                if(name==null)
                    throw new IllegalArgumentException("名字不能为空");
                return new Person(this);
            }
        }
}
