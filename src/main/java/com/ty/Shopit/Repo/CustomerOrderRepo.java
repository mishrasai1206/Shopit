package com.ty.Shopit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Shopit.Entity.CustomerOrder;

public interface CustomerOrderRepo extends JpaRepository<CustomerOrder, Integer>{

}
