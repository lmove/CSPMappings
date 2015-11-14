package co.edu.uniandes.mapping.featuremodel;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class MappingTCOptional {

	public void solveProblem() {
		Solver solver = new Solver( );
	
		// Optional for child feature of root node
		BoolVar A = VariableFactory.bool("A", solver);
		BoolVar A1 = VariableFactory.bool("A1", solver);
		
		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}