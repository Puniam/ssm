package org.excelProject.pojo;

public class TestPojo {
    private Integer id;

    private String name;

    private String no;

    public TestPojo(Integer id, String name, String no) {
        this.id = id;
        this.name = name;
        this.no = no;
    }

    public TestPojo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }
}