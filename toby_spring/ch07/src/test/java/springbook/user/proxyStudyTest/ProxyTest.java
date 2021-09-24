package springbook.user.proxyStudyTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Proxy;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springbook.user.proxyStudy.CarPaintService;
import springbook.user.proxyStudy.CarPaintTx;
import springbook.user.proxyStudy.CarServiceImpl;
import springbook.user.proxyStudy.Hello;
import springbook.user.proxyStudy.HelloTarget;
import springbook.user.proxyStudy.HelloUppercase;

public class ProxyTest {
	@Test
	public void simpleProxy() {
		Hello hello = new HelloTarget();
		assertThat(hello.sayHello("toby"), is("Hello toby"));
		assertThat(hello.sayHi("toby"), is("Hi toby"));
		assertThat(hello.sayThankyou("toby"), is("Thank You toby"));
	}
	
	@Test
	public void uppercaseProxyTest() {
		Hello hello = new HelloUppercase(new HelloTarget());
		
		assertThat(hello.sayHello("toby"), is("HELLO TOBY"));
		assertThat(hello.sayHi("toby"), is("HI TOBY"));
		assertThat(hello.sayThankyou("toby"), is("THANK YOU TOBY"));
	}
	
	@Test
	public void carTest() throws NoSuchMethodException, SecurityException, Throwable {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
		dataSource.setUsername("sure0830");
		dataSource.setPassword("1234");
		CarPaintTx tx = new CarPaintTx();
		tx.setPattern("paint");
		tx.setTarget(new CarServiceImpl());
		tx.setTransactionManager(new DataSourceTransactionManager(dataSource));
		
		CarPaintService cs = 
				(CarPaintService)Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] {CarPaintService.class}, tx);
		String car = "Car!!";
		cs.printCar(car);
	}
}
