package org.vaadin.addons.lazytooltip.client;

import com.vaadin.shared.communication.ClientRpc;

public interface LazyTooltipClientRpc extends ClientRpc {
    public void updateTooltip(long tooltipId, String elementId, String tooltipText);
}
