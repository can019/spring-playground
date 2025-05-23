package com.github.can019.spring.playground.bean.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeScopeWrapper {

    @Autowired
    public Inner inner;
}
