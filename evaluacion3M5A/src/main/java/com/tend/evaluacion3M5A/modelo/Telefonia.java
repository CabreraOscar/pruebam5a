/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tend.evaluacion3M5A.modelo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author ASUS ROG
 */
@Document(collection="Telefonia")
@Data
class Telefonia {
    private String tipo_telefonia;
    private String telefono;
    
}
