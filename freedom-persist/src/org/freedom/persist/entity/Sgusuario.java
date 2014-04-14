package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgusuario generated by hbm2java
 */
public class Sgusuario implements java.io.Serializable {

	private SgusuarioId id;
	private Sgfilial sgfilial;
	private Eqalmox eqalmox;
	private Sggrpusu sggrpusu;
	private Sgagente sgagente;
	private Tkconfemail tkconfemail;
	private Fncc fncc;
	private String nomeusu;
	private char tipousu;
	private String pnomeusu;
	private String unomeusu;
	private String comentusu;
	private Character baixocustousu;
	private Character abregavetausu;
	private String aprovcpsolicitacaousu;
	private Character almoxarifeusu;
	private String aprovrmausu;
	private Character comprasusu;
	private Character altparcvenda;
	private Character aprovreceita;
	private char ativcli;
	private char liberacredusu;
	private int coragenda;
	private Character cancelaop;
	private char vendapatrimusu;
	private char rmaoutcc;
	private char ativousu;
	private char visualizalucr;
	private char liberacampopesagem;
	private char aprovordcp;
	private char acesopbtcadlote;
	private char acesopbtrma;
	private char acesopbtqualid;
	private char acesopbtdistr;
	private char acesopbtfase;
	private char acesopbtcanc;
	private char acesopbtsubprod;
	private char acesopbtremessa;
	private char acesopbtretorno;
	private char acesopveritens;
	private char cadoutusu;
	private String senhausu;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgconexaos = new HashSet(0);
	private Set eqrmasForEqrmafksgusuarioap = new HashSet(0);
	private Set eqtipomovusus = new HashSet(0);
	private Set sgatribusus = new HashSet(0);
	private Set atatendentes = new HashSet(0);
	private Set pvmovcaixas = new HashSet(0);
	private Set eqrmaals = new HashSet(0);
	private Set fncontausus = new HashSet(0);
	private Set eqrmasForEqrmafksgusuarioex = new HashSet(0);
	private Set fnlibcreds = new HashSet(0);
	private Set sgacessoeus = new HashSet(0);
	private Set atatendimentos = new HashSet(0);
	private Set cpsolicitacaos = new HashSet(0);
	private Set sglogs = new HashSet(0);
	private Set eqrmasForEqrmafksgusuario = new HashSet(0);

	public Sgusuario() {
	}

