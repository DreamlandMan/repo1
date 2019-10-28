import org.junit.Test;

import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert implements DatabaseMethod {
    Statement sta;
    String name,sex;
    int id,work;
    Insert(Statement sta,int id,String name,String sex,int work){
        this.sta=sta;this.id=id;this.name=name;this.sex=sex;this.work=work;
    }
    @Test
    public void operate(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/theone","root","root");
            Statement sta=con.createStatement();
            String sql="insert into biao7 value("+id+","+name+","+sex+","+id+")";
            int count=sta.executeUpdate(sql);
            if(count>0){
                System.out.println("添加成功，"+count+"条记录受到影响");
            }else System.out.println("添加失败");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
