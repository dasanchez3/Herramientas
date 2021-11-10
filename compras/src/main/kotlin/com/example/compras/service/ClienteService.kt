package com.example.compras.service

import com.example.compras.model.Cliente
import com.example.compras.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClienteService {
    @Autowired
    lateinit var clienteRepository: ClienteRepository

    fun list(): List<Cliente>{
        return clienteRepository.findAll()
    }

    fun save(cliente: Cliente):Cliente{
        return clienteRepository.save(cliente)
    }

    fun update(cliente: Cliente):Cliente{
        return clienteRepository.save(cliente)
    }

    fun updateDescription (cliente: Cliente):Cliente {
        val response = clienteRepository.findById(cliente.id)
                ?:throw Exception()
        response.apply {
            this.nombre=cliente.nombre
        }
        return clienteRepository.save(cliente)
    }

    fun delete (id:Long): Boolean{
        clienteRepository.deleteById(id)
        return true
    }
}