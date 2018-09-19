package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DataUltimaAlteracaoCurriculo {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Entidade
	 * @return Var
	 */
	// dataUltimaAlteracaoCurriculo
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

			public Var call() throws Exception {
				cronapi.object.Operations
						.setObjectField(Entidade, Var.valueOf("idFuncJanus"), cronapi.database.Operations.getField(
								cronapi.database.Operations.query(Var.valueOf("app.entity.User"),
										Var.valueOf("select u.id from User u where u.login = :login"),
										Var.valueOf("login", cronapi.util.Operations.getCurrentUserName())),
								Var.valueOf("this[0]")));
				return Entidade;
			}
		}.call();
	}

}
