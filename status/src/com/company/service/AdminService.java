package com.company.service;

import com.company.pojo.Admin;

/**
 * @Description:
 * @Data:Created in 17:51 2/26
 * @Modified By:
 */
public interface AdminService {
    public Admin login(String username, String password);

    public void registAdmin(Admin admin);

    public boolean existsUsername(String username);
}
