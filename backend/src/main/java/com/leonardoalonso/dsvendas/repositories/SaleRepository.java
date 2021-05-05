package com.leonardoalonso.dsvendas.repositories;

import com.leonardoalonso.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
