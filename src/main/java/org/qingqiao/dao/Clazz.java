package org.qingqiao.dao;

public class Clazz {
    private int id;
    private String cname;

    public Clazz() {
    }

    public Clazz(int id, String cname) {
        this.id = id;
        this.cname = cname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                '}';
    }
}
