package studentlogindata;

import java.util.List;

public interface LoginDao {
    public int insert(Login login);
    public List<Login> get();
}
