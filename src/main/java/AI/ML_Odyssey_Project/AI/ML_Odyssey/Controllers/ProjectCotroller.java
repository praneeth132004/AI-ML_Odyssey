package AI.ML_Odyssey_Project.AI.ML_Odyssey.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ProjectCotroller {
	@GetMapping("/projects")
    public String getPro() {
    	return "projects";
    }
    
    @GetMapping("/beginner")
    public String getB() {
    	return "beginner";
    }
    
    @GetMapping("/Intermediate")
    public String getI() {
    	return "Intermediate";
    }
    
    @GetMapping("/Advanced")
    public String getA() {
    	return "Advanced";
    }
}
