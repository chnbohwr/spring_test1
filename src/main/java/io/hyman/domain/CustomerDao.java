package io.hyman.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 10411303 on 2015/11/12.
 * 做成DAO可以擁有許多ORM的功能。例如 findAll , save ... 等等。
 */
public interface CustomerDao extends JpaRepository<Customer,String>{

}
