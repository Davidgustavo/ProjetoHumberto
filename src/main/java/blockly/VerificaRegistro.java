package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class VerificaRegistro {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// VerificaRegistro
	public static Var VerificaRegistro() throws Exception {
		return new Callable<Var>() {

			private Var Registro = Var.VAR_NULL;
			private Var historico = Var.VAR_NULL;
			private Var curso = Var.VAR_NULL;
			private Var formacao = Var.VAR_NULL;
			private Var certificado = Var.VAR_NULL;
			private Var idioma = Var.VAR_NULL;
			private Var habilidade = Var.VAR_NULL;

			public Var call() throws Exception {
				Registro = cronapi.database.Operations.query(Var.valueOf("diagram.curriculo.entity.FuncionarioCV"),
						Var.valueOf("select f from FuncionarioCV f"));
				historico = cronapi.database.Operations.query(Var.valueOf("diagram.curriculo.entity.HistoricoCV"),
						Var.valueOf("select h from HistoricoCV h"));
				curso = cronapi.database.Operations.query(Var.valueOf("diagram.curriculo.entity.CursoCV"),
						Var.valueOf("select c from CursoCV c"));
				formacao = cronapi.database.Operations.query(Var.valueOf("diagram.curriculo.entity.FormacaoCV"),
						Var.valueOf("select f from FormacaoCV f"));
				certificado = cronapi.database.Operations.query(Var.valueOf("diagram.curriculo.entity.CertificacaoCV"),
						Var.valueOf("select c from CertificacaoCV c"));
				idioma = cronapi.database.Operations.query(Var.valueOf("diagram.curriculo.entity.IdiomaCV"),
						Var.valueOf("select i from IdiomaCV i"));
				habilidade = cronapi.database.Operations.query(Var.valueOf("diagram.curriculo.entity.HabilidadesCV"),
						Var.valueOf("select h from HabilidadesCV h"));
				if (cronapi.database.Operations.hasElement(Registro).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
							Var.valueOf("historicoCV"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
							Var.valueOf("historicoCV"));
				}
				if (cronapi.database.Operations.hasElement(historico).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
							Var.valueOf("cursoCV"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
							Var.valueOf("cursoCV"));
				}
				if (cronapi.database.Operations.hasElement(curso).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
							Var.valueOf("formacaoCV"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
							Var.valueOf("formacaoCV"));
				}
				if (cronapi.database.Operations.hasElement(formacao).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
							Var.valueOf("certificadoCV"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
							Var.valueOf("certificadoCV"));
				}
				if (cronapi.database.Operations.hasElement(certificado).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
							Var.valueOf("idiomaCV"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
							Var.valueOf("idiomaCV"));
				}
				if (cronapi.database.Operations.hasElement(idioma).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
							Var.valueOf("habilidadeCV"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
							Var.valueOf("habilidadeCV"));
				}
				if (cronapi.database.Operations.hasElement(habilidade).getObjectAsBoolean()) {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.enableComponent"),
							Var.valueOf("rhCV"));
				} else {
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
							Var.valueOf("rhCV"));
				}
				return Var.VAR_NULL;
			}
		}.call();
	}

}
