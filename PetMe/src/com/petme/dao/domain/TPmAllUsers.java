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
@Table(name = "t_pm_all_users")
public class TPmAllUsers implements java.io.Serializable {

	private static final long serialVersionUID = 5192110717679532454L;
	private Integer userId;
	private String userFname;
	private String userLname;
	private String userEmail;
	private long userMobile;
	private int userCountryId;
	private int userStateId;
	private int userCityId;
	private int userLocalityId;
	private String userPassword;
	private String userMstrUserRole;
	private String userUserName;
	private char userIsEmailVerified;
	private char userIsMobileVerified;
	private char userIsActive;
	private char userDeleted;
	private Date userCreateDate;
	private Date userModiDate;
	private Set TPmPetAccessoryAdInfos = new HashSet(0);
	private Set TPmPetAdInfos = new HashSet(0);

	public TPmAllUsers() {
	}

	public TPmAllUsers(String userFname, String userLname, String userEmail,
			long userMobile, int userCountryId, int userStateId,
			int userCityId, int userLocalityId, String userPassword,
			String userMstrUserRole, String userUserName,
			char userIsEmailVerified, char userIsMobileVerified,
			char userIsActive, char userDeleted, Date userCreateDate,
			Date userModiDate) {
		this.userFname = userFname;
		this.userLname = userLname;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.userCountryId = userCountryId;
		this.userStateId = userStateId;
		this.userCityId = userCityId;
		this.userLocalityId = userLocalityId;
		this.userPassword = userPassword;
		this.userMstrUserRole = userMstrUserRole;
		this.userUserName = userUserName;
		this.userIsEmailVerified = userIsEmailVerified;
		this.userIsMobileVerified = userIsMobileVerified;
		this.userIsActive = userIsActive;
		this.userDeleted = userDeleted;
		this.userCreateDate = userCreateDate;
		this.userModiDate = userModiDate;
	}

	public TPmAllUsers(String userFname, String userLname, String userEmail,
			long userMobile, int userCountryId, int userStateId,
			int userCityId, int userLocalityId, String userPassword,
			String userMstrUserRole, String userUserName,
			char userIsEmailVerified, char userIsMobileVerified,
			char userIsActive, char userDeleted, Date userCreateDate,
			Date userModiDate, Set TPmPetAccessoryAdInfos, Set TPmPetAdInfos) {
		this.userFname = userFname;
		this.userLname = userLname;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.userCountryId = userCountryId;
		this.userStateId = userStateId;
		this.userCityId = userCityId;
		this.userLocalityId = userLocalityId;
		this.userPassword = userPassword;
		this.userMstrUserRole = userMstrUserRole;
		this.userUserName = userUserName;
		this.userIsEmailVerified = userIsEmailVerified;
		this.userIsMobileVerified = userIsMobileVerified;
		this.userIsActive = userIsActive;
		this.userDeleted = userDeleted;
		this.userCreateDate = userCreateDate;
		this.userModiDate = userModiDate;
		this.TPmPetAccessoryAdInfos = TPmPetAccessoryAdInfos;
		this.TPmPetAdInfos = TPmPetAdInfos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "UserId", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "UserFName", nullable = false, length = 50)
	public String getUserFname() {
		return this.userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	@Column(name = "UserLName", nullable = false, length = 50)
	public String getUserLname() {
		return this.userLname;
	}

	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}

	@Column(name = "UserEmail", nullable = false)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "UserMobile", nullable = false)
	public long getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(long userMobile) {
		this.userMobile = userMobile;
	}

	@Column(name = "UserCountryId", nullable = false)
	public int getUserCountryId() {
		return this.userCountryId;
	}

	public void setUserCountryId(int userCountryId) {
		this.userCountryId = userCountryId;
	}

	@Column(name = "UserStateId", nullable = false)
	public int getUserStateId() {
		return this.userStateId;
	}

	public void setUserStateId(int userStateId) {
		this.userStateId = userStateId;
	}

	@Column(name = "UserCityId", nullable = false)
	public int getUserCityId() {
		return this.userCityId;
	}

	public void setUserCityId(int userCityId) {
		this.userCityId = userCityId;
	}

	@Column(name = "UserLocalityId", nullable = false)
	public int getUserLocalityId() {
		return this.userLocalityId;
	}

	public void setUserLocalityId(int userLocalityId) {
		this.userLocalityId = userLocalityId;
	}

	@Column(name = "UserPassword", nullable = false, length = 50)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "UserMstrUserRole", nullable = false, length = 20)
	public String getUserMstrUserRole() {
		return this.userMstrUserRole;
	}

	public void setUserMstrUserRole(String userMstrUserRole) {
		this.userMstrUserRole = userMstrUserRole;
	}

	@Column(name = "UserUserName", nullable = false, length = 50)
	public String getUserUserName() {
		return this.userUserName;
	}

	public void setUserUserName(String userUserName) {
		this.userUserName = userUserName;
	}

	@Column(name = "UserIsEmailVerified", nullable = false, length = 1)
	public char getUserIsEmailVerified() {
		return this.userIsEmailVerified;
	}

	public void setUserIsEmailVerified(char userIsEmailVerified) {
		this.userIsEmailVerified = userIsEmailVerified;
	}

	@Column(name = "UserIsMobileVerified", nullable = false, length = 1)
	public char getUserIsMobileVerified() {
		return this.userIsMobileVerified;
	}

	public void setUserIsMobileVerified(char userIsMobileVerified) {
		this.userIsMobileVerified = userIsMobileVerified;
	}

	@Column(name = "UserIsActive", nullable = false, length = 1)
	public char getUserIsActive() {
		return this.userIsActive;
	}

	public void setUserIsActive(char userIsActive) {
		this.userIsActive = userIsActive;
	}

	@Column(name = "UserDeleted", nullable = false, length = 1)
	public char getUserDeleted() {
		return this.userDeleted;
	}

	public void setUserDeleted(char userDeleted) {
		this.userDeleted = userDeleted;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UserCreateDate", nullable = false, length = 19)
	public Date getUserCreateDate() {
		return this.userCreateDate;
	}

	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UserModiDate", nullable = false, length = 19)
	public Date getUserModiDate() {
		return this.userModiDate;
	}

	public void setUserModiDate(Date userModiDate) {
		this.userModiDate = userModiDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TPmAllUsers")
	public Set getTPmPetAccessoryAdInfos() {
		return this.TPmPetAccessoryAdInfos;
	}

	public void setTPmPetAccessoryAdInfos(Set TPmPetAccessoryAdInfos) {
		this.TPmPetAccessoryAdInfos = TPmPetAccessoryAdInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TPmAllUsers")
	public Set getTPmPetAdInfos() {
		return this.TPmPetAdInfos;
	}

	public void setTPmPetAdInfos(Set TPmPetAdInfos) {
		this.TPmPetAdInfos = TPmPetAdInfos;
	}

}
