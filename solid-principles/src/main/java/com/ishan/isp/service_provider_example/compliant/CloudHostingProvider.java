package com.ishan.isp.service_provider_example.compliant;

import java.util.List;

public interface CloudHostingProvider {
    void addServer(String region, String serverId);

    List<String> listServers(String region);
}
