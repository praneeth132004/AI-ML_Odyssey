package AI.ML_Odyssey_Project.AI.ML_Odyssey.Controllers;
import AI.ML_Odyssey_Project.AI.ML_Odyssey.Entities.*;
import AI.ML_Odyssey_Project.AI.ML_Odyssey.Repository.UserRepository;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	@Autowired
    private UserRepository userRepository;
	
	@GetMapping("/home")
    public String getHome() {
        return "index"; // Ensure index.html is in the templates folder
    }
    
    @GetMapping("/signup")
    public String getSignup() {
        return "signup"; // This should match the filename signup.html
    }
    
    @GetMapping("/login")
    public String getLogin() {
        return "login"; // This should match the filename signup.html
    }
    @GetMapping("/aitools")
    public String getAITools() {
        return "aitools"; // This should match the filename signup.html
    }
    
 // Handle signup form submission
    @PostMapping("/signup")
    public String postSignup(@RequestParam("name") String name,
                             @RequestParam("email") String email,
                             @RequestParam("phone") String phone,
                             @RequestParam("level") String level,
                             @RequestParam("password") String password,
                             Model model) {
        // Create a new user object
        User user = new User(name, email, phone, level, password);
        
        try {
            // Save the user
            userRepository.save(user);
            model.addAttribute("successMessage", "Signup Successful!");
            return "login";  // Redirect to login page after success
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Signup Failed. Please try again.");
            return "signup";  // Stay on signup page if failure
        }
    }

    
 // Handle login form submission
    @PostMapping("/login")
    public String postLogin(@RequestParam("email") String email,
                            @RequestParam("password") String password,
                            HttpSession session, // For storing user session
                            Model model) {
        User user = userRepository.findByEmailAndPassword(email, password);
        if (user != null) {
            session.setAttribute("username", user.getName());  // Store user in session
            return "index";  // Redirect to home page
        } else {
            model.addAttribute("errorMessage", "Invalid credentials, please try again.");
            return "login";
        }
    }

    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();  // Invalidate the session
        return "redirect:/login";  // Redirect to login page
    }
    
    @GetMapping("/contactus")
    public String getCU() {
    	return "contactus";
    }
    
    @GetMapping("/community")
    public String getCom() {
    	return "community";
    }
    
    @GetMapping("/ai-assistance")
    public String getAIA() {
    	return "ai-assistance";
    }
    
    @GetMapping("/leaderboard")
    public String getLB() {
    	return "leaderboard";
    }
    
    
}
