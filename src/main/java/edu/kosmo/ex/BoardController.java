package edu.kosmo.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
 
 
	@RequestMapping("board/comfirm")
	public String check(@RequestParm("id") String id,
			            @RequestParm("pw") String pw, Model model") {
		
		model.addAttribute("id","abcd");
		model.addAttribute("pw","1234");
		 
		return "board/comfirm";
	}
	
}
