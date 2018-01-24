package com.cmos.ngbusitemp_sc.dao;

import com.cmos.ngbusitemps_sc.dao.IUserDao;
import com.cmos.ngbusitemps_sc.domain.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 17:57 2018/1/24
 * @Modified By:
 */
//告诉spring容器运行在虚拟机中
@RunWith(SpringJUnit4ClassRunner.class)
//配置文件的位置
//若当前配置文件名=当前测试类名-context.xml 就可以在当前目录中查找@ContextConfiguration()
@ContextConfiguration("classpath:application.xml")
public class UserTest {

    @Autowired
    private IUserDao userDao;
    @Test
    public void testUser(){
        User user = userDao.query(1L);
        System.out.println(user);
    }
}
