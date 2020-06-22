package com.advance.bank.bank.system.model.contract;

import com.advance.bank.bank.system.model.enums.ContractType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


@Entity
@Table(name = "contract_details")
public class ContractDetails {
    private static final ObjectMapper mapper = new ObjectMapper();

    @Id
    private Long id;
    @Column(columnDefinition = "jsonb")
    private BigDecimal interest;

    @Column
    @Enumerated(EnumType.STRING)
    private ContractType contractType = ContractType.NONE;
    @Column
    private Long principal;         // glavnica

    @Column
    private String additionalInfo;


    public Long getId() {
        return id;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public Long getPrincipal() {
        return principal;
    }

    public void setPrincipal(Long principal) {
        this.principal = principal;
    }

    public Map<String, Object> getAdditionalInfo() throws JsonProcessingException {     //dobavqne na exception i predavane na sledvashtiq method - v sluchaq tova e rabota na service
        return mapper.readValue(additionalInfo,Map.class);
    }

    public void setAdditionalInfo(Map<String, Object> additionalInfo) throws JsonProcessingException {

        this.additionalInfo = mapper.writeValueAsString(additionalInfo);
    }
}
