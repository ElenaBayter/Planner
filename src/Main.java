/*
С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом
и продолжаем погружаться в ООП.
Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.

Например:
Должен быть класс Задачи (общий/родительский и подтипы)
У задачи должно быть длительность, дедлайн, приоритет, тема, ответсвенный... -
параметры на Ваше усмотрение
**У задачи должна быть возможность включить или выключить нотификацию на разные события,
например, приближение дедлайна.

Должен быть класс Календарь, в который можно добавлять Задачи.
*** При пересечении задач по времени - выводить сообщение пользователю.

**** Должна быть возможность выгрузки Календаря в файл (тип на Ваше усмотрение)
**** Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи,
дедлай задачи, ФИО автора и др
 */


import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        PrivateTasks privateTasks = new PrivateTasks(2, false, "manicure", false);
        WorkTasks workTasks = new WorkTasks(2, true, "conference", "Nano-tecnologies");

        privateTasks.doIt();
        workTasks.doIt();

        Calendar<WorkTasks> work = new Calendar<>(new ArrayList<>());
        work.addTask(workTasks);

        Calendar<PrivateTasks> priv = new Calendar<>(new ArrayList<>());
        priv.addTask(privateTasks);

    }
}