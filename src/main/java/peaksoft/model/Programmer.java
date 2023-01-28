package peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import peaksoft.enums.Country;
import peaksoft.enums.Language;

import javax.persistence.*;

@Entity
@Table(name = "programmers")
@Getter
@Setter
@NoArgsConstructor
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "programmer_id_generator")
    @SequenceGenerator( name = "programmer_id_generator",
                        sequenceName = "programmer_seq",
                        allocationSize = 1)
    private Long id;
    @Column ( name =  "full_name")
    private String fullName;
    @Column( name = "phone_number")
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Language language;
    private Byte age;

    @Enumerated(EnumType.STRING)
    private Country country;

    public Programmer(String fullName, String phoneNumber, Language language, Byte age, Country country) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.language = language;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", language=" + language +
                ", age=" + age +
                ", country=" + country +
                '}';
    }
}
