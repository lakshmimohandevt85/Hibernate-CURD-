
	package test;

	import javax.xml.stream.XMLStreamException;
	import org.hibernate.HibernateException;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	import bean.Student;

	public class Delete {
		
  
	
		
		public static void main(String[] args) //throws HibernateException,XMLStreamException 
		{
			Student student = new Student();
			student.setId(152096);
			//student.setName("kvmonuttan");
			//student.setEmail("xyz@gmail.com");
			//student.setAddress(110775);
			//student object state is transient
			try
			{
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			SessionFactory  sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction t = session.beginTransaction();
			session.delete(student);
			
			System.out.println("data is deleted");
			t.commit();
			session.close();
			sessionFactory.close();
			//student object state is persistent
			//session.beginTransaction().commit();
			//session.evict(student);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	//create table student007(sid number  primary key,sname varchar2(255),semail varchar2(255),smarks number);


