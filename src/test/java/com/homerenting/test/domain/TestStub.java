package com.homerenting.test.domain;

/**
 * Created by Arthur on 04/06/14.
 */
public abstract class TestStub {

    public abstract void create();
    public abstract void read();
    public abstract void update();
    public abstract void delete();

    /*with Builder Pattern*/
    public abstract void createWithBuilder();

    /*from dataset*/
    public abstract void readFromDataset();
}
