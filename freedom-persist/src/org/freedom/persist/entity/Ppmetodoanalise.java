package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ppmetodoanalise generated by hbm2java
 */
@Entity
@Table(name = "PPMETODOANALISE")
public class Ppmetodoanalise implements java.io.Serializable {

	private PpmetodoanaliseId id;
	private String descmtanalise;
	private String tituloanalise;
	private String fontemtanalise;
	private String matanalise;
	private String reaganalise;
	private String procanalise;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Pptipoanalise> pptipoanalises = new HashSet<Pptipoanalise>(0);
	private Set<Ppfotomtan> ppfotomtans = new HashSet<Ppfotomtan>(0);

	public Ppmetodoanalise() {
	}

	public Ppmetodoanalise(PpmetodoanaliseId id, String descmtanalise,
			String tituloanalise, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.descmtanalise = descmtanalise;
		this.tituloanalise = tituloanalise;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Ppmetodoanalise(PpmetodoanaliseId id, String descmtanalise,
			String tituloanalise, String fontemtanalise, String matanalise,
			String reaganalise, String procanalise, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Pptipoanalise> pptipoanalises, Set<Ppfotomtan> ppfotomtans) {
		this.id = id;
		this.descmtanalise = descmtanalise;
		this.tituloanalise = tituloanalise;
		this.fontemtanalise = fontemtanalise;
		this.matanalise = matanalise;
		this.reaganalise = reaganalise;
		this.procanalise = procanalise;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.pptipoanalises = pptipoanalises;
		this.ppfotomtans = ppfotomtans;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmtanalise", column = @Column(name = "CODMTANALISE", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PpmetodoanaliseId getId() {
		return this.id;
	}

	public void setId(PpmetodoanaliseId id) {
		this.id = id;
	}

	@Column(name = "DESCMTANALISE", nullable = false, length = 80)
	public String getDescmtanalise() {
		return this.descmtanalise;
	}

	public void setDescmtanalise(String descmtanalise) {
		this.descmtanalise = descmtanalise;
	}

	@Column(name = "TITULOANALISE", nullable = false, length = 100)
	public String getTituloanalise() {
		return this.tituloanalise;
	}

	public void setTituloanalise(String tituloanalise) {
		this.tituloanalise = tituloanalise;
	}

	@Column(name = "FONTEMTANALISE", length = 100)
	public String getFontemtanalise() {
		return this.fontemtanalise;
	}

	public void setFontemtanalise(String fontemtanalise) {
		this.fontemtanalise = fontemtanalise;
	}

	@Column(name = "MATANALISE", length = 6000)
	public String getMatanalise() {
		return this.matanalise;
	}

	public void setMatanalise(String matanalise) {
		this.matanalise = matanalise;
	}

	@Column(name = "REAGANALISE", length = 6000)
	public String getReaganalise() {
		return this.reaganalise;
	}

	public void setReaganalise(String reaganalise) {
		this.reaganalise = reaganalise;
	}

	@Column(name = "PROCANALISE", length = 6000)
	public String getProcanalise() {
		return this.procanalise;
	}

	public void setProcanalise(String procanalise) {
		this.procanalise = procanalise;
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

	@Column(name = "IDUSUINS", nullable = false, length = 128)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppmetodoanalise")
	public Set<Pptipoanalise> getPptipoanalises() {
		return this.pptipoanalises;
	}

	public void setPptipoanalises(Set<Pptipoanalise> pptipoanalises) {
		this.pptipoanalises = pptipoanalises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppmetodoanalise")
	public Set<Ppfotomtan> getPpfotomtans() {
		return this.ppfotomtans;
	}

	public void setPpfotomtans(Set<Ppfotomtan> ppfotomtans) {
		this.ppfotomtans = ppfotomtans;
	}

}
