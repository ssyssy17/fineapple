package com.genie.fineapple.config.stomp;

import java.security.Principal;

public class StompPrincipal implements Principal {
    public String name;

    public StompPrincipal(String name) { this.name = name; }

    @Override
    public String getName() { return name;}
}