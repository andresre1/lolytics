package com.lolytics;

import com.lolytics.champion.web.in.controller.ChampionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ChampionController.class)
class ChampionControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  void getAllChampionsReturnsOkWithChampions() throws Exception {
    mockMvc
            .perform(
                    MockMvcRequestBuilders.get("/champions/all")
                            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.length()").value(3))
            .andExpect(jsonPath("$[0].id").value(1))
            .andExpect(jsonPath("$[0].name", is("Ahri")));
  }

}