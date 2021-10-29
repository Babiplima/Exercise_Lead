package com.zup.br.Lead.dto;

import java.util.List;

public class LeadDTO {

        private String nome;
        private String email;
        private String telefone;
        private List<ProdutoDTO> produtos;


        public LeadDTO(String nome, String email, String telefone) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
        }
    }


