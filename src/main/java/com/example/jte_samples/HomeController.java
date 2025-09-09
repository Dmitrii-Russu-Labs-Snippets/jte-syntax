package com.example.jte_samples;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/demo/primitives-n-objects")
    public String showPrimitives(Model model) {
        var str = "World";
        model.addAttribute("str", str);
        return "primitives-n-objects";
    }

    @GetMapping("/demo/for-loop")
    public String showForLoop(Model model) {
        var items = List.of("Item 1","Item 2","Item 3");
        model.addAttribute("items", items);
        return "for-loop";
    }

    @GetMapping("/demo/object")
    public String showObject(Model model) {
        var person = new Person("Johnnie", "Pastera str");
        model.addAttribute("person", person);
        return "object";
    }

    @GetMapping("/demo/if")
    public String showIf(@RequestParam(required = false) Integer num, Model model) {
        model.addAttribute("num", num);
        return "if";
    }



    @GetMapping("/demo/map")
    public String showMap(Model model) {
        var map = Map.of("name", "Alice", "role", "Admin");
        model.addAttribute("userMap", map);
        return "map";
    }

    @GetMapping("/demo/dates")
    public String showDates(Model model) {
        model.addAttribute("currentDate", LocalDate.now());
        model.addAttribute("amount", new BigDecimal("99.95"));
        return "dates";
    }

}

