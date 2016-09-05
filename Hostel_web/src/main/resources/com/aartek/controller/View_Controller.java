import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aartek.hostel.model.Reg_Dto;
import com.aartek.hostel.service.View_Service;

@Controller
public class View_Controller {
/*
	@Autowired
	private View_Service service;*/
	@RequestMapping("/showlogin")
	public String message(Map<String, Object> map) {
			
		return "home";
	}
	}
