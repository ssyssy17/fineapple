package com.genie.fineapple.order;

import com.genie.fineapple.common.BasicResponse;
import com.genie.fineapple.common.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @PostMapping("/")
    public ResponseEntity<? extends BasicResponse> order(OrderDto orderDto) {
        return ResponseEntity.ok().build();
    }
}
