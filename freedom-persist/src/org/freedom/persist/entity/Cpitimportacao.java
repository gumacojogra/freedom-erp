package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Cpitimportacao generated by hbm2java
 */
public class Cpitimportacao implements java.io.Serializable {

	private CpitimportacaoId id;
	private Eqproduto eqproduto;
	private Lfitclfiscal lfitclfiscal;
	private Cpimportacao cpimportacao;
	private Lfncm lfncm;
	private Equnidade equnidade;
	private String refprod;
	private BigDecimal qtd;
	private BigDecimal pesoliquido;
	private BigDecimal pesobruto;
	private BigDecimal precomi;
	private BigDecimal preco;
	private BigDecimal vmlemi;
	private BigDecimal vmldmi;
	private BigDecimal vmle;
	private BigDecimal vmld;
	private BigDecimal vlrfretemi;
	private BigDecimal vlrfrete;
	private BigDecimal vlrseguromi;
	private BigDecimal vlrseguro;
	private BigDecimal vlrthcmi;
	private BigDecimal vlrthc;
	private BigDecimal vlradmi;
	private BigDecimal vlrad;
	private BigDecimal aliqicmsimp;
	private BigDecimal aliqicmsuf;
	private BigDecimal percdifericms;
	private BigDecimal perccredpresimp;
	private BigDecimal aliqipi;
	private BigDecimal aliqpis;
	private BigDecimal aliqcofins;
	private BigDecimal aliqii;
	private BigDecimal vlrii;
	private BigDecimal vlripi;
	private BigDecimal vlrpis;
	private BigDecimal vlrcofins;
	private BigDecimal vlrbaseicms;
	private BigDecimal vlricms;
	private BigDecimal vlricmsdiferido;
	private BigDecimal vlricmsdevido;
	private BigDecimal vlricmscredpresum;
	private BigDecimal vlricmsrecolhimento;
	private BigDecimal vlritdespad;
	private BigDecimal vlrtxsiscomex;
	private BigDecimal vlrvmcv;
	private BigDecimal vlrcompl;
	private Short seqadic;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cpitimportacao() {
	}

