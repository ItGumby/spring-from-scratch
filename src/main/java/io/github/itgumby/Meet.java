package io.github.itgumby;

import java.net.URL;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  // hibernate requires no-arg constructor if others exist
@AllArgsConstructor // handy for unit tests and such
@Entity     // indicate class maps to a DB table
@Table(name = "meets")  // override default table name based on class name
public class Meet {
    @Id // indicate primary key of table rows
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // let DB control values
    private Long id;

    private Integer year;
    private String name;
    private LocalDate date;
    private String location;
    @Column(name = "temp")
    private Integer temperature;
    private String weather;
    @Column(name = "source_url")
    private URL url;
}
