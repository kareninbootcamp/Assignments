package org.ssa.tiy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="major")

public class Major {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//declares ID as autoincrement
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="score")
	private int score;
	
	
	
	
	
	
		public Major(){}
		public Major(String description, int score) {
			this.description = description;
			this.score = score;
			
		}
		public int getId(){
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setdescription(String description) {
			this.description = description;
			
			
		}
		public String getdescription() {
			return description;
		}
		public void setscore(int score) {
			this.score = score;
		}
		@Override
		public String toString() {
			return "Major [id=" + id + ", description=" + description + ", score=" + score + "]";
		}
		
		
		
		
		
		
}
