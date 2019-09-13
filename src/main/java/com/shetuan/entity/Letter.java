package com.shetuan.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "sk_letter")
public class Letter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@ManyToOne(cascade = { CascadeType.ALL},fetch=FetchType.LAZY,optional=true )
	@JoinColumn(name="organizationID")
	@JsonIgnore
	private Organization organization;
	
	@Column(nullable = false)
	private String name;
	
	private String describe;
	
	private String source;
	
	private Date stime;
	
	private Integer sttype;
	
	private Date ctime;
	
	private String cname;
	
	private Date mtime;
	
	private String mname;
	
	@Column(nullable = false)
	private Boolean state;
	
	private String remark;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="letter",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<LetterImage> letterImage;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="letter",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<LetterAudio> letterAudio;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="letter",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<LetterVideo> letterVideo;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
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

	public List<LetterImage> getLetterImage() {
		return letterImage;
	}

	public void setLetterImage(List<LetterImage> letterImage) {
		this.letterImage = letterImage;
	}

	public List<LetterAudio> getLetterAudio() {
		return letterAudio;
	}

	public void setLetterAudio(List<LetterAudio> letterAudio) {
		this.letterAudio = letterAudio;
	}

	public List<LetterVideo> getLetterVideo() {
		return letterVideo;
	}

	public void setLetterVideo(List<LetterVideo> letterVideo) {
		this.letterVideo = letterVideo;
	}
	
}
