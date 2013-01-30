package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgmenu generated by hbm2java
 */
@Entity
@Table(name = "SGMENU")
public class Sgmenu implements java.io.Serializable {

	private SgmenuId id;
	private Sgmodulo sgmodulo;
	private String descmenu;
	private String nomemenu;
	private char planomenu;
	private String acaomenu;
	private Integer codsispai;
	private Integer codmodupai;
	private Integer codmenupai;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Sgmenuobj> sgmenuobjs = new HashSet<Sgmenuobj>(0);

	public Sgmenu() {
	}

	public Sgmenu(SgmenuId id, Sgmodulo sgmodulo, String descmenu,
			String nomemenu, char planomenu, String acaomenu, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgmodulo = sgmodulo;
		this.descmenu = descmenu;
		this.nomemenu = nomemenu;
		this.planomenu = planomenu;
		this.acaomenu = acaomenu;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgmenu(SgmenuId id, Sgmodulo sgmodulo, String descmenu,
			String nomemenu, char planomenu, String acaomenu,
			Integer codsispai, Integer codmodupai, Integer codmenupai,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Sgmenuobj> sgmenuobjs) {
		this.id = id;
		this.sgmodulo = sgmodulo;
		this.descmenu = descmenu;
		this.nomemenu = nomemenu;
		this.planomenu = planomenu;
		this.acaomenu = acaomenu;
		this.codsispai = codsispai;
		this.codmodupai = codmodupai;
		this.codmenupai = codmenupai;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgmenuobjs = sgmenuobjs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmenu", column = @Column(name = "CODMENU", nullable = false)),
			@AttributeOverride(name = "codmodu", column = @Column(name = "CODMODU", nullable = false)),
			@AttributeOverride(name = "codsis", column = @Column(name = "CODSIS", nullable = false)) })
	public SgmenuId getId() {
		return this.id;
	}

	public void setId(SgmenuId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMODU", referencedColumnName = "CODMODU", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODSIS", referencedColumnName = "CODSIS", nullable = false, insertable = false, updatable = false) })
	public Sgmodulo getSgmodulo() {
		return this.sgmodulo;
	}

	public void setSgmodulo(Sgmodulo sgmodulo) {
		this.sgmodulo = sgmodulo;
	}

	@Column(name = "DESCMENU", nullable = false, length = 200)
	public String getDescmenu() {
		return this.descmenu;
	}

	public void setDescmenu(String descmenu) {
		this.descmenu = descmenu;
	}

	@Column(name = "NOMEMENU", nullable = false, length = 200)
	public String getNomemenu() {
		return this.nomemenu;
	}

	public void setNomemenu(String nomemenu) {
		this.nomemenu = nomemenu;
	}

	@Column(name = "PLANOMENU", nullable = false, length = 1)
	public char getPlanomenu() {
		return this.planomenu;
	}

	public void setPlanomenu(char planomenu) {
		this.planomenu = planomenu;
	}

	@Column(name = "ACAOMENU", nullable = false, length = 200)
	public String getAcaomenu() {
		return this.acaomenu;
	}

	public void setAcaomenu(String acaomenu) {
		this.acaomenu = acaomenu;
	}

	@Column(name = "CODSISPAI")
	public Integer getCodsispai() {
		return this.codsispai;
	}

	public void setCodsispai(Integer codsispai) {
		this.codsispai = codsispai;
	}

	@Column(name = "CODMODUPAI")
	public Integer getCodmodupai() {
		return this.codmodupai;
	}

	public void setCodmodupai(Integer codmodupai) {
		this.codmodupai = codmodupai;
	}

	@Column(name = "CODMENUPAI")
	public Integer getCodmenupai() {
		return this.codmenupai;
	}

	public void setCodmenupai(Integer codmenupai) {
		this.codmenupai = codmenupai;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgmenu")
	public Set<Sgmenuobj> getSgmenuobjs() {
		return this.sgmenuobjs;
	}

	public void setSgmenuobjs(Set<Sgmenuobj> sgmenuobjs) {
		this.sgmenuobjs = sgmenuobjs;
	}

}
