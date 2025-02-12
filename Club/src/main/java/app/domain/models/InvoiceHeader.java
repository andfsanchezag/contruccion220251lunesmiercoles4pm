/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ESTUDIANTE
 */

@Setter
@Getter
@NoArgsConstructor
public class InvoiceHeader {
    private long invoiceId;
    private Person person;
    private Partner partner;
    private boolean status;
    private Date createdDate;
    private double amount;

}
