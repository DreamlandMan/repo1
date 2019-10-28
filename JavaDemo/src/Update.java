import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update implements DatabaseMethod {
    String biao,lie,zhi;
    int id;
    Update(String biao,String lie,String zhi,int id){
        this.biao=biao;this.lie=lie;this.id=id;this.zhi=zhi;
    }
    @Test
    public void operate() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con= DriverManager.getConnection("jdbc:mysql:///theone","root","root");
            String sql="update "+biao+" set "+lie+"=? where id=?";
            PreparedStatement pre=con.prepareStatement(sql);
            pre.setString(1,zhi);
            pre.setInt(2,id);
            int count=pre.executeUpdate();
            if(count>0)System.out.println("修改成功");
            else System.out.println("修改失败");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
