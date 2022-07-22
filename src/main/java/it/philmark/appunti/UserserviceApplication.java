package it.philmark.appunti;

import it.philmark.appunti.domain.AppUser;
import it.philmark.appunti.domain.Role;
import it.philmark.appunti.service.ServicesImpl;
import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}
        @Bean
        PasswordEncoder passwordEncoder(){
            return new BCryptPasswordEncoder();
        }

//        @Bean
//        CommandLineRunner run (ServicesImpl userService){
//            return args -> {
//                userService.saveRole(new Role(null,"ROLE_USER"));
//                userService.saveRole(new Role(null,"ROLE_ADMIN"));
//                
//                userService.saveUser(new AppUser(null,"Hank ca","Hank","1234", new ArrayList<>()));
//                userService.saveUser(new AppUser(null,"FRankd","Papa","1234", new ArrayList<>()));
//                userService.saveUser(new AppUser(null,"Mufasa","Carl","1234", new ArrayList<>()));
//                userService.saveUser(new AppUser(null,"Prat","Sdenf","1234", new ArrayList<>()));
//                userService.saveUser(new AppUser(null,"Johnny","Sbaunch","1234", new ArrayList<>()));
//                
//                userService.addRoleToUser("Hank", "ROLE_USER");//Attenzione se dovete rifare il bean scriveteli tutti in maiuscuolo i ruoli es ROLE_USER
//                userService.addRoleToUser("Papa", "ROLE_ADMIN");
//                userService.addRoleToUser("Carl", "ROLE_ADMIN");
//                userService.addRoleToUser("Sdenf", "ROLE_USER");
//                userService.addRoleToUser("Sdenf", "ROLE_ADMIN");
//                userService.addRoleToUser("Sbaunch", "ROLE_USER");
//                
//                
//            };
//        }
}