	public Sgusuario(SgusuarioId id, Sgfilial sgfilial, String nomeusu,
			char tipousu, char ativcli, char liberacredusu, int coragenda,
			char vendapatrimusu, char rmaoutcc, char ativousu,
			char visualizalucr, char liberacampopesagem, char aprovordcp,
			char acesopbtcadlote, char acesopbtrma, char acesopbtqualid,
			char acesopbtdistr, char acesopbtfase, char acesopbtcanc,
			char acesopbtsubprod, char acesopbtremessa, char acesopbtretorno,
			char acesopveritens, char cadoutusu, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.nomeusu = nomeusu;
		this.tipousu = tipousu;
		this.ativcli = ativcli;
		this.liberacredusu = liberacredusu;
		this.coragenda = coragenda;
		this.vendapatrimusu = vendapatrimusu;
		this.rmaoutcc = rmaoutcc;
		this.ativousu = ativousu;
		this.visualizalucr = visualizalucr;
		this.liberacampopesagem = liberacampopesagem;
		this.aprovordcp = aprovordcp;
		this.acesopbtcadlote = acesopbtcadlote;
		this.acesopbtrma = acesopbtrma;
		this.acesopbtqualid = acesopbtqualid;
		this.acesopbtdistr = acesopbtdistr;
		this.acesopbtfase = acesopbtfase;
		this.acesopbtcanc = acesopbtcanc;
		this.acesopbtsubprod = acesopbtsubprod;
		this.acesopbtremessa = acesopbtremessa;
		this.acesopbtretorno = acesopbtretorno;
		this.acesopveritens = acesopveritens;
		this.cadoutusu = cadoutusu;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgusuario(SgusuarioId id, Sgfilial sgfilial, Eqalmox eqalmox,
			Sggrpusu sggrpusu, Sgagente sgagente, Tkconfemail tkconfemail,
			Fncc fncc, String nomeusu, char tipousu, String pnomeusu,
			String unomeusu, String comentusu, Character baixocustousu,
			Character abregavetausu, String aprovcpsolicitacaousu,
			Character almoxarifeusu, String aprovrmausu, Character comprasusu,
			Character altparcvenda, Character aprovreceita, char ativcli,
			char liberacredusu, int coragenda, Character cancelaop,
			char vendapatrimusu, char rmaoutcc, char ativousu,
			char visualizalucr, char liberacampopesagem, char aprovordcp,
			char acesopbtcadlote, char acesopbtrma, char acesopbtqualid,
			char acesopbtdistr, char acesopbtfase, char acesopbtcanc,
			char acesopbtsubprod, char acesopbtremessa, char acesopbtretorno,
			char acesopveritens, char cadoutusu, String senhausu, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgconexaos, Set eqrmasForEqrmafksgusuarioap, Set eqtipomovusus,
			Set sgatribusus, Set atatendentes, Set pvmovcaixas, Set eqrmaals,
			Set fncontausus, Set eqrmasForEqrmafksgusuarioex, Set fnlibcreds,
			Set sgacessoeus, Set atatendimentos, Set cpsolicitacaos,
			Set sglogs, Set eqrmasForEqrmafksgusuario) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.eqalmox = eqalmox;
		this.sggrpusu = sggrpusu;
		this.sgagente = sgagente;
		this.tkconfemail = tkconfemail;
		this.fncc = fncc;
		this.nomeusu = nomeusu;
		this.tipousu = tipousu;
		this.pnomeusu = pnomeusu;
		this.unomeusu = unomeusu;
		this.comentusu = comentusu;
		this.baixocustousu = baixocustousu;
		this.abregavetausu = abregavetausu;
		this.aprovcpsolicitacaousu = aprovcpsolicitacaousu;
		this.almoxarifeusu = almoxarifeusu;
		this.aprovrmausu = aprovrmausu;
		this.comprasusu = comprasusu;
		this.altparcvenda = altparcvenda;
		this.aprovreceita = aprovreceita;
		this.ativcli = ativcli;
		this.liberacredusu = liberacredusu;
		this.coragenda = coragenda;
		this.cancelaop = cancelaop;
		this.vendapatrimusu = vendapatrimusu;
		this.rmaoutcc = rmaoutcc;
		this.ativousu = ativousu;
		this.visualizalucr = visualizalucr;
		this.liberacampopesagem = liberacampopesagem;
		this.aprovordcp = aprovordcp;
		this.acesopbtcadlote = acesopbtcadlote;
		this.acesopbtrma = acesopbtrma;
		this.acesopbtqualid = acesopbtqualid;
		this.acesopbtdistr = acesopbtdistr;
		this.acesopbtfase = acesopbtfase;
		this.acesopbtcanc = acesopbtcanc;
		this.acesopbtsubprod = acesopbtsubprod;
		this.acesopbtremessa = acesopbtremessa;
		this.acesopbtretorno = acesopbtretorno;
		this.acesopveritens = acesopveritens;
		this.cadoutusu = cadoutusu;
		this.senhausu = senhausu;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgconexaos = sgconexaos;
		this.eqrmasForEqrmafksgusuarioap = eqrmasForEqrmafksgusuarioap;
		this.eqtipomovusus = eqtipomovusus;
		this.sgatribusus = sgatribusus;
		this.atatendentes = atatendentes;
		this.pvmovcaixas = pvmovcaixas;
		this.eqrmaals = eqrmaals;
		this.fncontausus = fncontausus;
		this.eqrmasForEqrmafksgusuarioex = eqrmasForEqrmafksgusuarioex;
		this.fnlibcreds = fnlibcreds;
		this.sgacessoeus = sgacessoeus;
		this.atatendimentos = atatendimentos;
		this.cpsolicitacaos = cpsolicitacaos;
		this.sglogs = sglogs;
		this.eqrmasForEqrmafksgusuario = eqrmasForEqrmafksgusuario;
	}

	public SgusuarioId getId() {
		return this.id;
	}

