package com.example.demo;

import com.example.demo.dao.testMapper;
import com.example.demo.entiy.test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
    @Autowired
    private testMapper testMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<test> userList = testMapper.selectList(null);
        Assert.assertEquals(2, userList.size());
        userList.forEach(System.out::println);
    }

}
