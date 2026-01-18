package com.ishan.isp.service_provider_example.violated;

import java.io.File;
import java.util.List;

public interface CloudProvider {

    void addServer(String region, String serverId);

    List<String> listServers(String region);

    String getCDNAddress();

    void uploadFile(String name);

    File getFile(String name);
}
