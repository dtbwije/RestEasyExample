package org.arm.example;

import com.google.inject.internal.ImmutableSet;

import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * Created by tharanga on 3/21/16.
 */
public class ApplicationImpl extends Application {

    private static final ImmutableSet services = ImmutableSet.of(
            ExampleResourceExample.class
    );

    @Override
    public Set<Class<?>> getClasses() {
        return services;
    }
}
