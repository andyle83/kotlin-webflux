package com.microservice.webflux.services

import com.microservice.webflux.models.Customer
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface ICustomerService {
    fun getCustomer(id: Int) : Mono<Customer>
    fun searchCustomers(nameFilter: String): Flux<Customer>
    fun createCustomer(customerMono: Mono<Customer>) : Mono<*>
}