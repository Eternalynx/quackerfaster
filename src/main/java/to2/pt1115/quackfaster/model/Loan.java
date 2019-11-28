package to2.pt1115.quackfaster.model;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;

    private Date loanedOn;

    private Date returnedOn;

    @ManyToOne
    @JoinColumn(name = "borrowerId")
    private Borrower borrower;



    @ManyToOne
    @JoinColumn(name = "copyId")
    private Copy copy;


    public Loan() {
    }

    public Loan(Date loanedOn, Date returnedOn, Borrower borrower, Copy copy) {
        this(loanedOn,returnedOn,borrower,copy);
    }


    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public int getLoanId() {
        return loanId;
    }

    public Date getLoanedOn() {
        return loanedOn;
    }

    public void setLoanedOn(Date loanedOn) {
        this.loanedOn = loanedOn;
    }

    public Date getReturnedOn() {
        return returnedOn;
    }

    public void setReturnedOn(Date returnedOn) {
        this.returnedOn = returnedOn;
    }


}
