package com.demo.hazelcast;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;

import java.io.Serializable;

@Data
@KeySpace("tesDomain1")
public class TestDomain implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    private String name;
}
