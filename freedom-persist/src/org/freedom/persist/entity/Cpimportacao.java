package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cpimportacao generated by hbm2java
 */
public class Cpimportacao implements java.io.Serializable {

	private CpimportacaoId id;
	private Cpforneced cpforneced;
	private Fnplanopag fnplanopag;
	private Cpimportacao cpimportacao;
	private Fnmoeda fnmoeda;
	private BigDecimal cotacaomoeda;
	private char tipoimp;
	private String invoice;
	private String di;
	private String manifesto;
	private String certorigem;
	private String lacre;
	private String prescarga;
	private String identhouse;
	private String dta;
	private String conheccarga;
	private String identcontainer;
	private String tipomanifesto;
	private Date dtimp;
	private Date dtemb;
	private Date dtchegada;
	private Date dtdesembdi;
	private Date dtregdi;
	private String localemb;
	private String recintoaduaneiro;
	private Integer codpaisdesembdi;
	private String siglaufdesembdi;
	private String locdesembdi;
	private String obs;
	private String veiculo;
	private BigDecimal pesobruto;
	private BigDecimal pesoliquido;
	private BigDecimal vlrfretemi;
	private BigDecimal vlrfrete;
	private BigDecimal vmlemi;
	private BigDecimal vmldmi;
	private BigDecimal vmle;
	private BigDecimal vmld;
	private BigDecimal vlrseguromi;
	private BigDecimal vlrseguro;
	private BigDecimal vlrii;
	private BigDecimal vlripi;
	private BigDecimal vlrpis;
	private BigDecimal vlrcofins;
	private BigDecimal vlrdireitosad;
	private BigDecimal vlrthc;
	private BigDecimal vlrthcmi;
	private BigDecimal vlrtxsiscomex;
	private BigDecimal vlrad;
	private BigDecimal vlradmi;
	private BigDecimal vlrbaseicms;
	private BigDecimal vlricms;
	private BigDecimal vlricmsdiferido;
	private BigDecimal vlricmsdevido;
	private BigDecimal vlricmscredpresum;
	private BigDecimal vlricmsrecolhimento;
	private BigDecimal vlrdespad;
	private BigDecimal vlrcompl;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set cpitimportacaos = new HashSet(0);
	private Set cpimportacaocompls = new HashSet(0);
	private Set cpimportacaoadics = new HashSet(0);
	private Set cpimportacaos = new HashSet(0);
	private Set cpcompras = new HashSet(0);

	public Cpimportacao() {
	}

