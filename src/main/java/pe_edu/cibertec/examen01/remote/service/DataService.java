package pe_edu.cibertec.examen01.remote.service;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class DataService {

    private static final Logger log = LoggerFactory.getLogger(DataService.class);

    @Async
    public CompletableFuture <String> correr(){
        try {
        log.info("Corriendo");

            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("10 segundos corridos");


    }

    @Async
    public CompletableFuture<String> respirar(){
        try{
            log.info("respirando");
            TimeUnit.SECONDS.sleep(5);

        }catch (InterruptedException ex){
            ex.printStackTrace();

        }
        return CompletableFuture.completedFuture("5 segundos respirando");
    }

    @Async
    public CompletableFuture<String> caminar(){
        try{
            log.info("caminando");
            TimeUnit.SECONDS.sleep(7);

        }catch (InterruptedException ex){
            ex.printStackTrace();

        }
        return CompletableFuture.completedFuture("7 segundos caminando");
    }




}






















