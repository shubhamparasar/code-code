package com.practice.designpatterns.builder;

public class Student {
    private String name;
    private int id;
    private int batchId;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getBatchId() {
        return batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", batchId=" + batchId +
                ", batchName='" + batchName + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }

    public String getDOB() {
        return DOB;
    }

    private String batchName;
    private String DOB;
    private Student(Builder builder){
        this.name=builder.name;
        this.id=builder.id;
        this.batchId=builder.batchId;
        this.batchName= builder.batchName;
        this.DOB=builder.DOB;
    }

    public static class Builder{
        private String name;
        private int id;
        private int batchId;
        private String batchName;
        private String DOB;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setBatchId(int batchId) {
            this.batchId = batchId;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public Builder setDOB(String DOB) {
            this.DOB = DOB;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}
