package benstadlbauer.expring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ExpenseController {
	@Autowired
	private ExpenseRepository expenseRepository;

	@GetMapping("/")
	public String showForm(Expense expense) {
		return "expense";
	}

	@PostMapping("/")
	public String checkAndSaveExpense(@Valid Expense expense, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "expense";
		}

		expenseRepository.save(expense);
		return "saved";
	}
}
