package ru.ganin.battleships.model;

import java.util.Map;

/**
 * Created by Sergey on 13.03.2017.
 */
public class Player extends Model {
    private static final int BATTLE_SHIP_4_DECK_COUNT = 1;
    private static final int BATTLE_SHIP_3_DECK_COUNT = 2;
    private static final int BATTLE_SHIP_2_DECK_COUNT = 3;
    private static final int BATTLE_SHIP_1_DECK_COUNT = 4;

    private String name;
    private Field field;

    public Player(String name, Field field) {
        this.name = name;
        this.field = field;
    }

    public Field getField() {
                return field;
        }

        public void setField(Field field) {
                this.field = field;
        }


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

    public void setShips (){
        //  достаем из спрингового контекста прототипы, циклы по константам, считаем, что мы вводим координаты с консоли
        System.out.println("d");
        // для каждого корабля - установка на поле

    }

}
