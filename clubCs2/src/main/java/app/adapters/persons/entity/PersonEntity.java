package app.adapters.persons.entity;

import app.domain.models.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@Setter
@Getter
@NoArgsConstructor
public class PersonEntity {
	public PersonEntity(Person person) {
		this.personId=person.getPersonId();
		this.document=person.getDocument();
		this.name=person.getName();
		this.cellPhone=person.getCellPhone();
	}
	@Id
	@Column(name = "id")
	private long personId;
	@Column(name = "document")
	private long document;
	@Column(name = "name")
	private String name;
	@Column(name = "cell_phone")
	private long cellPhone;
}
