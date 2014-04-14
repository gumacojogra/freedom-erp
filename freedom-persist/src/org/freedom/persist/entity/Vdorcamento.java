package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vdorcamento generated by hbm2java
 */
public class Vdorcamento implements java.io.Serializable {

	private VdorcamentoId id;
	private Atatendente atatendente;
	private Vdcliente vdcliente;
	private Fnplanopag fnplanopag;
	private Vdclcomis vdclcomis;
	private Eqtipomov eqtipomov;
	private Attipoconv attipoconv;
	private Vdvendedor vdvendedor;
	private Vdtransp vdtransp;
	private Atconveniado atconveniado;
	private Date dtorc;
	private Date dtvencorc;
	private BigDecimal vlrprodorc;
	private BigDecimal percdescorc;
	private BigDecimal vlrdescorc;
	private BigDecimal percadicorc;
	private BigDecimal vlradicorc;
	private BigDecimal vlrdescitorc;
	private BigDecimal vlrliqorc;
	private String statusorc;
	private String obsorc;
	private String txt01;
	private Short prazoentorc;
	private Character emmanut;
	private Character tipofrete;
	private Character adicfrete;
	private BigDecimal vlrfreteorc;
	private BigDecimal vlrcomisorc;
	private Date dtaprovorc;
	private Date dtpreventorc;
	private Date hpreventorc;
	private String justificcancorc;
	private String acorc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set vdstatusorcs = new HashSet(0);
	private Set atatendimentoorcs = new HashSet(0);
	private Vddetorc vddetorc;
	private Set vditorcamentos = new HashSet(0);

	public Vdorcamento() {
	}

