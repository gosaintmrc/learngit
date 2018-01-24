package com.cmos.ngbusitemps_sc.service.impl;

import com.cmos.ngbusitemps_sc.dao.IUserDao;
import com.cmos.ngbusitemps_sc.domain.User;
import com.cmos.ngbusitemps_sc.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 21:32 2018/1/24
 * @Modified By:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;
    public User get(final Long id) {
        return userDao.query(id);
    }
}
