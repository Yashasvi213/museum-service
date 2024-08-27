package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Museum;
import com.example.demo.service.MuseumService;

@RestController
@RequestMapping("/museum")
public class MuseumController {
	MuseumService mser;

	public MuseumController(MuseumService mser) {
		super();
		this.mser = mser;
	}
	
	@GetMapping("/all")
	public List<Museum>card_details(){
		return mser.card_details();
	}
	
	@GetMapping("/mue/{mid}")
	public Museum fullDetails(@PathVariable int mid) {
		return mser.fullDetails(mid);
	}
	
	@PostMapping("/create")
	public String createmueByAdmin(@RequestBody Museum mue) {
		return mser.createmueByAdmin(mue);
	}
	
	@GetMapping("/mue/by-state")
	public List<Museum> findMueByState(@RequestParam String state){
		return mser.findMueByState(state);
	}
	
	@GetMapping("/mue/by-city")
	public List<Museum> findMueBycity(@RequestParam String city){
		return mser.findMueBycity(city);
	}
	@GetMapping("/mue/by-both")
	public List<Museum> findMueByStateandCity(String state, String city){
		return mser.findMueByStateandCity(state, city);
	}
	
	@GetMapping("/mue/search")
	public List<Museum> searchMuseumsByName(String name){
		return mser.searchMuseumsByName(name);
	}
	
	
	
	
}
