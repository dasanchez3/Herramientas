package com.davidsanchez.primerapi.service

import com.davidsanchez.primerapi.model.Diet
import com.davidsanchez.primerapi.model.Workout
import com.davidsanchez.primerapi.repository.WorkoutRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class WorkoutService {
    @Autowired
    lateinit var workoutRepository: WorkoutRepository

    fun list(): List<Workout>{
        return workoutRepository.findAll()
    }
    fun save(workout: Workout): Workout {
        return workoutRepository.save(workout)
    }
}