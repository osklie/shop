package shop.project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class TaskDto {
    private String products;
    private String groups;
    private String carts;
    private String orders;
    private String users;
}