package com.example.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_lasttables")
public class Emp_details {

   @Id     
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "e_id", updatable = false, nullable = false)
  private int e_id;
  @Column(name="e_name")
   private String e_name;
  @Column(name="e_sal")
  private String e_sal;
  @ Column(name="e_designation")
  private String e_designation;
			
  
  public int getE_id() {
				return e_id;
			} 
  
  
		public void setE_id(int e_id) {
				this.e_id = e_id;
		}
			 
			public String getE_name() {
				return e_name;
		    }
			
				public Emp_details() {
				super();
				// TODO Auto-generated constructor stub
			}


				public void setE_name(String e_name) {
						this.e_name = e_name;
				}
					public String getE_sal() {
							return e_sal;
					}
					
						public void setE_sal(String e_sal) {
								this.e_sal = e_sal;
						}
						
							public String getE_designation() {
										return e_designation;
							}
											

								public void setE_designation(String e_designation) {
												this.e_designation = e_designation;
									}
                                               
											
									public Emp_details(int e_id, String e_name, String e_sal, String e_designation) {
												super();
												this.e_id = e_id;
												this.e_name = e_name;
												this.e_sal = e_sal;
												this.e_designation = e_designation;
                            				}

}
