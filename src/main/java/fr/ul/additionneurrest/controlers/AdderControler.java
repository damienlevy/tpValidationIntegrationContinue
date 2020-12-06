package fr.ul.additionneurrest.controlers;

import fr.ul.additionneurrest.services.AdderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

//, produces = MediaType.APPLICATION_JSON_UTF8_VALUE
@RequestMapping(value ="/adder")
@RestController
public class AdderControler {
    private AdderService adderService;

    public AdderControler(AdderService adderService){
        this.adderService = adderService;
    }

    @GetMapping("/current")
    public int currentNum(){
        return adderService.currentBase();
    }

    @PostMapping(value = "/add")
    public int add(@RequestParam int num){
        return adderService.add(num);
    }

    @PostMapping(value = "/changeBase")
    public int changeBase(@RequestParam int base){
        adderService.baseNum(base);
        return adderService.currentBase();
    }
    @GetMapping("/random")
    public int random(){
        adderService.random();
        return adderService.currentBase();
    }


}
