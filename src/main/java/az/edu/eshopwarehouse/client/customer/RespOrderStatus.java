package az.edu.eshopwarehouse.client.customer;

import az.edu.eshopwarehouse.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RespOrderStatus {
    private Long id;
    private Status status;
    private Date dataDate;
}
