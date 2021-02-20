package com.kayaTech.Repostory;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kayaTech.Model.RequiredProduct;


public interface RequiredProductRepo extends JpaRepository<RequiredProduct, String> {

}
