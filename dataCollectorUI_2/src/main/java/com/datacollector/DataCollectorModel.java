package com.datacollector;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//
@Entity
@Table(name="data_collector")
public class DataCollectorModel {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  
	  @Column(name = "value", nullable = false, length = 200)
	  private String value;

	  // constructors
	  public DataCollectorModel() {}
	  public DataCollectorModel(String val) {
	    this.value = val;
	    System.out.println("val= "+val);
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%d, fvalue='%s']", id, value);
	  }

	  public Long getId() {
	    return id;
	  }

	  public String getValue() {
	    return value;
	  }
}
