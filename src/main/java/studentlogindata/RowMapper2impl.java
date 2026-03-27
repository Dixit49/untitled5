package studentlogindata;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapper2impl implements RowMapper<Login> {
    @Override
    public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
       Login login=new Login();
       login.setStudentid(rs.getInt(2));
       login.setPassword(rs.getString(1));
       return login;
    }
}
