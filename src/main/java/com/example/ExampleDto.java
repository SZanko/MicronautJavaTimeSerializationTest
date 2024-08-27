package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.time.Duration;

@Introspected
@Data
@Serdeable
public class ExampleDto {
    @JsonProperty
    private String name;
    @JsonDeserialize
    @JsonSerialize
    @JsonProperty
    private Duration duration;
}
