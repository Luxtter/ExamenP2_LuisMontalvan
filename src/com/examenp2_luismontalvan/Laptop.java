/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenp2_luismontalvan;

/**
 *
 * @author luism
 */
public class Laptop extends Computadora{
    private String marca,resolution, resp;
    private boolean rgb;

    public Laptop() {
        super();
    }

    public Laptop(String marca, String resolution, String resp, boolean rgb, String host, String ip, String mask) {
        super(host, ip, mask);
        this.marca = marca;
        this.resolution = resolution;
        this.resp = resp;
        this.rgb = rgb;
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
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
    
    @Override
    public void ping() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Laptop{" + "marca=" + marca + ", resolution=" + resolution + ", resp=" + resp + ", rgb=" + rgb + '}';
    }
    
}
