package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ESTUDIANTE
 */
@Setter
@Getter
@NoArgsConstructor
public class Partner extends User{
    private long PartnerId;
    private double founds;
    private String type;
    private Date dateCreated;
}
