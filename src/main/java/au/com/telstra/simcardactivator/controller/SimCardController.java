package au.com.telstra.simcardactivator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import au.com.telstra.simcardactivator.dao.SimCardDao;
import au.com.telstra.simcardactivator.model.SimCard;

@RestController
public class SimCardController {

	@Autowired
	private SimCardDao simCardDao;
	
	@PostMapping("/activation")
	public String acceptSimCard(@RequestBody SimCard simCard) {
		simCardDao.save(simCard);
		return "success";
	}
}
