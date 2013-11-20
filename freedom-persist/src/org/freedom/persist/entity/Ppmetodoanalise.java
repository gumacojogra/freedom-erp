package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ppmetodoanalise generated by hbm2java
 */
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
	private Set pptipoanalises = new HashSet(0);
	private Set ppfotomtans = new HashSet(0);

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
			Set pptipoanalises, Set ppfotomtans) {
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

	public PpmetodoanaliseId getId() {
		return this.id;
	}

	public void setId(PpmetodoanaliseId id) {
		this.id = id;
	}

	public String getDescmtanalise() {
		return this.descmtanalise;
	}

	public void setDescmtanalise(String descmtanalise) {
		this.descmtanalise = descmtanalise;
	}

	public String getTituloanalise() {
		return this.tituloanalise;
	}

	public void setTituloanalise(String tituloanalise) {
		this.tituloanalise = tituloanalise;
	}

	public String getFontemtanalise() {
		return this.fontemtanalise;
	}

	public void setFontemtanalise(String fontemtanalise) {
		this.fontemtanalise = fontemtanalise;
	}

	public String getMatanalise() {
		return this.matanalise;
	}

	public void setMatanalise(String matanalise) {
		this.matanalise = matanalise;
	}

	public String getReaganalise() {
		return this.reaganalise;
	}

	public void setReaganalise(String reaganalise) {
		this.reaganalise = reaganalise;
	}

	public String getProcanalise() {
		return this.procanalise;
	}

	public void setProcanalise(String procanalise) {
		this.procanalise = procanalise;
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

	public Set getPptipoanalises() {
		return this.pptipoanalises;
	}

	public void setPptipoanalises(Set pptipoanalises) {
		this.pptipoanalises = pptipoanalises;
	}

	public Set getPpfotomtans() {
		return this.ppfotomtans;
	}

	public void setPpfotomtans(Set ppfotomtans) {
		this.ppfotomtans = ppfotomtans;
	}

}
