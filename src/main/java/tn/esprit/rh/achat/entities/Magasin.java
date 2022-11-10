package tn.esprit.rh.achat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Magasin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String nom;
	String adresse;
	long telephone;
	String email;

}
