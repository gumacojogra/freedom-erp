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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vdmotorista generated by hbm2java
 */
@Entity
@Table(name = "VDMOTORISTA")
public class Vdmotorista implements java.io.Serializable {

	private VdmotoristaId id;
	private Vdtransp vdtransp;
	private Sgmunicipio sgmunicipio;
	private String cnh;
	private String nomemot;
	private String cpfmot;
	private String endmot;
	private Integer nummot;
	private String complmot;
	private String bairmot;
	private String cepmot;
	private String fonemot;
	private String celmot;
	private String dddmot;
	private String conjugemot;
	private Short nrodependmot;
	private String rgmot;
	private String sspmot;
	private String nropismot;
	private String obsmot;
	private String emailmot;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Vdtransp> vdtransps = new HashSet<Vdtransp>(0);
	private Set<Eqexpedicao> eqexpedicaos = new HashSet<Eqexpedicao>(0);

	public Vdmotorista() {
	}

	public Vdmotorista(VdmotoristaId id, String cnh, String nomemot,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cnh = cnh;
		this.nomemot = nomemot;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdmotorista(VdmotoristaId id, Vdtransp vdtransp,
			Sgmunicipio sgmunicipio, String cnh, String nomemot, String cpfmot,
			String endmot, Integer nummot, String complmot, String bairmot,
			String cepmot, String fonemot, String celmot, String dddmot,
			String conjugemot, Short nrodependmot, String rgmot, String sspmot,
			String nropismot, String obsmot, String emailmot, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Vdtransp> vdtransps, Set<Eqexpedicao> eqexpedicaos) {
		this.id = id;
		this.vdtransp = vdtransp;
		this.sgmunicipio = sgmunicipio;
		this.cnh = cnh;
		this.nomemot = nomemot;
		this.cpfmot = cpfmot;
		this.endmot = endmot;
		this.nummot = nummot;
		this.complmot = complmot;
		this.bairmot = bairmot;
		this.cepmot = cepmot;
		this.fonemot = fonemot;
		this.celmot = celmot;
		this.dddmot = dddmot;
		this.conjugemot = conjugemot;
		this.nrodependmot = nrodependmot;
		this.rgmot = rgmot;
		this.sspmot = sspmot;
		this.nropismot = nropismot;
		this.obsmot = obsmot;
		this.emailmot = emailmot;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdtransps = vdtransps;
		this.eqexpedicaos = eqexpedicaos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmot", column = @Column(name = "CODMOT", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdmotoristaId getId() {
		return this.id;
	}

	public void setId(VdmotoristaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTRAN", referencedColumnName = "CODTRAN"),
			@JoinColumn(name = "CODFILIALTN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTN", referencedColumnName = "CODEMP") })
	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMUNIC", referencedColumnName = "CODMUNIC"),
			@JoinColumn(name = "SIGLAUF", referencedColumnName = "SIGLAUF"),
			@JoinColumn(name = "CODPAIS", referencedColumnName = "CODPAIS") })
	public Sgmunicipio getSgmunicipio() {
		return this.sgmunicipio;
	}

	public void setSgmunicipio(Sgmunicipio sgmunicipio) {
		this.sgmunicipio = sgmunicipio;
	}

	@Column(name = "CNH", nullable = false, length = 11)
	public String getCnh() {
		return this.cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	@Column(name = "NOMEMOT", nullable = false, length = 100)
	public String getNomemot() {
		return this.nomemot;
	}

	public void setNomemot(String nomemot) {
		this.nomemot = nomemot;
	}

	@Column(name = "CPFMOT", length = 11)
	public String getCpfmot() {
		return this.cpfmot;
	}

	public void setCpfmot(String cpfmot) {
		this.cpfmot = cpfmot;
	}

	@Column(name = "ENDMOT", length = 50)
	public String getEndmot() {
		return this.endmot;
	}

	public void setEndmot(String endmot) {
		this.endmot = endmot;
	}

	@Column(name = "NUMMOT")
	public Integer getNummot() {
		return this.nummot;
	}

	public void setNummot(Integer nummot) {
		this.nummot = nummot;
	}

	@Column(name = "COMPLMOT", length = 20)
	public String getComplmot() {
		return this.complmot;
	}

	public void setComplmot(String complmot) {
		this.complmot = complmot;
	}

	@Column(name = "BAIRMOT", length = 30)
	public String getBairmot() {
		return this.bairmot;
	}

	public void setBairmot(String bairmot) {
		this.bairmot = bairmot;
	}

	@Column(name = "CEPMOT", length = 8)
	public String getCepmot() {
		return this.cepmot;
	}

	public void setCepmot(String cepmot) {
		this.cepmot = cepmot;
	}

	@Column(name = "FONEMOT", length = 12)
	public String getFonemot() {
		return this.fonemot;
	}

	public void setFonemot(String fonemot) {
		this.fonemot = fonemot;
	}

	@Column(name = "CELMOT", length = 8)
	public String getCelmot() {
		return this.celmot;
	}

	public void setCelmot(String celmot) {
		this.celmot = celmot;
	}

	@Column(name = "DDDMOT", length = 4)
	public String getDddmot() {
		return this.dddmot;
	}

	public void setDddmot(String dddmot) {
		this.dddmot = dddmot;
	}

	@Column(name = "CONJUGEMOT", length = 100)
	public String getConjugemot() {
		return this.conjugemot;
	}

	public void setConjugemot(String conjugemot) {
		this.conjugemot = conjugemot;
	}

	@Column(name = "NRODEPENDMOT")
	public Short getNrodependmot() {
		return this.nrodependmot;
	}

	public void setNrodependmot(Short nrodependmot) {
		this.nrodependmot = nrodependmot;
	}

	@Column(name = "RGMOT", length = 13)
	public String getRgmot() {
		return this.rgmot;
	}

	public void setRgmot(String rgmot) {
		this.rgmot = rgmot;
	}

	@Column(name = "SSPMOT", length = 10)
	public String getSspmot() {
		return this.sspmot;
	}

	public void setSspmot(String sspmot) {
		this.sspmot = sspmot;
	}

	@Column(name = "NROPISMOT", length = 20)
	public String getNropismot() {
		return this.nropismot;
	}

	public void setNropismot(String nropismot) {
		this.nropismot = nropismot;
	}

	@Column(name = "OBSMOT", length = 1000)
	public String getObsmot() {
		return this.obsmot;
	}

	public void setObsmot(String obsmot) {
		this.obsmot = obsmot;
	}

	@Column(name = "EMAILMOT", length = 60)
	public String getEmailmot() {
		return this.emailmot;
	}

	public void setEmailmot(String emailmot) {
		this.emailmot = emailmot;
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

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "VDTRANSPMOT", joinColumns = {
			@JoinColumn(name = "CODMOT", nullable = false, updatable = false),
			@JoinColumn(name = "CODFILIALMT", nullable = false, updatable = false),
			@JoinColumn(name = "CODEMPMT", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "CODTRAN", nullable = false, updatable = false) })
	public Set<Vdtransp> getVdtransps() {
		return this.vdtransps;
	}

	public void setVdtransps(Set<Vdtransp> vdtransps) {
		this.vdtransps = vdtransps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdmotorista")
	public Set<Eqexpedicao> getEqexpedicaos() {
		return this.eqexpedicaos;
	}

	public void setEqexpedicaos(Set<Eqexpedicao> eqexpedicaos) {
		this.eqexpedicaos = eqexpedicaos;
	}

}
