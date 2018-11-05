package com.fenbi.fbms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fenbi.fbms.entity.Course;
import com.fenbi.fbms.entity.FenbiResult;
import com.fenbi.fbms.service.CourseService;

@Controller
public class TestController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/course/findById")
	@ResponseBody
	public Course findById(Integer id) {
		return courseService.findById(id);
	} 
	
}
  