package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vditorcamento generated by hbm2java
 */
public class Vditorcamento implements java.io.Serializable {

	private VditorcamentoId id;
	private Eqproduto eqproduto;
	private Sglog sglog;
	private Eqalmox eqalmox;
	private Eqlote eqlote;
	private Vdorcamento vdorcamento;
	private Vdprazoent vdprazoent;
	private BigDecimal qtditorc;
	private BigDecimal qtdaprovitorc;
	private BigDecimal qtdafatitorc;
	private BigDecimal qtdfatitorc;
	private BigDecimal precoitorc;
	private BigDecimal percdescitorc;
	private BigDecimal vlrdescitorc;
	private BigDecimal vlrliqitorc;
	private BigDecimal vlrproditorc;
	private String refprod;
	private String numautorizorc;
	private char aceiteitorc;
	private char aprovitorc;
	private char emititorc;
	private Date vencautorizorc;
	private String strdescitorc;
	private String obsitorc;
	private String statusitorc;
	private Short diaspe;
	private Character emmanut;
	private char sitentitorc;
	private char sittermritorc;
	private char cancitorc;
	private char fatitorc;
	private BigDecimal vlrcomisitorc;
	private BigDecimal perccomisitorc;
	private BigDecimal vlrfreteitorc;
	private Date dtaprovitorc;
	private String sitproditorc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdvendaorcs = new HashSet(0);
	private Set vdcontrorcs = new HashSet(0);
	private Set crfichaorcs = new HashSet(0);
	private Vdprevtribitorc vdprevtribitorc;
	private Set ppopitorcs = new HashSet(0);
	private Vditcustoorc vditcustoorc;
	private Ppprocessaoptmp ppprocessaoptmp;
	private Set eqitrecmercitositorcs = new HashSet(0);

	public Vditorcamento() {
	}

	public Vditorcamento(VditorcamentoId id, Eqproduto eqproduto,
			Eqalmox eqalmox, Eqlote eqlote, Vdorcamento vdorcamento,
			BigDecimal qtditorc, BigDecimal qtdafatitorc,
			BigDecimal qtdfatitorc, BigDecimal precoitorc, char aceiteitorc,
			char aprovitorc, char emititorc, char sitentitorc,
			char sittermritorc, char cancitorc, char fatitorc,
			String sitproditorc, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.eqalmox = eqalmox;
		this.eqlote = eqlote;
		this.vdorcamento = vdorcamento;
		this.qtditorc = qtditorc;
		this.qtdafatitorc = qtdafatitorc;
		this.qtdfatitorc = qtdfatitorc;
		this.precoitorc = precoitorc;
		this.aceiteitorc = aceiteitorc;
		this.aprovitorc = aprovitorc;
		this.emititorc = emititorc;
		this.sitentitorc = sitentitorc;
		this.sittermritorc = sittermritorc;
		this.cancitorc = cancitorc;
		this.fatitorc = fatitorc;
		this.sitproditorc = sitproditorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vditorcamento(VditorcamentoId id, Eqproduto eqproduto, Sglog sglog,
			Eqalmox eqalmox, Eqlote eqlote, Vdorcamento vdorcamento,
			Vdprazoent vdprazoent, BigDecimal qtditorc,
			BigDecimal qtdaprovitorc, BigDecimal qtdafatitorc,
			BigDecimal qtdfatitorc, BigDecimal precoitorc,
			BigDecimal percdescitorc, BigDecimal vlrdescitorc,
			BigDecimal vlrliqitorc, BigDecimal vlrproditorc, String refprod,
			String numautorizorc, char aceiteitorc, char aprovitorc,
			char emititorc, Date vencautorizorc, String strdescitorc,
			String obsitorc, String statusitorc, Short diaspe,
			Character emmanut, char sitentitorc, char sittermritorc,
			char cancitorc, char fatitorc, BigDecimal vlrcomisitorc,
			BigDecimal perccomisitorc, BigDecimal vlrfreteitorc,
			Date dtaprovitorc, String sitproditorc, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdvendaorcs, Set vdcontrorcs, Set crfichaorcs,
			Vdprevtribitorc vdprevtribitorc, Set ppopitorcs,
			Vditcustoorc vditcustoorc, Ppprocessaoptmp ppprocessaoptmp,
			Set eqitrecmercitositorcs) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.sglog = sglog;
		this.eqalmox = eqalmox;
		this.eqlote = eqlote;
		this.vdorcamento = vdorcamento;
		this.vdprazoent = vdprazoent;
		this.qtditorc = qtditorc;
		this.qtdaprovitorc = qtdaprovitorc;
		this.qtdafatitorc = qtdafatitorc;
		this.qtdfatitorc = qtdfatitorc;
		this.precoitorc = precoitorc;
		this.percdescitorc = percdescitorc;
		this.vlrdescitorc = vlrdescitorc;
		this.vlrliqitorc = vlrliqitorc;
		this.vlrproditorc = vlrproditorc;
		this.refprod = refprod;
		this.numautorizorc = numautorizorc;
		this.aceiteitorc = aceiteitorc;
		this.aprovitorc = aprovitorc;
		this.emititorc = emititorc;
		this.vencautorizorc = vencautorizorc;
		this.strdescitorc = strdescitorc;
		this.obsitorc = obsitorc;
		this.statusitorc = statusitorc;
		this.diaspe = diaspe;
		this.emmanut = emmanut;
		this.sitentitorc = sitentitorc;
		this.sittermritorc = sittermritorc;
		this.cancitorc = cancitorc;
		this.fatitorc = fatitorc;
		this.vlrcomisitorc = vlrcomisitorc;
		this.perccomisitorc = perccomisitorc;
		this.vlrfreteitorc = vlrfreteitorc;
		this.dtaprovitorc = dtaprovitorc;
		this.sitproditorc = sitproditorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdvendaorcs = vdvendaorcs;
		this.vdcontrorcs = vdcontrorcs;
		this.crfichaorcs = crfichaorcs;
		this.vdprevtribitorc = vdprevtribitorc;
		this.ppopitorcs = ppopitorcs;
		this.vditcustoorc = vditcustoorc;
		this.ppprocessaoptmp = ppprocessaoptmp;
		this.eqitrecmercitositorcs = eqitrecmercitositorcs;
	}

