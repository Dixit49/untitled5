package com.studentdata;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class QnsDaoimpl implements QnsDao {
    public int insert(Qns q) {
        String query = "insert into question(qnid,qn,op1,op2,op3,op4,ans) values(?,?,?,?,?,?,?)";
        int r = this.jdbcTemplate.update(query, q.getQnid(), q.getQn(), q.getOp1(), q.getOp2(), q.getOp3(), q.getOp4(), q.getAns());
        return r;
    }

    @Override
    public List<Qns> getqn() {
        String query="select * from question";
        RowMapper<Qns> rowMapper=new Rowmapperimpl();
        return this.jdbcTemplate.query(query,rowMapper);
    }


    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