	public Cpitimportacao(CpitimportacaoId id, Eqproduto eqproduto,
			Cpimportacao cpimportacao, Equnidade equnidade, String refprod,
			BigDecimal qtd, BigDecimal pesoliquido, BigDecimal pesobruto,
			BigDecimal precomi, BigDecimal preco, BigDecimal vmlemi,
			BigDecimal vmldmi, BigDecimal vmle, BigDecimal vmld,
			BigDecimal vlrfretemi, BigDecimal vlrfrete, BigDecimal vlrseguromi,
			BigDecimal vlrseguro, BigDecimal vlrthcmi, BigDecimal vlrthc,
			BigDecimal vlradmi, BigDecimal vlrad, BigDecimal aliqicmsimp,
			BigDecimal aliqicmsuf, BigDecimal percdifericms,
			BigDecimal perccredpresimp, BigDecimal aliqipi, BigDecimal aliqpis,
			BigDecimal aliqcofins, BigDecimal aliqii, BigDecimal vlrii,
			BigDecimal vlripi, BigDecimal vlrpis, BigDecimal vlrcofins,
			BigDecimal vlrbaseicms, BigDecimal vlricms,
			BigDecimal vlricmsdiferido, BigDecimal vlricmsdevido,
			BigDecimal vlricmscredpresum, BigDecimal vlricmsrecolhimento,
			BigDecimal vlritdespad, BigDecimal vlrtxsiscomex,
			BigDecimal vlrvmcv, BigDecimal vlrcompl, char emmanut, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.cpimportacao = cpimportacao;
		this.equnidade = equnidade;
		this.refprod = refprod;
		this.qtd = qtd;
		this.pesoliquido = pesoliquido;
		this.pesobruto = pesobruto;
		this.precomi = precomi;
		this.preco = preco;
		this.vmlemi = vmlemi;
		this.vmldmi = vmldmi;
		this.vmle = vmle;
		this.vmld = vmld;
		this.vlrfretemi = vlrfretemi;
		this.vlrfrete = vlrfrete;
		this.vlrseguromi = vlrseguromi;
		this.vlrseguro = vlrseguro;
		this.vlrthcmi = vlrthcmi;
		this.vlrthc = vlrthc;
		this.vlradmi = vlradmi;
		this.vlrad = vlrad;
		this.aliqicmsimp = aliqicmsimp;
		this.aliqicmsuf = aliqicmsuf;
		this.percdifericms = percdifericms;
		this.perccredpresimp = perccredpresimp;
		this.aliqipi = aliqipi;
		this.aliqpis = aliqpis;
		this.aliqcofins = aliqcofins;
		this.aliqii = aliqii;
		this.vlrii = vlrii;
		this.vlripi = vlripi;
		this.vlrpis = vlrpis;
		this.vlrcofins = vlrcofins;
		this.vlrbaseicms = vlrbaseicms;
		this.vlricms = vlricms;
		this.vlricmsdiferido = vlricmsdiferido;
		this.vlricmsdevido = vlricmsdevido;
		this.vlricmscredpresum = vlricmscredpresum;
		this.vlricmsrecolhimento = vlricmsrecolhimento;
		this.vlritdespad = vlritdespad;
		this.vlrtxsiscomex = vlrtxsiscomex;
		this.vlrvmcv = vlrvmcv;
		this.vlrcompl = vlrcompl;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpitimportacao(CpitimportacaoId id, Eqproduto eqproduto,
			Lfitclfiscal lfitclfiscal, Cpimportacao cpimportacao, Lfncm lfncm,
			Equnidade equnidade, String refprod, BigDecimal qtd,
			BigDecimal pesoliquido, BigDecimal pesobruto, BigDecimal precomi,
			BigDecimal preco, BigDecimal vmlemi, BigDecimal vmldmi,
			BigDecimal vmle, BigDecimal vmld, BigDecimal vlrfretemi,
			BigDecimal vlrfrete, BigDecimal vlrseguromi, BigDecimal vlrseguro,
			BigDecimal vlrthcmi, BigDecimal vlrthc, BigDecimal vlradmi,
			BigDecimal vlrad, BigDecimal aliqicmsimp, BigDecimal aliqicmsuf,
			BigDecimal percdifericms, BigDecimal perccredpresimp,
			BigDecimal aliqipi, BigDecimal aliqpis, BigDecimal aliqcofins,
			BigDecimal aliqii, BigDecimal vlrii, BigDecimal vlripi,
			BigDecimal vlrpis, BigDecimal vlrcofins, BigDecimal vlrbaseicms,
			BigDecimal vlricms, BigDecimal vlricmsdiferido,
			BigDecimal vlricmsdevido, BigDecimal vlricmscredpresum,
			BigDecimal vlricmsrecolhimento, BigDecimal vlritdespad,
			BigDecimal vlrtxsiscomex, BigDecimal vlrvmcv, BigDecimal vlrcompl,
			Short seqadic, char emmanut, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.lfitclfiscal = lfitclfiscal;
		this.cpimportacao = cpimportacao;
		this.lfncm = lfncm;
		this.equnidade = equnidade;
		this.refprod = refprod;
		this.qtd = qtd;
		this.pesoliquido = pesoliquido;
		this.pesobruto = pesobruto;
		this.precomi = precomi;
		this.preco = preco;
		this.vmlemi = vmlemi;
		this.vmldmi = vmldmi;
		this.vmle = vmle;
		this.vmld = vmld;
		this.vlrfretemi = vlrfretemi;
		this.vlrfrete = vlrfrete;
		this.vlrseguromi = vlrseguromi;
		this.vlrseguro = vlrseguro;
		this.vlrthcmi = vlrthcmi;
		this.vlrthc = vlrthc;
		this.vlradmi = vlradmi;
		this.vlrad = vlrad;
		this.aliqicmsimp = aliqicmsimp;
		this.aliqicmsuf = aliqicmsuf;
		this.percdifericms = percdifericms;
		this.perccredpresimp = perccredpresimp;
		this.aliqipi = aliqipi;
		this.aliqpis = aliqpis;
		this.aliqcofins = aliqcofins;
		this.aliqii = aliqii;
		this.vlrii = vlrii;
		this.vlripi = vlripi;
		this.vlrpis = vlrpis;
		this.vlrcofins = vlrcofins;
		this.vlrbaseicms = vlrbaseicms;
		this.vlricms = vlricms;
		this.vlricmsdiferido = vlricmsdiferido;
		this.vlricmsdevido = vlricmsdevido;
		this.vlricmscredpresum = vlricmscredpresum;
		this.vlricmsrecolhimento = vlricmsrecolhimento;
		this.vlritdespad = vlritdespad;
		this.vlrtxsiscomex = vlrtxsiscomex;
		this.vlrvmcv = vlrvmcv;
		this.vlrcompl = vlrcompl;
		this.seqadic = seqadic;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public CpitimportacaoId getId() {
		return this.id;
	}

	public void setId(CpitimportacaoId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Lfitclfiscal getLfitclfiscal() {
		return this.lfitclfiscal;
	}

	public void setLfitclfiscal(Lfitclfiscal lfitclfiscal) {
		this.lfitclfiscal = lfitclfiscal;
	}

	public Cpimportacao getCpimportacao() {
		return this.cpimportacao;
	}

	public void setCpimportacao(Cpimportacao cpimportacao) {
		this.cpimportacao = cpimportacao;
	}

	public Lfncm getLfncm() {
		return this.lfncm;
	}

	public void setLfncm(Lfncm lfncm) {
		this.lfncm = lfncm;
	}

	public Equnidade getEqunidade() {
		return this.equnidade;
	}

	public void setEqunidade(Equnidade equnidade) {
		this.equnidade = equnidade;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public BigDecimal getQtd() {
		return this.qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

	public BigDecimal getPesoliquido() {
		return this.pesoliquido;
	}

	public void setPesoliquido(BigDecimal pesoliquido) {
		this.pesoliquido = pesoliquido;
	}

	public BigDecimal getPesobruto() {
		return this.pesobruto;
	}

	public void setPesobruto(BigDecimal pesobruto) {
		this.pesobruto = pesobruto;
	}

	public BigDecimal getPrecomi() {
		return this.precomi;
	}

	public void setPrecomi(BigDecimal precomi) {
		this.precomi = precomi;
	}

	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public BigDecimal getVmlemi() {
		return this.vmlemi;
	}

	public void setVmlemi(BigDecimal vmlemi) {
		this.vmlemi = vmlemi;
	}

	public BigDecimal getVmldmi() {
		return this.vmldmi;
	}

	public void setVmldmi(BigDecimal vmldmi) {
		this.vmldmi = vmldmi;
	}

	public BigDecimal getVmle() {
		return this.vmle;
	}

	public void setVmle(BigDecimal vmle) {
		this.vmle = vmle;
	}

	public BigDecimal getVmld() {
		return this.vmld;
	}

	public void setVmld(BigDecimal vmld) {
		this.vmld = vmld;
	}

	public BigDecimal getVlrfretemi() {
		return this.vlrfretemi;
	}

	public void setVlrfretemi(BigDecimal vlrfretemi) {
		this.vlrfretemi = vlrfretemi;
	}

	public BigDecimal getVlrfrete() {
		return this.vlrfrete;
	}

	public void setVlrfrete(BigDecimal vlrfrete) {
		this.vlrfrete = vlrfrete;
	}

	public BigDecimal getVlrseguromi() {
		return this.vlrseguromi;
	}

	public void setVlrseguromi(BigDecimal vlrseguromi) {
		this.vlrseguromi = vlrseguromi;
	}

	public BigDecimal getVlrseguro() {
		return this.vlrseguro;
	}

	public void setVlrseguro(BigDecimal vlrseguro) {
		this.vlrseguro = vlrseguro;
	}

	public BigDecimal getVlrthcmi() {
		return this.vlrthcmi;
	}

	public void setVlrthcmi(BigDecimal vlrthcmi) {
		this.vlrthcmi = vlrthcmi;
	}

	public BigDecimal getVlrthc() {
		return this.vlrthc;
	}

	public void setVlrthc(BigDecimal vlrthc) {
		this.vlrthc = vlrthc;
	}

	public BigDecimal getVlradmi() {
		return this.vlradmi;
	}

	public void setVlradmi(BigDecimal vlradmi) {
		this.vlradmi = vlradmi;
	}

	public BigDecimal getVlrad() {
		return this.vlrad;
	}

	public void setVlrad(BigDecimal vlrad) {
		this.vlrad = vlrad;
	}

	public BigDecimal getAliqicmsimp() {
		return this.aliqicmsimp;
	}

	public void setAliqicmsimp(BigDecimal aliqicmsimp) {
		this.aliqicmsimp = aliqicmsimp;
	}

	public BigDecimal getAliqicmsuf() {
		return this.aliqicmsuf;
	}

	public void setAliqicmsuf(BigDecimal aliqicmsuf) {
		this.aliqicmsuf = aliqicmsuf;
	}

	public BigDecimal getPercdifericms() {
		return this.percdifericms;
	}

	public void setPercdifericms(BigDecimal percdifericms) {
		this.percdifericms = percdifericms;
	}

	public BigDecimal getPerccredpresimp() {
		return this.perccredpresimp;
	}

	public void setPerccredpresimp(BigDecimal perccredpresimp) {
		this.perccredpresimp = perccredpresimp;
	}

	public BigDecimal getAliqipi() {
		return this.aliqipi;
	}

	public void setAliqipi(BigDecimal aliqipi) {
		this.aliqipi = aliqipi;
	}

	public BigDecimal getAliqpis() {
		return this.aliqpis;
	}

	public void setAliqpis(BigDecimal aliqpis) {
		this.aliqpis = aliqpis;
	}

	public BigDecimal getAliqcofins() {
		return this.aliqcofins;
	}

	public void setAliqcofins(BigDecimal aliqcofins) {
		this.aliqcofins = aliqcofins;
	}

	public BigDecimal getAliqii() {
		return this.aliqii;
	}

	public void setAliqii(BigDecimal aliqii) {
		this.aliqii = aliqii;
	}

	public BigDecimal getVlrii() {
		return this.vlrii;
	}

	public void setVlrii(BigDecimal vlrii) {
		this.vlrii = vlrii;
	}

	public BigDecimal getVlripi() {
		return this.vlripi;
	}

	public void setVlripi(BigDecimal vlripi) {
		this.vlripi = vlripi;
	}

	public BigDecimal getVlrpis() {
		return this.vlrpis;
	}

	public void setVlrpis(BigDecimal vlrpis) {
		this.vlrpis = vlrpis;
	}

	public BigDecimal getVlrcofins() {
		return this.vlrcofins;
	}

	public void setVlrcofins(BigDecimal vlrcofins) {
		this.vlrcofins = vlrcofins;
	}

	public BigDecimal getVlrbaseicms() {
		return this.vlrbaseicms;
	}

	public void setVlrbaseicms(BigDecimal vlrbaseicms) {
		this.vlrbaseicms = vlrbaseicms;
	}

	public BigDecimal getVlricms() {
		return this.vlricms;
	}

	public void setVlricms(BigDecimal vlricms) {
		this.vlricms = vlricms;
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

	public BigDecimal getVlricmsrecolhimento() {
		return this.vlricmsrecolhimento;
	}

	public void setVlricmsrecolhimento(BigDecimal vlricmsrecolhimento) {
		this.vlricmsrecolhimento = vlricmsrecolhimento;
	}

	public BigDecimal getVlritdespad() {
		return this.vlritdespad;
	}

	public void setVlritdespad(BigDecimal vlritdespad) {
		this.vlritdespad = vlritdespad;
	}

	public BigDecimal getVlrtxsiscomex() {
		return this.vlrtxsiscomex;
	}

	public void setVlrtxsiscomex(BigDecimal vlrtxsiscomex) {
		this.vlrtxsiscomex = vlrtxsiscomex;
	}

	public BigDecimal getVlrvmcv() {
		return this.vlrvmcv;
	}

	public void setVlrvmcv(BigDecimal vlrvmcv) {
		this.vlrvmcv = vlrvmcv;
	}

	public BigDecimal getVlrcompl() {
		return this.vlrcompl;
	}

	public void setVlrcompl(BigDecimal vlrcompl) {
		this.vlrcompl = vlrcompl;
	}

	public Short getSeqadic() {
		return this.seqadic;
	}

	public void setSeqadic(Short seqadic) {
		this.seqadic = seqadic;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
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

}
