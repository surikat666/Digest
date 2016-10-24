package com.strokova.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

@Service
public class FileLoadService implements IFileLoadService {
    public byte[] downloadFileData(String src) {

        try (ByteArrayOutputStream os = new ByteArrayOutputStream();
        InputStream is = new URL(src).openStream()){
            byte[] buffer = new byte[4096];
            int bytesRead = 0;
            while((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.flush();
            return os.toByteArray();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



//    ExecutorService pool = Executors.newFixedThreadPool(10);
//for (String name : fileNames) {
//        pool.submit(new DownloadTask(name, toPath));
//    }
//pool.shutdown();
//pool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
//    // all tasks have now finished (unless an exception is thrown above)
//
//    private static class DownloadTask implements Runnable {
//
//        private String name;
//        private final String toPath;
//
//        public DownloadTask(String name, String toPath) {
//            this.name = name;
//            this.toPath = toPath;
//        }
//
//        @Override
//        public void run() {
//            // surround with try-catch if downloadFile() throws something
//            downloadFile(name, toPath);
//        }
//    }
}
