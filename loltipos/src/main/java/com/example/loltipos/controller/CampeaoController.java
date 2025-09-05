package com.example.loltipos.controller;

import com.example.loltipos.exception.RecursoNaoEncontradoException;
import com.example.loltipos.model.Campeao;
import com.example.loltipos.repository.CampeaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campeoes")
public class CampeaoController {

    @Autowired
    private CampeaoRepository campeaoRepository;

    // GET: Listar todos os campeões
    @GetMapping
    public ResponseEntity<List<Campeao>> listarTodos() {
        List<Campeao> campeoes = campeaoRepository.findAll();
        return new ResponseEntity<>(campeoes, HttpStatus.OK);
    }

    // GET: Buscar campeão por ID
    @GetMapping("/{id}")
    public ResponseEntity<Campeao> buscarPorId(@PathVariable Long id) {
        Campeao campeao = campeaoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Campeão com ID " + id + " não encontrado."));
        return ResponseEntity.ok(campeao);
    }

    // POST: Adicionar novo campeão
    @PostMapping
    public ResponseEntity<Campeao> criarCampeao(@Valid @RequestBody Campeao campeao) {
        Campeao salvo = campeaoRepository.save(campeao);
        return new ResponseEntity<>(salvo, HttpStatus.CREATED);
    }

    // PUT: Atualizar campeão completo
    @PutMapping("/{id}")
    public ResponseEntity<Campeao> atualizarCampeao(@PathVariable Long id, @Valid @RequestBody Campeao dadosAtualizados) {
        Campeao campeao = campeaoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Campeão com ID " + id + " não encontrado."));

        campeao.setNome(dadosAtualizados.getNome());
        campeao.setFuncao(dadosAtualizados.getFuncao());
        campeao.setDificuldade(dadosAtualizados.getDificuldade());

        Campeao atualizado = campeaoRepository.save(campeao);
        return ResponseEntity.ok(atualizado);
    }

    // DELETE: Remover campeão
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCampeao(@PathVariable Long id) {
        Campeao campeao = campeaoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Campeão com ID " + id + " não encontrado."));

        campeaoRepository.delete(campeao);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}