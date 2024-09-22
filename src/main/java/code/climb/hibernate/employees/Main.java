package code.climb.hibernate.employees;

import code.climb.hibernate.employees.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = buildConfiguration();
        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession()) {
            // get Employee
            Employee employee = session.get(Employee.class, 10001);
            System.out.println(employee);

            // get Department
            Department d001 = session.get(Department.class, "d001");
            System.out.println(d001);
        }
    }

    private static Configuration buildConfiguration() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Department.class);
        configuration.addAnnotatedClass(Title.class);
        configuration.addAnnotatedClass(Salary.class);
        configuration.addAnnotatedClass(DepartmentManagement.class);
        return configuration;
    }
}
