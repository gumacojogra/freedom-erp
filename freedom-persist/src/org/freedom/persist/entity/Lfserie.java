package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Lfserie generated by hbm2java
 */
@Entity
@Table(name = "LFSERIE")
public class Lfserie implements java.io.Serializable {

	private LfserieId id;
	private Sgfilial sgfilial;
	private int docserie;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqtipomovsForEqtipomovfklfserco = new HashSet(0);
	private Set eqtipomovsForEqtipomovfklfserie = new HashSet(0);
	private Set vdvendas = new HashSet(0);

	public Lfserie() {
	}

	public Lfserie(LfserieId id, Sgfilial sgfilial, int docserie, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.docserie = docserie;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfserie(LfserieId id, Sgfilial sgfilial, int docserie, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqtipomovsForEqtipomovfklfserco,
			Set eqtipomovsForEqtipomovfklfserie, Set vdvendas) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.docserie = docserie;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqtipomovsForEqtipomovfklfserco = eqtipomovsForEqtipomovfklfserco;
		this.eqtipomovsForEqtipomovfklfserie = eqtipomovsForEqtipomovfklfserie;
		this.vdvendas = vdvendas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "serie", column = @Column(name = "SERIE", nullable = false, length = 4)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LfserieId getId() {
		return this.id;
	}

	public void setId(LfserieId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DOCSERIE", nullable = false)
	public int getDocserie() {
		return this.docserie;
	}

	public void setDocserie(int docserie) {
		this.docserie = docserie;
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

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfserieByEqtipomovfklfserco")
	public Set getEqtipomovsForEqtipomovfklfserco() {
		return this.eqtipomovsForEqtipomovfklfserco;
	}

	public void setEqtipomovsForEqtipomovfklfserco(
			Set eqtipomovsForEqtipomovfklfserco) {
		this.eqtipomovsForEqtipomovfklfserco = eqtipomovsForEqtipomovfklfserco;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfserieByEqtipomovfklfserie")
	public Set getEqtipomovsForEqtipomovfklfserie() {
		return this.eqtipomovsForEqtipomovfklfserie;
	}

	public void setEqtipomovsForEqtipomovfklfserie(
			Set eqtipomovsForEqtipomovfklfserie) {
		this.eqtipomovsForEqtipomovfklfserie = eqtipomovsForEqtipomovfklfserie;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfserie")
	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}
*/
}
