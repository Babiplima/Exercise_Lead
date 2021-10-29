package com.zup.br.Lead.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lead")
public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarLead(LeadDTO leadDTO){
        leadService.salvarLead(leadDTO);
    }

    @GetMapping
    public List<LeadDTO> exibirMailling(){
        return leadService.retornarLeads();
    }
}