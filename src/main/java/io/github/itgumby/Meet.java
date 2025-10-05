package io.github.itgumby;

import java.net.URL;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meet {
    private Long id;
    private Integer year;
    private String name;
    private LocalDate date;
    private String location;
    private Integer temperature;
    private String weather;
    private URL url;
}