	public Vdorcamento(VdorcamentoId id, Vdcliente vdcliente,
			Vdvendedor vdvendedor, Date dtorc, Date dtvencorc,
			String statusorc, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.vdvendedor = vdvendedor;
		this.dtorc = dtorc;
		this.dtvencorc = dtvencorc;
		this.statusorc = statusorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdorcamento(VdorcamentoId id, Atatendente atatendente,
			Vdcliente vdcliente, Fnplanopag fnplanopag, Vdclcomis vdclcomis,
			Eqtipomov eqtipomov, Attipoconv attipoconv, Vdvendedor vdvendedor,
			Vdtransp vdtransp, Atconveniado atconveniado, Date dtorc,
			Date dtvencorc, BigDecimal vlrprodorc, BigDecimal percdescorc,
			BigDecimal vlrdescorc, BigDecimal percadicorc,
			BigDecimal vlradicorc, BigDecimal vlrdescitorc,
			BigDecimal vlrliqorc, String statusorc, String obsorc,
			String txt01, Short prazoentorc, Character emmanut,
			Character tipofrete, Character adicfrete, BigDecimal vlrfreteorc,
			BigDecimal vlrcomisorc, Date dtaprovorc, Date dtpreventorc,
			Date hpreventorc, String justificcancorc, String acorc, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set vdstatusorcs, Set atatendimentoorcs, Vddetorc vddetorc,
			Set vditorcamentos) {
		this.id = id;
		this.atatendente = atatendente;
		this.vdcliente = vdcliente;
		this.fnplanopag = fnplanopag;
		this.vdclcomis = vdclcomis;
		this.eqtipomov = eqtipomov;
		this.attipoconv = attipoconv;
		this.vdvendedor = vdvendedor;
		this.vdtransp = vdtransp;
		this.atconveniado = atconveniado;
		this.dtorc = dtorc;
		this.dtvencorc = dtvencorc;
		this.vlrprodorc = vlrprodorc;
		this.percdescorc = percdescorc;
		this.vlrdescorc = vlrdescorc;
		this.percadicorc = percadicorc;
		this.vlradicorc = vlradicorc;
		this.vlrdescitorc = vlrdescitorc;
		this.vlrliqorc = vlrliqorc;
		this.statusorc = statusorc;
		this.obsorc = obsorc;
		this.txt01 = txt01;
		this.prazoentorc = prazoentorc;
		this.emmanut = emmanut;
		this.tipofrete = tipofrete;
		this.adicfrete = adicfrete;
		this.vlrfreteorc = vlrfreteorc;
		this.vlrcomisorc = vlrcomisorc;
		this.dtaprovorc = dtaprovorc;
		this.dtpreventorc = dtpreventorc;
		this.hpreventorc = hpreventorc;
		this.justificcancorc = justificcancorc;
		this.acorc = acorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdstatusorcs = vdstatusorcs;
		this.atatendimentoorcs = atatendimentoorcs;
		this.vddetorc = vddetorc;
		this.vditorcamentos = vditorcamentos;
	}

	public VdorcamentoId getId() {
		return this.id;
	}

	public void setId(VdorcamentoId id) {
		this.id = id;
	}

	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	public Vdclcomis getVdclcomis() {
		return this.vdclcomis;
	}

	public void setVdclcomis(Vdclcomis vdclcomis) {
		this.vdclcomis = vdclcomis;
	}

	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	public Attipoconv getAttipoconv() {
		return this.attipoconv;
	}

	public void setAttipoconv(Attipoconv attipoconv) {
		this.attipoconv = attipoconv;
	}

	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	public Atconveniado getAtconveniado() {
		return this.atconveniado;
	}

	public void setAtconveniado(Atconveniado atconveniado) {
		this.atconveniado = atconveniado;
	}

	public Date getDtorc() {
		return this.dtorc;
	}

	public void setDtorc(Date dtorc) {
		this.dtorc = dtorc;
	}

	public Date getDtvencorc() {
		return this.dtvencorc;
	}

	public void setDtvencorc(Date dtvencorc) {
		this.dtvencorc = dtvencorc;
	}

	public BigDecimal getVlrprodorc() {
		return this.vlrprodorc;
	}

	public void setVlrprodorc(BigDecimal vlrprodorc) {
		this.vlrprodorc = vlrprodorc;
	}

	public BigDecimal getPercdescorc() {
		return this.percdescorc;
	}

	public void setPercdescorc(BigDecimal percdescorc) {
		this.percdescorc = percdescorc;
	}

	public BigDecimal getVlrdescorc() {
		return this.vlrdescorc;
	}

	public void setVlrdescorc(BigDecimal vlrdescorc) {
		this.vlrdescorc = vlrdescorc;
	}

	public BigDecimal getPercadicorc() {
		return this.percadicorc;
	}

	public void setPercadicorc(BigDecimal percadicorc) {
		this.percadicorc = percadicorc;
	}

	public BigDecimal getVlradicorc() {
		return this.vlradicorc;
	}

	public void setVlradicorc(BigDecimal vlradicorc) {
		this.vlradicorc = vlradicorc;
	}

	public BigDecimal getVlrdescitorc() {
		return this.vlrdescitorc;
	}

	public void setVlrdescitorc(BigDecimal vlrdescitorc) {
		this.vlrdescitorc = vlrdescitorc;
	}

	public BigDecimal getVlrliqorc() {
		return this.vlrliqorc;
	}

	public void setVlrliqorc(BigDecimal vlrliqorc) {
		this.vlrliqorc = vlrliqorc;
	}

	public String getStatusorc() {
		return this.statusorc;
	}

	public void setStatusorc(String statusorc) {
		this.statusorc = statusorc;
	}

	public String getObsorc() {
		return this.obsorc;
	}

	public void setObsorc(String obsorc) {
		this.obsorc = obsorc;
	}

	public String getTxt01() {
		return this.txt01;
	}

	public void setTxt01(String txt01) {
		this.txt01 = txt01;
	}

	public Short getPrazoentorc() {
		return this.prazoentorc;
	}

	public void setPrazoentorc(Short prazoentorc) {
		this.prazoentorc = prazoentorc;
	}

	public Character getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(Character emmanut) {
		this.emmanut = emmanut;
	}

	public Character getTipofrete() {
		return this.tipofrete;
	}

	public void setTipofrete(Character tipofrete) {
		this.tipofrete = tipofrete;
	}

	public Character getAdicfrete() {
		return this.adicfrete;
	}

	public void setAdicfrete(Character adicfrete) {
		this.adicfrete = adicfrete;
	}

	public BigDecimal getVlrfreteorc() {
		return this.vlrfreteorc;
	}

	public void setVlrfreteorc(BigDecimal vlrfreteorc) {
		this.vlrfreteorc = vlrfreteorc;
	}

	public BigDecimal getVlrcomisorc() {
		return this.vlrcomisorc;
	}

	public void setVlrcomisorc(BigDecimal vlrcomisorc) {
		this.vlrcomisorc = vlrcomisorc;
	}

	public Date getDtaprovorc() {
		return this.dtaprovorc;
	}

	public void setDtaprovorc(Date dtaprovorc) {
		this.dtaprovorc = dtaprovorc;
	}

	public Date getDtpreventorc() {
		return this.dtpreventorc;
	}

	public void setDtpreventorc(Date dtpreventorc) {
		this.dtpreventorc = dtpreventorc;
	}

	public Date getHpreventorc() {
		return this.hpreventorc;
	}

	public void setHpreventorc(Date hpreventorc) {
		this.hpreventorc = hpreventorc;
	}

	public String getJustificcancorc() {
		return this.justificcancorc;
	}

	public void setJustificcancorc(String justificcancorc) {
		this.justificcancorc = justificcancorc;
	}

	public String getAcorc() {
		return this.acorc;
	}

	public void setAcorc(String acorc) {
		this.acorc = acorc;
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

	public Set getVdstatusorcs() {
		return this.vdstatusorcs;
	}

	public void setVdstatusorcs(Set vdstatusorcs) {
		this.vdstatusorcs = vdstatusorcs;
	}

	public Set getAtatendimentoorcs() {
		return this.atatendimentoorcs;
	}

	public void setAtatendimentoorcs(Set atatendimentoorcs) {
		this.atatendimentoorcs = atatendimentoorcs;
	}

	public Vddetorc getVddetorc() {
		return this.vddetorc;
	}

	public void setVddetorc(Vddetorc vddetorc) {
		this.vddetorc = vddetorc;
	}

	public Set getVditorcamentos() {
		return this.vditorcamentos;
	}

	public void setVditorcamentos(Set vditorcamentos) {
		this.vditorcamentos = vditorcamentos;
	}

}