	public void setId(SgusuarioId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	public Sggrpusu getSggrpusu() {
		return this.sggrpusu;
	}

	public void setSggrpusu(Sggrpusu sggrpusu) {
		this.sggrpusu = sggrpusu;
	}

	public Sgagente getSgagente() {
		return this.sgagente;
	}

	public void setSgagente(Sgagente sgagente) {
		this.sgagente = sgagente;
	}

	public Tkconfemail getTkconfemail() {
		return this.tkconfemail;
	}

	public void setTkconfemail(Tkconfemail tkconfemail) {
		this.tkconfemail = tkconfemail;
	}

	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	public String getNomeusu() {
		return this.nomeusu;
	}

	public void setNomeusu(String nomeusu) {
		this.nomeusu = nomeusu;
	}

	public char getTipousu() {
		return this.tipousu;
	}

	public void setTipousu(char tipousu) {
		this.tipousu = tipousu;
	}

	public String getPnomeusu() {
		return this.pnomeusu;
	}

	public void setPnomeusu(String pnomeusu) {
		this.pnomeusu = pnomeusu;
	}

	public String getUnomeusu() {
		return this.unomeusu;
	}

	public void setUnomeusu(String unomeusu) {
		this.unomeusu = unomeusu;
	}

	public String getComentusu() {
		return this.comentusu;
	}

	public void setComentusu(String comentusu) {
		this.comentusu = comentusu;
	}

	public Character getBaixocustousu() {
		return this.baixocustousu;
	}

	public void setBaixocustousu(Character baixocustousu) {
		this.baixocustousu = baixocustousu;
	}

	public Character getAbregavetausu() {
		return this.abregavetausu;
	}

	public void setAbregavetausu(Character abregavetausu) {
		this.abregavetausu = abregavetausu;
	}

	public String getAprovcpsolicitacaousu() {
		return this.aprovcpsolicitacaousu;
	}

	public void setAprovcpsolicitacaousu(String aprovcpsolicitacaousu) {
		this.aprovcpsolicitacaousu = aprovcpsolicitacaousu;
	}

	public Character getAlmoxarifeusu() {
		return this.almoxarifeusu;
	}

	public void setAlmoxarifeusu(Character almoxarifeusu) {
		this.almoxarifeusu = almoxarifeusu;
	}

	public String getAprovrmausu() {
		return this.aprovrmausu;
	}

	public void setAprovrmausu(String aprovrmausu) {
		this.aprovrmausu = aprovrmausu;
	}

	public Character getComprasusu() {
		return this.comprasusu;
	}

	public void setComprasusu(Character comprasusu) {
		this.comprasusu = comprasusu;
	}

	public Character getAltparcvenda() {
		return this.altparcvenda;
	}

	public void setAltparcvenda(Character altparcvenda) {
		this.altparcvenda = altparcvenda;
	}

	public Character getAprovreceita() {
		return this.aprovreceita;
	}

	public void setAprovreceita(Character aprovreceita) {
		this.aprovreceita = aprovreceita;
	}

	public char getAtivcli() {
		return this.ativcli;
	}

	public void setAtivcli(char ativcli) {
		this.ativcli = ativcli;
	}

	public char getLiberacredusu() {
		return this.liberacredusu;
	}

	public void setLiberacredusu(char liberacredusu) {
		this.liberacredusu = liberacredusu;
	}

	public int getCoragenda() {
		return this.coragenda;
	}

	public void setCoragenda(int coragenda) {
		this.coragenda = coragenda;
	}

	public Character getCancelaop() {
		return this.cancelaop;
	}

	public void setCancelaop(Character cancelaop) {
		this.cancelaop = cancelaop;
	}

	public char getVendapatrimusu() {
		return this.vendapatrimusu;
	}

	public void setVendapatrimusu(char vendapatrimusu) {
		this.vendapatrimusu = vendapatrimusu;
	}

	public char getRmaoutcc() {
		return this.rmaoutcc;
	}

	public void setRmaoutcc(char rmaoutcc) {
		this.rmaoutcc = rmaoutcc;
	}

	public char getAtivousu() {
		return this.ativousu;
	}

	public void setAtivousu(char ativousu) {
		this.ativousu = ativousu;
	}

	public char getVisualizalucr() {
		return this.visualizalucr;
	}

	public void setVisualizalucr(char visualizalucr) {
		this.visualizalucr = visualizalucr;
	}

	public char getLiberacampopesagem() {
		return this.liberacampopesagem;
	}

	public void setLiberacampopesagem(char liberacampopesagem) {
		this.liberacampopesagem = liberacampopesagem;
	}

	public char getAprovordcp() {
		return this.aprovordcp;
	}

	public void setAprovordcp(char aprovordcp) {
		this.aprovordcp = aprovordcp;
	}

	public char getAcesopbtcadlote() {
		return this.acesopbtcadlote;
	}

	public void setAcesopbtcadlote(char acesopbtcadlote) {
		this.acesopbtcadlote = acesopbtcadlote;
	}

	public char getAcesopbtrma() {
		return this.acesopbtrma;
	}

	public void setAcesopbtrma(char acesopbtrma) {
		this.acesopbtrma = acesopbtrma;
	}

	public char getAcesopbtqualid() {
		return this.acesopbtqualid;
	}

	public void setAcesopbtqualid(char acesopbtqualid) {
		this.acesopbtqualid = acesopbtqualid;
	}

	public char getAcesopbtdistr() {
		return this.acesopbtdistr;
	}

	public void setAcesopbtdistr(char acesopbtdistr) {
		this.acesopbtdistr = acesopbtdistr;
	}

	public char getAcesopbtfase() {
		return this.acesopbtfase;
	}

	public void setAcesopbtfase(char acesopbtfase) {
		this.acesopbtfase = acesopbtfase;
	}

	public char getAcesopbtcanc() {
		return this.acesopbtcanc;
	}

	public void setAcesopbtcanc(char acesopbtcanc) {
		this.acesopbtcanc = acesopbtcanc;
	}

	public char getAcesopbtsubprod() {
		return this.acesopbtsubprod;
	}

	public void setAcesopbtsubprod(char acesopbtsubprod) {
		this.acesopbtsubprod = acesopbtsubprod;
	}

	public char getAcesopbtremessa() {
		return this.acesopbtremessa;
	}

	public void setAcesopbtremessa(char acesopbtremessa) {
		this.acesopbtremessa = acesopbtremessa;
	}

	public char getAcesopbtretorno() {
		return this.acesopbtretorno;
	}

	public void setAcesopbtretorno(char acesopbtretorno) {
		this.acesopbtretorno = acesopbtretorno;
	}

	public char getAcesopveritens() {
		return this.acesopveritens;
	}

	public void setAcesopveritens(char acesopveritens) {
		this.acesopveritens = acesopveritens;
	}

	public char getCadoutusu() {
		return this.cadoutusu;
	}

	public void setCadoutusu(char cadoutusu) {
		this.cadoutusu = cadoutusu;
	}

	public String getSenhausu() {
		return this.senhausu;
	}

	public void setSenhausu(String senhausu) {
		this.senhausu = senhausu;
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

	public Set getSgconexaos() {
		return this.sgconexaos;
	}

	public void setSgconexaos(Set sgconexaos) {
		this.sgconexaos = sgconexaos;
	}

	public Set getEqrmasForEqrmafksgusuarioap() {
		return this.eqrmasForEqrmafksgusuarioap;
	}

	public void setEqrmasForEqrmafksgusuarioap(Set eqrmasForEqrmafksgusuarioap) {
		this.eqrmasForEqrmafksgusuarioap = eqrmasForEqrmafksgusuarioap;
	}

	public Set getEqtipomovusus() {
		return this.eqtipomovusus;
	}

	public void setEqtipomovusus(Set eqtipomovusus) {
		this.eqtipomovusus = eqtipomovusus;
	}

	public Set getSgatribusus() {
		return this.sgatribusus;
	}

	public void setSgatribusus(Set sgatribusus) {
		this.sgatribusus = sgatribusus;
	}

	public Set getAtatendentes() {
		return this.atatendentes;
	}

	public void setAtatendentes(Set atatendentes) {
		this.atatendentes = atatendentes;
	}

	public Set getPvmovcaixas() {
		return this.pvmovcaixas;
	}

	public void setPvmovcaixas(Set pvmovcaixas) {
		this.pvmovcaixas = pvmovcaixas;
	}

	public Set getEqrmaals() {
		return this.eqrmaals;
	}

	public void setEqrmaals(Set eqrmaals) {
		this.eqrmaals = eqrmaals;
	}

	public Set getFncontausus() {
		return this.fncontausus;
	}

	public void setFncontausus(Set fncontausus) {
		this.fncontausus = fncontausus;
	}

	public Set getEqrmasForEqrmafksgusuarioex() {
		return this.eqrmasForEqrmafksgusuarioex;
	}

	public void setEqrmasForEqrmafksgusuarioex(Set eqrmasForEqrmafksgusuarioex) {
		this.eqrmasForEqrmafksgusuarioex = eqrmasForEqrmafksgusuarioex;
	}

	public Set getFnlibcreds() {
		return this.fnlibcreds;
	}

	public void setFnlibcreds(Set fnlibcreds) {
		this.fnlibcreds = fnlibcreds;
	}

	public Set getSgacessoeus() {
		return this.sgacessoeus;
	}

	public void setSgacessoeus(Set sgacessoeus) {
		this.sgacessoeus = sgacessoeus;
	}

	public Set getAtatendimentos() {
		return this.atatendimentos;
	}

	public void setAtatendimentos(Set atatendimentos) {
		this.atatendimentos = atatendimentos;
	}

	public Set getCpsolicitacaos() {
		return this.cpsolicitacaos;
	}

	public void setCpsolicitacaos(Set cpsolicitacaos) {
		this.cpsolicitacaos = cpsolicitacaos;
	}

	public Set getSglogs() {
		return this.sglogs;
	}

	public void setSglogs(Set sglogs) {
		this.sglogs = sglogs;
	}

	public Set getEqrmasForEqrmafksgusuario() {
		return this.eqrmasForEqrmafksgusuario;
	}

	public void setEqrmasForEqrmafksgusuario(Set eqrmasForEqrmafksgusuario) {
		this.eqrmasForEqrmafksgusuario = eqrmasForEqrmafksgusuario;
	}

}
