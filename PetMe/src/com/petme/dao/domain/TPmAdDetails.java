package com.petme.dao.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_pm_ad_details")
public class TPmAdDetails implements java.io.Serializable {

	private static final long serialVersionUID = -5802159166977546480L;
	private Integer petAdId;
	private String petAdDesc;
	private long petAdPrice;
	private String petAdImageName;
	private String petAdVideoName;
	private Date petAdCreateDate;
	private Date petAdModiDate;
	private Set TPmPetAccessoryAdInfos = new HashSet(0);
	private Set TPmPetAdInfos = new HashSet(0);

	public TPmAdDetails() {
	}

	public TPmAdDetails(String petAdDesc, long petAdPrice,
			String petAdImageName, String petAdVideoName, Date petAdCreateDate,
			Date petAdModiDate) {
		this.petAdDesc = petAdDesc;
		this.petAdPrice = petAdPrice;
		this.petAdImageName = petAdImageName;
		this.petAdVideoName = petAdVideoName;
		this.petAdCreateDate = petAdCreateDate;
		this.petAdModiDate = petAdModiDate;
	}

	public TPmAdDetails(String petAdDesc, long petAdPrice,
			String petAdImageName, String petAdVideoName, Date petAdCreateDate,
			Date petAdModiDate, Set TPmPetAccessoryAdInfos, Set TPmPetAdInfos) {
		this.petAdDesc = petAdDesc;
		this.petAdPrice = petAdPrice;
		this.petAdImageName = petAdImageName;
		this.petAdVideoName = petAdVideoName;
		this.petAdCreateDate = petAdCreateDate;
		this.petAdModiDate = petAdModiDate;
		this.TPmPetAccessoryAdInfos = TPmPetAccessoryAdInfos;
		this.TPmPetAdInfos = TPmPetAdInfos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PetAdId", unique = true, nullable = false)
	public Integer getPetAdId() {
		return this.petAdId;
	}

	public void setPetAdId(Integer petAdId) {
		this.petAdId = petAdId;
	}

	@Column(name = "PetAdDesc", nullable = false, length = 65535)
	public String getPetAdDesc() {
		return this.petAdDesc;
	}

	public void setPetAdDesc(String petAdDesc) {
		this.petAdDesc = petAdDesc;
	}

	@Column(name = "PetAdPrice", nullable = false)
	public long getPetAdPrice() {
		return this.petAdPrice;
	}

	public void setPetAdPrice(long petAdPrice) {
		this.petAdPrice = petAdPrice;
	}

	@Column(name = "PetAdImageName", nullable = false)
	public String getPetAdImageName() {
		return this.petAdImageName;
	}

	public void setPetAdImageName(String petAdImageName) {
		this.petAdImageName = petAdImageName;
	}

	@Column(name = "PetAdVideoName", nullable = false)
	public String getPetAdVideoName() {
		return this.petAdVideoName;
	}

	public void setPetAdVideoName(String petAdVideoName) {
		this.petAdVideoName = petAdVideoName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PetAdCreateDate", nullable = false, length = 19)
	public Date getPetAdCreateDate() {
		return this.petAdCreateDate;
	}

	public void setPetAdCreateDate(Date petAdCreateDate) {
		this.petAdCreateDate = petAdCreateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PetAdModiDate", nullable = false, length = 19)
	public Date getPetAdModiDate() {
		return this.petAdModiDate;
	}

	public void setPetAdModiDate(Date petAdModiDate) {
		this.petAdModiDate = petAdModiDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TPmAdDetails")
	public Set getTPmPetAccessoryAdInfos() {
		return this.TPmPetAccessoryAdInfos;
	}

	public void setTPmPetAccessoryAdInfos(Set TPmPetAccessoryAdInfos) {
		this.TPmPetAccessoryAdInfos = TPmPetAccessoryAdInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TPmAdDetails")
	public Set getTPmPetAdInfos() {
		return this.TPmPetAdInfos;
	}

	public void setTPmPetAdInfos(Set TPmPetAdInfos) {
		this.TPmPetAdInfos = TPmPetAdInfos;
	}

}
