package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cpcompra generated by hbm2java
 */
public class Cpcompra implements java.io.Serializable {

	private CpcompraId id;
	private Ppop ppop;
	private Fnconta fnconta;
	private Cpsolicitacao cpsolicitacao;
	private Fnbanco fnbanco;
	private Fncc fncc;
	private Eqrecmerc eqrecmerc;
	private Sgfilial sgfilial;
	private Cpimportacao cpimportacao;
	private Fntipocob fntipocob;
	private Cpforneced cpforneced;
	private Fnplanopag fnplanopag;
	private Eqtipomov eqtipomov;
	private Fnplanejamento fnplanejamento;
	private Cpordcompra cpordcompra;
	private Vdtransp vdtransp;
	private int codempse;
	private short codfilialse;
	private String serie;
	private int doccompra;
	private Date dtentcompra;
	private Date dtemitcompra;
	private Date dtcompcompra;
	private BigDecimal percdesccompra;
	private BigDecimal percipicompra;
	private BigDecimal vlrprodcompra;
	private BigDecimal vlrliqcompra;
	private BigDecimal vlrcompra;
	private BigDecimal vlrdesccompra;
	private BigDecimal vlrdescitcompra;
	private BigDecimal vlradiccompra;
	private BigDecimal vlrbaseicmscompra;
	private BigDecimal vlrbaseicmsstcompra;
	private BigDecimal vlrbaseipicompra;
	private BigDecimal vlrbasepiscompra;
	private BigDecimal vlrbasecofinscompra;
	private BigDecimal vlricmscompra;
	private BigDecimal vlricmsstcompra;
	private BigDecimal vlripicompra;
	private BigDecimal vlrpiscompra;
	private BigDecimal vlrcofinscompra;
	private BigDecimal vlrfunruralcompra;
	private BigDecimal vlrfretecompra;
	private BigDecimal vlroutrascompra;
	private BigDecimal vlrisentascompra;
	private char impnotacompra;
	private char bloqcompra;
	private char emmanut;
	private Character flag;
	private char adicfretecompra;
	private Character tipofretecompra;
	private String observacao;
	private String obs01;
	private String obs02;
	private String obs03;
	private String obs04;
	private char adicadiccompra;
	private BigDecimal qtdfretecompra;
	private Character adicfretebaseicms;
	private Character adicadicbaseicms;
	private Character adicipibaseicms;
	private String chavenfecompra;
	private String statuscompra;
	private String nrodi;
	private Date dtregdi;
	private String locdesembdi;
	private String siglaufdesembdi;
	private Integer codpaisdesembdi;
	private Date dtdesembdi;
	private String identcontainer;
	private char calctrib;
	private String infcompl;
	private String numacdraw;
	private Character tipodocimp;
	private String sitdoc;
	private String obsnfe;
	private BigDecimal vlrbaseiicompra;
	private BigDecimal vlriicompra;
	private BigDecimal vlricmsdiferido;
	private BigDecimal vlricmsdevido;
	private BigDecimal vlricmscredpresum;
	private String obspag;
	private BigDecimal vlrisscompra;
	private String nroordemcompra;
	private BigDecimal vlroutrasdesp;
	private Long cnf;
	private String chavenfevalida;
	private String motivocanccompra;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqguiatrafs = new HashSet(0);
	private Set cprateios = new HashSet(0);
	private Set ppitops = new HashSet(0);
	private Set lffretecompras = new HashSet(0);
	private Set fnpagars = new HashSet(0);
	private Set cpitcompras = new HashSet(0);
	private Cpfretecp cpfretecp;

	public Cpcompra() {
	}

