package ru.shilaev.tacocloudproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TacoPageController.class)
class TacoPageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getTacoPage() throws Exception {
        mockMvc.perform(get("/taco"))
                .andExpect(status().isOk())
                .andExpect(view().name("taco"))
                .andExpect(content().string(
                        containsString("Taco Page")
                ));
    }
}