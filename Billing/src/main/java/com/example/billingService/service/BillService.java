package com.example.billingService.service;

import com.example.billingService.entity.Bill;
import com.example.billingService.repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public String generateBill(Bill bill) {
        bill.setPaymentStatus("PENDING");
        billRepository.save(bill);
        return "Bill generated successfully";
    }

    public List<Bill> getBills() {
        return billRepository.findAll();
    }
}