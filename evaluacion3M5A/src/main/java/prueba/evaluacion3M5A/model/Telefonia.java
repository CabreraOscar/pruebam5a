package prueba.evaluacion3M5A.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Telefonia")
@Data
public class Telefonia {

    private String tipo_telefonia;
    private String telefono;
}
