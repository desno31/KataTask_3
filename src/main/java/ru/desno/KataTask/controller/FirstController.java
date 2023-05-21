package ru.desno.KataTask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping()
    public static String getUsersPage() {
        return "pages/firstPage";
    }
}
