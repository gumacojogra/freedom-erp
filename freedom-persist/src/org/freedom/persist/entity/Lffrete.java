package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lffrete generated by hbm2java
 */
public class Lffrete implements java.io.Serializable {

	private LffreteId id;
	private Fnpagar fnpagar;
	private Eqrecmerc eqrecmerc;
	private Sgunifcod sgunifcodByLffretefksgunifcodd;
	private Lfnatoper lfnatoper;
	private Eqexpedicao eqexpedicao;
	private Lftrattrib lftrattrib;
	private Eqtipomov eqtipomov;
	private Vdtransp vdtransp;
	private Sgunifcod sgunifcodByLffretefksgunifcodr;
	private String docfrete;
	private char tipofrete;
	private char tipopgto;
	private Date dtemitfrete;
	private Date dtpagfrete;
	private BigDecimal qtdfrete;
	private BigDecimal vlrmercadoria;
	private BigDecimal vlrfrete;
	private BigDecimal vlrfretenota;
	private BigDecimal pesobruto;
	private BigDecimal pesoliquido;
	private BigDecimal aliqicmsfrete;
	private BigDecimal vlricmsfrete;
	private BigDecimal vlrbaseicmsfrete;
	private String serie;
	private String chavecte;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lffretecompras = new HashSet(0);
	private Set lffretevendas = new HashSet(0);

	public Lffrete() {
	}

