package com.yugiohwiki.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yugiohwiki.Monster;
import com.yugiohwiki.services.MonsterService;

@RestController //RestController annotation is used to create RESTful web services using Spring MVC. RestController takes care of mapping request data to the defined request handler method.
@RequestMapping(path="api")  //RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. 
@CrossOrigin({"*", "http://localhost:4200"})
public class MonsterController {
	
	@Autowired // Autowiring feature of spring framework enables you to inject the object dependency implicitly.
	private MonsterService monsterServ;
	
	@RequestMapping(path="ping", method=RequestMethod.GET)
	public String ping(){
		return "pong";
	}
	
	@RequestMapping(path="monsters", method=RequestMethod.GET)
	public List<Monster> showAllMonsters(HttpServletRequest req, HttpServletResponse res){
		return monsterServ.showAll();
	}
	
	@RequestMapping(path="monsters/{id}", method=RequestMethod.GET)
	public Monster showAMonster(HttpServletRequest req, HttpServletResponse res, @PathVariable int id) {
		return monsterServ.showMonsterById(id);
	}
	
	@RequestMapping(path="monsters", method=RequestMethod.POST)
	public Monster create(HttpServletRequest req, HttpServletResponse res, @RequestBody Monster monster) {
		System.out.println(monster);
		return monsterServ.createUserMonster("yugioh", monster);
	}
	
	@RequestMapping(path="monsters/{id}", method=RequestMethod.PUT)
	public Monster update(HttpServletRequest req, HttpServletResponse res, @PathVariable int id, @RequestBody Monster monster) {
		return monsterServ.updateMonster(id, "yugioh", monster);
	}
	
	@RequestMapping(path="monsters/{id}", method=RequestMethod.DELETE)
	public boolean destroy(HttpServletRequest req, HttpServletResponse res, @PathVariable int id) {
		return monsterServ.destroy(id, "yugioh");
	}

}
