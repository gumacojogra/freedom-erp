package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lfserie generated by hbm2java
 */
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
	private Set eqtipomovs = new HashSet(0);
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
			Set eqtipomovs, Set vdvendas) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.docserie = docserie;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqtipomovs = eqtipomovs;
		this.vdvendas = vdvendas;
	}

	public LfserieId getId() {
		return this.id;
	}

	public void setId(LfserieId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public int getDocserie() {
		return this.docserie;
	}

	public void setDocserie(int docserie) {
		this.docserie = docserie;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getEqtipomovs() {
		return this.eqtipomovs;
	}

	public void setEqtipomovs(Set eqtipomovs) {
		this.eqtipomovs = eqtipomovs;
	}

	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

}
