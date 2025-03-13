package com.list.task.controller;

import com.list.task.config.SecurityConfig;
import com.list.task.model.Tarea;
import com.list.task.service.TareaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private static final Logger logger = LoggerFactory.getLogger(SecurityConfig.class);

    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> getAllTareas() {
        return tareaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarea> getTareaById(@PathVariable Long id) {
        Optional<Tarea> tarea = tareaService.findById(id);
        logger.info("Tarea encontrada: " + tarea);
        return tarea.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tarea createTarea(@RequestBody Tarea tarea) {
        logger.info("Tarea creada: " + tarea);
        return tareaService.save(tarea);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        if (!tareaService.findById(id).isPresent()) {
            logger.info("Tarea no encontrada");
            return ResponseEntity.notFound().build();
        }

        tarea.setId(id);
        tareaService.update(tarea);
        logger.info("Tarea actualizada: " + tarea);
        return ResponseEntity.ok("Tarea actualizado con éxito");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTarea(@PathVariable Long id) {
        if (!tareaService.findById(id).isPresent()) {
            logger.info("Tarea no encontrada");
            return ResponseEntity.ok("Tarea no encontrada");
        }

        tareaService.deleteById(id);
        logger.info("Tarea eliminada: " + id);
        return ResponseEntity.ok("Tarea eliminada con éxito");
    }
}