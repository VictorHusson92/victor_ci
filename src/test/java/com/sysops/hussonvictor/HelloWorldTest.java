package com.sysops.hussonvictor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    public void should_return_hello_world(){
       HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.helloWorld();

        assertThat(result).isEqualTo("Hello World");
    }

}