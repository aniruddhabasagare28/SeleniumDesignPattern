package tests;

import org.testng.annotations.Test;
import utilities.DBUtil;

public class DBUtilTests {

    @Test
    public void test1(){
        DBUtil dbUtil= DBUtil.getInstance();
        dbUtil.runQuery("select * test1");
    }

    @Test
    public void test2(){
        DBUtil dbUtil= DBUtil.getInstance();
        dbUtil.runQuery("select * test2");
    }

    @Test
    public void test3(){
        DBUtil dbUtil= DBUtil.getInstance();
        dbUtil.runQuery("select * test3");
    }

}