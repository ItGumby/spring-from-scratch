package io.github.itgumby;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    public void processProfile(Profile profile) {
        System.out.println("received profile: " + profile);
    }
}
