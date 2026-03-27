package com.studentdata;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Rowmapperimpl implements RowMapper<Qns> {

    @Override
    public Qns mapRow(ResultSet rs, int rowNum) throws SQLException {
        Qns qns=new Qns();
        qns.setQnid(rs.getInt(1));
        qns.setQn(rs.getString(2));
        qns.setOp1(rs.getString(3));
        qns.setOp2(rs.getString(4));
        qns.setOp3(rs.getString(5));
        qns.setOp4(rs.getString(6));
        qns.setAns(rs.getString(7));
        return qns;
    }
}
