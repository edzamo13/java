package ec.com.ezamora.hibernate.primerHibernate.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Client {

	@Id
	private Integer idclient;
	private String first_name;
	private String last_name;
	private String adress;
	private Date date_birth;
	private String telephone;
	private String email;
	private String documentdni;

}
