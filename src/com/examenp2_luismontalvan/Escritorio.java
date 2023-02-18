/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenp2_luismontalvan;

/**
 *
 * @author luism
 */
public class Escritorio extends Computadora{
    private String ram, storage;
    private String typeStorage, resp;
    private boolean gpu;

    public Escritorio() {
        super();
    }

    public Escritorio(String ram, String storage, String typeStorage, String resp, boolean gpu, String host, String ip, String mask) {
        super(host, ip, mask);
        this.ram = ram;
        this.storage = storage;
        this.typeStorage = typeStorage;
        this.resp = resp;
        this.gpu = gpu;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getRam() {
        return ram;
    }

    
    

    

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getTypeStorage() {
        return typeStorage;
    }

    public void setTypeStorage(String typeStorage) {
        this.typeStorage = typeStorage;
    }

    public boolean isGpu() {
        return gpu;
    }

    public void setGpu(boolean gpu) {
        this.gpu = gpu;
    }
    
    @Override
    public void ping() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString()+"RAM: " + ram + " GB\nStorage: " + storage + " GB\nType: " + typeStorage + "\nGPU: " + resp;
    }

    
    
}
