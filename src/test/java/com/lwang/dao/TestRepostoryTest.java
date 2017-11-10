package com.lwang.dao;

import com.lwang.model.TestTwo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * TestRepostoryTest.class
 *
 * @author lwang
 * @date 2017/11/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRepostoryTest {

    @Autowired
    TestRepostory testRepostory;

    // 添加
    @Test
    public void testSave() {

        TestTwo testTwo = new TestTwo();
        testTwo.setName("张局长");
        testTwo.setPice("96");
        testTwo.setCount("000");
        testRepostory.save(testTwo);
    }

    // 删除
    @Test
    public void testDeleteGoods() {

        testRepostory.delete("5a057936014c0c42b4637a04");
    }


    // 修改
    @Test
    public void testUpdateGoods() {

        TestTwo testTwo = testRepostory.findOne("5a057ad4014c0cfa989e6018");
        testTwo.setName("jac");
        testTwo.setPice("888");
        testRepostory.save(testTwo);
    }


    // 查询
    @Test
    public void testFindGoods() {

        List<TestTwo> all = testRepostory.findAll();
        TestTwo testTwo = testRepostory.findOne("5a057ad4014c0cfa989e6018");

        System.out.print("-------总共有" + all.size() + "人-------");
        System.out.print("我叫：" + testTwo.getName() + "-------");
    }

}
