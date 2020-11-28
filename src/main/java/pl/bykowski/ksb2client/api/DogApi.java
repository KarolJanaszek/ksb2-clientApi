package pl.bykowski.ksb2client.api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogApi {

    private List<Dog> dogList;

    public DogApi() {
        this.dogList = new ArrayList<>();
        dogList.add(new Dog("Napoleon", "Corgie"));
        dogList.add(new Dog("Napoleonka", "Corgie"));
        dogList.add(new Dog("Puszek", "BernisPuppy"));
        dogList.add(new Dog("Puszka", "BernisPuppy"));
    }

    @GetMapping
    public List<Dog> get(@RequestHeader int amount) {
        return dogList.subList(0, amount);
    }

    @PostMapping
    public void add(@RequestBody Dog dog) {
        dogList.add(dog);
    }
}
