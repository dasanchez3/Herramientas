package com.davidsanchez.primerapi.controllers

import com.davidsanchez.primerapi.model.Workout
import com.davidsanchez.primerapi.service.WorkoutService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/workouts")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class WorkoutController {
    @Autowired
    lateinit var workoutService: WorkoutService

    @GetMapping
    fun list(): List<Workout>{
        return workoutService.list()
    }

    @PostMapping
    fun save(@RequestBody workout: Workout): Workout {
        return workoutService.save(workout)
    }
}