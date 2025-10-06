package io.github.itgumby;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    private String name;
    private String address;

    @Override
    public String toString() {
        return String.format("{name: \"%s\", address: \"%s\"}", name, address);
    }
}
