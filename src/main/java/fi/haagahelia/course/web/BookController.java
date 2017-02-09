package fi.haagahelia.course.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import fi.haagahelia.course.domain.Message;



@Controller
public class BookController {

	
	@RequestMapping(value="/index", method=RequestMethod.GET)
    public String greeting() {
        return "index";
    }
	
	
	
	@RequestMapping(value="/receipt", method=RequestMethod.GET)
	public String greetingForm(	
		@RequestParam (name="Title") String title,
		@RequestParam (name="Author") String author,
		@RequestParam (name="Year") int year,
		@RequestParam (name="ISBN") int isbn,
		@RequestParam (name="Price") String price,
		Model model) {
		model.addAttribute("Title", title);
		model.addAttribute("Author", author);
		model.addAttribute("Year", year);
		model.addAttribute("ISBN", isbn);
		model.addAttribute("Price", price);
		return "receipt";
	}
    
    
		

}
