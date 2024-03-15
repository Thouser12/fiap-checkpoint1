package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PingController {

	@Autowired
    private Environment env;

    @GetMapping("/ping")
    public String getPing() {
        String profile = env.getActiveProfiles()[0]; // Assume que haja sempre ao menos um perfil ativo
        return "Pong em " + profile;
    }
	
}
