package com.neighbor.sample;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class DBConnectionTest {
	
	@Test
	public void connectionTest() throws Exception  {
		log.info("================");
		Class.forName("org.mariadb.jdbc.Driver"); // 마리아DB
		Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3307/test", "root", "1234"); // 마리아 DB
		System.out.println(con);
	    log.info("con", con);
	}
}
