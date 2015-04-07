package org.dasein.cloud.ci;

import java.util.Locale;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.dasein.cloud.AccessControlledService;
import org.dasein.cloud.CloudException;
import org.dasein.cloud.InternalException;
import org.dasein.cloud.ResourceStatus;
import org.dasein.cloud.Tag;

public interface ConvergedHttpLoadBalancerSupport extends AccessControlledService {

    public @Nonnull String getProviderTermForConvergedHttpLoadBalancer(@Nonnull Locale locale);

    public @Nullable ConvergedHttpLoadBalancer getConvergedHttpLoadBalancer(@Nonnull String convergedHttpLoadbalancerId) throws CloudException, InternalException;

    public boolean isSubscribed() throws CloudException, InternalException;

    public @Nonnull Iterable<ConvergedHttpLoadBalancer> listConvergedHttpLoadBalancers(@Nullable ConvergedHttpLoadBalancerFilterOptions options) throws CloudException, InternalException;

    public @Nonnull Iterable<ResourceStatus> listConvergedHttpLoadBalancerStatus() throws InternalException, CloudException;

    public void updateTags(@Nonnull String convergedHttpLoadbalancerId, @Nonnull Tag... tags) throws CloudException, InternalException;

    public void updateTags(@Nonnull String[] convergedHttpLoadbalancerIds, @Nonnull Tag... tags) throws CloudException, InternalException;

    public void removeTags(@Nonnull String convergedHttpLoadbalancerId, @Nonnull Tag... tags) throws CloudException, InternalException;

    public void removeTags(@Nonnull String[] convergedHttpLoadbalancerIds, @Nonnull Tag... tags) throws CloudException, InternalException;

    public String createConvergedHttpLoadBalancer(@Nonnull ConvergedHttpLoadbalancerOptions withConvergedHttpLoadbalancerOptions) throws CloudException, InternalException;

    public void removeConvergedHttpLoadBalancers(String[] convergedHttpLoadBalancerIds) throws CloudException, InternalException;
}
