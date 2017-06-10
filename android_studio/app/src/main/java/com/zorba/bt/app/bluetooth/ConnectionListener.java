package com.zorba.bt.app.bluetooth;

public interface ConnectionListener {

    void connectionStarted(int connectionType);

    void connectionLost();
}
