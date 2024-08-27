package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/example")
public class ExampleController{

    @Post("/")
    public HttpResponse<ExampleDto> createTour(@Body ExampleDto exampleDto) {
        // Process the tourDto, e.g., save to a database
        System.out.println("Received Tour: " + exampleDto.getName() + ", Duration: " + exampleDto.getDuration());

        // Return the created TourDto as a response
        return HttpResponse.created(exampleDto);
    }
}