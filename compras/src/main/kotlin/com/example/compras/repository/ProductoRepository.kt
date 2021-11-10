package com.example.compras.repository
import com.example.compras.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository
import com.example.compras.model.Producto

interface ProductoRepository:JpaRepository<Producto,Long> {
    fun findById(id: Long?): Producto?
}