	public Lffrete(LffreteId id, Sgunifcod sgunifcodByLffretefksgunifcodd,
			Eqtipomov eqtipomov, Vdtransp vdtransp,
			Sgunifcod sgunifcodByLffretefksgunifcodr, char tipofrete,
			char tipopgto, Date dtemitfrete, BigDecimal qtdfrete,
			BigDecimal vlrmercadoria, BigDecimal vlrfrete,
			BigDecimal pesobruto, BigDecimal pesoliquido,
			BigDecimal aliqicmsfrete, BigDecimal vlricmsfrete,
			BigDecimal vlrbaseicmsfrete, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgunifcodByLffretefksgunifcodd = sgunifcodByLffretefksgunifcodd;
		this.eqtipomov = eqtipomov;
		this.vdtransp = vdtransp;
		this.sgunifcodByLffretefksgunifcodr = sgunifcodByLffretefksgunifcodr;
		this.tipofrete = tipofrete;
		this.tipopgto = tipopgto;
		this.dtemitfrete = dtemitfrete;
		this.qtdfrete = qtdfrete;
		this.vlrmercadoria = vlrmercadoria;
		this.vlrfrete = vlrfrete;
		this.pesobruto = pesobruto;
		this.pesoliquido = pesoliquido;
		this.aliqicmsfrete = aliqicmsfrete;
		this.vlricmsfrete = vlricmsfrete;
		this.vlrbaseicmsfrete = vlrbaseicmsfrete;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lffrete(LffreteId id, Fnpagar fnpagar, Eqrecmerc eqrecmerc,
			Sgunifcod sgunifcodByLffretefksgunifcodd, Lfnatoper lfnatoper,
			Eqexpedicao eqexpedicao, Lftrattrib lftrattrib,
			Eqtipomov eqtipomov, Vdtransp vdtransp,
			Sgunifcod sgunifcodByLffretefksgunifcodr, String docfrete,
			char tipofrete, char tipopgto, Date dtemitfrete, Date dtpagfrete,
			BigDecimal qtdfrete, BigDecimal vlrmercadoria, BigDecimal vlrfrete,
			BigDecimal vlrfretenota, BigDecimal pesobruto,
			BigDecimal pesoliquido, BigDecimal aliqicmsfrete,
			BigDecimal vlricmsfrete, BigDecimal vlrbaseicmsfrete, String serie,
			String chavecte, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set lffretecompras,
			Set lffretevendas) {
		this.id = id;
		this.fnpagar = fnpagar;
		this.eqrecmerc = eqrecmerc;
		this.sgunifcodByLffretefksgunifcodd = sgunifcodByLffretefksgunifcodd;
		this.lfnatoper = lfnatoper;
		this.eqexpedicao = eqexpedicao;
		this.lftrattrib = lftrattrib;
		this.eqtipomov = eqtipomov;
		this.vdtransp = vdtransp;
		this.sgunifcodByLffretefksgunifcodr = sgunifcodByLffretefksgunifcodr;
		this.docfrete = docfrete;
		this.tipofrete = tipofrete;
		this.tipopgto = tipopgto;
		this.dtemitfrete = dtemitfrete;
		this.dtpagfrete = dtpagfrete;
		this.qtdfrete = qtdfrete;
		this.vlrmercadoria = vlrmercadoria;
		this.vlrfrete = vlrfrete;
		this.vlrfretenota = vlrfretenota;
		this.pesobruto = pesobruto;
		this.pesoliquido = pesoliquido;
		this.aliqicmsfrete = aliqicmsfrete;
		this.vlricmsfrete = vlricmsfrete;
		this.vlrbaseicmsfrete = vlrbaseicmsfrete;
		this.serie = serie;
		this.chavecte = chavecte;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lffretecompras = lffretecompras;
		this.lffretevendas = lffretevendas;
	}

	public LffreteId getId() {
		return this.id;
	}

	public void setId(LffreteId id) {
		this.id = id;
	}

	public Fnpagar getFnpagar() {
		return this.fnpagar;
	}

	public void setFnpagar(Fnpagar fnpagar) {
		this.fnpagar = fnpagar;
	}

	public Eqrecmerc getEqrecmerc() {
		return this.eqrecmerc;
	}

	public void setEqrecmerc(Eqrecmerc eqrecmerc) {
		this.eqrecmerc = eqrecmerc;
	}

	public Sgunifcod getSgunifcodByLffretefksgunifcodd() {
		return this.sgunifcodByLffretefksgunifcodd;
	}

	public void setSgunifcodByLffretefksgunifcodd(
			Sgunifcod sgunifcodByLffretefksgunifcodd) {
		this.sgunifcodByLffretefksgunifcodd = sgunifcodByLffretefksgunifcodd;
	}

	public Lfnatoper getLfnatoper() {
		return this.lfnatoper;
	}

	public void setLfnatoper(Lfnatoper lfnatoper) {
		this.lfnatoper = lfnatoper;
	}

	public Eqexpedicao getEqexpedicao() {
		return this.eqexpedicao;
	}

	public void setEqexpedicao(Eqexpedicao eqexpedicao) {
		this.eqexpedicao = eqexpedicao;
	}

	public Lftrattrib getLftrattrib() {
		return this.lftrattrib;
	}

	public void setLftrattrib(Lftrattrib lftrattrib) {
		this.lftrattrib = lftrattrib;
	}

	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	public Sgunifcod getSgunifcodByLffretefksgunifcodr() {
		return this.sgunifcodByLffretefksgunifcodr;
	}

	public void setSgunifcodByLffretefksgunifcodr(
			Sgunifcod sgunifcodByLffretefksgunifcodr) {
		this.sgunifcodByLffretefksgunifcodr = sgunifcodByLffretefksgunifcodr;
	}

	public String getDocfrete() {
		return this.docfrete;
	}

	public void setDocfrete(String docfrete) {
		this.docfrete = docfrete;
	}

	public char getTipofrete() {
		return this.tipofrete;
	}

	public void setTipofrete(char tipofrete) {
		this.tipofrete = tipofrete;
	}

	public char getTipopgto() {
		return this.tipopgto;
	}

	public void setTipopgto(char tipopgto) {
		this.tipopgto = tipopgto;
	}

	public Date getDtemitfrete() {
		return this.dtemitfrete;
	}

	public void setDtemitfrete(Date dtemitfrete) {
		this.dtemitfrete = dtemitfrete;
	}

	public Date getDtpagfrete() {
		return this.dtpagfrete;
	}

	public void setDtpagfrete(Date dtpagfrete) {
		this.dtpagfrete = dtpagfrete;
	}

	public BigDecimal getQtdfrete() {
		return this.qtdfrete;
	}

	public void setQtdfrete(BigDecimal qtdfrete) {
		this.qtdfrete = qtdfrete;
	}

	public BigDecimal getVlrmercadoria() {
		return this.vlrmercadoria;
	}

	public void setVlrmercadoria(BigDecimal vlrmercadoria) {
		this.vlrmercadoria = vlrmercadoria;
	}

	public BigDecimal getVlrfrete() {
		return this.vlrfrete;
	}

	public void setVlrfrete(BigDecimal vlrfrete) {
		this.vlrfrete = vlrfrete;
	}

	public BigDecimal getVlrfretenota() {
		return this.vlrfretenota;
	}

	public void setVlrfretenota(BigDecimal vlrfretenota) {
		this.vlrfretenota = vlrfretenota;
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

	public BigDecimal getAliqicmsfrete() {
		return this.aliqicmsfrete;
	}

	public void setAliqicmsfrete(BigDecimal aliqicmsfrete) {
		this.aliqicmsfrete = aliqicmsfrete;
	}

	public BigDecimal getVlricmsfrete() {
		return this.vlricmsfrete;
	}

	public void setVlricmsfrete(BigDecimal vlricmsfrete) {
		this.vlricmsfrete = vlricmsfrete;
	}

	public BigDecimal getVlrbaseicmsfrete() {
		return this.vlrbaseicmsfrete;
	}

	public void setVlrbaseicmsfrete(BigDecimal vlrbaseicmsfrete) {
		this.vlrbaseicmsfrete = vlrbaseicmsfrete;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getChavecte() {
		return this.chavecte;
	}

	public void setChavecte(String chavecte) {
		this.chavecte = chavecte;
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

	public Set getLffretecompras() {
		return this.lffretecompras;
	}

	public void setLffretecompras(Set lffretecompras) {
		this.lffretecompras = lffretecompras;
	}

	public Set getLffretevendas() {
		return this.lffretevendas;
	}

	public void setLffretevendas(Set lffretevendas) {
		this.lffretevendas = lffretevendas;
	}

}