	public VditorcamentoId getId() {
		return this.id;
	}

	public void setId(VditorcamentoId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Sglog getSglog() {
		return this.sglog;
	}

	public void setSglog(Sglog sglog) {
		this.sglog = sglog;
	}

	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	public Eqlote getEqlote() {
		return this.eqlote;
	}

	public void setEqlote(Eqlote eqlote) {
		this.eqlote = eqlote;
	}

	public Vdorcamento getVdorcamento() {
		return this.vdorcamento;
	}

	public void setVdorcamento(Vdorcamento vdorcamento) {
		this.vdorcamento = vdorcamento;
	}

	public Vdprazoent getVdprazoent() {
		return this.vdprazoent;
	}

	public void setVdprazoent(Vdprazoent vdprazoent) {
		this.vdprazoent = vdprazoent;
	}

	public BigDecimal getQtditorc() {
		return this.qtditorc;
	}

	public void setQtditorc(BigDecimal qtditorc) {
		this.qtditorc = qtditorc;
	}

	public BigDecimal getQtdaprovitorc() {
		return this.qtdaprovitorc;
	}

	public void setQtdaprovitorc(BigDecimal qtdaprovitorc) {
		this.qtdaprovitorc = qtdaprovitorc;
	}

	public BigDecimal getQtdafatitorc() {
		return this.qtdafatitorc;
	}

	public void setQtdafatitorc(BigDecimal qtdafatitorc) {
		this.qtdafatitorc = qtdafatitorc;
	}

	public BigDecimal getQtdfatitorc() {
		return this.qtdfatitorc;
	}

	public void setQtdfatitorc(BigDecimal qtdfatitorc) {
		this.qtdfatitorc = qtdfatitorc;
	}

	public BigDecimal getPrecoitorc() {
		return this.precoitorc;
	}

	public void setPrecoitorc(BigDecimal precoitorc) {
		this.precoitorc = precoitorc;
	}

	public BigDecimal getPercdescitorc() {
		return this.percdescitorc;
	}

	public void setPercdescitorc(BigDecimal percdescitorc) {
		this.percdescitorc = percdescitorc;
	}

	public BigDecimal getVlrdescitorc() {
		return this.vlrdescitorc;
	}

	public void setVlrdescitorc(BigDecimal vlrdescitorc) {
		this.vlrdescitorc = vlrdescitorc;
	}

	public BigDecimal getVlrliqitorc() {
		return this.vlrliqitorc;
	}

	public void setVlrliqitorc(BigDecimal vlrliqitorc) {
		this.vlrliqitorc = vlrliqitorc;
	}

	public BigDecimal getVlrproditorc() {
		return this.vlrproditorc;
	}

	public void setVlrproditorc(BigDecimal vlrproditorc) {
		this.vlrproditorc = vlrproditorc;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public String getNumautorizorc() {
		return this.numautorizorc;
	}

	public void setNumautorizorc(String numautorizorc) {
		this.numautorizorc = numautorizorc;
	}

	public char getAceiteitorc() {
		return this.aceiteitorc;
	}

	public void setAceiteitorc(char aceiteitorc) {
		this.aceiteitorc = aceiteitorc;
	}

	public char getAprovitorc() {
		return this.aprovitorc;
	}

	public void setAprovitorc(char aprovitorc) {
		this.aprovitorc = aprovitorc;
	}

	public char getEmititorc() {
		return this.emititorc;
	}

	public void setEmititorc(char emititorc) {
		this.emititorc = emititorc;
	}

	public Date getVencautorizorc() {
		return this.vencautorizorc;
	}

	public void setVencautorizorc(Date vencautorizorc) {
		this.vencautorizorc = vencautorizorc;
	}

	public String getStrdescitorc() {
		return this.strdescitorc;
	}

	public void setStrdescitorc(String strdescitorc) {
		this.strdescitorc = strdescitorc;
	}

	public String getObsitorc() {
		return this.obsitorc;
	}

	public void setObsitorc(String obsitorc) {
		this.obsitorc = obsitorc;
	}

	public String getStatusitorc() {
		return this.statusitorc;
	}

	public void setStatusitorc(String statusitorc) {
		this.statusitorc = statusitorc;
	}

	public Short getDiaspe() {
		return this.diaspe;
	}

	public void setDiaspe(Short diaspe) {
		this.diaspe = diaspe;
	}

	public Character getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(Character emmanut) {
		this.emmanut = emmanut;
	}

	public char getSitentitorc() {
		return this.sitentitorc;
	}

	public void setSitentitorc(char sitentitorc) {
		this.sitentitorc = sitentitorc;
	}

	public char getSittermritorc() {
		return this.sittermritorc;
	}

	public void setSittermritorc(char sittermritorc) {
		this.sittermritorc = sittermritorc;
	}

	public char getCancitorc() {
		return this.cancitorc;
	}

	public void setCancitorc(char cancitorc) {
		this.cancitorc = cancitorc;
	}

	public char getFatitorc() {
		return this.fatitorc;
	}

	public void setFatitorc(char fatitorc) {
		this.fatitorc = fatitorc;
	}

	public BigDecimal getVlrcomisitorc() {
		return this.vlrcomisitorc;
	}

	public void setVlrcomisitorc(BigDecimal vlrcomisitorc) {
		this.vlrcomisitorc = vlrcomisitorc;
	}

	public BigDecimal getPerccomisitorc() {
		return this.perccomisitorc;
	}

	public void setPerccomisitorc(BigDecimal perccomisitorc) {
		this.perccomisitorc = perccomisitorc;
	}

	public BigDecimal getVlrfreteitorc() {
		return this.vlrfreteitorc;
	}

	public void setVlrfreteitorc(BigDecimal vlrfreteitorc) {
		this.vlrfreteitorc = vlrfreteitorc;
	}

	public Date getDtaprovitorc() {
		return this.dtaprovitorc;
	}

	public void setDtaprovitorc(Date dtaprovitorc) {
		this.dtaprovitorc = dtaprovitorc;
	}

	public String getSitproditorc() {
		return this.sitproditorc;
	}

	public void setSitproditorc(String sitproditorc) {
		this.sitproditorc = sitproditorc;
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

	public Set getVdvendaorcs() {
		return this.vdvendaorcs;
	}

	public void setVdvendaorcs(Set vdvendaorcs) {
		this.vdvendaorcs = vdvendaorcs;
	}

	public Set getVdcontrorcs() {
		return this.vdcontrorcs;
	}

	public void setVdcontrorcs(Set vdcontrorcs) {
		this.vdcontrorcs = vdcontrorcs;
	}

	public Set getCrfichaorcs() {
		return this.crfichaorcs;
	}

	public void setCrfichaorcs(Set crfichaorcs) {
		this.crfichaorcs = crfichaorcs;
	}

	public Vdprevtribitorc getVdprevtribitorc() {
		return this.vdprevtribitorc;
	}

	public void setVdprevtribitorc(Vdprevtribitorc vdprevtribitorc) {
		this.vdprevtribitorc = vdprevtribitorc;
	}

	public Set getPpopitorcs() {
		return this.ppopitorcs;
	}

	public void setPpopitorcs(Set ppopitorcs) {
		this.ppopitorcs = ppopitorcs;
	}

	public Vditcustoorc getVditcustoorc() {
		return this.vditcustoorc;
	}

	public void setVditcustoorc(Vditcustoorc vditcustoorc) {
		this.vditcustoorc = vditcustoorc;
	}

	public Ppprocessaoptmp getPpprocessaoptmp() {
		return this.ppprocessaoptmp;
	}

	public void setPpprocessaoptmp(Ppprocessaoptmp ppprocessaoptmp) {
		this.ppprocessaoptmp = ppprocessaoptmp;
	}

	public Set getEqitrecmercitositorcs() {
		return this.eqitrecmercitositorcs;
	}

	public void setEqitrecmercitositorcs(Set eqitrecmercitositorcs) {
		this.eqitrecmercitositorcs = eqitrecmercitositorcs;
	}

}
