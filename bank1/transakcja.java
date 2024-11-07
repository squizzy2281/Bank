package bank1;
import javax.persistence.*;

@Entity
@Table(name = "transakcja")
public class transakcja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "konto_id")
    private konto konto;

    @Column(name = "kwota")
    private Double kwota;

    @Column(name = "data_transakcji")
    private String dataTransakcji;


}
