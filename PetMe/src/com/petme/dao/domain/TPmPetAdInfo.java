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
@Table(name = "t_pm_pet_ad_info")
public class TPmPetAdInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5075421499060956997L;
	private Integer petAdInfoId;
	private TPmAdDetails TPmAdDetails;
	private TPmAllUsers TPmAllUsers;
	private int petAdInfoPetId;
	private int petAdInfoBreedId;
	private String petAdInfoGender;
	private Date petAdInfoDob;
	private String petAdInfoMstrAdType;
	private int petAdInfoMasterColourId;
	private char petAdInfoIsPedigree;
	private Long petAdInfoRegistrationNo;
	private String petAdInfoAncestor;
	private char petAdInfoIsActive;
	private Date petAdInfoCreateDate;
	private Date petAdInfoModiDate;

	public TPmPetAdInfo() {
	}

	public TPmPetAdInfo(TPmAdDetails TPmAdDetails, TPmAllUsers TPmAllUsers,
			int petAdInfoPetId, int petAdInfoBreedId, String petAdInfoGender,
			Date petAdInfoDob, String petAdInfoMstrAdType,
			int petAdInfoMasterColourId, char petAdInfoIsPedigree,
			char petAdInfoIsActive, Date petAdInfoCreateDate,
			Date petAdInfoModiDate) {
		this.TPmAdDetails = TPmAdDetails;
		this.TPmAllUsers = TPmAllUsers;
		this.petAdInfoPetId = petAdInfoPetId;
		this.petAdInfoBreedId = petAdInfoBreedId;
		this.petAdInfoGender = petAdInfoGender;
		this.petAdInfoDob = petAdInfoDob;
		this.petAdInfoMstrAdType = petAdInfoMstrAdType;
		this.petAdInfoMasterColourId = petAdInfoMasterColourId;
		this.petAdInfoIsPedigree = petAdInfoIsPedigree;
		this.petAdInfoIsActive = petAdInfoIsActive;
		this.petAdInfoCreateDate = petAdInfoCreateDate;
		this.petAdInfoModiDate = petAdInfoModiDate;
	}

	public TPmPetAdInfo(TPmAdDetails TPmAdDetails, TPmAllUsers TPmAllUsers,
			int petAdInfoPetId, int petAdInfoBreedId, String petAdInfoGender,
			Date petAdInfoDob, String petAdInfoMstrAdType,
			int petAdInfoMasterColourId, char petAdInfoIsPedigree,
			Long petAdInfoRegistrationNo, String petAdInfoAncestor,
			char petAdInfoIsActive, Date petAdInfoCreateDate,
			Date petAdInfoModiDate) {
		this.TPmAdDetails = TPmAdDetails;
		this.TPmAllUsers = TPmAllUsers;
		this.petAdInfoPetId = petAdInfoPetId;
		this.petAdInfoBreedId = petAdInfoBreedId;
		this.petAdInfoGender = petAdInfoGender;
		this.petAdInfoDob = petAdInfoDob;
		this.petAdInfoMstrAdType = petAdInfoMstrAdType;
		this.petAdInfoMasterColourId = petAdInfoMasterColourId;
		this.petAdInfoIsPedigree = petAdInfoIsPedigree;
		this.petAdInfoRegistrationNo = petAdInfoRegistrationNo;
		this.petAdInfoAncestor = petAdInfoAncestor;
		this.petAdInfoIsActive = petAdInfoIsActive;
		this.petAdInfoCreateDate = petAdInfoCreateDate;
		this.petAdInfoModiDate = petAdInfoModiDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PetAdInfoId", unique = true, nullable = false)
	public Integer getPetAdInfoId() {
		return this.petAdInfoId;
	}

	public void setPetAdInfoId(Integer petAdInfoId) {
		this.petAdInfoId = petAdInfoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PetAdInfoAdDetailId", nullable = false)
	public TPmAdDetails getTPmAdDetails() {
		return this.TPmAdDetails;
	}

	public void setTPmAdDetails(TPmAdDetails TPmAdDetails) {
		this.TPmAdDetails = TPmAdDetails;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PetAdInfoUserId", nullable = false)
	public TPmAllUsers getTPmAllUsers() {
		return this.TPmAllUsers;
	}

	public void setTPmAllUsers(TPmAllUsers TPmAllUsers) {
		this.TPmAllUsers = TPmAllUsers;
	}

	@Column(name = "PetAdInfoPetId", nullable = false)
	public int getPetAdInfoPetId() {
		return this.petAdInfoPetId;
	}

	public void setPetAdInfoPetId(int petAdInfoPetId) {
		this.petAdInfoPetId = petAdInfoPetId;
	}

	@Column(name = "PetAdInfoBreedId", nullable = false)
	public int getPetAdInfoBreedId() {
		return this.petAdInfoBreedId;
	}

	public void setPetAdInfoBreedId(int petAdInfoBreedId) {
		this.petAdInfoBreedId = petAdInfoBreedId;
	}

	@Column(name = "PetAdInfoGender", nullable = false, length = 10)
	public String getPetAdInfoGender() {
		return this.petAdInfoGender;
	}

	public void setPetAdInfoGender(String petAdInfoGender) {
		this.petAdInfoGender = petAdInfoGender;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PetAdInfoDOB", nullable = false, length = 19)
	public Date getPetAdInfoDob() {
		return this.petAdInfoDob;
	}

	public void setPetAdInfoDob(Date petAdInfoDob) {
		this.petAdInfoDob = petAdInfoDob;
	}

	@Column(name = "PetAdInfoMstrAdType", nullable = false, length = 50)
	public String getPetAdInfoMstrAdType() {
		return this.petAdInfoMstrAdType;
	}

	public void setPetAdInfoMstrAdType(String petAdInfoMstrAdType) {
		this.petAdInfoMstrAdType = petAdInfoMstrAdType;
	}

	@Column(name = "PetAdInfoMasterColourId", nullable = false)
	public int getPetAdInfoMasterColourId() {
		return this.petAdInfoMasterColourId;
	}

	public void setPetAdInfoMasterColourId(int petAdInfoMasterColourId) {
		this.petAdInfoMasterColourId = petAdInfoMasterColourId;
	}

	@Column(name = "PetAdInfoIsPedigree", nullable = false, length = 1)
	public char getPetAdInfoIsPedigree() {
		return this.petAdInfoIsPedigree;
	}

	public void setPetAdInfoIsPedigree(char petAdInfoIsPedigree) {
		this.petAdInfoIsPedigree = petAdInfoIsPedigree;
	}

	@Column(name = "PetAdInfoRegistrationNo")
	public Long getPetAdInfoRegistrationNo() {
		return this.petAdInfoRegistrationNo;
	}

	public void setPetAdInfoRegistrationNo(Long petAdInfoRegistrationNo) {
		this.petAdInfoRegistrationNo = petAdInfoRegistrationNo;
	}

	@Column(name = "PetAdInfoAncestor", length = 50)
	public String getPetAdInfoAncestor() {
		return this.petAdInfoAncestor;
	}

	public void setPetAdInfoAncestor(String petAdInfoAncestor) {
		this.petAdInfoAncestor = petAdInfoAncestor;
	}

	@Column(name = "PetAdInfoIsActive", nullable = false, length = 1)
	public char getPetAdInfoIsActive() {
		return this.petAdInfoIsActive;
	}

	public void setPetAdInfoIsActive(char petAdInfoIsActive) {
		this.petAdInfoIsActive = petAdInfoIsActive;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PetAdInfoCreateDate", nullable = false, length = 19)
	public Date getPetAdInfoCreateDate() {
		return this.petAdInfoCreateDate;
	}

	public void setPetAdInfoCreateDate(Date petAdInfoCreateDate) {
		this.petAdInfoCreateDate = petAdInfoCreateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PetAdInfoModiDate", nullable = false, length = 19)
	public Date getPetAdInfoModiDate() {
		return this.petAdInfoModiDate;
	}

	public void setPetAdInfoModiDate(Date petAdInfoModiDate) {
		this.petAdInfoModiDate = petAdInfoModiDate;
	}

}
