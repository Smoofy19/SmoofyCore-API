package de.smoofy.core.api.message;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;

/**
 *
 */
public interface ITextBuilder {

    /**
     * @param hover the hover message
     * @return the TextBuilder
     */
    ITextBuilder hover(String hover);

    /**
     * @param action the click action {@link ClickEvent.Action}
     * @param click  the execution of the click
     * @return the TextBuilder
     */
    ITextBuilder click(ClickEvent.Action action, String click);

    /**
     * @return the built TextComponent
     */
    TextComponent build();
}
