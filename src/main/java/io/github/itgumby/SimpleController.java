package io.github.itgumby;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class SimpleController {

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
        System.out.println("received profile: " + profile);
    }

    public static class Profile {
        private String name;
        private String address;

        public Profile() {
            super();
        }

        public String getName() { return name; }
        public void setName(String n) { name = n; }
        public String getAddress() { return address; }
        public void setAddress(String a) { address = a; }
    }
}