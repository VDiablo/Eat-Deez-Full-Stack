package com.eat.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eat.model.EatDeeztable;
import com.eat.repository.EatDeezrepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EatDeezcontroller
{
   
	@Autowired
	private EatDeezrepository erepository;
	
	@PostMapping("insert")
	@CrossOrigin(origins="http://localhost:4200")
	public EatDeeztable insert(@RequestBody EatDeeztable etable)
	{
		return erepository.save(etable);
	}
	
	@PostMapping("update")
	@CrossOrigin(origins="http://localhost:4200")
	public EatDeeztable update(@RequestBody EatDeeztable ed)
	{
		return erepository.save(ed);
	}
	
	@PostMapping("delete")
	@CrossOrigin(origins="http://localhost:4200")
	public void delete(@RequestBody EatDeeztable fid)
	{
		erepository.delete(fid);
	}
	
	@GetMapping("view")
	@CrossOrigin(origins="http://localhost:4200")
	public List<EatDeeztable> view()
	{
		return this.erepository.findAll();
	}
	
	
	
}
