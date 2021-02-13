package com.velog.samples.gson;

import java.util.List;
import java.util.Map;

public class JsonSampleObject {

    private String s;
    private int i;
    private boolean b;
    private Map<String, String> map;
    private List<String> list;

    public JsonSampleObject(String s, int i, boolean b, Map<String, String> map, List<String> list) {
        this.s = s;
        this.i = i;
        this.b = b;
        this.map = map;
        this.list = list;
    }

    public String getS() {
        return s;
    }

    public JsonSampleObject setS(String s) {
        this.s = s;
        return this;
    }

    public int getI() {
        return i;
    }

    public JsonSampleObject setI(int i) {
        this.i = i;
        return this;
    }

    public boolean isB() {
        return b;
    }

    public JsonSampleObject setB(boolean b) {
        this.b = b;
        return this;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public JsonSampleObject setMap(Map<String, String> map) {
        this.map = map;
        return this;
    }

    public List<String> getList() {
        return list;
    }

    public JsonSampleObject setList(List<String> list) {
        this.list = list;
        return this;
    }
}
