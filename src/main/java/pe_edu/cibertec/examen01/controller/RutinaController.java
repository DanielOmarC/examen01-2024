package pe_edu.cibertec.examen01.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe_edu.cibertec.examen01.service.RutinaService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RequiredArgsConstructor
@RestController
public class RutinaController {
    private final RutinaService rutinaService;


    @GetMapping("/rutina-diaria")
    public String rutinaDiaria()
        throws ExecutionException, InterruptedException{

        CompletableFuture<String> resultado =
                rutinaService.rutina();
        return resultado.get();
    }
}
