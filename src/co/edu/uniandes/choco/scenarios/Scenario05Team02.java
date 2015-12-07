package co.edu.uniandes.choco.scenarios;

import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class Scenario05Team02 {
	public void solveProblem() {
		Solver solver = new Solver();

		// FEATURES (Variables & Domains)
		BoolVar inversionti = VariableFactory.bool("inversionti", solver);
		BoolVar motivadoresdenegocio = (BoolVar) VariableFactory.fixed("motivadoresdenegocio", 1, solver);
		BoolVar sistemasempresariales = (BoolVar) VariableFactory.fixed("sistemasempresariales", 1, solver);
		BoolVar tipodesolucion = (BoolVar) VariableFactory.fixed("tipodesolucion", 1, solver);
		BoolVar modelodeimplementacion = (BoolVar) VariableFactory.fixed("modelodeimplementacion", 1, solver);
		BoolVar crm_customerrelationshipmanagement = (BoolVar) VariableFactory.fixed("crm_customerrelationshipmanagement", 0, solver);
		BoolVar erp_enterpriseresourceplanning = VariableFactory.bool("erp_enterpriseresourceplanning", solver);
		BoolVar segmentarydepurarclientes = (BoolVar) VariableFactory.fixed("segmentarydepurarclientes", 0, solver);
		BoolVar analisisdemarketing = (BoolVar) VariableFactory.fixed("analisisdemarketing", 0, solver);
		BoolVar gestiondecampanias = (BoolVar) VariableFactory.fixed("gestiondecampanias", 0, solver);
		BoolVar reducirciclosdeventas = (BoolVar) VariableFactory.fixed("reducirciclosdeventas", 0, solver);
		BoolVar mejorarretenciondeclientes = (BoolVar) VariableFactory.fixed("mejorarretenciondeclientes", 0, solver);
		BoolVar mejorarconocimientodelcliente = (BoolVar) VariableFactory.fixed("mejorarconocimientodelcliente", 0, solver);
		BoolVar implementarcontrolessobreprocesosfinancieros = (BoolVar) VariableFactory.fixed("implementarcontrolessobreprocesosfinancieros", 0, solver);
		BoolVar controlyadministraciondelpresupuesto = (BoolVar) VariableFactory.fixed("controlyadministraciondelpresupuesto", 0, solver);
		BoolVar manejodeinventarios = VariableFactory.bool("manejodeinventarios", solver);
		BoolVar manejodealmacen = (BoolVar) VariableFactory.fixed("manejodealmacen", 0, solver);
		BoolVar gestiondecompras = VariableFactory.bool("gestiondecompras", solver);
		BoolVar comercioexterior = (BoolVar) VariableFactory.fixed("comercioexterior", 0, solver);
		BoolVar disminuirtiemposdeentrega = (BoolVar) VariableFactory.fixed("disminuirtiemposdeentrega", 1, solver);
		BoolVar integracionconproveedores = (BoolVar) VariableFactory.fixed("integracionconproveedores", 1, solver);
		BoolVar buscartendenciasyrelaciones = (BoolVar) VariableFactory.fixed("buscartendenciasyrelaciones", 0, solver);
		BoolVar compartirconocimiento = (BoolVar) VariableFactory.fixed("compartirconocimiento", 0, solver);
		BoolVar predecirdisponibilidades = (BoolVar) VariableFactory.fixed("predecirdisponibilidades", 0, solver);
		BoolVar planificarcapacidades = VariableFactory.bool("planificarcapacidades", solver);
		BoolVar gestiondelademanda = (BoolVar) VariableFactory.fixed("gestiondelademanda", 0, solver);
		BoolVar crm_modulomarketing = (BoolVar) VariableFactory.fixed("crm_modulomarketing", 0, solver);
		BoolVar crm_moduloventas = (BoolVar) VariableFactory.fixed("crm_moduloventas", 0, solver);
		BoolVar crm_modulodeclientes = (BoolVar) VariableFactory.fixed("crm_modulodeclientes", 0, solver);
		BoolVar erp_modulofinanciero = (BoolVar) VariableFactory.fixed("erp_modulofinanciero", 0, solver);
		BoolVar erp_moduloadministrativo = (BoolVar) VariableFactory.fixed("erp_moduloadministrativo", 0, solver);
		BoolVar erp_modulodeproduccion = VariableFactory.bool("erp_modulodeproduccion", solver);
		BoolVar erp_modulodeinteligenciadenegocio = (BoolVar) VariableFactory.fixed("erp_modulodeinteligenciadenegocio", 0, solver);
		BoolVar erp_marketingyventas = (BoolVar) VariableFactory.fixed("erp_marketingyventas", 0, solver);
		BoolVar erp_modulodegestiondeproyectos = (BoolVar) VariableFactory.fixed("erp_modulodegestiondeproyectos", 0, solver);
		BoolVar scm_sistemadegestiondeabastecimiento = (BoolVar) VariableFactory.fixed("scm_sistemadegestiondeabastecimiento", 0, solver);
		BoolVar comercial = VariableFactory.bool("comercial", solver);
		BoolVar opensource = VariableFactory.bool("opensource", solver);
		BoolVar bigbang = VariableFactory.bool("bigbang", solver);
		BoolVar implementacionporfases = VariableFactory.bool("implementacionporfases", solver);
		BoolVar implementacionporprocesos = (BoolVar) VariableFactory.fixed("implementacionporprocesos", 0, solver);

		// FEATURE ATTRIBUTES (Variables & Domains)
		IntVar[][] featureAttributes = new IntVar[34][4];featureAttributes[0][0] = VariableFactory.bounded("segmentarydepurarclientescostos", 0, 0, solver);
		featureAttributes[0][1] = VariableFactory.bounded("segmentarydepurarclientestiempo", 0, 0, solver);
		featureAttributes[0][2] = VariableFactory.bounded("segmentarydepurarclientesrecursoshumanos", 0, 0, solver);
		featureAttributes[0][3] = VariableFactory.bounded("segmentarydepurarclientesriesgos", 0, 0, solver);

		featureAttributes[1][0] = VariableFactory.bounded("analisisdemarketingcostos", 0, 0, solver);
		featureAttributes[1][1] = VariableFactory.bounded("analisisdemarketingtiempo", 0, 0, solver);
		featureAttributes[1][2] = VariableFactory.bounded("analisisdemarketingrecursoshumanos", 0, 0, solver);
		featureAttributes[1][3] = VariableFactory.bounded("analisisdemarketingriesgos", 0, 0, solver);

		featureAttributes[2][0] = VariableFactory.bounded("gestiondecampaniascostos", 0, 0, solver);
		featureAttributes[2][1] = VariableFactory.bounded("gestiondecampaniastiempo", 0, 0, solver);
		featureAttributes[2][2] = VariableFactory.bounded("gestiondecampaniasrecursoshumanos", 0, 0, solver);
		featureAttributes[2][3] = VariableFactory.bounded("gestiondecampaniasriesgos", 0, 0, solver);

		featureAttributes[3][0] = VariableFactory.bounded("reducirciclosdeventascostos", 0, 0, solver);
		featureAttributes[3][1] = VariableFactory.bounded("reducirciclosdeventastiempo", 0, 0, solver);
		featureAttributes[3][2] = VariableFactory.bounded("reducirciclosdeventasrecursoshumanos", 0, 0, solver);
		featureAttributes[3][3] = VariableFactory.bounded("reducirciclosdeventasriesgos", 0, 0, solver);

		featureAttributes[4][0] = VariableFactory.bounded("mejorarretenciondeclientescostos", 0, 0, solver);
		featureAttributes[4][1] = VariableFactory.bounded("mejorarretenciondeclientestiempo", 0, 0, solver);
		featureAttributes[4][2] = VariableFactory.bounded("mejorarretenciondeclientesrecursoshumanos", 0, 0, solver);
		featureAttributes[4][3] = VariableFactory.bounded("mejorarretenciondeclientesriesgos", 0, 0, solver);

		featureAttributes[5][0] = VariableFactory.bounded("mejorarconocimientodelclientecostos", 0, 0, solver);
		featureAttributes[5][1] = VariableFactory.bounded("mejorarconocimientodelclientetiempo", 0, 0, solver);
		featureAttributes[5][2] = VariableFactory.bounded("mejorarconocimientodelclienterecursoshumanos", 0, 0, solver);
		featureAttributes[5][3] = VariableFactory.bounded("mejorarconocimientodelclienteriesgos", 0, 0, solver);

		featureAttributes[6][0] = VariableFactory.bounded("implementarcontrolessobreprocesosfinancieroscostos", 0, 0, solver);
		featureAttributes[6][1] = VariableFactory.bounded("implementarcontrolessobreprocesosfinancierostiempo", 0, 0, solver);
		featureAttributes[6][2] = VariableFactory.bounded("implementarcontrolessobreprocesosfinancierosrecursoshumanos", 0, 0, solver);
		featureAttributes[6][3] = VariableFactory.bounded("implementarcontrolessobreprocesosfinancierosriesgos", 0, 0, solver);

		featureAttributes[7][0] = VariableFactory.bounded("controlyadministraciondelpresupuestocostos", 0, 0, solver);
		featureAttributes[7][1] = VariableFactory.bounded("controlyadministraciondelpresupuestotiempo", 0, 0, solver);
		featureAttributes[7][2] = VariableFactory.bounded("controlyadministraciondelpresupuestorecursoshumanos", 0, 0, solver);
		featureAttributes[7][3] = VariableFactory.bounded("controlyadministraciondelpresupuestoriesgos", 0, 0, solver);

		featureAttributes[8][0] = VariableFactory.bounded("manejodeinventarioscostos", 0, 0, solver);
		featureAttributes[8][1] = VariableFactory.bounded("manejodeinventariostiempo", 0, 0, solver);
		featureAttributes[8][2] = VariableFactory.bounded("manejodeinventariosrecursoshumanos", 0, 0, solver);
		featureAttributes[8][3] = VariableFactory.bounded("manejodeinventariosriesgos", 0, 0, solver);

		featureAttributes[9][0] = VariableFactory.bounded("manejodealmacencostos", 0, 0, solver);
		featureAttributes[9][1] = VariableFactory.bounded("manejodealmacentiempo", 0, 0, solver);
		featureAttributes[9][2] = VariableFactory.bounded("manejodealmacenrecursoshumanos", 0, 0, solver);
		featureAttributes[9][3] = VariableFactory.bounded("manejodealmacenriesgos", 0, 0, solver);

		featureAttributes[10][0] = VariableFactory.bounded("gestiondecomprascostos", 0, 0, solver);
		featureAttributes[10][1] = VariableFactory.bounded("gestiondecomprastiempo", 0, 0, solver);
		featureAttributes[10][2] = VariableFactory.bounded("gestiondecomprasrecursoshumanos", 0, 0, solver);
		featureAttributes[10][3] = VariableFactory.bounded("gestiondecomprasriesgos", 0, 0, solver);

		featureAttributes[11][0] = VariableFactory.bounded("comercioexteriorcostos", 0, 0, solver);
		featureAttributes[11][1] = VariableFactory.bounded("comercioexteriortiempo", 0, 0, solver);
		featureAttributes[11][2] = VariableFactory.bounded("comercioexteriorrecursoshumanos", 0, 0, solver);
		featureAttributes[11][3] = VariableFactory.bounded("comercioexteriorriesgos", 0, 0, solver);

		featureAttributes[12][0] = VariableFactory.bounded("disminuirtiemposdeentregacostos", 0, 0, solver);
		featureAttributes[12][1] = VariableFactory.bounded("disminuirtiemposdeentregatiempo", 0, 0, solver);
		featureAttributes[12][2] = VariableFactory.bounded("disminuirtiemposdeentregarecursoshumanos", 0, 0, solver);
		featureAttributes[12][3] = VariableFactory.bounded("disminuirtiemposdeentregariesgos", 0, 0, solver);

		featureAttributes[13][0] = VariableFactory.bounded("integracionconproveedorescostos", 0, 0, solver);
		featureAttributes[13][1] = VariableFactory.bounded("integracionconproveedorestiempo", 0, 0, solver);
		featureAttributes[13][2] = VariableFactory.bounded("integracionconproveedoresrecursoshumanos", 0, 0, solver);
		featureAttributes[13][3] = VariableFactory.bounded("integracionconproveedoresriesgos", 0, 0, solver);

		featureAttributes[14][0] = VariableFactory.bounded("buscartendenciasyrelacionescostos", 0, 0, solver);
		featureAttributes[14][1] = VariableFactory.bounded("buscartendenciasyrelacionestiempo", 0, 0, solver);
		featureAttributes[14][2] = VariableFactory.bounded("buscartendenciasyrelacionesrecursoshumanos", 0, 0, solver);
		featureAttributes[14][3] = VariableFactory.bounded("buscartendenciasyrelacionesriesgos", 0, 0, solver);

		featureAttributes[15][0] = VariableFactory.bounded("compartirconocimientocostos", 0, 0, solver);
		featureAttributes[15][1] = VariableFactory.bounded("compartirconocimientotiempo", 0, 0, solver);
		featureAttributes[15][2] = VariableFactory.bounded("compartirconocimientorecursoshumanos", 0, 0, solver);
		featureAttributes[15][3] = VariableFactory.bounded("compartirconocimientoriesgos", 0, 0, solver);

		featureAttributes[16][0] = VariableFactory.bounded("predecirdisponibilidadescostos", 0, 0, solver);
		featureAttributes[16][1] = VariableFactory.bounded("predecirdisponibilidadestiempo", 0, 0, solver);
		featureAttributes[16][2] = VariableFactory.bounded("predecirdisponibilidadesrecursoshumanos", 0, 0, solver);
		featureAttributes[16][3] = VariableFactory.bounded("predecirdisponibilidadesriesgos", 0, 0, solver);

		featureAttributes[17][0] = VariableFactory.bounded("planificarcapacidadescostos", 0, 0, solver);
		featureAttributes[17][1] = VariableFactory.bounded("planificarcapacidadestiempo", 0, 0, solver);
		featureAttributes[17][2] = VariableFactory.bounded("planificarcapacidadesrecursoshumanos", 0, 0, solver);
		featureAttributes[17][3] = VariableFactory.bounded("planificarcapacidadesriesgos", 0, 0, solver);

		featureAttributes[18][0] = VariableFactory.bounded("gestiondelademandacostos", 0, 0, solver);
		featureAttributes[18][1] = VariableFactory.bounded("gestiondelademandatiempo", 0, 0, solver);
		featureAttributes[18][2] = VariableFactory.bounded("gestiondelademandarecursoshumanos", 0, 0, solver);
		featureAttributes[18][3] = VariableFactory.bounded("gestiondelademandariesgos", 0, 0, solver);

		featureAttributes[19][0] = VariableFactory.bounded("crm_modulomarketingcostos", 0, 0, solver);
		featureAttributes[19][1] = VariableFactory.bounded("crm_modulomarketingtiempo", 0, 0, solver);
		featureAttributes[19][2] = VariableFactory.bounded("crm_modulomarketingrecursoshumanos", 0, 0, solver);
		featureAttributes[19][3] = VariableFactory.bounded("crm_modulomarketingriesgos", 0, 0, solver);

		featureAttributes[20][0] = VariableFactory.bounded("crm_moduloventascostos", 0, 0, solver);
		featureAttributes[20][1] = VariableFactory.bounded("crm_moduloventastiempo", 0, 0, solver);
		featureAttributes[20][2] = VariableFactory.bounded("crm_moduloventasrecursoshumanos", 0, 0, solver);
		featureAttributes[20][3] = VariableFactory.bounded("crm_moduloventasriesgos", 0, 0, solver);

		featureAttributes[21][0] = VariableFactory.bounded("crm_modulodeclientescostos", 0, 0, solver);
		featureAttributes[21][1] = VariableFactory.bounded("crm_modulodeclientestiempo", 0, 0, solver);
		featureAttributes[21][2] = VariableFactory.bounded("crm_modulodeclientesrecursoshumanos", 0, 0, solver);
		featureAttributes[21][3] = VariableFactory.bounded("crm_modulodeclientesriesgos", 0, 0, solver);

		featureAttributes[22][0] = VariableFactory.bounded("erp_modulofinancierocostos", 0, 0, solver);
		featureAttributes[22][1] = VariableFactory.bounded("erp_modulofinancierotiempo", 0, 0, solver);
		featureAttributes[22][2] = VariableFactory.bounded("erp_modulofinancierorecursoshumanos", 0, 0, solver);
		featureAttributes[22][3] = VariableFactory.bounded("erp_modulofinancieroriesgos", 0, 0, solver);

		featureAttributes[23][0] = VariableFactory.bounded("erp_moduloadministrativocostos", 0, 0, solver);
		featureAttributes[23][1] = VariableFactory.bounded("erp_moduloadministrativotiempo", 0, 0, solver);
		featureAttributes[23][2] = VariableFactory.bounded("erp_moduloadministrativorecursoshumanos", 0, 0, solver);
		featureAttributes[23][3] = VariableFactory.bounded("erp_moduloadministrativoriesgos", 0, 0, solver);

		featureAttributes[24][0] = VariableFactory.bounded("erp_modulodeproduccioncostos", 0, 0, solver);
		featureAttributes[24][1] = VariableFactory.bounded("erp_modulodeproducciontiempo", 0, 0, solver);
		featureAttributes[24][2] = VariableFactory.bounded("erp_modulodeproduccionrecursoshumanos", 0, 0, solver);
		featureAttributes[24][3] = VariableFactory.bounded("erp_modulodeproduccionriesgos", 0, 0, solver);

		featureAttributes[25][0] = VariableFactory.bounded("erp_modulodeinteligenciadenegociocostos", 0, 0, solver);
		featureAttributes[25][1] = VariableFactory.bounded("erp_modulodeinteligenciadenegociotiempo", 0, 0, solver);
		featureAttributes[25][2] = VariableFactory.bounded("erp_modulodeinteligenciadenegociorecursoshumanos", 0, 0, solver);
		featureAttributes[25][3] = VariableFactory.bounded("erp_modulodeinteligenciadenegocioriesgos", 0, 0, solver);

		featureAttributes[26][0] = VariableFactory.bounded("erp_marketingyventascostos", 0, 0, solver);
		featureAttributes[26][1] = VariableFactory.bounded("erp_marketingyventastiempo", 0, 0, solver);
		featureAttributes[26][2] = VariableFactory.bounded("erp_marketingyventasrecursoshumanos", 0, 0, solver);
		featureAttributes[26][3] = VariableFactory.bounded("erp_marketingyventasriesgos", 0, 0, solver);

		featureAttributes[27][0] = VariableFactory.bounded("erp_modulodegestiondeproyectoscostos", 0, 0, solver);
		featureAttributes[27][1] = VariableFactory.bounded("erp_modulodegestiondeproyectostiempo", 0, 0, solver);
		featureAttributes[27][2] = VariableFactory.bounded("erp_modulodegestiondeproyectosrecursoshumanos", 0, 0, solver);
		featureAttributes[27][3] = VariableFactory.bounded("erp_modulodegestiondeproyectosriesgos", 0, 0, solver);

		featureAttributes[28][0] = VariableFactory.bounded("scm_sistemadegestiondeabastecimientocostos", 0, 0, solver);
		featureAttributes[28][1] = VariableFactory.bounded("scm_sistemadegestiondeabastecimientotiempo", 0, 0, solver);
		featureAttributes[28][2] = VariableFactory.bounded("scm_sistemadegestiondeabastecimientorecursoshumanos", 0, 0, solver);
		featureAttributes[28][3] = VariableFactory.bounded("scm_sistemadegestiondeabastecimientoriesgos", 0, 0, solver);

		int[]intscomercialtiempo = new int[4];
		intscomercialtiempo[0] = 0;
		intscomercialtiempo[1] = 24;
		intscomercialtiempo[2] = 28;
		intscomercialtiempo[3] = 30;
		
		featureAttributes[29][0] = VariableFactory.bounded("comercialcostos", 0, 710750, solver);
		featureAttributes[29][1] = VariableFactory.enumerated("comercialtiempo", intscomercialtiempo, solver);
		featureAttributes[29][2] = VariableFactory.bounded("comercialrecursoshumanos", 0, 0, solver);
		featureAttributes[29][3] = VariableFactory.bounded("comercialriesgos", 0, 64, solver);

		
		int[]intsopensourcetiempo = new int[3];
		intsopensourcetiempo[0] = 0;
		intsopensourcetiempo[0] = 30;
		intsopensourcetiempo[1] = 36;
		
		featureAttributes[30][0] = VariableFactory.bounded("opensourcecostos", 0, 286000, solver);
		featureAttributes[30][1] = VariableFactory.enumerated("opensourcetiempo", intsopensourcetiempo, solver);
		featureAttributes[30][2] = VariableFactory.bounded("opensourcerecursoshumanos", 0, 0, solver);
		featureAttributes[30][3] = VariableFactory.bounded("opensourceriesgos", 0, 126, solver);

		featureAttributes[31][0] = VariableFactory.bounded("bigbangcostos", 0, 0, solver);
		featureAttributes[31][1] = VariableFactory.bounded("bigbangtiempo", 0, 0, solver);
		featureAttributes[31][2] = VariableFactory.bounded("bigbangrecursoshumanos", 0, 0, solver);
		featureAttributes[31][3] = VariableFactory.bounded("bigbangriesgos", 0, 55, solver);

		featureAttributes[32][0] = VariableFactory.bounded("implementacionporfasescostos", 0, 0, solver);
		featureAttributes[32][1] = VariableFactory.bounded("implementacionporfasestiempo", 0, 0, solver);
		featureAttributes[32][2] = VariableFactory.bounded("implementacionporfasesrecursoshumanos", 0, 0, solver);
		featureAttributes[32][3] = VariableFactory.bounded("implementacionporfasesriesgos", 0, 110, solver);

		featureAttributes[33][0] = VariableFactory.bounded("implementacionporprocesoscostos", 0, 0, solver);
		featureAttributes[33][1] = VariableFactory.bounded("implementacionporprocesostiempo", 0, 0, solver);
		featureAttributes[33][2] = VariableFactory.bounded("implementacionporprocesosrecursoshumanos", 0, 0, solver);
		featureAttributes[33][3] = VariableFactory.bounded("implementacionporprocesosriesgos", 0, 65, solver);


		// FEATURE MODEL CONSTRAINTS (Constraints
		// Or constraints
		BoolVar[] varsOr0 = new BoolVar[19];
		varsOr0[0] = segmentarydepurarclientes;
		varsOr0[1] = analisisdemarketing;
		varsOr0[2] = gestiondecampanias;
		varsOr0[3] = reducirciclosdeventas;
		varsOr0[4] = mejorarretenciondeclientes;
		varsOr0[5] = mejorarconocimientodelcliente;
		varsOr0[6] = implementarcontrolessobreprocesosfinancieros;
		varsOr0[7] = controlyadministraciondelpresupuesto;
		varsOr0[8] = manejodeinventarios;
		varsOr0[9] = manejodealmacen;
		varsOr0[10] = gestiondecompras;
		varsOr0[11] = comercioexterior;
		varsOr0[12] = disminuirtiemposdeentrega;
		varsOr0[13] = integracionconproveedores;
		varsOr0[14] = buscartendenciasyrelaciones;
		varsOr0[15] = compartirconocimiento;
		varsOr0[16] = predecirdisponibilidades;
		varsOr0[17] = planificarcapacidades;
		varsOr0[18] = gestiondelademanda;
		SatFactory.addClauses(LogOp.or(varsOr0), solver);

		BoolVar[] varsOr2 = new BoolVar[6];
		varsOr2[0] = erp_modulofinanciero;
		varsOr2[1] = erp_moduloadministrativo;
		varsOr2[2] = erp_modulodeproduccion;
		varsOr2[3] = erp_modulodeinteligenciadenegocio;
		varsOr2[4] = erp_marketingyventas;
		varsOr2[5] = erp_modulodegestiondeproyectos;
		SatFactory.addClauses(LogOp.or(varsOr2), solver);


		// Alternative constraints
		BoolVar[] varsXor0 = new BoolVar[3];
		varsXor0[0] = crm_customerrelationshipmanagement;
		SatFactory.addClauses(LogOp.implies(crm_customerrelationshipmanagement, LogOp.nor(erp_enterpriseresourceplanning)), solver);
		SatFactory.addClauses(LogOp.implies(crm_customerrelationshipmanagement, LogOp.nor(scm_sistemadegestiondeabastecimiento)), solver);
		varsXor0[1] = erp_enterpriseresourceplanning;
		SatFactory.addClauses(LogOp.implies(erp_enterpriseresourceplanning, LogOp.nor(scm_sistemadegestiondeabastecimiento)), solver);
		varsXor0[2] = scm_sistemadegestiondeabastecimiento;
		SatFactory.addClauses(LogOp.or(varsXor0), solver);

		BoolVar[] varsXor1 = new BoolVar[2];
		varsXor1[0] = comercial;
		SatFactory.addClauses(LogOp.implies(comercial, LogOp.nor(opensource)), solver);
		varsXor1[1] = opensource;
		SatFactory.addClauses(LogOp.or(varsXor1), solver);

		BoolVar[] varsXor2 = new BoolVar[3];
		varsXor2[0] = bigbang;
		SatFactory.addClauses(LogOp.implies(bigbang, LogOp.nor(implementacionporfases)), solver);
		SatFactory.addClauses(LogOp.implies(bigbang, LogOp.nor(implementacionporprocesos)), solver);
		varsXor2[1] = implementacionporfases;
		SatFactory.addClauses(LogOp.implies(implementacionporfases, LogOp.nor(implementacionporprocesos)), solver);
		varsXor2[2] = implementacionporprocesos;
		SatFactory.addClauses(LogOp.or(varsXor2), solver);


		// Require constraints
		SatFactory.addClauses(LogOp.implies(LogOp.and(buscartendenciasyrelaciones, compartirconocimiento), erp_modulodeinteligenciadenegocio), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(segmentarydepurarclientes, analisisdemarketing, gestiondecampanias), crm_modulomarketing), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(reducirciclosdeventas, mejorarretenciondeclientes), crm_moduloventas), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(mejorarconocimientodelcliente), crm_modulodeclientes), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(implementarcontrolessobreprocesosfinancieros, controlyadministraciondelpresupuesto), erp_modulofinanciero), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(manejodeinventarios, manejodealmacen, gestiondecompras, comercioexterior), erp_moduloadministrativo), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(disminuirtiemposdeentrega, integracionconproveedores), erp_modulodeproduccion), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(gestiondelademanda), scm_sistemadegestiondeabastecimiento), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(gestiondecampanias), erp_marketingyventas), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(predecirdisponibilidades, planificarcapacidades), erp_modulodegestiondeproyectos), solver);

		// Parent-children constraints
		SatFactory.addClauses(LogOp.implies(motivadoresdenegocio, inversionti), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0));
		SatFactory.addClauses(LogOp.implies(sistemasempresariales, inversionti), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(sistemasempresariales, "=", 0));
		SatFactory.addClauses(LogOp.implies(tipodesolucion, inversionti), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(tipodesolucion, "=", 0));
		SatFactory.addClauses(LogOp.implies(modelodeimplementacion, inversionti), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(inversionti, "=", 0), IntConstraintFactory.arithm(modelodeimplementacion, "=", 0));

		// Parent-children constraints
		SatFactory.addClauses(LogOp.implies(segmentarydepurarclientes, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(segmentarydepurarclientes, "=", 0));
		SatFactory.addClauses(LogOp.implies(analisisdemarketing, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(analisisdemarketing, "=", 0));
		SatFactory.addClauses(LogOp.implies(gestiondecampanias, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondecampanias, "=", 0));
		SatFactory.addClauses(LogOp.implies(reducirciclosdeventas, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0));
		SatFactory.addClauses(LogOp.implies(mejorarretenciondeclientes, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(mejorarretenciondeclientes, "=", 0));
		SatFactory.addClauses(LogOp.implies(mejorarconocimientodelcliente, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(mejorarconocimientodelcliente, "=", 0));
		SatFactory.addClauses(LogOp.implies(implementarcontrolessobreprocesosfinancieros, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0));
		SatFactory.addClauses(LogOp.implies(controlyadministraciondelpresupuesto, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0));
		SatFactory.addClauses(LogOp.implies(manejodeinventarios, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodeinventarios, "=", 0));
		SatFactory.addClauses(LogOp.implies(manejodealmacen, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(manejodealmacen, "=", 0));
		SatFactory.addClauses(LogOp.implies(gestiondecompras, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondecompras, "=", 0));
		SatFactory.addClauses(LogOp.implies(comercioexterior, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(comercioexterior, "=", 0));
		SatFactory.addClauses(LogOp.implies(disminuirtiemposdeentrega, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(disminuirtiemposdeentrega, "=", 0));
		SatFactory.addClauses(LogOp.implies(integracionconproveedores, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(integracionconproveedores, "=", 0));
		SatFactory.addClauses(LogOp.implies(buscartendenciasyrelaciones, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0));
		SatFactory.addClauses(LogOp.implies(compartirconocimiento, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(compartirconocimiento, "=", 0));
		SatFactory.addClauses(LogOp.implies(predecirdisponibilidades, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0));
		SatFactory.addClauses(LogOp.implies(planificarcapacidades, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(planificarcapacidades, "=", 0));
		SatFactory.addClauses(LogOp.implies(gestiondelademanda, motivadoresdenegocio), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(motivadoresdenegocio, "=", 0), IntConstraintFactory.arithm(gestiondelademanda, "=", 0));
		SatFactory.addClauses(LogOp.implies(crm_modulomarketing, crm_customerrelationshipmanagement), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_customerrelationshipmanagement, "=", 0), IntConstraintFactory.arithm(crm_modulomarketing, "=", 0));
		SatFactory.addClauses(LogOp.implies(crm_moduloventas, crm_customerrelationshipmanagement), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_customerrelationshipmanagement, "=", 0), IntConstraintFactory.arithm(crm_moduloventas, "=", 0));
		SatFactory.addClauses(LogOp.implies(crm_modulodeclientes, crm_customerrelationshipmanagement), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_customerrelationshipmanagement, "=", 0), IntConstraintFactory.arithm(crm_modulodeclientes, "=", 0));
		SatFactory.addClauses(LogOp.implies(erp_modulofinanciero, erp_enterpriseresourceplanning), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0));
		SatFactory.addClauses(LogOp.implies(erp_moduloadministrativo, erp_enterpriseresourceplanning), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0));
		SatFactory.addClauses(LogOp.implies(erp_modulodeproduccion, erp_enterpriseresourceplanning), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulodeproduccion, "=", 0));
		SatFactory.addClauses(LogOp.implies(erp_modulodeinteligenciadenegocio, erp_enterpriseresourceplanning), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0));
		SatFactory.addClauses(LogOp.implies(erp_marketingyventas, erp_enterpriseresourceplanning), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_marketingyventas, "=", 0));
		SatFactory.addClauses(LogOp.implies(erp_modulodegestiondeproyectos, erp_enterpriseresourceplanning), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0), IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0));

		// Parent-children constraints
		SatFactory.addClauses(LogOp.implies(crm_customerrelationshipmanagement, sistemasempresariales), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasempresariales, "=", 0), IntConstraintFactory.arithm(crm_customerrelationshipmanagement, "=", 0));
		SatFactory.addClauses(LogOp.implies(erp_enterpriseresourceplanning, sistemasempresariales), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasempresariales, "=", 0), IntConstraintFactory.arithm(erp_enterpriseresourceplanning, "=", 0));
		SatFactory.addClauses(LogOp.implies(scm_sistemadegestiondeabastecimiento, sistemasempresariales), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(sistemasempresariales, "=", 0), IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0));
		SatFactory.addClauses(LogOp.implies(comercial, tipodesolucion), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tipodesolucion, "=", 0), IntConstraintFactory.arithm(comercial, "=", 0));
		SatFactory.addClauses(LogOp.implies(opensource, tipodesolucion), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(tipodesolucion, "=", 0), IntConstraintFactory.arithm(opensource, "=", 0));
		SatFactory.addClauses(LogOp.implies(bigbang, modelodeimplementacion), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodeimplementacion, "=", 0), IntConstraintFactory.arithm(bigbang, "=", 0));
		SatFactory.addClauses(LogOp.implies(implementacionporfases, modelodeimplementacion), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodeimplementacion, "=", 0), IntConstraintFactory.arithm(implementacionporfases, "=", 0));
		SatFactory.addClauses(LogOp.implies(implementacionporprocesos, modelodeimplementacion), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(modelodeimplementacion, "=", 0), IntConstraintFactory.arithm(implementacionporprocesos, "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(segmentarydepurarclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[0][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(segmentarydepurarclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[0][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(segmentarydepurarclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[0][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(segmentarydepurarclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[0][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(analisisdemarketing, "=", 0), IntConstraintFactory.arithm(featureAttributes[1][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(analisisdemarketing, "=", 0), IntConstraintFactory.arithm(featureAttributes[1][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(analisisdemarketing, "=", 0), IntConstraintFactory.arithm(featureAttributes[1][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(analisisdemarketing, "=", 0), IntConstraintFactory.arithm(featureAttributes[1][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecampanias, "=", 0), IntConstraintFactory.arithm(featureAttributes[2][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecampanias, "=", 0), IntConstraintFactory.arithm(featureAttributes[2][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecampanias, "=", 0), IntConstraintFactory.arithm(featureAttributes[2][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondecampanias, "=", 0), IntConstraintFactory.arithm(featureAttributes[2][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[3][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[3][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[3][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(reducirciclosdeventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[3][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarretenciondeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[4][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarretenciondeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[4][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarretenciondeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[4][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarretenciondeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[4][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarconocimientodelcliente, "=", 0), IntConstraintFactory.arithm(featureAttributes[5][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarconocimientodelcliente, "=", 0), IntConstraintFactory.arithm(featureAttributes[5][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarconocimientodelcliente, "=", 0), IntConstraintFactory.arithm(featureAttributes[5][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(mejorarconocimientodelcliente, "=", 0), IntConstraintFactory.arithm(featureAttributes[5][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[6][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[6][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[6][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementarcontrolessobreprocesosfinancieros, "=", 0), IntConstraintFactory.arithm(featureAttributes[6][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0), IntConstraintFactory.arithm(featureAttributes[7][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0), IntConstraintFactory.arithm(featureAttributes[7][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0), IntConstraintFactory.arithm(featureAttributes[7][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(controlyadministraciondelpresupuesto, "=", 0), IntConstraintFactory.arithm(featureAttributes[7][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodealmacen, "=", 0), IntConstraintFactory.arithm(featureAttributes[9][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodealmacen, "=", 0), IntConstraintFactory.arithm(featureAttributes[9][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodealmacen, "=", 0), IntConstraintFactory.arithm(featureAttributes[9][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(manejodealmacen, "=", 0), IntConstraintFactory.arithm(featureAttributes[9][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(comercioexterior, "=", 0), IntConstraintFactory.arithm(featureAttributes[11][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(comercioexterior, "=", 0), IntConstraintFactory.arithm(featureAttributes[11][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(comercioexterior, "=", 0), IntConstraintFactory.arithm(featureAttributes[11][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(comercioexterior, "=", 0), IntConstraintFactory.arithm(featureAttributes[11][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[14][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[14][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[14][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(buscartendenciasyrelaciones, "=", 0), IntConstraintFactory.arithm(featureAttributes[14][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(compartirconocimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[15][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(compartirconocimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[15][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(compartirconocimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[15][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(compartirconocimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[15][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[16][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[16][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[16][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(predecirdisponibilidades, "=", 0), IntConstraintFactory.arithm(featureAttributes[16][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondelademanda, "=", 0), IntConstraintFactory.arithm(featureAttributes[18][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondelademanda, "=", 0), IntConstraintFactory.arithm(featureAttributes[18][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondelademanda, "=", 0), IntConstraintFactory.arithm(featureAttributes[18][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(gestiondelademanda, "=", 0), IntConstraintFactory.arithm(featureAttributes[18][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_modulomarketing, "=", 0), IntConstraintFactory.arithm(featureAttributes[19][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_modulomarketing, "=", 0), IntConstraintFactory.arithm(featureAttributes[19][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_modulomarketing, "=", 0), IntConstraintFactory.arithm(featureAttributes[19][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_modulomarketing, "=", 0), IntConstraintFactory.arithm(featureAttributes[19][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_moduloventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[20][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_moduloventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[20][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_moduloventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[20][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_moduloventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[20][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_modulodeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[21][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_modulodeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[21][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_modulodeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[21][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(crm_modulodeclientes, "=", 0), IntConstraintFactory.arithm(featureAttributes[21][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0), IntConstraintFactory.arithm(featureAttributes[22][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0), IntConstraintFactory.arithm(featureAttributes[22][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0), IntConstraintFactory.arithm(featureAttributes[22][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulofinanciero, "=", 0), IntConstraintFactory.arithm(featureAttributes[22][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0), IntConstraintFactory.arithm(featureAttributes[23][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0), IntConstraintFactory.arithm(featureAttributes[23][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0), IntConstraintFactory.arithm(featureAttributes[23][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_moduloadministrativo, "=", 0), IntConstraintFactory.arithm(featureAttributes[23][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0), IntConstraintFactory.arithm(featureAttributes[25][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0), IntConstraintFactory.arithm(featureAttributes[25][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0), IntConstraintFactory.arithm(featureAttributes[25][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodeinteligenciadenegocio, "=", 0), IntConstraintFactory.arithm(featureAttributes[25][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_marketingyventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[26][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_marketingyventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[26][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_marketingyventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[26][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_marketingyventas, "=", 0), IntConstraintFactory.arithm(featureAttributes[26][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0), IntConstraintFactory.arithm(featureAttributes[27][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0), IntConstraintFactory.arithm(featureAttributes[27][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0), IntConstraintFactory.arithm(featureAttributes[27][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(erp_modulodegestiondeproyectos, "=", 0), IntConstraintFactory.arithm(featureAttributes[27][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[28][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[28][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[28][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(scm_sistemadegestiondeabastecimiento, "=", 0), IntConstraintFactory.arithm(featureAttributes[28][3], "=", 0));

		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementacionporprocesos, "=", 0), IntConstraintFactory.arithm(featureAttributes[33][0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementacionporprocesos, "=", 0), IntConstraintFactory.arithm(featureAttributes[33][1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementacionporprocesos, "=", 0), IntConstraintFactory.arithm(featureAttributes[33][2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(implementacionporprocesos, "=", 0), IntConstraintFactory.arithm(featureAttributes[33][3], "=", 0));

		IntVar[] varTiempo = new IntVar[featureAttributes.length];
		IntVar[] varRiesgo = new IntVar[featureAttributes.length];
		int maxTiempo = 0;
		int maxRiesgo = 0;
		
		for (int i = 0; i < featureAttributes.length; i ++) {
			varTiempo [i] = featureAttributes[i][1];
			varRiesgo [i] = featureAttributes[i][3];
			
			maxTiempo += featureAttributes[i][1].getDomainSize();
			maxRiesgo += featureAttributes[i][3].getDomainSize();
		}
		
		IntVar totalTiempo = VariableFactory.bounded("totalTiempo", 0, maxTiempo, solver);
		IntVar totalRiesgo = VariableFactory.bounded("totalRiesgo", 0, maxRiesgo, solver);
		
		solver.post(IntConstraintFactory.sum(varTiempo, totalTiempo));
		solver.post(IntConstraintFactory.sum(varRiesgo, totalRiesgo));
		solver.post(IntConstraintFactory.arithm(totalRiesgo, ">", 4));
		solver.post(IntConstraintFactory.arithm(totalRiesgo, "<=", 100));

		Chatterbox.showSolutions(solver);
		solver.findOptimalSolution(ResolutionPolicy.MAXIMIZE, totalTiempo);
		Chatterbox.printStatistics(solver);
	}
}
