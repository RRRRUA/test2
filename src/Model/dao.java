package Model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class dao {
    private final SessionFactory sessionFactory;

    public dao() {
        // 创建 Hibernate 配置对象
        Configuration configuration = new Configuration().configure("resources/hibernate.cfg.xml");

        // 创建 SessionFactory
        this.sessionFactory = configuration.buildSessionFactory();
    }
}
