package com.davidsanchez.primerapi.service

import com.davidsanchez.primerapi.model.Diet
import com.davidsanchez.primerapi.repository.DietRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DietService {
    @Autowired
    lateinit var dietRepository: DietRepository

    fun list(): List<Diet>{
        return dietRepository.findAll()
    }

    fun save(diet:Diet):Diet{
        return dietRepository.save(diet)
    }
}