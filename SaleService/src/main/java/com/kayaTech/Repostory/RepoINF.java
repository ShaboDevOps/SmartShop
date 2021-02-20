package com.kayaTech.Repostory;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayaTech.Model.Sales;

public interface RepoINF extends JpaRepository<Sales, String>{

}
