package com.company.service.impl;

import com.company.dao.AdminDao;
import com.company.dao.impl.AdminDaoImpl;
import com.company.pojo.Admin;
import com.company.service.AdminService;

/**
 * @Description:
 * @Data:Created in 17:54 2/26
 * @Modified By:
 */
public class AdminServiceImpl implements AdminService {

    AdminDao adminDao=new AdminDaoImpl();
    @Override
    public Admin login(String username, String password) {
        return adminDao.queryUserByUsernameAndPassword(username,password);
    }

    @Override
    public void registAdmin(Admin admin) {
        adminDao.saveAdmin(admin);
    }

    @Override
    public boolean existsUsername(String username) {

        if (adminDao.queryUserByUsername(username) == null) {
            return false;
        }

        return true;

    }
}
