import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete implements DatabaseMethod {
    @Test
    public void operate() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql:///theone","root","root");
            String sql="delete from biao7 where id=?";
            PreparedStatement pre=con.prepareStatement(sql);
            pre.setInt(1,6);
            pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
