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
    private int ram, storage;
    private String typeStorage, resp;
    private boolean gpu;

    public Escritorio() {
        super();
    }

    public Escritorio(int ram, int storage, String typeStorage, String resp, boolean gpu, String host, String ip, String mask) {
        super(host, ip, mask);
        this.ram = ram;
        this.storage = storage;
        this.typeStorage = typeStorage;
        this.resp = resp;
        this.gpu = gpu;
    }

    


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
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
        return "Escritorio{" + "ram=" + ram + ", storage=" + storage + ", typeStorage=" + typeStorage + ", resp=" + resp + ", gpu=" + gpu + '}';
    }

    
    
}
