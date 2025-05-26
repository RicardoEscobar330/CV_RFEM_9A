package mx.edu.utez.cvrfem9a.controller;

@RestController
@RequestMapping("/api/user1")
@CrossOrigin("*")
public class User1Controller {
    @GetMapping("")
    public String getMessage(){
        return "Hello World";
    }
}