	public Cpimportacao(CpimportacaoId id, Cpforneced cpforneced,
			Fnplanopag fnplanopag, Fnmoeda fnmoeda, BigDecimal cotacaomoeda,
			char tipoimp, Date dtimp, BigDecimal pesobruto,
			BigDecimal pesoliquido, BigDecimal vlrfretemi, BigDecimal vlrfrete,
			BigDecimal vmlemi, BigDecimal vmldmi, BigDecimal vmle,
			BigDecimal vmld, BigDecimal vlrseguromi, BigDecimal vlrseguro,
			BigDecimal vlrii, BigDecimal vlripi, BigDecimal vlrpis,
			BigDecimal vlrcofins, BigDecimal vlrdireitosad, BigDecimal vlrthc,
			BigDecimal vlrthcmi, BigDecimal vlrtxsiscomex, BigDecimal vlrad,
			BigDecimal vlradmi, BigDecimal vlrbaseicms, BigDecimal vlricms,
			BigDecimal vlricmsdiferido, BigDecimal vlricmsdevido,
			BigDecimal vlricmscredpresum, BigDecimal vlricmsrecolhimento,
			BigDecimal vlrdespad, BigDecimal vlrcompl, char emmanut,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.fnmoeda = fnmoeda;
		this.cotacaomoeda = cotacaomoeda;
		this.tipoimp = tipoimp;
		this.dtimp = dtimp;
		this.pesobruto = pesobruto;
		this.pesoliquido = pesoliquido;
		this.vlrfretemi = vlrfretemi;
		this.vlrfrete = vlrfrete;
		this.vmlemi = vmlemi;
		this.vmldmi = vmldmi;
		this.vmle = vmle;
		this.vmld = vmld;
		this.vlrseguromi = vlrseguromi;
		this.vlrseguro = vlrseguro;
		this.vlrii = vlrii;
		this.vlripi = vlripi;
		this.vlrpis = vlrpis;
		this.vlrcofins = vlrcofins;
		this.vlrdireitosad = vlrdireitosad;
		this.vlrthc = vlrthc;
		this.vlrthcmi = vlrthcmi;
		this.vlrtxsiscomex = vlrtxsiscomex;
		this.vlrad = vlrad;
		this.vlradmi = vlradmi;
		this.vlrbaseicms = vlrbaseicms;
		this.vlricms = vlricms;
		this.vlricmsdiferido = vlricmsdiferido;
		this.vlricmsdevido = vlricmsdevido;
		this.vlricmscredpresum = vlricmscredpresum;
		this.vlricmsrecolhimento = vlricmsrecolhimento;
		this.vlrdespad = vlrdespad;
		this.vlrcompl = vlrcompl;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpimportacao(CpimportacaoId id, Cpforneced cpforneced,
			Fnplanopag fnplanopag, Cpimportacao cpimportacao, Fnmoeda fnmoeda,
			BigDecimal cotacaomoeda, char tipoimp, String invoice, String di,
			String manifesto, String certorigem, String lacre,
			String prescarga, String identhouse, String dta,
			String conheccarga, String identcontainer, String tipomanifesto,
			Date dtimp, Date dtemb, Date dtchegada, Date dtdesembdi,
			Date dtregdi, String localemb, String recintoaduaneiro,
			Integer codpaisdesembdi, String siglaufdesembdi,
			String locdesembdi, String obs, String veiculo,
			BigDecimal pesobruto, BigDecimal pesoliquido,
			BigDecimal vlrfretemi, BigDecimal vlrfrete, BigDecimal vmlemi,
			BigDecimal vmldmi, BigDecimal vmle, BigDecimal vmld,
			BigDecimal vlrseguromi, BigDecimal vlrseguro, BigDecimal vlrii,
			BigDecimal vlripi, BigDecimal vlrpis, BigDecimal vlrcofins,
			BigDecimal vlrdireitosad, BigDecimal vlrthc, BigDecimal vlrthcmi,
			BigDecimal vlrtxsiscomex, BigDecimal vlrad, BigDecimal vlradmi,
			BigDecimal vlrbaseicms, BigDecimal vlricms,
			BigDecimal vlricmsdiferido, BigDecimal vlricmsdevido,
			BigDecimal vlricmscredpresum, BigDecimal vlricmsrecolhimento,
			BigDecimal vlrdespad, BigDecimal vlrcompl, char emmanut,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set cpitimportacaos, Set cpimportacaocompls,
			Set cpimportacaoadics, Set cpimportacaos, Set cpcompras) {
		this.id = id;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.cpimportacao = cpimportacao;
		this.fnmoeda = fnmoeda;
		this.cotacaomoeda = cotacaomoeda;
		this.tipoimp = tipoimp;
		this.invoice = invoice;
		this.di = di;
		this.manifesto = manifesto;
		this.certorigem = certorigem;
		this.lacre = lacre;
		this.prescarga = prescarga;
		this.identhouse = identhouse;
		this.dta = dta;
		this.conheccarga = conheccarga;
		this.identcontainer = identcontainer;
		this.tipomanifesto = tipomanifesto;
		this.dtimp = dtimp;
		this.dtemb = dtemb;
		this.dtchegada = dtchegada;
		this.dtdesembdi = dtdesembdi;
		this.dtregdi = dtregdi;
		this.localemb = localemb;
		this.recintoaduaneiro = recintoaduaneiro;
		this.codpaisdesembdi = codpaisdesembdi;
		this.siglaufdesembdi = siglaufdesembdi;
		this.locdesembdi = locdesembdi;
		this.obs = obs;
		this.veiculo = veiculo;
		this.pesobruto = pesobruto;
		this.pesoliquido = pesoliquido;
		this.vlrfretemi = vlrfretemi;
		this.vlrfrete = vlrfrete;
		this.vmlemi = vmlemi;
		this.vmldmi = vmldmi;
		this.vmle = vmle;
		this.vmld = vmld;
		this.vlrseguromi = vlrseguromi;
		this.vlrseguro = vlrseguro;
		this.vlrii = vlrii;
		this.vlripi = vlripi;
		this.vlrpis = vlrpis;
		this.vlrcofins = vlrcofins;
		this.vlrdireitosad = vlrdireitosad;
		this.vlrthc = vlrthc;
		this.vlrthcmi = vlrthcmi;
		this.vlrtxsiscomex = vlrtxsiscomex;
		this.vlrad = vlrad;
		this.vlradmi = vlradmi;
		this.vlrbaseicms = vlrbaseicms;
		this.vlricms = vlricms;
		this.vlricmsdiferido = vlricmsdiferido;
		this.vlricmsdevido = vlricmsdevido;
		this.vlricmscredpresum = vlricmscredpresum;
		this.vlricmsrecolhimento = vlricmsrecolhimento;
		this.vlrdespad = vlrdespad;
		this.vlrcompl = vlrcompl;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpitimportacaos = cpitimportacaos;
		this.cpimportacaocompls = cpimportacaocompls;
		this.cpimportacaoadics = cpimportacaoadics;
		this.cpimportacaos = cpimportacaos;
		this.cpcompras = cpcompras;
	}

	public CpimportacaoId getId() {
		return this.id;
	}

	public void setId(CpimportacaoId id) {
		this.id = id;
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

	public Cpimportacao getCpimportacao() {
		return this.cpimportacao;
	}

	public void setCpimportacao(Cpimportacao cpimportacao) {
		this.cpimportacao = cpimportacao;
	}

	public Fnmoeda getFnmoeda() {
		return this.fnmoeda;
	}

	public void setFnmoeda(Fnmoeda fnmoeda) {
		this.fnmoeda = fnmoeda;
	}

	public BigDecimal getCotacaomoeda() {
		return this.cotacaomoeda;
	}

	public void setCotacaomoeda(BigDecimal cotacaomoeda) {
		this.cotacaomoeda = cotacaomoeda;
	}

	public char getTipoimp() {
		return this.tipoimp;
	}

	public void setTipoimp(char tipoimp) {
		this.tipoimp = tipoimp;
	}

	public String getInvoice() {
		return this.invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getDi() {
		return this.di;
	}

	public void setDi(String di) {
		this.di = di;
	}

	public String getManifesto() {
		return this.manifesto;
	}

	public void setManifesto(String manifesto) {
		this.manifesto = manifesto;
	}

	public String getCertorigem() {
		return this.certorigem;
	}

	public void setCertorigem(String certorigem) {
		this.certorigem = certorigem;
	}

	public String getLacre() {
		return this.lacre;
	}

	public void setLacre(String lacre) {
		this.lacre = lacre;
	}

	public String getPrescarga() {
		return this.prescarga;
	}

	public void setPrescarga(String prescarga) {
		this.prescarga = prescarga;
	}

	public String getIdenthouse() {
		return this.identhouse;
	}

	public void setIdenthouse(String identhouse) {
		this.identhouse = identhouse;
	}

	public String getDta() {
		return this.dta;
	}

	public void setDta(String dta) {
		this.dta = dta;
	}

	public String getConheccarga() {
		return this.conheccarga;
	}

	public void setConheccarga(String conheccarga) {
		this.conheccarga = conheccarga;
	}

	public String getIdentcontainer() {
		return this.identcontainer;
	}

	public void setIdentcontainer(String identcontainer) {
		this.identcontainer = identcontainer;
	}

	public String getTipomanifesto() {
		return this.tipomanifesto;
	}

	public void setTipomanifesto(String tipomanifesto) {
		this.tipomanifesto = tipomanifesto;
	}

	public Date getDtimp() {
		return this.dtimp;
	}

	public void setDtimp(Date dtimp) {
		this.dtimp = dtimp;
	}

	public Date getDtemb() {
		return this.dtemb;
	}

	public void setDtemb(Date dtemb) {
		this.dtemb = dtemb;
	}

	public Date getDtchegada() {
		return this.dtchegada;
	}

	public void setDtchegada(Date dtchegada) {
		this.dtchegada = dtchegada;
	}

	public Date getDtdesembdi() {
		return this.dtdesembdi;
	}

	public void setDtdesembdi(Date dtdesembdi) {
		this.dtdesembdi = dtdesembdi;
	}

	public Date getDtregdi() {
		return this.dtregdi;
	}

	public void setDtregdi(Date dtregdi) {
		this.dtregdi = dtregdi;
	}

	public String getLocalemb() {
		return this.localemb;
	}

	public void setLocalemb(String localemb) {
		this.localemb = localemb;
	}

	public String getRecintoaduaneiro() {
		return this.recintoaduaneiro;
	}

	public void setRecintoaduaneiro(String recintoaduaneiro) {
		this.recintoaduaneiro = recintoaduaneiro;
	}

	public Integer getCodpaisdesembdi() {
		return this.codpaisdesembdi;
	}

	public void setCodpaisdesembdi(Integer codpaisdesembdi) {
		this.codpaisdesembdi = codpaisdesembdi;
	}

	public String getSiglaufdesembdi() {
		return this.siglaufdesembdi;
	}

	public void setSiglaufdesembdi(String siglaufdesembdi) {
		this.siglaufdesembdi = siglaufdesembdi;
	}

	public String getLocdesembdi() {
		return this.locdesembdi;
	}

	public void setLocdesembdi(String locdesembdi) {
		this.locdesembdi = locdesembdi;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getVeiculo() {
		return this.veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public BigDecimal getPesobruto() {
		return this.pesobruto;
	}

	public void setPesobruto(BigDecimal pesobruto) {
		this.pesobruto = pesobruto;
	}

	public BigDecimal getPesoliquido() {
		return this.pesoliquido;
	}

	public void setPesoliquido(BigDecimal pesoliquido) {
		this.pesoliquido = pesoliquido;
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

	public BigDecimal getVlrdireitosad() {
		return this.vlrdireitosad;
	}

	public void setVlrdireitosad(BigDecimal vlrdireitosad) {
		this.vlrdireitosad = vlrdireitosad;
	}

	public BigDecimal getVlrthc() {
		return this.vlrthc;
	}

	public void setVlrthc(BigDecimal vlrthc) {
		this.vlrthc = vlrthc;
	}

	public BigDecimal getVlrthcmi() {
		return this.vlrthcmi;
	}

	public void setVlrthcmi(BigDecimal vlrthcmi) {
		this.vlrthcmi = vlrthcmi;
	}

	public BigDecimal getVlrtxsiscomex() {
		return this.vlrtxsiscomex;
	}

	public void setVlrtxsiscomex(BigDecimal vlrtxsiscomex) {
		this.vlrtxsiscomex = vlrtxsiscomex;
	}

	public BigDecimal getVlrad() {
		return this.vlrad;
	}

	public void setVlrad(BigDecimal vlrad) {
		this.vlrad = vlrad;
	}

	public BigDecimal getVlradmi() {
		return this.vlradmi;
	}

	public void setVlradmi(BigDecimal vlradmi) {
		this.vlradmi = vlradmi;
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

	public BigDecimal getVlrdespad() {
		return this.vlrdespad;
	}

	public void setVlrdespad(BigDecimal vlrdespad) {
		this.vlrdespad = vlrdespad;
	}

	public BigDecimal getVlrcompl() {
		return this.vlrcompl;
	}

	public void setVlrcompl(BigDecimal vlrcompl) {
		this.vlrcompl = vlrcompl;
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

	public Set getCpitimportacaos() {
		return this.cpitimportacaos;
	}

	public void setCpitimportacaos(Set cpitimportacaos) {
		this.cpitimportacaos = cpitimportacaos;
	}

	public Set getCpimportacaocompls() {
		return this.cpimportacaocompls;
	}

	public void setCpimportacaocompls(Set cpimportacaocompls) {
		this.cpimportacaocompls = cpimportacaocompls;
	}

	public Set getCpimportacaoadics() {
		return this.cpimportacaoadics;
	}

	public void setCpimportacaoadics(Set cpimportacaoadics) {
		this.cpimportacaoadics = cpimportacaoadics;
	}

	public Set getCpimportacaos() {
		return this.cpimportacaos;
	}

	public void setCpimportacaos(Set cpimportacaos) {
		this.cpimportacaos = cpimportacaos;
	}

	public Set getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set cpcompras) {
		this.cpcompras = cpcompras;
	}

}
