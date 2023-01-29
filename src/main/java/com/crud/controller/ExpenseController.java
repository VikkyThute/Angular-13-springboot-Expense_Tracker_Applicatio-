package com.crud.controller;

import com.crud.model.Expense;
import com.crud.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/get")
    public ResponseEntity<List<Expense>>get(){
        List<Expense> expenses=expenseService.getAll();
        return new ResponseEntity<List<Expense>>(expenses, HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Expense>save(@RequestBody Expense expense){
        Expense expensesOne=expenseService.save(expense);
        return new ResponseEntity<Expense>(expensesOne,HttpStatus.OK);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Expense>get(@PathVariable("id") Long id){
        Expense expenses=expenseService.findById(id);
        return new ResponseEntity<Expense>(expenses,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String>delete(@PathVariable("id") Long id){
        expenseService.delete(id);
        return new ResponseEntity<String>("Expense is Deleted successfully",HttpStatus.OK);
    }
}
