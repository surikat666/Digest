package com.strokova.service;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;


public class FileLoadService implements IFileLoadService {
    public File downloadFile(String src) {
        return null;
    }

    private void download(String fileURL, String destinationDirectory) throws IOException {
        // File name that is being downloaded
        String downloadedFileName = fileURL.substring(fileURL.lastIndexOf("/")+1);

        // Open connection to the file
        URL url = new URL(fileURL);
        InputStream is = url.openStream();
        // Stream to the destionation file
        FileOutputStream fos = new FileOutputStream(destinationDirectory + "/" + downloadedFileName);

        // Read bytes from URL to the local file
        byte[] buffer = new byte[4096];
        int bytesRead = 0;

        System.out.print("Downloading " + downloadedFileName);
        while ((bytesRead = is.read(buffer)) != -1) {
            System.out.print(".");  // Progress bar :)
            fos.write(buffer,0,bytesRead);
        }
        System.out.println("done!");

        // Close destination stream
        fos.close();
        // Close URL stream
        is.close();
    }
    public byte[] readContent(String path) throws IOException{
        ByteArrayOutputStream out = null;
        InputStream input = null;
        try{
            out = new ByteArrayOutputStream();
            input = new BufferedInputStream(new FileInputStream(path));
            int data = 0;
            while ((data = input.read()) != -1){
                out.write(data);
            }
        }
        finally{
            if (null != input){
                input.close();
            }
            if (null != out){
                out.close();
            }
        }
        return out.toByteArray();
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
