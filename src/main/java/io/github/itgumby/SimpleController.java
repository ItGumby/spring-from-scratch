package io.github.itgumby;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class SimpleController {

    private final ProfileService profileService;
    public SimpleController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/simple/test")
    public String getString() {
        return "Here is the test string";
    }

    @GetMapping("/simple/hello/{name}")
    public String getHelloDynamic(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/simple/setProfile")
    public void receiveData(@RequestBody Profile profile) {
        profileService.processProfile(profile);
    }

}