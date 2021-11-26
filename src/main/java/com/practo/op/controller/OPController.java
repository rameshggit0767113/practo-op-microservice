package com.practo.op.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practo.op.dto.Visit;

@RestController
@RequestMapping("/op")
public class OPController {

	@GetMapping(path = "/getVisit",produces = MediaType.APPLICATION_JSON)
	public Visit getVisitDetails(@RequestParam("visitId") String visitId) {
		return new Visit(new Long(visitId), "OP/ENT/120/2021/08/20", "156", "ENT", "156854", "9808");
	}
	
}
