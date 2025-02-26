package com.lolytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ChampionController.class)
class ChampionControllerTest {

  @Autowired
  MockMvc mockMvc;

}