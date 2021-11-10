package com.davidsanchez.primerapi.repository

import com.davidsanchez.primerapi.model.Diet
import org.springframework.data.jpa.repository.JpaRepository

interface DietRepository:JpaRepository<Diet, Long> {

}