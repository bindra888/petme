package com.petme.dao.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_pm_pet_accessory_ad_info")
public class TPmPetAccessoryAdInfo implements java.io.Serializable {

	private static final long serialVersionUID = 5453975028895021286L;
	private Integer petAccessoryAdId;
	private TPmAllUsers TPmAllUsers;
	private TPmAdDetails TPmAdDetails;
	private int petAccessoryAdAccessoryId;
	private char petAccessoryAdActive;
	private Date petAccessoryAdCreateDate;
	private Date petAccessoryAdModiDate;

	public TPmPetAccessoryAdInfo() {
	}

	public TPmPetAccessoryAdInfo(TPmAllUsers TPmAllUsers,
			TPmAdDetails TPmAdDetails, int petAccessoryAdAccessoryId,
			char petAccessoryAdActive, Date petAccessoryAdCreateDate,
			Date petAccessoryAdModiDate) {
		this.TPmAllUsers = TPmAllUsers;
		this.TPmAdDetails = TPmAdDetails;
		this.petAccessoryAdAccessoryId = petAccessoryAdAccessoryId;
		this.petAccessoryAdActive = petAccessoryAdActive;
		this.petAccessoryAdCreateDate = petAccessoryAdCreateDate;
		this.petAccessoryAdModiDate = petAccessoryAdModiDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PetAccessoryAdId", unique = true, nullable = false)
	public Integer getPetAccessoryAdId() {
		return this.petAccessoryAdId;
	}

	public void setPetAccessoryAdId(Integer petAccessoryAdId) {
		this.petAccessoryAdId = petAccessoryAdId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PetAccessoryAdUserId", nullable = false)
	public TPmAllUsers getTPmAllUsers() {
		return this.TPmAllUsers;
	}

	public void setTPmAllUsers(TPmAllUsers TPmAllUsers) {
		this.TPmAllUsers = TPmAllUsers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PetAccessoryAdAdRefId", nullable = false)
	public TPmAdDetails getTPmAdDetails() {
		return this.TPmAdDetails;
	}

	public void setTPmAdDetails(TPmAdDetails TPmAdDetails) {
		this.TPmAdDetails = TPmAdDetails;
	}

	@Column(name = "PetAccessoryAdAccessoryId", nullable = false)
	public int getPetAccessoryAdAccessoryId() {
		return this.petAccessoryAdAccessoryId;
	}

	public void setPetAccessoryAdAccessoryId(int petAccessoryAdAccessoryId) {
		this.petAccessoryAdAccessoryId = petAccessoryAdAccessoryId;
	}

	@Column(name = "PetAccessoryAdActive", nullable = false, length = 1)
	public char getPetAccessoryAdActive() {
		return this.petAccessoryAdActive;
	}

	public void setPetAccessoryAdActive(char petAccessoryAdActive) {
		this.petAccessoryAdActive = petAccessoryAdActive;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PetAccessoryAdCreateDate", nullable = false, length = 19)
	public Date getPetAccessoryAdCreateDate() {
		return this.petAccessoryAdCreateDate;
	}

	public void setPetAccessoryAdCreateDate(Date petAccessoryAdCreateDate) {
		this.petAccessoryAdCreateDate = petAccessoryAdCreateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PetAccessoryAdModiDate", nullable = false, length = 19)
	public Date getPetAccessoryAdModiDate() {
		return this.petAccessoryAdModiDate;
	}

	public void setPetAccessoryAdModiDate(Date petAccessoryAdModiDate) {
		this.petAccessoryAdModiDate = petAccessoryAdModiDate;
	}

}
