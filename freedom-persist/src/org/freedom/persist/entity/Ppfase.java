package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ppfase generated by hbm2java
 */
public class Ppfase implements java.io.Serializable {

	private PpfaseId id;
	private Sgfilial sgfilial;
	private String descfase;
	private String tipofase;
	private Character externafase;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppopsubprods = new HashSet(0);
	private Set ppopfases = new HashSet(0);
	private Set ppestrufases = new HashSet(0);
	private Set ppitops = new HashSet(0);

	public Ppfase() {
	}

	public Ppfase(PpfaseId id, Sgfilial sgfilial, String descfase,
			String tipofase, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descfase = descfase;
		this.tipofase = tipofase;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppfase(PpfaseId id, Sgfilial sgfilial, String descfase,
			String tipofase, Character externafase, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set ppopsubprods, Set ppopfases, Set ppestrufases, Set ppitops) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descfase = descfase;
		this.tipofase = tipofase;
		this.externafase = externafase;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppopsubprods = ppopsubprods;
		this.ppopfases = ppopfases;
		this.ppestrufases = ppestrufases;
		this.ppitops = ppitops;
	}

	public PpfaseId getId() {
		return this.id;
	}

	public void setId(PpfaseId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescfase() {
		return this.descfase;
	}

	public void setDescfase(String descfase) {
		this.descfase = descfase;
	}

	public String getTipofase() {
		return this.tipofase;
	}

	public void setTipofase(String tipofase) {
		this.tipofase = tipofase;
	}

	public Character getExternafase() {
		return this.externafase;
	}

	public void setExternafase(Character externafase) {
		this.externafase = externafase;
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

	public Set getPpopsubprods() {
		return this.ppopsubprods;
	}

	public void setPpopsubprods(Set ppopsubprods) {
		this.ppopsubprods = ppopsubprods;
	}

	public Set getPpopfases() {
		return this.ppopfases;
	}

	public void setPpopfases(Set ppopfases) {
		this.ppopfases = ppopfases;
	}

	public Set getPpestrufases() {
		return this.ppestrufases;
	}

	public void setPpestrufases(Set ppestrufases) {
		this.ppestrufases = ppestrufases;
	}

	public Set getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set ppitops) {
		this.ppitops = ppitops;
	}

}
