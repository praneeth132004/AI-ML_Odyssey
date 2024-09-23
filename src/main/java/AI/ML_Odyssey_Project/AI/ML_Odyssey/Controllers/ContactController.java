package AI.ML_Odyssey_Project.AI.ML_Odyssey.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

import AI.ML_Odyssey_Project.AI.ML_Odyssey.Services.EmailService;

@Controller
public class ContactController {
	 @Autowired
	    private EmailService emailService;
     
	 @PostMapping("/contactus")
	 public String sendContactMessage(
	            @RequestParam("name") String name,
	            @RequestParam("email") String email,
	            @RequestParam("message") String message,
	            Model model) {

	        // Compose email
	        String subject = "New Contact Message from " + name;
	        String body = "You have received a new message from " + name + " (" + email + "):\n\n" + message;

	        // Send email
	        emailService.sendSimpleMessage("odysseyaiml@gmail.com", subject, body);

	        // Add confirmation message to model
	        model.addAttribute("confirmationMessage", "Your message has been sent successfully!");

	        return "contactus";
	    }
}
