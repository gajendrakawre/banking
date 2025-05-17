package com.banking.banking_web_app.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setAmount(double amount) {
}
    public void setStatus(String status) {
    }
    public void setTimestamp(LocalDateTime now) {
    }

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;
    public void setSender(User sender) {
       this.sender=sender; 
    }

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Beneficiary receiver;
    
    public void setReceiver(Beneficiary receiver2, Beneficiary receiver) {
        this.receiver=receiver;
    }
    
       
    
        

}
