package com.novoda.downloadmanager.lib;

public interface DownloadClientReadyChecker {
    Ready READY = new Ready();

    boolean isAllowedToDownload();

    /**
     * Ready specifies that it is always ready to download
     */
    class Ready implements DownloadClientReadyChecker {

        @Override
        public boolean isAllowedToDownload() {
            return true;
        }
    }
}