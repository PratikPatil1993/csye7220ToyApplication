package com.csye.ToyApplication.toy;

import com.csye.ToyApplication.authentication.AuthenticationService;
import com.csye.ToyApplication.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/toys")
public class ToyController {
    @Autowired
    private ToyService toyService;

    @Autowired
    private AuthenticationService authService;

    @Autowired
    private UserService userService;


    //    @GetMapping("")
//    public List<Toy> getAllToys(@RequestParam(required = false) String name) {
//        if (name != null) {
//            return toyService.getByName(name);
//        }
//        return toyService.getAll();
//    }
    @GetMapping("")
    public List<Toy> getAllToys(@RequestParam Long userId) {
        return toyService.getAllByUserId(userId);
    }

    @GetMapping("/{id}")
    public Toy getByID(@PathVariable Long id) {
        return toyService.getByID(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public Toy create(@RequestBody Toy newToy) {
        return toyService.create(newToy);
    }

    @PutMapping("")
    public Toy update(@RequestBody Toy updatedToy) {
        return toyService.update(updatedToy);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        toyService.deleteById(id);
    }

    @GetMapping("/all")
    public List<Toy> exploreToys(@RequestParam Long userId){
        return toyService.exploreAllToys(userId);

    }
}
