package com.cmos.ngbusitemps_sc.dao;

import com.cmos.ngbusitemps_sc.domain.User;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 14:08 2018/1/24
 * @Modified By:
 */
public interface IUserDao {
    User query(Long id);
    void delete(Long id);
    void save(User user);
    void update(Long id);
}
