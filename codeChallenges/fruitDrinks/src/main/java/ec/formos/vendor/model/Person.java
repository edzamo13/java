package ec.formos.vendor.model;

import lombok.Getter;
import lombok.Setter;

public class Person {
	
	@Getter
	@Setter
	private Integer id;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String typePerson;
	@Getter
	@Setter 
	private String address;
	@Getter
	@Setter
	private String email;

    public Person() {
    }
        
        
        

    public Person(Integer id, String name, String typePerson, String address, String email) {
        this.id = id;
        this.name = name;
        this.typePerson = typePerson;
        this.address = address;
        this.email = email;
    }




	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", typePerson=" + typePerson + ", address=" + address
				+ ", email=" + email + "]";
	}
	

}
