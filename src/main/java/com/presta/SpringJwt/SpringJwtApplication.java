package com.presta.SpringJwt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class })
public class SpringJwtApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
      /*  Role role = new Role();
        role.setRoleName("yessine");
        role.setRoleDescription("admin");
        roleDao.save(role);

*/


	}

}
