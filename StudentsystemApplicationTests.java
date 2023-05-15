package com.example.studentsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.studentsystem.controller.StudentController;
import com.example.studentsystem.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@WebMvcTest(StudentController.class)
@ExtendWith(SpringExtension.class)
class StudentsystemApplicationTests {

//	@Autowired
//	private MockMvc mvc;
//	
//	
//	@Test
//	void contextLoads() throws Exception {
//		
//		Student s=new Student();
//		s.setId(521);
//		s.setName("Vineel");
//		s.setAddress("Springfield");
//		
//		ObjectMapper obj=new ObjectMapper();
//		String studentJson= obj.writeValueAsString(s);
//		
//		
//		mvc.perform(get("/student/particular").param("address","Springfield"))
//		.andExpect(status().isOk()).andExpect((ResultMatcher) content().json(studentJson));
//		
//	}
}
	


