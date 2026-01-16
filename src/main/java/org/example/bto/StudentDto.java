package org.example.bto;

import lombok.*;
import org.example.util.Gander;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDto {
    private Integer id;
    private String name;
    private String classRoom;
    private Integer phone;
    private String address;
    private Gander gander;
}
