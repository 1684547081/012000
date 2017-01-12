import cn.lhl.entity.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by datou on 2017/1/12.
 */
public class test2 {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction ts = session.beginTransaction();
        Query query = session.createQuery("from  Users where name='呵呵'");
        List<Users> list = query.list();
        for (Users item : list) {
            System.out.println(item.getName());
        }
        ts.commit();

    }
}
