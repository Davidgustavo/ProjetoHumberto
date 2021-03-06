package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoFiltroIDLogado {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// BlocoFiltroIDLogado
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var query = Var.VAR_NULL;

			public Var call() throws Exception {
				query = cronapi.database.Operations.getField(
						cronapi.database.Operations.query(Var.valueOf("app.entity.User"),
								Var.valueOf("select u.id from User u where u.login = :login"),
								Var.valueOf("login", cronapi.util.Operations.getCurrentUserName())),
						Var.valueOf("this[0]"));
				return query;
			}
		}.call();
	}

}
