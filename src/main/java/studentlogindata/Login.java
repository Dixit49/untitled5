package studentlogindata;

public class Login {
    int studentid;
    String password;

    public Login(String password, int studentid) {
        this.password = password;
        this.studentid = studentid;
    }
    public Login(){}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
}
