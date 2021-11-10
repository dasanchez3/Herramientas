package com.davidsanchez.primerapi.repository

import com.davidsanchez.primerapi.model.Workout
import org.springframework.data.jpa.repository.JpaRepository

interface WorkoutRepository:JpaRepository<Workout, Long> {

}