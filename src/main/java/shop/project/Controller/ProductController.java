package shop.project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.project.domain.TaskDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/shop")
public class ProductController {
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    @GetMapping
    public TaskDto getTask(String taskproducts) {
        return new TaskDto("items1", "items2", "items3", "items4", "items5");

    }
}