package entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Builder
@ToString

@Entity
@Table(name = "library")
public class LibraryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lName", length = 20)
    private String libraryName;

    public LibraryEntity() {
    }

    public LibraryEntity(Long id, String libraryName) {
        this.id = id;
        this.libraryName = libraryName;
    }
}
