package slaughterHouse.restAPI.controller;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import slaughterHouse.shared.service.Animal.IAnimalService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AnimalController.class)
class AnimalEntityControllerTest {
    @MockBean
    private IAnimalService animalService;
    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldGiveAllPosts() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/animals")).
                andExpect(MockMvcResultMatchers.status().is(200));
    }
}

