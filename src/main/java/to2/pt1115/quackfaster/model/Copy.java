package to2.pt1115.quackfaster.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "Copies")
public class Copy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int copyId;

    @Column(precision=6, scale=2)
    private BigDecimal cost;

    private Date acquiredOn;

    @OneToMany(mappedBy="copy")
    private Set<Loan> loan;


    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book book;

    public Copy() {
    }

    public Copy(BigDecimal cost, Date acquiredOn, Book book)
    {
        this.cost = cost;
        this.acquiredOn = acquiredOn;
        this.book = book;
    }

    public int getCopyId() {
        return copyId;
    }

    public BigDecimal getCost(){
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getAcquiredOn() {
        return acquiredOn;
    }

    public void setAcquiredOn(Date acquiredOn) {
        this.acquiredOn = acquiredOn;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


}
