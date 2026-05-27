package br.edu.listatarefas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.listatarefas.model.Tarefa;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	private static List<Tarefa> tarefas = new ArrayList<>();
	private static Long proximoId = 1L;

	// ROTA: GET http://localhost:9090/tarefas
	@GetMapping
	public List<Tarefa> listarTarefas() {
		return tarefas;
	}

	// ROTA: POST http://localhost:9090/tarefas
	@PostMapping
	public String cadastrarTarefa(@RequestBody Tarefa tarefa) {
		tarefa.setId(proximoId++);
		tarefas.add(tarefa);
		return "Tarefa cadastrada com sucesso! \n" + tarefa.getTitulo() + " - " + tarefa.getDescricao();
	}

	/*
	 * json teste

	{
  "titulo": "entregar projeto",
  "descricao": "entregar projeto individual",
  "concluida": false
}
	 */


	// ROTA: PUT http://localhost:9090/tarefas/{id}
	@PutMapping("/{id}")
	public String atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
		for (Tarefa t : tarefas) {
			if (t.getId().equals(id)) {
				t.setTitulo(tarefaAtualizada.getTitulo());
				t.setDescricao(tarefaAtualizada.getDescricao());
				t.marcarConclusao(tarefaAtualizada.foiConcluida());
				return "Tarefa atualizada com sucesso!";
			}
		}
		return "Tarefa nao encontrada!";
	}

		/*
	 json teste

{
  "titulo": "entregar projeto",
  "descricao": "entregar projeto individual",
  "concluida": true
}

	 */

	

	// ROTA: DELETE http://localhost:9090/tarefas/{id}
	@DeleteMapping("/{id}")
	public String deletarTarefa(@PathVariable Long id) {
		for (Tarefa t : tarefas) {
			if (t.getId().equals(id)) {
				tarefas.remove(t);
				return "Tarefa removida com sucesso!";
			}
		}
		return "Tarefa nao encontrada!";
	}
}
