/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenp2_luismontalvan;

/**
 *
 * @author luism
 */
public abstract class Computadora {
    private String host, ip, mask;

    public Computadora() {
    }

    public Computadora(String host, String ip, String mask) {
        this.host = host;
        this.ip = ip;
        this.mask = mask;
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
    
    public abstract void ping();

    @Override
    public String toString() {
        return "Computadora{" + "host=" + host + ", ip=" + ip + ", mask=" + mask + '}';
    }
    
}
