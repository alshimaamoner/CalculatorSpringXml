package calculator;

public class UserDao {
    String Msg="User Created";

    public UserDao() {
        System.out.println("User Dao");
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "Msg='" + Msg + '\'' +
                '}';
    }
}
