package com.company.dao.impl;

import com.company.dao.AdminDao;
import com.company.pojo.Admin;


/**
 * @Description:
 * @Data:Created in 16:24 2/26
 * @Modified By:
 */
public class AdminDaoImpl extends BaseDao implements AdminDao {
    @Override
    public Admin queryUserByUsername(String username) {
        String sql = "select `id`,`username`,`password`,`email` from admin where username = ?";
        return queryForOne(Admin.class, sql, username);
    }

    @Override
    public Admin queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`,`password`,`email` from admin where username = ? and password = ?";
        return queryForOne(Admin.class, sql, username,password);
    }

    @Override
    public int saveAdmin(Admin user) {
        String sql = "insert into admin(`username`,`password`,`email`) values(?,?,?)";
        return update(sql, user.getUsername(),user.getPassword(),user.getEmail());
    }
}
