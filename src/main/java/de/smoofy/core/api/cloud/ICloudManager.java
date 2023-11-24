package de.smoofy.core.api.cloud;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import eu.cloudnetservice.driver.event.EventManager;
import eu.cloudnetservice.driver.provider.CloudServiceProvider;
import eu.cloudnetservice.driver.provider.ServiceTaskProvider;
import eu.cloudnetservice.modules.bridge.BridgeServiceHelper;
import eu.cloudnetservice.modules.bridge.player.PlayerManager;
import eu.cloudnetservice.wrapper.configuration.WrapperConfiguration;

/**
 *
 */
public interface ICloudManager {

    /**
     * @return the {@link PlayerManager}
     */
    PlayerManager playerManager();

    /**
     * @return the {@link CloudServiceProvider}
     */
    CloudServiceProvider cloudServiceProvider();

    /**
     * @return the {@link ServiceTaskProvider}
     */
    ServiceTaskProvider serviceTaskProvider();

    /**
     * @return the {@link EventManager}
     */
    EventManager eventManager();

    /**
     * @return the {@link WrapperConfiguration}
     */
    WrapperConfiguration wrapperConfiguration();

    /**
     * @return the {@link BridgeServiceHelper}
     */
    BridgeServiceHelper bridgeServiceHelper();
}
