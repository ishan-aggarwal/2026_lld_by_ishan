package com.ishan.isp.service_provider_example.compliant;

import java.io.File;

public interface CloudStorageProvider {
    void uploadFile(String name);

    File getFile(String name);
}
