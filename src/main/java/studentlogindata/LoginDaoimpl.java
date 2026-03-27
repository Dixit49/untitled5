package studentlogindata;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class LoginDaoimpl implements LoginDao {

    @Override
    public int insert(Login login) {
        String query="insert into login(studentid,password) values(?,?)";
        int r=this.jdbcTemplate.update(query,login.getStudentid(),login.getPassword());
        return r;
    }

    @Override
    public List<Login> get() {
        String query="select * from login";
        RowMapper<Login> rowMapper=new RowMapper2impl();
        return this.jdbcTemplate.query(query,rowMapper);
    }
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(){
        this.jdbcTemplate=jdbcTemplate;
    }
}
