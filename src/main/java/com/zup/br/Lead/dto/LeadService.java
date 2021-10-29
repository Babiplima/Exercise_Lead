package com.zup.br.Lead.dto;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    private List<LeadDTO> mailing = new ArrayList<>();

    public void salvarLead(LeadDTO leadDTO){
        mailing.add(leadDTO);
    }

    public List<LeadDTO> retornarLeads(){
        return mailing;
    }
}
