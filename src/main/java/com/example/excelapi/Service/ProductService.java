package com.example.excelapi.Service;


import com.example.excelapi.entity.Product;
import com.example.excelapi.helper.Helper;
//import com.example.excelapi.repo.CustomerRepo;
import com.example.excelapi.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
//    private CustomerRepo customerRepo;

    public  void save(MultipartFile file) {

        try {
            List<Product> products = Helper.convertExcelToListOfProduct(file.getInputStream());
            this.productRepo.saveAll(products);

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public List<Product> getALLProduct () {
        return this.productRepo.findAll();
    }

//    public List<Product> getALLProductbyid() {
//        return this.productRepo.findById();
    }


//    public Product getProductById(Long productId) {
//        return null;
//    }



//    public Product getProductById(Long productId) {
//        return null;
//    }


//    public Product getProductById(Long productId) {
//        return this.productRepo.findById(Integer)











