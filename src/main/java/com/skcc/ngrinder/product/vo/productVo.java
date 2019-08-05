package com.skcc.ngrinder.product.vo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id; 

@Entity
public class productVo {
	@Id
	@GeneratedValue
	private String id; 
	private String name; 
	@Column(length = 10000000)
	private String content;
	private String created; 
	private String reg_id;
}
