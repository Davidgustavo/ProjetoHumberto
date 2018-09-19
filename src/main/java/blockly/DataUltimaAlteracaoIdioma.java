package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DataUltimaAlteracaoIdioma {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Entidade
	 * @return Var
	 */
	// dataUltimaAlteracaoIdioma
	public static Var exibeData(Var Entidade) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.object.Operations.setObjectField(Entidade, Var.valueOf("dataUltimaAlteracao"),
						cronapi.dateTime.Operations.getNowNoHour());
				return Entidade;
			}
		}.call();
	}

	/**
	 *
	 * @param Entidade
	 * @return Var
	 */
	// Descreva esta função...
	public static Var obterId(Var Entidade) throws Exception {
		return new Callable<Var>() {

			private Var query = Var.VAR_NULL;

			public Var call() throws Exception {
				query = cronapi.database.Operations
						.query(Var.valueOf("diagram.curriculo.entity.FuncionarioCV"),
								Var.valueOf("select f.id from FuncionarioCV f where f.idFuncJanus = :idFuncJanus"),
								Var.valueOf("idFuncJanus", cronapi.database.Operations.getField(
										cronapi.database.Operations.query(Var.valueOf("app.entity.User"),
												Var.valueOf("select u.id from User u where u.login = :login"),
												Var.valueOf("login", cronapi.util.Operations.getCurrentUserName())),
										Var.valueOf("this[0]"))));
				cronapi.object.Operations.setObjectField(Entidade, Var.valueOf("funcionarioCV"),
						cronapi.object.Operations.newObject(Var.valueOf("diagram.curriculo.entity.FuncionarioCV"), Var
								.valueOf("id", cronapi.database.Operations.getField(query, Var.valueOf("this[0]")))));
				return Entidade;
			}
		}.call();
	}

}
