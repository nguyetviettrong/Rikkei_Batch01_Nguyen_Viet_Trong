package rikkei_trong.com.demo.Repository;


import rikkei_trong.com.demo.Entity.khachhangEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface khachhangrepos extends JpaRepository<khachhangEntity,String> {
}
