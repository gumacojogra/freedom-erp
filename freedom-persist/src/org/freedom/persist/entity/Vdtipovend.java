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
 * Vdtipovend generated by hbm2java
 */
@Entity
@Table(name = "VDTIPOVEND")
public class Vdtipovend implements java.io.Serializable {

	private VdtipovendId id;
	private String desctipovend;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Vditregracomis> vditregracomises = new HashSet<Vditregracomis>(
			0);
	private Set<Vdvendedor> vdvendedors = new HashSet<Vdvendedor>(0);

	public Vdtipovend() {
	}

	public Vdtipovend(VdtipovendId id, String desctipovend, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.desctipovend = desctipovend;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Vdtipovend(VdtipovendId id, String desctipovend, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Vditregracomis> vditregracomises, Set<Vdvendedor> vdvendedors) {
		this.id = id;
		this.desctipovend = desctipovend;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vditregracomises = vditregracomises;
		this.vdvendedors = vdvendedors;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codtipovend", column = @Column(name = "CODTIPOVEND", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdtipovendId getId() {
		return this.id;
	}

	public void setId(VdtipovendId id) {
		this.id = id;
	}

	@Column(name = "DESCTIPOVEND", nullable = false, length = 50)
	public String getDesctipovend() {
		return this.desctipovend;
	}

	public void setDesctipovend(String desctipovend) {
		this.desctipovend = desctipovend;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdtipovend")
	public Set<Vditregracomis> getVditregracomises() {
		return this.vditregracomises;
	}

	public void setVditregracomises(Set<Vditregracomis> vditregracomises) {
		this.vditregracomises = vditregracomises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdtipovend")
	public Set<Vdvendedor> getVdvendedors() {
		return this.vdvendedors;
	}

	public void setVdvendedors(Set<Vdvendedor> vdvendedors) {
		this.vdvendedors = vdvendedors;
	}

}
