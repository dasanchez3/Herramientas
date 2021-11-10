package com.example.compras.service
import com.example.compras.model.Cliente
import com.example.compras.model.Producto
import com.example.compras.repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductoService {
    @Autowired
    lateinit var productoRepository: ProductoRepository

    fun list(): List<Producto>{
        return productoRepository.findAll()
    }

    fun save(producto: Producto):Producto{
        return productoRepository.save(producto)
    }

    fun update(producto: Producto): Producto {
        return productoRepository.save(producto)
    }

    fun updateDescription (producto: Producto): Producto {
        val response = productoRepository.findById(producto.id)
                ?:throw Exception()
        response.apply {
            this.nombre=producto.nombre
        }
        return productoRepository.save(producto)
    }

    fun delete (id:Long): Boolean{
        productoRepository.deleteById(id)
        return true
    }
}