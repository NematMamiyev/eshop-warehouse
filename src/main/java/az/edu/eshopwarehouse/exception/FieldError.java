package az.edu.eshopwarehouse.exception;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FieldError {
    private String fieldName;
    private String message;
}