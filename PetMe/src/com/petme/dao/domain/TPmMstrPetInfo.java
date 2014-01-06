package com.petme.dao.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_pm_mstr_pet_info")
public class TPmMstrPetInfo implements java.io.Serializable {

	private static final long serialVersionUID = -7899075233566365184L;
	private Integer mstrpetId;
	private String mstrpetDesc;
	private Integer mstrpetParentId;
	private char mstrpetIsActive;
	private String mstrpetExtraInfo;
	private String mstrpetMstrCountryId;
	private Date mstrpetCreateDate;
	private Date mstrpetModiDate;

	public TPmMstrPetInfo() {
	}

	public TPmMstrPetInfo(String mstrpetDesc, char mstrpetIsActive,
			Date mstrpetCreateDate, Date mstrpetModiDate) {
		this.mstrpetDesc = mstrpetDesc;
		this.mstrpetIsActive = mstrpetIsActive;
		this.mstrpetCreateDate = mstrpetCreateDate;
		this.mstrpetModiDate = mstrpetModiDate;
	}

	public TPmMstrPetInfo(String mstrpetDesc, Integer mstrpetParentId,
			char mstrpetIsActive, String mstrpetExtraInfo,
			String mstrpetMstrCountryId, Date mstrpetCreateDate,
			Date mstrpetModiDate) {
		this.mstrpetDesc = mstrpetDesc;
		this.mstrpetParentId = mstrpetParentId;
		this.mstrpetIsActive = mstrpetIsActive;
		this.mstrpetExtraInfo = mstrpetExtraInfo;
		this.mstrpetMstrCountryId = mstrpetMstrCountryId;
		this.mstrpetCreateDate = mstrpetCreateDate;
		this.mstrpetModiDate = mstrpetModiDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MSTRPetID", unique = true, nullable = false)
	public Integer getMstrpetId() {
		return this.mstrpetId;
	}

	public void setMstrpetId(Integer mstrpetId) {
		this.mstrpetId = mstrpetId;
	}

	@Column(name = "MSTRPetDesc", nullable = false)
	public String getMstrpetDesc() {
		return this.mstrpetDesc;
	}

	public void setMstrpetDesc(String mstrpetDesc) {
		this.mstrpetDesc = mstrpetDesc;
	}

	@Column(name = "MSTRPetParentID")
	public Integer getMstrpetParentId() {
		return this.mstrpetParentId;
	}

	public void setMstrpetParentId(Integer mstrpetParentId) {
		this.mstrpetParentId = mstrpetParentId;
	}

	@Column(name = "MSTRPetIsActive", nullable = false, length = 1)
	public char getMstrpetIsActive() {
		return this.mstrpetIsActive;
	}

	public void setMstrpetIsActive(char mstrpetIsActive) {
		this.mstrpetIsActive = mstrpetIsActive;
	}

	@Column(name = "MSTRPetExtraInfo")
	public String getMstrpetExtraInfo() {
		return this.mstrpetExtraInfo;
	}

	public void setMstrpetExtraInfo(String mstrpetExtraInfo) {
		this.mstrpetExtraInfo = mstrpetExtraInfo;
	}

	@Column(name = "MSTRPetMstrCountryID")
	public String getMstrpetMstrCountryId() {
		return this.mstrpetMstrCountryId;
	}

	public void setMstrpetMstrCountryId(String mstrpetMstrCountryId) {
		this.mstrpetMstrCountryId = mstrpetMstrCountryId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MSTRPetCreateDate", nullable = false, length = 19)
	public Date getMstrpetCreateDate() {
		return this.mstrpetCreateDate;
	}

	public void setMstrpetCreateDate(Date mstrpetCreateDate) {
		this.mstrpetCreateDate = mstrpetCreateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MSTRPetModiDate", nullable = false, length = 19)
	public Date getMstrpetModiDate() {
		return this.mstrpetModiDate;
	}

	public void setMstrpetModiDate(Date mstrpetModiDate) {
		this.mstrpetModiDate = mstrpetModiDate;
	}

}
