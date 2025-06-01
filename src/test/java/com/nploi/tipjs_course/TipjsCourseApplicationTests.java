package com.nploi.tipjs_course;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nploi.tipjs_course.repository.UserRepository;

@SpringBootTest
class TipjsCourseApplicationTests {

	@Autowired
	private UserRepository userRepository;
}
