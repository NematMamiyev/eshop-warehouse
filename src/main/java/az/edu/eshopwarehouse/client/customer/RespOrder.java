package az.edu.eshopwarehouse.client.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RespOrder {
    private Long id;
    private RespCustomer respCustomer;
    private BigDecimal amount;
    private Map<Long, Integer> productDetailsQuantityMap;
    private List<RespOrderStatus> respOrderStatusList;
}
