package web;
import javax.persistence.*;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Main {
	public static void main(String[] z) {
		SpringApplication.run(Main.class, z);
	}
}
@Controller
class Web {
	@GetMapping("/")
	String showHome() {
		return "home";
	}
	@PostMapping("/")
	String saveProduct(String topic, String detail) {
		Product p = new Product();
		p.topic = topic;
		p.detail = detail;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("main");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(p);
		manager.getTransaction().commit();
		return "redirect:/";
	}
}
