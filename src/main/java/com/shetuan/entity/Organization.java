package com.shetuan.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="sk_organization")
public class Organization {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "namehistory")
	private String nameHistory;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "createtime")
	private Date createTime;
	
	@Column(name = "cttype")
	private Integer ctType;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "deletetime")
	private Date deleteTime;
	
	@Column(name = "dttype")
	private Integer dtType;
	
	@Column(name = "place")
	private String place;
	
	@Column(name = "creator")
	private String creator;
	
	@Column(name = "leader")
	private String leader;
	
	@Column(name = "secretariat")
	private String secretariat;
	
	@Column(name = "member")
	private String member;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime", length = 19)
	private Date ctime;
	
	@Column(name = "cname")
	private String cname;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "mtime", length = 19)
	private Date mtime;
	
	@Column(name = "mname")
	private String mname;
	
	@Column(name = "state")
	private Boolean state;
	
	@Column(name = "remark")
	private String remark;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<OfficePlace> officePlaces;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<AcademicActivity> academicActivity;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<ScienceActivity> scienceActivity;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<IndustrialActivity> industrialActivity;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<OtherActivity> otherActivity;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<Journal> journal;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<PrimitiveLiterature> primitiveLiterature;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<ResearchLiterature> researchLiterature;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<RealObject> realObject;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<Letter> letter;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<Constitution> constitution;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<HistoricalDataIndex> historicalDataIndex;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organization",cascade=CascadeType.ALL,orphanRemoval = true)
	private List<OtherHistoricalDataIndex> otherHistoricalDataIndex;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNameHistory() {
		return nameHistory;
	}
	public void setNameHistory(String nameHistory) {
		this.nameHistory = nameHistory;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Integer getCtType() {
		return ctType;
	}
	public void setCtType(Integer ctType) {
		this.ctType = ctType;
	}
	
	public Date getDeleteTime() {
		return deleteTime;
	}
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}
	
	public Integer getDtType() {
		return dtType;
	}
	public void setDtType(Integer dtType) {
		this.dtType = dtType;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	
	public String getSecretariat() {
		return secretariat;
	}
	public void setSecretariat(String secretariat) {
		this.secretariat = secretariat;
	}
	
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
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
	
	public boolean getState() {
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
	
	public List<OfficePlace> getOfficePlaces() {
		return officePlaces;
	}
	public void setOfficePlaces(List<OfficePlace> officePlaces) {
		this.officePlaces = officePlaces;
	}
	public List<AcademicActivity> getAcademicActivity() {
		return academicActivity;
	}
	public void setAcademicActivity(List<AcademicActivity> academicActivity) {
		this.academicActivity = academicActivity;
	}
	public List<ScienceActivity> getScienceActivity() {
		return scienceActivity;
	}
	public void setScienceActivity(List<ScienceActivity> scienceActivity) {
		this.scienceActivity = scienceActivity;
	}
	public List<IndustrialActivity> getIndustrialActivity() {
		return industrialActivity;
	}
	public void setIndustrialActivity(List<IndustrialActivity> industrialActivity) {
		this.industrialActivity = industrialActivity;
	}
	public List<OtherActivity> getOtherActivity() {
		return otherActivity;
	}
	public void setOtherActivity(List<OtherActivity> otherActivity) {
		this.otherActivity = otherActivity;
	}
	public List<Journal> getJournal() {
		return journal;
	}
	public void setJournal(List<Journal> journal) {
		this.journal = journal;
	}
	public List<PrimitiveLiterature> getPrimitiveLiterature() {
		return primitiveLiterature;
	}
	public void setPrimitiveLiterature(List<PrimitiveLiterature> primitiveLiterature) {
		this.primitiveLiterature = primitiveLiterature;
	}
	public List<ResearchLiterature> getResearchLiterature() {
		return researchLiterature;
	}
	public void setResearchLiterature(List<ResearchLiterature> researchLiterature) {
		this.researchLiterature = researchLiterature;
	}
	public List<RealObject> getRealObject() {
		return realObject;
	}
	public void setRealObject(List<RealObject> realObject) {
		this.realObject = realObject;
	}
	public List<Letter> getLetter() {
		return letter;
	}
	public void setLetter(List<Letter> letter) {
		this.letter = letter;
	}
	public List<Constitution> getConstitution() {
		return constitution;
	}
	public void setConstitution(List<Constitution> constitution) {
		this.constitution = constitution;
	}
	public List<HistoricalDataIndex> getHistoricalDataIndex() {
		return historicalDataIndex;
	}
	public void setHistoricalDataIndex(List<HistoricalDataIndex> historicalDataIndex) {
		this.historicalDataIndex = historicalDataIndex;
	}
	public List<OtherHistoricalDataIndex> getOtherHistoricalDataIndex() {
		return otherHistoricalDataIndex;
	}
	public void setOtherHistoricalDataIndex(List<OtherHistoricalDataIndex> otherHistoricalDataIndex) {
		this.otherHistoricalDataIndex = otherHistoricalDataIndex;
	}
	
	
}
