package com.company.test;

import com.company.dao.AdminDao;
import com.company.dao.impl.AdminDaoImpl;
import com.company.pojo.Admin;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Data:Created in 16:37
 * @Modified By:
 */
public class AdminDaoTest {

    private AdminDao adminDao=new AdminDaoImpl();
    @Test
    public void queryUserByUsernameAndPassword() {
        System.out.println(adminDao.queryUserByUsernameAndPassword("admin","admin"));
    }

    @Test
    public void saveAdmin() {
        adminDao.saveAdmin(new Admin(null,"2842902295","naohao172","2842902295@qq.com"));
    }
}