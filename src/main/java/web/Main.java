package web;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
public class Main {
	public static void main(String[] z) {
		SpringApplication.run(Main.class, z);
	}
	@GetMapping("/")
	String showHome(Model m) {
		m.addAttribute("brand", "iCoffee");
		return "home";
	}
}
