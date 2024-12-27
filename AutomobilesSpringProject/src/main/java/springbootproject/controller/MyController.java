package springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootproject.entity.MyEntity;
import springbootproject.services.Services;

@Controller
@RequestMapping("/cars")
public class MyController {
	
	@Autowired
	private Services sv;
	
	@GetMapping("/")
	public String getHomePage(Model model) {
		List<MyEntity> li = sv.getAllCars();
		model.addAttribute("index", li);
		return "index";
	}
	
	@GetMapping("/new")
	public String getAllData(Model model) {
		model.addAttribute("car", new MyEntity());
		return "addcar";
	}
	
	@PostMapping("/save")
	public String saveNewCar(@ModelAttribute MyEntity me) {
		sv.saveCar(me);
		System.out.println(me);
		return "redirect:/cars/";
	}
	
	// to update the data of Cars Details--
	@GetMapping("/update/{id}")
	public String updateCar(@PathVariable long id, Model model) {
		
		MyEntity me = sv.getById(id);
		if(me != null) {
			model.addAttribute("car", me);
			return "update";
		}
		else {
			return "redirect:/cars/";
		}
				
	}
			
	@PostMapping("/update/{id}")
	public String updateCar(@PathVariable long id, @ModelAttribute MyEntity me) {
				
		me.setId(id);
		sv.saveCar(me);
		return "redirect:/cars/";
				
	}
			
	@GetMapping("/delete/{id}")
	public String delNewPet(@PathVariable long id) {
		System.out.println(id);
		sv.deletePets(id);
		return "redirect:/cars/";
	}

}
