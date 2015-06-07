package controllers;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import domain.Expense;

@RestController
@RequestMapping("/expenses")
public class ExpenseRestController {
	
	private static final Logger logger = Logger.getLogger(ExpenseRestController.class);
	
	@RequestMapping(method = RequestMethod.POST)
	public Expense create(@RequestBody Expense expense) {
		logger.info("creating expense " + expense);
		return expense;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Expense> readAllExpenses() {
		Expense dummyExpense = new Expense();
		dummyExpense.setId(1);
		dummyExpense.setDescirption("dummy description...");
		List<Expense> dummyExpenses = Lists.newArrayList(); // TODO investigate if type Expense will be passed to created ArrayList
		dummyExpenses.add(dummyExpense);
		return dummyExpenses;
	}

}
