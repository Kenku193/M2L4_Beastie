package org.example.service;

import org.example.repository.FileWorker;
import org.example.repository.FileWorkerInterface;

public class Crypto implements EncryptionInterface{

    FileWorkerInterface file = new FileWorker();

    @Override
    public void doCrypt() {
        file.readFile();

    }


}
