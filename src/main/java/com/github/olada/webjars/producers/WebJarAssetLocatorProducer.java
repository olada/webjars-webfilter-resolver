package com.github.olada.webjars.producers;

import org.webjars.WebJarAssetLocator;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * Created by David Olah (@olada)
 * Date: 01.05.2018 - 16:03.
 */
public class WebJarAssetLocatorProducer {
    @Produces @ApplicationScoped
    public WebJarAssetLocator webJarAssetLocator() {
        return new WebJarAssetLocator();
    }
}
