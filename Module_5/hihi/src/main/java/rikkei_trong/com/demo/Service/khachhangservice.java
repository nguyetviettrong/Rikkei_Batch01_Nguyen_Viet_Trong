package rikkei_trong.com.demo.Service;

import rikkei_trong.com.demo.Entity.khachhangEntity;
import rikkei_trong.com.demo.Repository.khachhangrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class khachhangservice {
    @Autowired
    private khachhangrepos repo;

    public List<khachhangEntity> listALL(){
        return repo.findAll();
    }
    public void save(khachhangEntity khachhang){
        repo.save(khachhang);
    }

    public khachhangEntity get(String MaKhachHang){
        return repo.findById(MaKhachHang).get();
    }

    public void delete(String MaKhachHang){
        repo.deleteById(MaKhachHang);
    }
}
