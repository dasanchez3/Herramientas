package com.davidsanchez.primerapi.controllers

import com.davidsanchez.primerapi.model.Diet
import com.davidsanchez.primerapi.service.DietService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/diets")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class DietController {
    @Autowired
    lateinit var dietService: DietService

    @GetMapping
    fun list(): List<Diet>{
        return dietService.list()
    }

    @PostMapping
    fun save(@RequestBody diet:Diet):Diet{
        return dietService.save(diet)
    }
}