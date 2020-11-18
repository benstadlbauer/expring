package benstadlbauer.expring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ExpenseController {
	@Autowired
	private ExpenseRepository expenseRepository;

	@GetMapping("/")
	public String showForm(Model model) {
		model.addAttribute("expense", new Expense());
		return "expense";
	}

	@PostMapping("/")
	public String checkAndSaveExpense(@Valid @ModelAttribute Expense expense, BindingResult bindingResult,
	                                  Model model) {
		if (bindingResult.hasErrors()) {
			return "expense";
		}

		model.addAttribute("expense", expense);
		expenseRepository.save(expense);
		model.addAttribute("expense", new Expense());
		return "expense";
	}
}
