package org.qingqiao.dao;

public class StudentDemo {
    private int id;
    private String name;
    private String sex;
    private int age;
    private Clazz clazz;

    public StudentDemo() {
    }

    public StudentDemo(int id, String name, String sex, int age, Clazz clazz) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.clazz = clazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }





    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", clazz=" + clazz +
                '}';
    }
}