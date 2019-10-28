import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select implements DatabaseMethod {
//    int id;
//    Select(int id){this.id=id;}
    @Test
    public void operate() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql:///theone","root","root");
            String sql="select * from biao7 where id=2";
            PreparedStatement pre=con.prepareStatement(sql);
            ResultSet res=pre.executeQuery();
            if(res.next())
            System.out.println(res.getString("name")+" "+res.getString("sex")+" "+res.getString("work"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
