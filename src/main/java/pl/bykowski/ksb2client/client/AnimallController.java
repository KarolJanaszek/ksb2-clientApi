package pl.bykowski.ksb2client.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class AnimallController {

    public AnimallController() {
        RestTemplate restTemplate = new RestTemplate();
        AnimalFact[] forObject = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=2", AnimalFact[].class);

        for (AnimalFact animalFact : forObject) {
            System.out.println(animalFact.getText());
        }
    }
}
