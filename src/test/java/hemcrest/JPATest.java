package hemcrest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.Before;
import org.junit.Test;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class JPATest {
	EntityManagerFactory emf = null;
	List<Employee> empList =EmployeeUtil.generateEmployees();
	@Before
	public void init() {
		emf = mock(EntityManagerFactory.class);
		when(emf.createEntityManager()).thenReturn(mock(EntityManager.class));
		
	}
	@Test
	public void test() {
		EntityManager em =  emf.createEntityManager();
		when(em.find(Employee.class, 1)).thenReturn(empList.get(0));
		Employee e = em.find(Employee.class, 1);
		assertNotNull(e);
		assertEquals("Same", empList.get(0), e);
	}
}
