package app.fpp.bean.confirmation;

import java.io.Serializable;

import java.math.BigDecimal;

public class ListAddendumBudget implements Serializable{
    private static final long serialVersionUID= 1L;
    private String BudgetCustId;
    private String promoProdukId;
    private String budgetById;
    private BigDecimal Amount;
    public void setBudgetCustId(String BudgetCustId) {
        this.BudgetCustId = BudgetCustId;
    }

    public String getBudgetCustId() {
        return BudgetCustId;
    }

    public void setPromoProdukId(String promoProdukId) {
        this.promoProdukId = promoProdukId;
    }

    public String getPromoProdukId() {
        return promoProdukId;
    }

    public void setBudgetById(String budgetById) {
        this.budgetById = budgetById;
    }

    public String getBudgetById() {
        return budgetById;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

    public BigDecimal getAmount() {
        return Amount;
    }
}
