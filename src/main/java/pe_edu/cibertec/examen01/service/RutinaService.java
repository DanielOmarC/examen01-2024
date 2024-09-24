package pe_edu.cibertec.examen01.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe_edu.cibertec.examen01.remote.service.DataService;

import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@Service
public class RutinaService {

   private final DataService dataService;

   public CompletableFuture<String> rutina(){
       CompletableFuture<String> tarea1 = dataService.correr();
       CompletableFuture<String> tarea2 = dataService.respirar();
       CompletableFuture<String> tarea3 = dataService.caminar();
       return CompletableFuture.allOf(tarea1, tarea2, tarea3)
               .thenApply(result ->{
                   try{
                       String valorTarea1 = tarea1.join();
                       String valorTarea2 = tarea2.join();
                       String valorTarea3 = tarea3.join();
                       return "Rutina Completada"+
                               valorTarea1+"-"+
                               valorTarea2+"-"+
                               valorTarea3;
                   }catch (Exception ex){
                       return "Error"+ex.getMessage();
                   }
               })
               .exceptionally(ex-> "Error al ejecutar tareas"+ ex.getMessage());
   }
}
