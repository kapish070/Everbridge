package com.example.modal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity annotation specifies that the corresponding class is a JPA entity
@Entity
//@Table annotation provides more options to customize the mapping.
//Here the name of the table to be created in the database is explicitly mentioned as 'users'. Hence the table named 'users' will be created in the database with all the columns mapped to all the attributes in 'User' class
@Table(name = "WORKDAY.WORKER_DETAILS_COMM")

public class User {

	// @Id annotation specifies that the corresponding attribute is a primary key

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO) // @Column annotation
	// specifies that the attribute will be mapped to the column in the database.
	// Here the column name is explicitly mentioned as 'id'

	@Column(name = "EMPLOYEE_ID")
	private Integer employee_id;

	@Transient
	@Column(name = "WORK_EMAIL")
	private String work_email;

	@Transient
	@Column(name = "WE_KRONOS")
	private String we_kronos;

	@Transient
	@Column(name = "HOME_PHONE")
	private String home_phone;

	@Transient
	@Column(name = "HP_ALERT")
	private String hp_alert;

	@Transient
	@Column(name = "WORK_PHONE")
	private String work_phone;

	@Transient
	@Column(name = "WP_ALERT")
	private String wp_alert;

	@Transient
	@Column(name = "PERSONAL_EMAIL")
	private String personal_email;

	@Transient
	@Column(name = "PE_ALERT")
	private String pe_alert;

	@Transient
	@Column(name = "PE_KRONOS")
	private String pe_kronos;

	@Transient
	@Column(name = "CELL_PHONE")
	private String cell_phone;

	@Transient
	@Column(name = "CP_ALERT")
	private String cp_alert;

	@Transient
	@Column(name = "TEXT_PHONE")
	private String text_phone;

	@Transient
	@Column(name = "TXT_ALERT")
	private String text_alert;

	@Transient
	@Column(name = "TXT_KRONOS")
	private String txt_kronos;

	@Transient
	@Column(name = "INT_PAGER")
	private String int_pager;

	@Transient
	@Column(name = "IP_ALERT")
	private String ip_alert;

	@Transient
	@Column(name = "EXT_PAGER")
	private String ext_pager;

	@Transient
	@Column(name = "EP_ALERT")
	private String ep_alert;

	@Transient
	@Column(name = "COMM_PREF")
	private String comm_pref;

	@Transient
	@Column(name = "RHS_TEXTS")
	private String rhs_texts;

	/*
	 * public User() {
	 * 
	 * }
	 * 
	 * public User(int employee_id, String work_email, String we_kronos, String
	 * home_phone, String hp_alert, String work_phone, String wp_alert, String
	 * personal_email, String pe_alert, String pe_kronos, String cell_phone, String
	 * cp_alert, String text_phone, String text_alert, String txt_kronos, String
	 * int_pager, String ip_alert, String ext_pager, String ep_alert, String
	 * comm_pref, String rhs_texts) { super(); this.employee_id = employee_id;
	 * this.work_email = work_email; this.we_kronos = we_kronos; this.home_phone =
	 * home_phone; this.hp_alert = hp_alert; this.work_phone = work_phone;
	 * this.wp_alert = wp_alert; this.personal_email = personal_email; this.pe_alert
	 * = pe_alert; this.pe_kronos = pe_kronos; this.cell_phone = cell_phone;
	 * this.cp_alert = cp_alert; this.text_phone = text_phone; this.text_alert =
	 * text_alert; this.txt_kronos = txt_kronos; this.int_pager = int_pager;
	 * this.ip_alert = ip_alert; this.ext_pager = ext_pager; this.ep_alert =
	 * ep_alert; this.comm_pref = comm_pref; this.rhs_texts = rhs_texts; }
	 * 
	 */	
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getWork_email() {
		return work_email;
	}

	public void setWork_email(String work_email) {
		this.work_email = work_email;
	}

	public String getWe_kronos() {
		return we_kronos;
	}

	public void setWe_kronos(String we_kronos) {
		this.we_kronos = we_kronos;
	}

	public String getHome_phone() {
		return home_phone;
	}

	public void setHome_phone(String home_phone) {
		this.home_phone = home_phone;
	}

	public String getHp_alert() {
		return hp_alert;
	}

	public void setHp_alert(String hp_alert) {
		this.hp_alert = hp_alert;
	}

	public String getWork_phone() {
		return work_phone;
	}

	public void setWork_phone(String work_phone) {
		this.work_phone = work_phone;
	}

	public String getWp_alert() {
		return wp_alert;
	}

	public void setWp_alert(String wp_alert) {
		this.wp_alert = wp_alert;
	}

	public String getPersonal_email() {
		return personal_email;
	}

	public void setPersonal_email(String personal_email) {
		this.personal_email = personal_email;
	}

	public String getPe_alert() {
		return pe_alert;
	}

	public void setPe_alert(String pe_alert) {
		this.pe_alert = pe_alert;
	}

	public String getPe_kronos() {
		return pe_kronos;
	}

	public void setPe_kronos(String pe_kronos) {
		this.pe_kronos = pe_kronos;
	}

	public String getCell_phone() {
		return cell_phone;
	}

	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}

	public String getCp_alert() {
		return cp_alert;
	}

	public void setCp_alert(String cp_alert) {
		this.cp_alert = cp_alert;
	}

	public String getText_phone() {
		return text_phone;
	}

	public void setText_phone(String text_phone) {
		this.text_phone = text_phone;
	}

	public String getText_alert() {
		return text_alert;
	}

	public void setText_alert(String text_alert) {
		this.text_alert = text_alert;
	}

	public String getTxt_kronos() {
		return txt_kronos;
	}

	public void setTxt_kronos(String txt_kronos) {
		this.txt_kronos = txt_kronos;
	}

	public String getInt_pager() {
		return int_pager;
	}

	public void setInt_pager(String int_pager) {
		this.int_pager = int_pager;
	}

	public String getIp_alert() {
		return ip_alert;
	}

	public void setIp_alert(String ip_alert) {
		this.ip_alert = ip_alert;
	}

	public String getExt_pager() {
		return ext_pager;
	}

	public void setExt_pager(String ext_pager) {
		this.ext_pager = ext_pager;
	}

	public String getEp_alert() {
		return ep_alert;
	}

	public void setEp_alert(String ep_alert) {
		this.ep_alert = ep_alert;
	}

	public String getComm_pref() {
		return comm_pref;
	}

	public void setComm_pref(String comm_pref) {
		this.comm_pref = comm_pref;
	}

	public String getRhs_texts() {
		return rhs_texts;
	}

	public void setRhs_texts(String rhs_texts) {
		this.rhs_texts = rhs_texts;
	}

	@Override
	public String toString() {
		return "User [employee_id=" + employee_id + ", work_email=" + work_email + ", we_kronos=" + we_kronos
				+ ", home_phone=" + home_phone + ", hp_alert=" + hp_alert + ", work_phone=" + work_phone + ", wp_alert="
				+ wp_alert + ", personal_email=" + personal_email + ", pe_alert=" + pe_alert + ", pe_kronos="
				+ pe_kronos + ", cell_phone=" + cell_phone + ", cp_alert=" + cp_alert + ", text_phone=" + text_phone
				+ ", text_alert=" + text_alert + ", txt_kronos=" + txt_kronos + ", int_pager=" + int_pager
				+ ", ip_alert=" + ip_alert + ", ext_pager=" + ext_pager + ", ep_alert=" + ep_alert + ", comm_pref="
				+ comm_pref + ", rhs_texts=" + rhs_texts + "]";
	}

}