package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    // Mapping for the home page
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("petitions", petitions);
        return "index";
    }

    // Mapping for creating a new petition form
    @GetMapping("/create")
    public String showCreatePetitionForm() {
        return "create";
    }

    // Mapping for handling form submission for a new petition
    @PostMapping("/create")
    public String createPetition(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String author
    ) {
        Petition newPetition = new Petition(title, description, author);
        petitions.add(newPetition);
        return "redirect:/";
    }

}
