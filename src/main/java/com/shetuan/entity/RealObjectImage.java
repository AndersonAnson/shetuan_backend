package com.shetuan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "sk_real_object_image")
public class RealObjectImage implements RealObjectSource{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@ManyToOne(cascade = { CascadeType.ALL},fetch=FetchType.LAZY,optional=true )
	@JoinColumn(name="realobjectID")
	@JsonIgnore
	private RealObject realObject;
	
	private String name;
	
	private String url;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public RealObject getRealObject() {
		return realObject;
	}

	public void setRealObject(RealObject realObject) {
		this.realObject = realObject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
