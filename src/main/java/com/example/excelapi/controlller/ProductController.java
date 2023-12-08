package com.example.excelapi.controlller;

import com.example.excelapi.Service.ProductService;
import com.example.excelapi.entity.Product;
import com.example.excelapi.helper.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("upload/product")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (Helper.checkExcelFormat(file)) {
            this.productService.save(file);

            return ResponseEntity.ok(Map.of("Message", "file is upload and data enter succesfully"));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("empty cell found. file not uploaded");


    }

    @GetMapping(value = "/products")


    public List<Product> getAllProduct() {
        return this.productService.getALLProduct();
////        }
//@GetMapping("/{productId}")
//public ResponseEntity<?> getProducts(@PathVariable(required = false) Long productId) {
//    if (productId != null) {
//        // Get product by ID
//        Product product = productService.getProductById(productId);
//        if (product != null) {
//            return new ResponseEntity<>(product, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
//        }
//    } else {
//        // Get all products/
//        List<Product> products = productService.getAllProducts();
//        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}





//        @GetMapping("/productId")
//        public ResponseEntity<Product> getProductById (@PathVariable Long productId){
//            Product product = productService.getProductById(productId);
//
//            if (product != null) {
//                return ResponseEntity.ok(product);
//            } else {
//                return ResponseEntity.notFound().build();
//            }
//
//
//        }











