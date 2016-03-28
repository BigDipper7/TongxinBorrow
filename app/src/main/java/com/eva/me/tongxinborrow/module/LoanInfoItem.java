package com.eva.me.tongxinborrow.module;

/**
 * Created by eva on 16-3-29.
 */
public class LoanInfoItem {
    public String loanType="";
    public String loanAccount="";
    public String loanDeadline="";

    public LoanInfoItem(String loanType, String loanAccount, String loanDeadline) {
        this.loanType=loanType;
        this.loanAccount = loanAccount;
        this.loanDeadline = loanDeadline;
    }
}
