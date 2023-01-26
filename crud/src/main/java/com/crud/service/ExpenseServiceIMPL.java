package com.crud.service;

import com.crud.model.Expense;
import com.crud.repository.ExpenseRepository;
import com.crud.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceIMPL implements ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;
    @Override
    public List<Expense> getAll() {
        return expenseRepository.findAll();

    }
}
