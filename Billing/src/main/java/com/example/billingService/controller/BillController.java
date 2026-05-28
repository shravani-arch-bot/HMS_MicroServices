package com.example.billingService.controller;

import com.example.billingService.entity.Bill;
import com.example.billingService.service.BillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping("/")
    public String home() {
        return "Billing Service Running";
    }

    @PostMapping
    public String generateBill(@RequestBody Bill bill) {
        return billService.generateBill(bill);
    }

    @GetMapping
    public List<Bill> getBills() {
        return billService.getBills();
    }
}