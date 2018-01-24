package com.cmos.ngbusitemps_sc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cmos.ngbusitemps_sc.dao.IUserDao;
import com.cmos.ngbusitemps_sc.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 14:10 2018/1/24
 * @Modified By:
 */
@Repository
public class UserDaoImpl implements IUserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User query(final Long id) {
        final User user=new User();
        jdbcTemplate.queryForObject("SELECT * FROM t_user WHERE id=?", new RowMapper<User>() {
            public User mapRow(final ResultSet resultSet, final int i) throws SQLException {
                // 处理结果集
                user.setId(resultSet.getLong("id"));
                user.setUserName(resultSet.getString("userName"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        },id);
        return user;
    }

    public void delete(final Long id) {

    }

    public void save(final User user) {

    }

    public void update(final Long id) {

    }
}
