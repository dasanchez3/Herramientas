package com.example.compras.repository
import org.springframework.data.jpa.repository.JpaRepository
import com.example.compras.model.Cliente

interface ClienteRepository:JpaRepository<Cliente, Long> {
    fun findById(id: Long?): Cliente?
}