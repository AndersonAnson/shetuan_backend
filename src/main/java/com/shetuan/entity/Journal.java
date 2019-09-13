package com.shetuan.entity;

import java.util.Date;

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
@Table(name = "sk_journal")
public class Journal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@ManyToOne(cascade = { CascadeType.ALL},fetch=FetchType.LAZY,optional=true )
	@JoinColumn(name="organizationID")
	@JsonIgnore
	private Organization organization;
	
	@Column(name = "jname")
	private String jname;
	
	@Column(name = "namehistory")
	private String namehistory;
	
	private Date stime;
	
	private Integer sttype;
	
	private Date etime;
	
	private Integer ettype;
	
	private Date ctime;
	
	private String cname;
	
	private Date mtime;
	
	private String mname;
	
	@Column(nullable = false)
	private Boolean state;
	
	private String remark;
	
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public String getnamehistory() {
		return namehistory;
	}

	public void setnameHistory(String namehistory) {
		this.namehistory = namehistory;
	}

	public Date getStime() {
		return stime;
	}

	public void setStime(Date stime) {
		this.stime = stime;
	}

	public Integer getSttype() {
		return sttype;
	}

	public void setSttype(Integer sttype) {
		this.sttype = sttype;
	}

	public Date getEtime() {
		return etime;
	}

	public void setEtime(Date etime) {
		this.etime = etime;
	}

	public Integer getEttype() {
		return ettype;
	}

	public void setEttype(Integer ettype) {
		this.ettype = ettype;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Date getMtime() {
		return mtime;
	}

	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
