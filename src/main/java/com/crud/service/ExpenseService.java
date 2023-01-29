package com.crud.service;

import com.crud.model.Expense;

import java.util.List;

public interface ExpenseService {

    public List<Expense> getAll();

    Expense save(Expense expense);

    Expense findById(Long id);

    void delete(Long id);
}
