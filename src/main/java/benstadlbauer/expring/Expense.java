package benstadlbauer.expring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	@Size(min = 3, max = 255)
	private String description;

	@NotNull
	@Positive
	private BigDecimal amount;

	@NotNull
	@Size(min=8, max=8)
	private String date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDate() {
		if (this.date != null) {
			return date;
		} else {
			return new SimpleDateFormat("yyyyMMdd").format(new Date());
		}
	}

	public void setDate(String date) {
		this.date = date;
	}
}

