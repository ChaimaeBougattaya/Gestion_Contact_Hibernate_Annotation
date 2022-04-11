package ma.fstm.ilisi.gestion_contact.model.bo;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="type")
public class Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titre;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="type")
	Set<Contact> contacts;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Set<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	public Type(int id, String titre, Set<Contact> contacts) {
		super();
		this.id = id;
		this.titre = titre;
		this.contacts = contacts;
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Type [id=" + id + ", titre=" + titre + ", contacts=" + contacts + "]";
	}
	
	
}
