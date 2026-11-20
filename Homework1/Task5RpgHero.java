//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task5RpgHero {
    public static void main(String[] args) {
        int strength = (int) (Math.random()*11)+8;
        int agility = (int) (Math.random()*11)+8;
        int intelligence = (int) (Math.random()*11)+8;
        int HP = strength*10 + agility*2;
        int MP = intelligence*15;
        int armor = agility/2;
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        int monster_attack = (int) (Math.random()*23)+2;
        int playerAttack = dice1 + dice2 + strength;
        boolean isPlayerVictory = playerAttack > monster_attack;


        System.out.println("/**************************************************\\\n" +
                           "|                 ПАСПОРТ ГЕРОЯ RPG                |\n" +
                           "\\**************************************************/\n" +
                           "Ім'я персонажа:          Артур Миша\n" +
                           "Клас:                    Мечник\n" +
                           "" +
                           "                  [ХАРАКТЕРИСТИКИ]\n" +
                           "Сила (STR):              "+ strength +"\n" +
                           "Спритність (AGI):        "+ agility +"\n" +
                           "Інтелект (INT):          "+ intelligence +"" +
                           "\n" +
                           "[ПОХІДНІ АТРИБУТИ]\n" +
                           "Очки здоров'я (HP):      "+ HP +"\n" +
                           "Очки мани (MP):          "+ MP +"\n" +
                           "Клас броні (Armor):      "+ armor +"\n" +
                           "\n" +
                           "                  [СИМУЛЯЦІЯ БОЮ]\n" +
                           "Кидок кубиків гравця:    "+ dice1+ " | " +dice2+"\n" +
                           "Загальна атака гравця:   "+ playerAttack +"\n" +
                           "Сила удару монстра:      "+ monster_attack +"\n" +
                           "Чи переміг гравець?      "+ isPlayerVictory +"\n" +
                           "\\**************************************************/");

    }
}