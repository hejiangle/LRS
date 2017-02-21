package com.example.service;


import com.example.model.Room;
import javafx.util.Pair;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

@Service
public class LrsService {

    private Map<String,Pair<Room, Queue<String>>> map = new HashMap<>();

    public String create(Room room){
        String number = randomRoomNumber();
        LinkedList<String> list = new LinkedList<>();

        if(room.getFortuneTeller()) list.add("预言家");
        if(room.getWitch()) list.add("女巫");
        if(room.getHunter()) list.add("猎人");
        if(room.getSavior()) list.add("守卫");
        IntStream.range(0, room.getTownsFolks()).forEach((i) -> list.add("平民"));
        IntStream.range(0, room.getWerewolves()).forEach((i) -> list.add("狼人"));
        Collections.shuffle(list);
        Pair pair = new Pair(room,list);
        map.put(number, pair);
        return number;
    }

    public synchronized String join(String number){
        Pair<Room, Queue<String>> pair = map.get(number);
        if(pair == null) return null;
        return  pair.getValue().poll();
    }

    private String randomRoomNumber(){
        String number;
        do{
            number = String.valueOf(Math.abs(ThreadLocalRandom.current().nextInt()));
        }while(map.containsKey(number));
        return number;
    }

    public Room room(String number){
        return map.get(number).getKey();
    }

}
