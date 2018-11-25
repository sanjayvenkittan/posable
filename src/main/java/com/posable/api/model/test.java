package com.posable.api.model;

import javax.persistence.*;

@Entity
@Table(name="test")
public class test {
    @Id
    @Column(name = "testID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer testID;

    @Column(name = "testData")
    private String testData;

    public test(){}

    public int getTestID() {
        return testID;
    }

    public String getTestData() {
        return testData;
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }

    public void setTestData(String testData) {
        this.testData = testData;
    }
}
