package com.leonardoalonso.dsvendas.repositories;

import com.leonardoalonso.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
