package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqgrupo generated by hbm2java
 */
public class Eqgrupo implements java.io.Serializable {

	private EqgrupoId id;
	private Sgfilial sgfilial;
	private Eqgrupo eqgrupo;
	private String descgrup;
	private Integer nivelgrup;
	private Integer codempsg;
	private Short codfilialsg;
	private String siglagrup;
	private char estneggrup;
	private char estlotneggrup;
	private char web;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqprodutos = new HashSet(0);
	private Set eqgrupos = new HashSet(0);
	private Set tkctogrpints = new HashSet(0);
	private Set sgprefere1s = new HashSet(0);

	public Eqgrupo() {
	}

	public Eqgrupo(EqgrupoId id, Sgfilial sgfilial, Eqgrupo eqgrupo,
			String descgrup, char estneggrup, char estlotneggrup, char web,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqgrupo = eqgrupo;
		this.descgrup = descgrup;
		this.estneggrup = estneggrup;
		this.estlotneggrup = estlotneggrup;
		this.web = web;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqgrupo(EqgrupoId id, Sgfilial sgfilial, Eqgrupo eqgrupo,
			String descgrup, Integer nivelgrup, Integer codempsg,
			Short codfilialsg, String siglagrup, char estneggrup,
			char estlotneggrup, char web, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set eqprodutos, Set eqgrupos, Set tkctogrpints, Set sgprefere1s) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqgrupo = eqgrupo;
		this.descgrup = descgrup;
		this.nivelgrup = nivelgrup;
		this.codempsg = codempsg;
		this.codfilialsg = codfilialsg;
		this.siglagrup = siglagrup;
		this.estneggrup = estneggrup;
		this.estlotneggrup = estlotneggrup;
		this.web = web;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqprodutos = eqprodutos;
		this.eqgrupos = eqgrupos;
		this.tkctogrpints = tkctogrpints;
		this.sgprefere1s = sgprefere1s;
	}

	public EqgrupoId getId() {
		return this.id;
	}

	public void setId(EqgrupoId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Eqgrupo getEqgrupo() {
		return this.eqgrupo;
	}

	public void setEqgrupo(Eqgrupo eqgrupo) {
		this.eqgrupo = eqgrupo;
	}

	public String getDescgrup() {
		return this.descgrup;
	}

	public void setDescgrup(String descgrup) {
		this.descgrup = descgrup;
	}

	public Integer getNivelgrup() {
		return this.nivelgrup;
	}

	public void setNivelgrup(Integer nivelgrup) {
		this.nivelgrup = nivelgrup;
	}

	public Integer getCodempsg() {
		return this.codempsg;
	}

	public void setCodempsg(Integer codempsg) {
		this.codempsg = codempsg;
	}

	public Short getCodfilialsg() {
		return this.codfilialsg;
	}

	public void setCodfilialsg(Short codfilialsg) {
		this.codfilialsg = codfilialsg;
	}

	public String getSiglagrup() {
		return this.siglagrup;
	}

	public void setSiglagrup(String siglagrup) {
		this.siglagrup = siglagrup;
	}

	public char getEstneggrup() {
		return this.estneggrup;
	}

	public void setEstneggrup(char estneggrup) {
		this.estneggrup = estneggrup;
	}

	public char getEstlotneggrup() {
		return this.estlotneggrup;
	}

	public void setEstlotneggrup(char estlotneggrup) {
		this.estlotneggrup = estlotneggrup;
	}

	public char getWeb() {
		return this.web;
	}

	public void setWeb(char web) {
		this.web = web;
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

	public Set getEqprodutos() {
		return this.eqprodutos;
	}

	public void setEqprodutos(Set eqprodutos) {
		this.eqprodutos = eqprodutos;
	}

	public Set getEqgrupos() {
		return this.eqgrupos;
	}

	public void setEqgrupos(Set eqgrupos) {
		this.eqgrupos = eqgrupos;
	}

	public Set getTkctogrpints() {
		return this.tkctogrpints;
	}

	public void setTkctogrpints(Set tkctogrpints) {
		this.tkctogrpints = tkctogrpints;
	}

	public Set getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

}
