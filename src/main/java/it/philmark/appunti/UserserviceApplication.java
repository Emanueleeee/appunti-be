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
//                userService.saveRole(new Role(null,"Role_User"));
//                userService.saveRole(new Role(null,"Role_Manager"));
//                userService.saveRole(new Role(null,"Role_Admin"));
//                userService.saveRole(new Role(null,"Role_Super_Admin"));
//                
//                userService.saveUser(new AppUser(null,"Hank ca","Hank","1234", new ArrayList<>()));
//                userService.saveUser(new AppUser(null,"FRankd","Papa","1234", new ArrayList<>()));
//                userService.saveUser(new AppUser(null,"Mufasa","Carl","1234", new ArrayList<>()));
//                userService.saveUser(new AppUser(null,"Prat","Sdenf","1234", new ArrayList<>()));
//                userService.saveUser(new AppUser(null,"Johnny","Sbaunch","1234", new ArrayList<>()));
//                
//                userService.addRoleToUser("Hank", "Role_User");//Attenzione se dovete rifare il bean scriveteli tutti in maiuscuolo i ruoli es ROLE_USER
//                userService.addRoleToUser("Papa", "Role_Manager");
//                userService.addRoleToUser("Carl", "Role_Admin");
//                userService.addRoleToUser("Sdenf", "Role_Super_Admin");
//                userService.addRoleToUser("Sdenf", "Role_Admin");
//                userService.addRoleToUser("Sbaunch", "Role_Manager");
//                
//                
//            };
//        }
}
