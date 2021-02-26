package com.company.dao;

import com.company.pojo.Admin;
import com.company.pojo.Student;

/**
 * @Description:
 * @Data:Created in 16:19 2/26
 * @Modified By:
 */
public interface AdminDao {
    public Admin queryUserByUsernameAndPassword(String username, String password);

    public int saveAdmin(Admin admin);

    public Admin queryUserByUsername(String username);
}