	public Cpcompra(CpcompraId id, Sgfilial sgfilial, Cpforneced cpforneced,
			Fnplanopag fnplanopag, Eqtipomov eqtipomov, int codempse,
			short codfilialse, String serie, int doccompra, Date dtentcompra,
			Date dtemitcompra, Date dtcompcompra, char impnotacompra,
			char bloqcompra, char emmanut, char adicfretecompra,
			char adicadiccompra, String statuscompra, char calctrib,
			String chavenfevalida, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.eqtipomov = eqtipomov;
		this.codempse = codempse;
		this.codfilialse = codfilialse;
		this.serie = serie;
		this.doccompra = doccompra;
		this.dtentcompra = dtentcompra;
		this.dtemitcompra = dtemitcompra;
		this.dtcompcompra = dtcompcompra;
		this.impnotacompra = impnotacompra;
		this.bloqcompra = bloqcompra;
		this.emmanut = emmanut;
		this.adicfretecompra = adicfretecompra;
		this.adicadiccompra = adicadiccompra;
		this.statuscompra = statuscompra;
		this.calctrib = calctrib;
		this.chavenfevalida = chavenfevalida;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpcompra(CpcompraId id, Ppop ppop, Fnconta fnconta,
			Cpsolicitacao cpsolicitacao, Fnbanco fnbanco, Fncc fncc,
			Eqrecmerc eqrecmerc, Sgfilial sgfilial, Cpimportacao cpimportacao,
			Fntipocob fntipocob, Cpforneced cpforneced, Fnplanopag fnplanopag,
			Eqtipomov eqtipomov, Fnplanejamento fnplanejamento,
			Cpordcompra cpordcompra, Vdtransp vdtransp, int codempse,
			short codfilialse, String serie, int doccompra, Date dtentcompra,
			Date dtemitcompra, Date dtcompcompra, BigDecimal percdesccompra,
			BigDecimal percipicompra, BigDecimal vlrprodcompra,
			BigDecimal vlrliqcompra, BigDecimal vlrcompra,
			BigDecimal vlrdesccompra, BigDecimal vlrdescitcompra,
			BigDecimal vlradiccompra, BigDecimal vlrbaseicmscompra,
			BigDecimal vlrbaseicmsstcompra, BigDecimal vlrbaseipicompra,
			BigDecimal vlrbasepiscompra, BigDecimal vlrbasecofinscompra,
			BigDecimal vlricmscompra, BigDecimal vlricmsstcompra,
			BigDecimal vlripicompra, BigDecimal vlrpiscompra,
			BigDecimal vlrcofinscompra, BigDecimal vlrfunruralcompra,
			BigDecimal vlrfretecompra, BigDecimal vlroutrascompra,
			BigDecimal vlrisentascompra, char impnotacompra, char bloqcompra,
			char emmanut, Character flag, char adicfretecompra,
			Character tipofretecompra, String observacao, String obs01,
			String obs02, String obs03, String obs04, char adicadiccompra,
			BigDecimal qtdfretecompra, Character adicfretebaseicms,
			Character adicadicbaseicms, Character adicipibaseicms,
			String chavenfecompra, String statuscompra, String nrodi,
			Date dtregdi, String locdesembdi, String siglaufdesembdi,
			Integer codpaisdesembdi, Date dtdesembdi, String identcontainer,
			char calctrib, String infcompl, String numacdraw,
			Character tipodocimp, String sitdoc, String obsnfe,
			BigDecimal vlrbaseiicompra, BigDecimal vlriicompra,
			BigDecimal vlricmsdiferido, BigDecimal vlricmsdevido,
			BigDecimal vlricmscredpresum, String obspag,
			BigDecimal vlrisscompra, String nroordemcompra,
			BigDecimal vlroutrasdesp, Long cnf, String chavenfevalida,
			String motivocanccompra, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set eqguiatrafs,
			Set cprateios, Set ppitops, Set lffretecompras, Set fnpagars,
			Set cpitcompras, Cpfretecp cpfretecp) {
		this.id = id;
		this.ppop = ppop;
		this.fnconta = fnconta;
		this.cpsolicitacao = cpsolicitacao;
		this.fnbanco = fnbanco;
		this.fncc = fncc;
		this.eqrecmerc = eqrecmerc;
		this.sgfilial = sgfilial;
		this.cpimportacao = cpimportacao;
		this.fntipocob = fntipocob;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.eqtipomov = eqtipomov;
		this.fnplanejamento = fnplanejamento;
		this.cpordcompra = cpordcompra;
		this.vdtransp = vdtransp;
		this.codempse = codempse;
		this.codfilialse = codfilialse;
		this.serie = serie;
		this.doccompra = doccompra;
		this.dtentcompra = dtentcompra;
		this.dtemitcompra = dtemitcompra;
		this.dtcompcompra = dtcompcompra;
		this.percdesccompra = percdesccompra;
		this.percipicompra = percipicompra;
		this.vlrprodcompra = vlrprodcompra;
		this.vlrliqcompra = vlrliqcompra;
		this.vlrcompra = vlrcompra;
		this.vlrdesccompra = vlrdesccompra;
		this.vlrdescitcompra = vlrdescitcompra;
		this.vlradiccompra = vlradiccompra;
		this.vlrbaseicmscompra = vlrbaseicmscompra;
		this.vlrbaseicmsstcompra = vlrbaseicmsstcompra;
		this.vlrbaseipicompra = vlrbaseipicompra;
		this.vlrbasepiscompra = vlrbasepiscompra;
		this.vlrbasecofinscompra = vlrbasecofinscompra;
		this.vlricmscompra = vlricmscompra;
		this.vlricmsstcompra = vlricmsstcompra;
		this.vlripicompra = vlripicompra;
		this.vlrpiscompra = vlrpiscompra;
		this.vlrcofinscompra = vlrcofinscompra;
		this.vlrfunruralcompra = vlrfunruralcompra;
		this.vlrfretecompra = vlrfretecompra;
		this.vlroutrascompra = vlroutrascompra;
		this.vlrisentascompra = vlrisentascompra;
		this.impnotacompra = impnotacompra;
		this.bloqcompra = bloqcompra;
		this.emmanut = emmanut;
		this.flag = flag;
		this.adicfretecompra = adicfretecompra;
		this.tipofretecompra = tipofretecompra;
		this.observacao = observacao;
		this.obs01 = obs01;
		this.obs02 = obs02;
		this.obs03 = obs03;
		this.obs04 = obs04;
		this.adicadiccompra = adicadiccompra;
		this.qtdfretecompra = qtdfretecompra;
		this.adicfretebaseicms = adicfretebaseicms;
		this.adicadicbaseicms = adicadicbaseicms;
		this.adicipibaseicms = adicipibaseicms;
		this.chavenfecompra = chavenfecompra;
		this.statuscompra = statuscompra;
		this.nrodi = nrodi;
		this.dtregdi = dtregdi;
		this.locdesembdi = locdesembdi;
		this.siglaufdesembdi = siglaufdesembdi;
		this.codpaisdesembdi = codpaisdesembdi;
		this.dtdesembdi = dtdesembdi;
		this.identcontainer = identcontainer;
		this.calctrib = calctrib;
		this.infcompl = infcompl;
		this.numacdraw = numacdraw;
		this.tipodocimp = tipodocimp;
		this.sitdoc = sitdoc;
		this.obsnfe = obsnfe;
		this.vlrbaseiicompra = vlrbaseiicompra;
		this.vlriicompra = vlriicompra;
		this.vlricmsdiferido = vlricmsdiferido;
		this.vlricmsdevido = vlricmsdevido;
		this.vlricmscredpresum = vlricmscredpresum;
		this.obspag = obspag;
		this.vlrisscompra = vlrisscompra;
		this.nroordemcompra = nroordemcompra;
		this.vlroutrasdesp = vlroutrasdesp;
		this.cnf = cnf;
		this.chavenfevalida = chavenfevalida;
		this.motivocanccompra = motivocanccompra;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqguiatrafs = eqguiatrafs;
		this.cprateios = cprateios;
		this.ppitops = ppitops;
		this.lffretecompras = lffretecompras;
		this.fnpagars = fnpagars;
		this.cpitcompras = cpitcompras;
		this.cpfretecp = cpfretecp;
	}

	public CpcompraId getId() {
		return this.id;
	}

	public void setId(CpcompraId id) {
		this.id = id;
	}

	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	public Cpsolicitacao getCpsolicitacao() {
		return this.cpsolicitacao;
	}

	public void setCpsolicitacao(Cpsolicitacao cpsolicitacao) {
		this.cpsolicitacao = cpsolicitacao;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public Eqrecmerc getEqrecmerc() {
		return this.eqrecmerc;
	}

	public void setEqrecmerc(Eqrecmerc eqrecmerc) {
		this.eqrecmerc = eqrecmerc;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Cpimportacao getCpimportacao() {
		return this.cpimportacao;
	}

	public void setCpimportacao(Cpimportacao cpimportacao) {
		this.cpimportacao = cpimportacao;
	}

	public Fntipocob getFntipocob() {
		return this.fntipocob;
	}

	public void setFntipocob(Fntipocob fntipocob) {
		this.fntipocob = fntipocob;
	}

	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Cpordcompra getCpordcompra() {
		return this.cpordcompra;
	}

	public void setCpordcompra(Cpordcompra cpordcompra) {
		this.cpordcompra = cpordcompra;
	}

	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	public int getCodempse() {
		return this.codempse;
	}

	public void setCodempse(int codempse) {
		this.codempse = codempse;
	}

	public short getCodfilialse() {
		return this.codfilialse;
	}

	public void setCodfilialse(short codfilialse) {
		this.codfilialse = codfilialse;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getDoccompra() {
		return this.doccompra;
	}

	public void setDoccompra(int doccompra) {
		this.doccompra = doccompra;
	}

	public Date getDtentcompra() {
		return this.dtentcompra;
	}

	public void setDtentcompra(Date dtentcompra) {
		this.dtentcompra = dtentcompra;
	}

	public Date getDtemitcompra() {
		return this.dtemitcompra;
	}

	public void setDtemitcompra(Date dtemitcompra) {
		this.dtemitcompra = dtemitcompra;
	}

	public Date getDtcompcompra() {
		return this.dtcompcompra;
	}

	public void setDtcompcompra(Date dtcompcompra) {
		this.dtcompcompra = dtcompcompra;
	}

	public BigDecimal getPercdesccompra() {
		return this.percdesccompra;
	}

	public void setPercdesccompra(BigDecimal percdesccompra) {
		this.percdesccompra = percdesccompra;
	}

	public BigDecimal getPercipicompra() {
		return this.percipicompra;
	}

	public void setPercipicompra(BigDecimal percipicompra) {
		this.percipicompra = percipicompra;
	}

	public BigDecimal getVlrprodcompra() {
		return this.vlrprodcompra;
	}

	public void setVlrprodcompra(BigDecimal vlrprodcompra) {
		this.vlrprodcompra = vlrprodcompra;
	}

	public BigDecimal getVlrliqcompra() {
		return this.vlrliqcompra;
	}

	public void setVlrliqcompra(BigDecimal vlrliqcompra) {
		this.vlrliqcompra = vlrliqcompra;
	}

	public BigDecimal getVlrcompra() {
		return this.vlrcompra;
	}

	public void setVlrcompra(BigDecimal vlrcompra) {
		this.vlrcompra = vlrcompra;
	}

	public BigDecimal getVlrdesccompra() {
		return this.vlrdesccompra;
	}

	public void setVlrdesccompra(BigDecimal vlrdesccompra) {
		this.vlrdesccompra = vlrdesccompra;
	}

	public BigDecimal getVlrdescitcompra() {
		return this.vlrdescitcompra;
	}

	public void setVlrdescitcompra(BigDecimal vlrdescitcompra) {
		this.vlrdescitcompra = vlrdescitcompra;
	}

	public BigDecimal getVlradiccompra() {
		return this.vlradiccompra;
	}

	public void setVlradiccompra(BigDecimal vlradiccompra) {
		this.vlradiccompra = vlradiccompra;
	}

	public BigDecimal getVlrbaseicmscompra() {
		return this.vlrbaseicmscompra;
	}

	public void setVlrbaseicmscompra(BigDecimal vlrbaseicmscompra) {
		this.vlrbaseicmscompra = vlrbaseicmscompra;
	}

	public BigDecimal getVlrbaseicmsstcompra() {
		return this.vlrbaseicmsstcompra;
	}

	public void setVlrbaseicmsstcompra(BigDecimal vlrbaseicmsstcompra) {
		this.vlrbaseicmsstcompra = vlrbaseicmsstcompra;
	}

	public BigDecimal getVlrbaseipicompra() {
		return this.vlrbaseipicompra;
	}

	public void setVlrbaseipicompra(BigDecimal vlrbaseipicompra) {
		this.vlrbaseipicompra = vlrbaseipicompra;
	}

	public BigDecimal getVlrbasepiscompra() {
		return this.vlrbasepiscompra;
	}

	public void setVlrbasepiscompra(BigDecimal vlrbasepiscompra) {
		this.vlrbasepiscompra = vlrbasepiscompra;
	}

	public BigDecimal getVlrbasecofinscompra() {
		return this.vlrbasecofinscompra;
	}

	public void setVlrbasecofinscompra(BigDecimal vlrbasecofinscompra) {
		this.vlrbasecofinscompra = vlrbasecofinscompra;
	}

	public BigDecimal getVlricmscompra() {
		return this.vlricmscompra;
	}

	public void setVlricmscompra(BigDecimal vlricmscompra) {
		this.vlricmscompra = vlricmscompra;
	}

	public BigDecimal getVlricmsstcompra() {
		return this.vlricmsstcompra;
	}

	public void setVlricmsstcompra(BigDecimal vlricmsstcompra) {
		this.vlricmsstcompra = vlricmsstcompra;
	}

	public BigDecimal getVlripicompra() {
		return this.vlripicompra;
	}

	public void setVlripicompra(BigDecimal vlripicompra) {
		this.vlripicompra = vlripicompra;
	}

	public BigDecimal getVlrpiscompra() {
		return this.vlrpiscompra;
	}

	public void setVlrpiscompra(BigDecimal vlrpiscompra) {
		this.vlrpiscompra = vlrpiscompra;
	}

	public BigDecimal getVlrcofinscompra() {
		return this.vlrcofinscompra;
	}

	public void setVlrcofinscompra(BigDecimal vlrcofinscompra) {
		this.vlrcofinscompra = vlrcofinscompra;
	}

	public BigDecimal getVlrfunruralcompra() {
		return this.vlrfunruralcompra;
	}

	public void setVlrfunruralcompra(BigDecimal vlrfunruralcompra) {
		this.vlrfunruralcompra = vlrfunruralcompra;
	}

	public BigDecimal getVlrfretecompra() {
		return this.vlrfretecompra;
	}

	public void setVlrfretecompra(BigDecimal vlrfretecompra) {
		this.vlrfretecompra = vlrfretecompra;
	}

	public BigDecimal getVlroutrascompra() {
		return this.vlroutrascompra;
	}

	public void setVlroutrascompra(BigDecimal vlroutrascompra) {
		this.vlroutrascompra = vlroutrascompra;
	}

	public BigDecimal getVlrisentascompra() {
		return this.vlrisentascompra;
	}

	public void setVlrisentascompra(BigDecimal vlrisentascompra) {
		this.vlrisentascompra = vlrisentascompra;
	}

	public char getImpnotacompra() {
		return this.impnotacompra;
	}

	public void setImpnotacompra(char impnotacompra) {
		this.impnotacompra = impnotacompra;
	}

	public char getBloqcompra() {
		return this.bloqcompra;
	}

	public void setBloqcompra(char bloqcompra) {
		this.bloqcompra = bloqcompra;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	public char getAdicfretecompra() {
		return this.adicfretecompra;
	}

	public void setAdicfretecompra(char adicfretecompra) {
		this.adicfretecompra = adicfretecompra;
	}

	public Character getTipofretecompra() {
		return this.tipofretecompra;
	}

	public void setTipofretecompra(Character tipofretecompra) {
		this.tipofretecompra = tipofretecompra;
	}

	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getObs01() {
		return this.obs01;
	}

	public void setObs01(String obs01) {
		this.obs01 = obs01;
	}

	public String getObs02() {
		return this.obs02;
	}

	public void setObs02(String obs02) {
		this.obs02 = obs02;
	}

	public String getObs03() {
		return this.obs03;
	}

	public void setObs03(String obs03) {
		this.obs03 = obs03;
	}

	public String getObs04() {
		return this.obs04;
	}

	public void setObs04(String obs04) {
		this.obs04 = obs04;
	}

	public char getAdicadiccompra() {
		return this.adicadiccompra;
	}

	public void setAdicadiccompra(char adicadiccompra) {
		this.adicadiccompra = adicadiccompra;
	}

	public BigDecimal getQtdfretecompra() {
		return this.qtdfretecompra;
	}

	public void setQtdfretecompra(BigDecimal qtdfretecompra) {
		this.qtdfretecompra = qtdfretecompra;
	}

	public Character getAdicfretebaseicms() {
		return this.adicfretebaseicms;
	}

	public void setAdicfretebaseicms(Character adicfretebaseicms) {
		this.adicfretebaseicms = adicfretebaseicms;
	}

	public Character getAdicadicbaseicms() {
		return this.adicadicbaseicms;
	}

	public void setAdicadicbaseicms(Character adicadicbaseicms) {
		this.adicadicbaseicms = adicadicbaseicms;
	}

	public Character getAdicipibaseicms() {
		return this.adicipibaseicms;
	}

	public void setAdicipibaseicms(Character adicipibaseicms) {
		this.adicipibaseicms = adicipibaseicms;
	}

	public String getChavenfecompra() {
		return this.chavenfecompra;
	}

	public void setChavenfecompra(String chavenfecompra) {
		this.chavenfecompra = chavenfecompra;
	}

	public String getStatuscompra() {
		return this.statuscompra;
	}

	public void setStatuscompra(String statuscompra) {
		this.statuscompra = statuscompra;
	}

	public String getNrodi() {
		return this.nrodi;
	}

	public void setNrodi(String nrodi) {
		this.nrodi = nrodi;
	}

	public Date getDtregdi() {
		return this.dtregdi;
	}

	public void setDtregdi(Date dtregdi) {
		this.dtregdi = dtregdi;
	}

	public String getLocdesembdi() {
		return this.locdesembdi;
	}

	public void setLocdesembdi(String locdesembdi) {
		this.locdesembdi = locdesembdi;
	}

	public String getSiglaufdesembdi() {
		return this.siglaufdesembdi;
	}

	public void setSiglaufdesembdi(String siglaufdesembdi) {
		this.siglaufdesembdi = siglaufdesembdi;
	}

	public Integer getCodpaisdesembdi() {
		return this.codpaisdesembdi;
	}

	public void setCodpaisdesembdi(Integer codpaisdesembdi) {
		this.codpaisdesembdi = codpaisdesembdi;
	}

	public Date getDtdesembdi() {
		return this.dtdesembdi;
	}

	public void setDtdesembdi(Date dtdesembdi) {
		this.dtdesembdi = dtdesembdi;
	}

	public String getIdentcontainer() {
		return this.identcontainer;
	}

	public void setIdentcontainer(String identcontainer) {
		this.identcontainer = identcontainer;
	}

	public char getCalctrib() {
		return this.calctrib;
	}

	public void setCalctrib(char calctrib) {
		this.calctrib = calctrib;
	}

	public String getInfcompl() {
		return this.infcompl;
	}

	public void setInfcompl(String infcompl) {
		this.infcompl = infcompl;
	}

	public String getNumacdraw() {
		return this.numacdraw;
	}

	public void setNumacdraw(String numacdraw) {
		this.numacdraw = numacdraw;
	}

	public Character getTipodocimp() {
		return this.tipodocimp;
	}

	public void setTipodocimp(Character tipodocimp) {
		this.tipodocimp = tipodocimp;
	}

	public String getSitdoc() {
		return this.sitdoc;
	}

	public void setSitdoc(String sitdoc) {
		this.sitdoc = sitdoc;
	}

	public String getObsnfe() {
		return this.obsnfe;
	}

	public void setObsnfe(String obsnfe) {
		this.obsnfe = obsnfe;
	}

	public BigDecimal getVlrbaseiicompra() {
		return this.vlrbaseiicompra;
	}

	public void setVlrbaseiicompra(BigDecimal vlrbaseiicompra) {
		this.vlrbaseiicompra = vlrbaseiicompra;
	}

	public BigDecimal getVlriicompra() {
		return this.vlriicompra;
	}

	public void setVlriicompra(BigDecimal vlriicompra) {
		this.vlriicompra = vlriicompra;
	}

	public BigDecimal getVlricmsdiferido() {
		return this.vlricmsdiferido;
	}

	public void setVlricmsdiferido(BigDecimal vlricmsdiferido) {
		this.vlricmsdiferido = vlricmsdiferido;
	}

	public BigDecimal getVlricmsdevido() {
		return this.vlricmsdevido;
	}

	public void setVlricmsdevido(BigDecimal vlricmsdevido) {
		this.vlricmsdevido = vlricmsdevido;
	}

	public BigDecimal getVlricmscredpresum() {
		return this.vlricmscredpresum;
	}

	public void setVlricmscredpresum(BigDecimal vlricmscredpresum) {
		this.vlricmscredpresum = vlricmscredpresum;
	}

	public String getObspag() {
		return this.obspag;
	}

	public void setObspag(String obspag) {
		this.obspag = obspag;
	}

	public BigDecimal getVlrisscompra() {
		return this.vlrisscompra;
	}

	public void setVlrisscompra(BigDecimal vlrisscompra) {
		this.vlrisscompra = vlrisscompra;
	}

	public String getNroordemcompra() {
		return this.nroordemcompra;
	}

	public void setNroordemcompra(String nroordemcompra) {
		this.nroordemcompra = nroordemcompra;
	}

	public BigDecimal getVlroutrasdesp() {
		return this.vlroutrasdesp;
	}

	public void setVlroutrasdesp(BigDecimal vlroutrasdesp) {
		this.vlroutrasdesp = vlroutrasdesp;
	}

	public Long getCnf() {
		return this.cnf;
	}

	public void setCnf(Long cnf) {
		this.cnf = cnf;
	}

	public String getChavenfevalida() {
		return this.chavenfevalida;
	}

	public void setChavenfevalida(String chavenfevalida) {
		this.chavenfevalida = chavenfevalida;
	}

	public String getMotivocanccompra() {
		return this.motivocanccompra;
	}

	public void setMotivocanccompra(String motivocanccompra) {
		this.motivocanccompra = motivocanccompra;
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

	public Set getEqguiatrafs() {
		return this.eqguiatrafs;
	}

	public void setEqguiatrafs(Set eqguiatrafs) {
		this.eqguiatrafs = eqguiatrafs;
	}

	public Set getCprateios() {
		return this.cprateios;
	}

	public void setCprateios(Set cprateios) {
		this.cprateios = cprateios;
	}

	public Set getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set ppitops) {
		this.ppitops = ppitops;
	}

	public Set getLffretecompras() {
		return this.lffretecompras;
	}

	public void setLffretecompras(Set lffretecompras) {
		this.lffretecompras = lffretecompras;
	}

	public Set getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set fnpagars) {
		this.fnpagars = fnpagars;
	}

	public Set getCpitcompras() {
		return this.cpitcompras;
	}

	public void setCpitcompras(Set cpitcompras) {
		this.cpitcompras = cpitcompras;
	}

	public Cpfretecp getCpfretecp() {
		return this.cpfretecp;
	}

	public void setCpfretecp(Cpfretecp cpfretecp) {
		this.cpfretecp = cpfretecp;
	}

}
