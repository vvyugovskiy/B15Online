package office_hours.Practice_2020_01_16;

public class UserInfo {

    // Attributes ==> instance variables

    private String userName,
            password,
            ssn;

    public UserInfo() {   // default values for the instance variable
        setUserName("Unknown");
        setSSN("0000000");
        setPassword("123456");
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        // this.getUserName();
    }

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

