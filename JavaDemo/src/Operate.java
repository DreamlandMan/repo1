import java.lang.reflect.Constructor;
import java.sql.Statement;

public class Operate {
    public Class operate(int x) {
        Class cla=null;
        Constructor con=null;
        try {
            switch (x){
                case 1:
                    con=Class.forName("Insert").getDeclaredConstructor(Statement.class);
                    cla=(Class)con.newInstance();
                    return cla;
                case 2:
                    con=Class.forName("Delete").getDeclaredConstructor(Statement.class);
                    cla=(Class)con.newInstance();
                    return cla;
                case 3:
                    con=Class.forName("UpDate").getDeclaredConstructor(Statement.class);
                    cla=(Class)con.newInstance();
                    return cla;
                case 4:
                    con=Class.forName("Select").getDeclaredConstructor(Statement.class);
                    cla=(Class)con.newInstance();
                    return cla;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
