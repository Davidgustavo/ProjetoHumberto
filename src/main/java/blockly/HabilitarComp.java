package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class HabilitarComp {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// HabilitarComp
	public static Var Historico() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return Var.VAR_NULL;
			}
		}.call();
	}

}
