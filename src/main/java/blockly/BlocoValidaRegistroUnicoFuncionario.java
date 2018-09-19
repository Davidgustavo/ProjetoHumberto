package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoValidaRegistroUnicoFuncionario {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// BlocoValidaRegistroUnicoFuncionario
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var query = Var.VAR_NULL;

			public Var call() throws Exception {
				query = cronapi.database.Operations.getField(
						cronapi.database.Operations.query(Var.valueOf("diagram.curriculo.entity.FuncionarioCV"),
								Var.valueOf("select f.id from FuncionarioCV f where f.idFuncJanus = :idFuncJanus"),
								Var.valueOf("idFuncJanus", cronapi.database.Operations.getField(
										cronapi.database.Operations.query(Var.valueOf("app.entity.User"),
												Var.valueOf("select u.id from User u where u.login = :login"),
												Var.valueOf("login", cronapi.util.Operations.getCurrentUserName())),
										Var.valueOf("this[0]")))),
						Var.valueOf("this[0]"));
				return query;
			}
		}.call();
	}

}
