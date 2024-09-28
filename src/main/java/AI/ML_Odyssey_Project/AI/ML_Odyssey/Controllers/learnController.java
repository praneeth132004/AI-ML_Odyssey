package AI.ML_Odyssey_Project.AI.ML_Odyssey.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class learnController {
   @GetMapping("/learn")
   public String getLearn() {
	   return "learn";
   }
   @GetMapping("/aieng")
   public String getAIENG() {
	   return "aieng";
   }
}
