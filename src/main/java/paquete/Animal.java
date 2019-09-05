package paquete;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Animal {
    private String name;
    private int age;
    private String color;
}
