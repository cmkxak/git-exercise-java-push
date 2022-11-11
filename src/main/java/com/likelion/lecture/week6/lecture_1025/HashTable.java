package com.likelion.lecture.week6.lecture_1025;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTable {

    class Node{
        String key;
        Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    private int size = 10000;
    private List<Node>[] hashTable = new ArrayList[1000];

    public HashTable(){}

    public HashTable(int size) {
        this.size = size;
        this.hashTable = new ArrayList[size];
    }

    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, int value){
        int idx = hash(key);
        if(this.hashTable[idx] == null){
            this.hashTable[idx] = new ArrayList<>();
        }
        //Map, or Object
        this.hashTable[idx].add(new Node(key, value));
    }

    public Integer get(String key) {
        List<Node> nodes = this.hashTable[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                System.out.println(node.getKey() + " 는(은) " + node.getValue() + " 방에 저장되었습니다. ");
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};
        HashTable hashTableEx = new HashTable(200);
        Set<String> nameSet = new HashSet<>();

        for (int i = 0; i < names.length; i++) {
            hashTableEx.insert(names[i], hashTableEx.hash(names[i]));
        }

        for (int i = 0; i < names.length; i++) {
            hashTableEx.get(names[i]);
        }

    }
}
