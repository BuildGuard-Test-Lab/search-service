package com.buildguard.search;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/search")
public class SearchController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "healthy", "service", "search-service");
    }

    @GetMapping
    public Map<String, Object> search(@RequestParam String q) {
        return Map.of("query", q, "results", new Object[]{}, "total", 0);
    }
}
