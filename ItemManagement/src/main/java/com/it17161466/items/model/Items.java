package com.it17161466.items.model;

import lombok.Data;
//import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "item")
public class Items {

	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "item_id")
	    private int id;
	    
	    @Column(name = "item_name")
	    //@Email(message = "*Please provide an item name")
	   // @NotEmpty(message = "*Please provide an item name")
	    private String item_name;
	    
	    @Column(name = "item_price")
	   // @Email(message = "*Please provide an item price")
	   // @NotEmpty(message = "*Please provide an item price")
	    private Double item_price;
	    
	    @Column(name = "item_weight")
	   // @Email(message = "*Please provide an item weight")
	   // @NotEmpty(message = "*Please provide an item weight")
	    private Double item_weight;
	    
	 /*   @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(name = "item_supply", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
	    private Set<User> item_supplier;*/

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getItem_name() {
			return item_name;
		}

		public void setItem_name(String item_name) {
			this.item_name = item_name;
		}

		public Double getItem_price() {
			return item_price;
		}

		public void setItem_price(Double item_price) {
			this.item_price = item_price;
		}

		public Double getItem_weight() {
			return item_weight;
		}

		public void setItem_weight(Double item_weight) {
			this.item_weight = item_weight;
		}

		/*public Set<User> getItem_supplier() {
			return item_supplier;
		}

		public void setItem_supplier(Set<User> item_supplier) {
			this.item_supplier = item_supplier;
		}*/

		/*@Override
		public String toString() {
			return "Items [id=" + id + ", item_name=" + item_name + ", item_price=" + item_price + ", item_weight="
					+ item_weight + ", item_supplier=" + item_supplier + "]";
		}*/
	    
	    
	    
	    
}
