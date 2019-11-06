package pl.example.spring.zad03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class HelloController
{
    @RequestMapping("/hello")
    public String hello(){
        return"Hello, time is" + LocalDateTime.now();
    }



}
