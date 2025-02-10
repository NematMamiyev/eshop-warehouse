package az.edu.eshopwarehouse.controller;

import az.edu.eshopwarehouse.dto.request.ReqWarehouse;
import az.edu.eshopwarehouse.dto.response.RespStatus;
import az.edu.eshopwarehouse.dto.response.RespWarehouse;
import az.edu.eshopwarehouse.dto.response.Response;
import az.edu.eshopwarehouse.service.WarehouseService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/warehouses")
public class WarehouseController {
    private final WarehouseService warehouseService;

    @ResponseStatus(HttpStatus.CREATED)
   // @PreAuthorize("hasAuthority('SUPER_ADMIN')")
    @PostMapping
    public Response<RespWarehouse> addWarehouse(@RequestBody @Valid ReqWarehouse reqWarehouse){
        return warehouseService.addWarehouse(reqWarehouse);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public Response<List<RespWarehouse>> getWarehouseList(){
        return warehouseService.getWarehouseList();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Response<RespWarehouse>  getWarehouseById(@PathVariable @NotNull(message = "Id is required") Long id){
        return warehouseService.getWarehouseById(id);
    }

    @ResponseStatus(HttpStatus.OK)
   // @PreAuthorize("hasAuthority('SUPER_ADMIN')")
    @PutMapping("/{id}")
    public Response<RespWarehouse> updateWarehouse(@PathVariable @NotNull(message = "Id is required") Long id,@RequestBody @Valid ReqWarehouse reqWarehouse){
        return warehouseService.updateWarehouse(id, reqWarehouse);
    }

    @ResponseStatus(HttpStatus.OK)
   // @PreAuthorize("hasAuthority('SUPER_ADMIN')")
    @DeleteMapping("/{id}")
    public RespStatus deleteWarehouse(@PathVariable @NotNull(message = "Id is required") Long id){
        return warehouseService.deleteWarehouse(id);
    }
}
