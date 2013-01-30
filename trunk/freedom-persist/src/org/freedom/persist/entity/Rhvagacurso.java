package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Rhvagacurso generated by hbm2java
 */
@Entity
@Table(name = "RHVAGACURSO")
public class Rhvagacurso implements java.io.Serializable {

	private RhvagacursoId id;
	private Rhcurso rhcurso;
	private Rhvaga rhvaga;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Rhvagacurso() {
	}

	public Rhvagacurso(RhvagacursoId id, Rhcurso rhcurso, Rhvaga rhvaga,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.rhcurso = rhcurso;
		this.rhvaga = rhvaga;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhvagacurso(RhvagacursoId id, Rhcurso rhcurso, Rhvaga rhvaga,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.rhcurso = rhcurso;
		this.rhvaga = rhvaga;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codvaga", column = @Column(name = "CODVAGA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codcurso", column = @Column(name = "CODCURSO", nullable = false)),
			@AttributeOverride(name = "codfilialcs", column = @Column(name = "CODFILIALCS", nullable = false)),
			@AttributeOverride(name = "codempcs", column = @Column(name = "CODEMPCS", nullable = false)) })
	public RhvagacursoId getId() {
		return this.id;
	}

	public void setId(RhvagacursoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCURSO", referencedColumnName = "CODCURSO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALCS", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPCS", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Rhcurso getRhcurso() {
		return this.rhcurso;
	}

	public void setRhcurso(Rhcurso rhcurso) {
		this.rhcurso = rhcurso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVAGA", referencedColumnName = "CODVAGA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Rhvaga getRhvaga() {
		return this.rhvaga;
	}

	public void setRhvaga(Rhvaga rhvaga) {
		this.rhvaga = rhvaga;
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

}
