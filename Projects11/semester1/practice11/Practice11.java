package semester1.practice11;

import java.util.*;

public class Practice11 {
    public static void main(String[] args) {
        System.out.println("\n\nЗавдання 1: Усі 8 класів-близнюків (Wrapper Classes) та причина їх появи для колекцій");
        demonstrateWrapperTwins();

        System.out.println("\n\nЗавдання 2: Autoboxing та Unboxing: Що бачить компілятор «під капотом» (Integer.valueOf() та intValue())");
        showCompilerUnderTheHood();

        System.out.println("\n\nЗавдання 3: Методи Integer.parseInt() проти Integer.valueOf() при роботі з рядками");
        parseNumbersFromStrings(new String[]{"120", "-45", "300", "abc", "1024", ""});

        System.out.println("\n\nЗавдання 4: Використання констант Integer.MAX_VALUE та Integer.MIN_VALUE для пошуку екстремумів");
        printWrapperLimits();
        List<Integer> numbers = List.of(45, -12, 1024, 0, -500, 314, 2147483647);
        findMinAndMax(numbers);
        demonstrateIntegerOverflow();

        System.out.println("\n\nЗавдання 5: Кешування обгорток IntegerCache ([-128; 127]) та порівняння == проти .equals()");
        testIntegerPool();

        System.out.println("\n\nЗавдання 6: Безпечний Unboxing та захист від NullPointerException у списках обгорток");
        testUnboxingWithNulls();

        System.out.println("\n\nЗавдання 7: Методи класів-обгорток Character та Double для аналізу даних");
        String serverLog = "Server-04: CPU 85%, RAM 16GB, Disk 512GB";
        List<Integer> extractedDigits = extractDigitsFromText(serverLog);
        System.out.println("Текст для аналізу: \"" + serverLog + "\"");
        System.out.println("Витягнуті цифри у вигляді ArrayList<Integer>: " + extractedDigits);

        System.out.println("\n\nЗавдання 8: Робота з системами числення та бітовими методами класу Integer");
        int number = 42;
        convertNumberSystems(number);
        parseCustomNumberSystems();

        System.out.println("\n\nблок 2\nЗавдання 9: Звичайний масив проти ArrayList (Array + List): Порівняння на практиці");
        compareArrayAndArrayList();

        System.out.println("\n\nЗавдання 10: Внутрішнє влаштування ArrayList: Початкова ємність (10) та формула розширення в $1.5$ раза");
        traceArrayListCapacity(100);
        System.out.println(traceArrayListCapacity(100));

        System.out.println("\n\nЗавдання 11: Демонстрація роботи System.arraycopy під капотом ArrayList");
        growArrayManually(new Object[10]);

        System.out.println("\n\nЗавдання 12: Додавання елементів у кінець (add(e)) та вставка за індексом (add(index, e))");
        managePipeline();

        System.out.println("\n\nЗавдання 13: Читання (get) та заміна (set) елементів за індексом");
        demonstrateGetAndSet();

        System.out.println("\n\nЗавдання 14: Власна міні-модель SimpleArrayList на базі Object[], size та System.arraycopy");
        SimpleArrayList myCustomList = new SimpleArrayList();
        System.out.println("Початковий розмір: " + myCustomList.size() + ", ємність (capacity): " + myCustomList.getCapacity());
        for (int i = 1; i <= 12; i++) {
            myCustomList.add("Елемент №" + i);
        }
        System.out.println("Після додавання 12 елементів:");
        System.out.println("Фінальний розмір (size): " + myCustomList.size());
        System.out.println("Фінальна ємність (capacity) масиву: " + myCustomList.getCapacity());
        System.out.println("Читання елементів за індексами:");
        System.out.println("Елемент під індексом 0: " + myCustomList.get(0));
        System.out.println("Елемент під індексом 5: " + myCustomList.get(5));
        System.out.println("Елемент під індексом 11: " + myCustomList.get(11));

        System.out.println("\n\nЗавдання 15: Управління початковою ємністю: конструктор new ArrayList<>(initialCapacity) та ensureCapacity");
        demonstrateCapacity();

        System.out.println("\n\nЗавдання 16: Динамічне формування списку результатів із фільтрацією та підрахунком size()");
        ArrayList<Integer> scores = new ArrayList<>(List.of(45, 88, 92, 59, 74, 100, 38, 65));
        int minPassScore = 60;
        System.out.println("Початковий список усіх балів: " + scores);
        System.out.println("Початкова кількість студентів (size): " + scores.size());
        ArrayList<Integer> passedScores = extractPassedScores(scores, minPassScore);
        System.out.println("Результати фільтрації (прохідний бал >= " + minPassScore + "):");
        System.out.println("Список зарахованих балів: " + passedScores);
        System.out.println("Кількість зарахованих студентів (size): " + passedScores.size());
        int droppedCount = scores.size() - passedScores.size();
        System.out.println("Кількість відрахованих/незарахованих студентів: " + droppedCount);

        System.out.println("\n\nблок 3\nЗавдання 17: Видалення з ArrayList<Integer>: remove(int index) проти remove(Object o)");
        demonstrateRemoveMethods();

        System.out.println("\n\nЗавдання 18: Перевірка наявності (contains) та пошук індексу (indexOf, lastIndexOf)");
        ArrayList<String> langs = new ArrayList<>(List.of("Java", "Python", "C++", "Java", "Kotlin", "Java"));
        System.out.println("Список мов програмування: " + langs);
        boolean hasKotlin = langs.contains("Kotlin");
        boolean hasRust = langs.contains("Rust");
        System.out.println("Перевірка наявності (contains)");
        System.out.println("Чи містить список \"Kotlin\"? " + hasKotlin);
        System.out.println("Чи містить список \"Rust\"? " + hasRust);
        int firstJavaIndex = langs.indexOf("Java");
        int lastJavaIndex = langs.lastIndexOf("Java");
        System.out.println("Пошук індексів (indexOf та lastIndexOf)");
        System.out.println("Індекс першого входження \"Java\": " + firstJavaIndex);
        System.out.println("Індекс останнього входження \"Java\": " + lastJavaIndex);
        String target = "Java";
        int occurrences = countOccurrences(langs, target);
        System.out.println("\nКількість входжень елемента \"" + target + "\" у списку: " + occurrences);

        System.out.println("\n\nЗавдання 19: Перевірка на порожнечу (isEmpty), розмір (size) та повне очищення (clear)");
        testCartMethods();

        System.out.println("\n\nЗавдання 20: Перетворення ArrayList у звичайний масив (toArray) та зворотне перетворення");
        demonstrateToArray();
        System.out.println("\n\nЗавдання 21: Комплексна ревізія методів таблиці ArrayList в одному сценарії");
        manageTaskList();

        System.out.println("\n\nЗавдання 22: Видалення всіх дублікатів зі списку за допомогою contains");
        ArrayList<Integer> numberi = new ArrayList<>(List.of(5, 12, 5, 8, 12, 20, 5));
        ArrayList<Integer> uniqueNumbers = deduplicate(numberi);
        System.out.println("Початковий список чисел " + numberi);
        System.out.println("Список без дублікатів " + uniqueNumbers);
        ArrayList<String> words = new ArrayList<>(List.of("Java", "Python", "Java", "C++", "Python", "Kotlin"));
        ArrayList<String> uniqueWords = deduplicate(words);
        System.out.println("Початковий список рядків: " + words);
        System.out.println("Список без дублікатів:    " + uniqueWords);

        System.out.println("\n\nЗавдання 23: Пошук перетину та різниці двох списків (contains, removeAll, retainAll)");
        ArrayList<String> listA = new ArrayList<>(List.of("Анна", "Богдан", "Віктор", "Галина", "Дмитро"));
        ArrayList<String> listB = new ArrayList<>(List.of("Богдан", "Галина", "Євген", "Олена", "Дмитро"));
        System.out.println("Студенти, які склали іспит з Java (listA) " + listA);
        System.out.println("Студенти, які склали іспит з БД (listB) " + listB);
        ArrayList<String> bothExams = findIntersection(listA, listB);
        System.out.println("Студенти, які склали обидва іспити: " + bothExams);
        ArrayList<String> onlyFirstExam = findOnlyFirstExam(listA, listB);
        System.out.println("Студенти, які склали лише іспит з Java: " + onlyFirstExam);

        System.out.println("\n\nЗавдання 24: Заміна всіх входжень старого значення на нове за допомогою get та set");
        ArrayList<String> statuses = new ArrayList<>(List.of("PENDING", "ACTIVE", "PENDING", "INACTIVE", "PENDING", "ACTIVE"));
        System.out.println("Початковий список статусі: " + statuses);
        String oldValue = "PENDING";
        String newValue = "PROCESSING";
        int replacedCount = replaceAllValues(statuses, oldValue, newValue);
        System.out.println("Результат заміни \"" + oldValue + "\" на \"" + newValue + "\":");
        System.out.println("Оновлений список: " + statuses);
        System.out.println("Кількість виконаних замін: " + replacedCount);

        System.out.println("\n\nблок\nЗавдання 25: Синтаксичний цукор: Ромбовидний оператор <> та ключове слово var");
        demonstrateTypeInference();

        System.out.println("\n\nЗавдання 26: Небезпека втрати типу при поєднанні var та <> (var list = new ArrayList<>())");
        demonstrateVarDiamondDanger();

        System.out.println("\n\nЗавдання 27: Дослідження ієрархії колекцій: від Iterable через Collection до List, Set, Queue");
        exploreCollectionHierarchy();

        System.out.println("\n\nЗавдання 28: Універсальні поліморфні методи на рівні Iterable<E>, Collection<E> та List<E>");
        ArrayList<String> arrayList = new ArrayList<>(List.of("Перший", "Середній", "Останній"));
        LinkedList<String> linkedList = new LinkedList<>(List.of("Alpha", "Beta", "Gamma"));
        Vector<String> vector = new Vector<>(List.of("Java", "Kotlin", "Scala"));
        Stack<String> stack = new Stack<>();
        stack.push("Base");
        stack.push("Middle");
        stack.push("Top");
        System.out.print("ArrayList: ");
        printElements(arrayList);
        System.out.print("LinkedList: ");
        printElements(linkedList);
        printSummary(vector, "Vector");
        printSummary(stack, "Stack");
        System.out.println("ArrayList - Перший: " + getFirstAndLast(arrayList).first + ", Останній: " + getFirstAndLast(arrayList).last);
        System.out.println("LinkedList - Перший: " + getFirstAndLast(linkedList).first + ", Останній: " + getFirstAndLast(linkedList).last);

        System.out.println("\n\nЗавдання 29: Гілка List: Практичне знайомство з ArrayList, LinkedList, Vector та Stack");
        exploreListBranchClasses();

        System.out.println("\n\nЗавдання 30: Обхід колекції за допомогою Iterator<E> (hasNext(), next())");
        demonstrateIteratorTraversal();

        System.out.println("\n\nЗавдання 31: Виникнення ConcurrentModificationException та його уникнення через Iterator.remove()");
        demonstrateConcurrentModification();

        System.out.println("\n\nЗавдання 32: Фільтрація рядків за допомогою Iterator та ListIterator");
        demonstrateIteratorAndListIterator();

        System.out.println("\n\nЗавдання 33: Розділення списку чисел на парні та непарні за допомогою Autoboxing та ArrayList");
        splitEvenAndOddDemo();

        System.out.println("\n\nЗавдання 34: Видалення елементів у заданому діапазоні за допомогою Iterator");
        ArrayList<Integer> numbers1 = new ArrayList<>(List.of(5, 12, 18, 25, 30, 42, 50, 65, 80, 95));
        System.out.println("Початковий список чисел: " + numbers);
        int minRange = 20;
        int maxRange = 60;
        int removedCount = removeInRange(numbers1, minRange, maxRange);

        System.out.println("Діапазон видалення: [" + minRange + "; " + maxRange + "]");
        System.out.println("Кількість видалених елементів: " + removedCount);
        System.out.println("Список після видалення: " + numbers);

        System.out.println("\n\nЗавдання 35: Розворот списку на місці (In-Place Reverse) через методи get та set");
        ArrayList<String> words1 = new ArrayList<>(List.of("Java", "Collections", "ArrayList", "Iterator", "Generics"));
        System.out.println("Початковий список: " + words1);
        reverseInPlace(words1);
        System.out.println("Розвернутий список: " + words1);
        reverseInPlace(words);

        System.out.println("\n\nЗавдання 36: Злиття двох списків без дублікатів із перетворенням у масив");
        ArrayList<String> firstList = new ArrayList<>(List.of("Java", "Python", "C++", "Java"));
        ArrayList<String> secondList = new ArrayList<>(List.of("Python", "Kotlin", "JavaScript", "C++"));
        System.out.println("Перший список: " + firstList);
        System.out.println("Другий список: " + secondList);
        String[] uniqueArray = mergeUniqueToArray(firstList, secondList);
        System.out.println("Результуючий масив без дублікатів: " + Arrays.toString(uniqueArray));

        System.out.println("\n\nЗавдання 37: Циклічний зсув елементів ArrayList праворуч на $K$ позицій");
        ArrayList<Integer> numbes = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Початковий список: " + numbes);
        int k = 2;
        rotateRight(numbes, k);
        System.out.println("Список після зсуву праворуч на " + k + " позиції(-й): " + numbes);

        System.out.println("\n\nЗавдання 38: Аналізатор текстового звіту: Парсинг цін із рядків у ArrayList<Integer> та фільтрація ітератором");
        List<String> receiptLines = List.of(
                "Хліб: 35",
                "Молоко: 48",
                "Помилка сканера: N/A",
                "Кава: 240",
                "Пакет: 5",
                "Сир: 185"
        );
        analyzeReceiptReport(receiptLines);

        System.out.println("\n\nЗавдання 39: Порівняння швидкодії ArrayList та LinkedList при доступі за індексом (get) і вставці на початок (add(0, e))");
        comparePerformance();
    }

    //завданя 1
    public static void demonstrateWrapperTwins() {
        Byte objByte = Byte.valueOf((byte) 10);
        Short objShort = Short.valueOf((short) 500);
        Integer objInt = Integer.valueOf(42);
        Long objLong = Long.valueOf(100L);
        Float objFloat = Float.valueOf(3.14f);
        Double objDouble = Double.valueOf(2.718);
        Character objChar = Character.valueOf('A');
        Boolean objBoolean = Boolean.valueOf(true);
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(objInt);
        numbersList.add(150);
        System.out.println("Byte: " + objByte + " (Клас: " + objByte.getClass().getSimpleName() + ")");
        System.out.println("Short: " + objShort + " (Клас: " + objShort.getClass().getSimpleName() + ")");
        System.out.println("Integer: " + objInt + " (Клас: " + objInt.getClass().getSimpleName() + ")");
        System.out.println("Long: " + objLong + " (Клас: " + objLong.getClass().getSimpleName() + ")");
        System.out.println("Float: " + objFloat + " (Клас: " + objFloat.getClass().getSimpleName() + ")");
        System.out.println("Double: " + objDouble + " (Клас: " + objDouble.getClass().getSimpleName() + ")");
        System.out.println("Character: " + objChar + " (Клас: " + objChar.getClass().getSimpleName() + ")");
        System.out.println("Boolean: " + objBoolean + " (Клас: " + objBoolean.getClass().getSimpleName() + ")");
        System.out.println("ArrayList з обгортуваним типом Integer успішно створено: " + numbersList);
    }

    //завдання 2
    public static void showCompilerUnderTheHood() {
        int a = 45;
        Integer box = a;
        int unbox = box;
        Integer explicitBoxed = Integer.valueOf(42);
        int explicitUnboxed = explicitBoxed.intValue();
        Double dObj = Double.valueOf(3.14);
        double dPrim = dObj.doubleValue();
        Boolean bObj = Boolean.valueOf(true);
        boolean bPrim = bObj.booleanValue();
        System.out.println("Пакування та розпакування виконано успішно!");
    }

    //завдання 3
    public static List<Integer> parseNumbersFromStrings(String[] inputs) {
        List<Integer> resultList = new ArrayList<>();
        int sum = 0;
        for (String str : inputs) {
            try {
                Integer.valueOf(str);
                resultList.add(Integer.valueOf(str));
                int ar = Integer.parseInt(str);
                sum += ar;
            } catch (NumberFormatException e) {
                System.out.println("eror значеня |" + str + "| не вдалось розпізнати");
            }
        }
        System.out.println("сума " + sum);
        return resultList;
    }

    //завдання 4
    public static void printWrapperLimits() {
        System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE + ", Byte.MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE + ", Short.MAX_VALUE: " + Short.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE + ", Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE + ", Long.MAX_VALUE: " + Long.MAX_VALUE);
    }

    public static void findMinAndMax(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }

    public static void demonstrateIntegerOverflow() {
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Початкове значення " + maxInt);
        int overflowed = maxInt + 1;
        System.out.println("Після додавання 1 (maxInt + 1): " + overflowed);
        System.out.println("Чи overflowed == Integer.MIN_VALUE) " + (overflowed == Integer.MIN_VALUE));
        int valueToAdd = 100;
        if (maxInt > Integer.MAX_VALUE - valueToAdd) {
            System.out.println("Увага: сталось би переповнення, додавання скасовано!");
        } else {
            int safeResult = maxInt + valueToAdd;
            System.out.println("Безпечний результат: " + safeResult);
        }
    }

    //завдання 5
    public static void testIntegerPool() {
        Integer a = 100;
        Integer b = 100;
        System.out.println("a == b (порівняння посилань): " + (a == b));
        System.out.println("a.equals(b) (порівняння значень): " + a.equals(b));
        Integer x = 250;
        Integer y = 250;
        System.out.println("x == y (порівняння посилань): " + (x == y));
        System.out.println("x.equals(y) (порівняння значень): " + x.equals(y));
    }

    //завдання 6
    public static void testUnboxingWithNulls() {
        ArrayList<Integer> temperatures = new ArrayList<>();
        temperatures.add(18);
        temperatures.add(22);
        temperatures.add(null);
        temperatures.add(15);
        temperatures.add(null);
        temperatures.add(20);
        System.out.println("Початковий список температур: " + temperatures);
        try {
            int t = temperatures.get(2);
        } catch (NullPointerException e) {
            System.out.println("Перехоплено виняток: " + e);
        }
        int totalSum = sumIgnoringNulls(temperatures);
        System.out.println("Сума всіх наявних температур (ігноруючи null): " + totalSum);
    }

    public static int sumIgnoringNulls(List<Integer> list) {
        int sum = 0;
        for (Integer element : list) {
            if (element != null) {
                sum += element;
            }
        }
        return sum;
    }

    //завдання 7
    public static List<Integer> extractDigitsFromText(String text) {
        List<Integer> digitsList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                Character.getNumericValue(ch);
                int numericValue = Character.getNumericValue(ch);
                digitsList.add(numericValue);
            }
        }
        return digitsList;
    }

    public static void demonstrateDoubleMethods() {
        double primitivePrice = Double.parseDouble("199.95");
        Double wrapperPrice = Double.valueOf("36.6");
        System.out.println("Парсинг через Double.parseDouble(\"199.95\") -> примітив: " + primitivePrice);
        System.out.println("Парсинг через Double.valueOf(\"36.6\") -> об'єкт: " + wrapperPrice);
        double divisionByZero = 5.0 / 0.0;
        double invalidOperation = 0.0 / 0.0;
        System.out.println("Результат 5.0 / 0.0: " + divisionByZero);
        System.out.println("Чи є це число нескінченним? (Double.isInfinite): " + Double.isInfinite(divisionByZero));
        System.out.println("Результат 0.0 / 0.0: " + invalidOperation);
        System.out.println("Чи є це NaN? (Double.isNaN): " + Double.isNaN(invalidOperation));
    }

    //завдання 8
    public static void convertNumberSystems(int number) {
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hex = Integer.toHexString(number);
        System.out.println("Десяткова (Base 10): " + number);
        System.out.println("Двійкова (Base 2):   " + binary);
        System.out.println("Вісімкова (Base 8):  " + octal);
        System.out.println("Шістнадцяткова (Base 16): " + hex);
    }

    public static void parseCustomNumberSystems() {
        String binaryStr = "101010";
        int parsedFromBinary = Integer.parseInt(binaryStr, 2);
        System.out.println("Двійковий рядок \"" + binaryStr + "\" в int (radix 2): " + parsedFromBinary);
        String hexStr = "FF";
        int parsedFromHex = Integer.parseInt(hexStr, 16);
        System.out.println("Шістнадцятковий рядок \"" + hexStr + "\" в int (radix 16): " + parsedFromHex);
        String octalStr = "52";
        int parsedFromOctal = Integer.parseInt(octalStr, 8);
        System.out.println("Вісімковий рядок \"" + octalStr + "\" в int (radix 8): " + parsedFromOctal);
    }

    //завдання 9
    public static void compareArrayAndArrayList() {
        String[] fixedArray = new String[3];
        fixedArray[0] = "Київ";
        fixedArray[1] = "Львів";
        fixedArray[2] = "Одеса";
        System.out.println("Звичайний масив: " + Arrays.toString(fixedArray));
        System.out.println("У звичайний масив неможливо додати 4-й елемент — його розмір фіксований!");
        ArrayList<String> dynamicList = new ArrayList<>();
        dynamicList.add("Київ");
        dynamicList.add("Львів");
        dynamicList.add("Одеса");
        System.out.println("ArrayList після додавання 3 міст: " + dynamicList);
        dynamicList.add("Харків");
        dynamicList.add("Дніпро");
        dynamicList.add(1, "Житомир");
        dynamicList.remove(0);
        System.out.println("ArrayList після додаваня ('Житомир') та видалення елемента 1 " + dynamicList);
        System.out.println("Поточний розмір списку (size): " + dynamicList.size());
    }

    //задвання 10
    public static List<Integer> traceArrayListCapacity(int elementsCount) {
        List<Integer> capacityHistory = new ArrayList<>();
        int currentCapacity = 10;
        capacityHistory.add(currentCapacity);
        for (int i = 1; i <= elementsCount; i++) {
            if (i > currentCapacity) {
                currentCapacity = currentCapacity + (currentCapacity >> 1);
                capacityHistory.add(currentCapacity);

            }
        }
        return capacityHistory;
    }

    //завдання 11
    public static Object[] growArrayManually(Object[] oldData) {
        for (int i = 0; i < oldData.length; i++) {
            oldData[i] = i + 1;
        }
        Object[] newData = new Object[15];
        System.arraycopy(oldData, 0, newData, 0, oldData.length);
        System.out.println("Новий масив після System.arraycopy (capacity = 15): " + Arrays.toString(newData));
        newData[oldData.length] = 11;
        System.out.println("Після додавання 11-го елемента: " + Arrays.toString(newData));
        String[] letters = {"A", "B", "C", "D", "E", null, null};
        int size = 5;
        int insertIndex = 2;
        String elementToInsert = "X";
        System.out.println("До вставки 'X' на індекс 2: " + Arrays.toString(letters));
        System.arraycopy(letters, insertIndex, letters, insertIndex + 1, size - insertIndex);
        letters[insertIndex] = elementToInsert;
        size++;
        System.out.println("Після вставки та зсуву елементів " + Arrays.toString(letters));
        return newData;
    }

    //завдання 11
    public static void managePipeline() {
        ArrayList<String> pipeline = new ArrayList<>();
        pipeline.add("Compile");
        pipeline.add("Package");
        pipeline.add("Deploy");
        System.out.println("Список: " + pipeline);
        System.out.println("Поточний розмір (size): " + pipeline.size());
        pipeline.add(0, "Checkout Git");
        pipeline.add(2, "Run Unit Tests");
        System.out.println("Список: " + pipeline);
        System.out.println("Поточний розмір (size): " + pipeline.size());
    }

    //завдання 13
    public static void demonstrateGetAndSet() {
        ArrayList<Integer> speeds = new ArrayList<>(List.of(60, 85, 110, 95, 130));
        System.out.println(speeds.get(speeds.size() / 2));
        System.out.println(speeds.get(speeds.size() - 1));
        for (int i = 0; i < speeds.size(); i++) {
            int currentSpeed = speeds.get(i);
            if (currentSpeed > 100) {
                Integer oldSpeed = speeds.set(i, 100);
                System.out.println("перевищення: " + oldSpeed + " км/год номер " + i +
                        " -> обмежено до 100 км/год (метод set повернув: " + oldSpeed + ")");
            }
        }
        System.out.println("список після корекції " + speeds);
    }
    //завдання 14
    static class SimpleArrayList {
        private Object[] data = new Object[10];
        private int size = 0;
        public SimpleArrayList(){
        }
        public void add(Object element){
            if (size == data.length) {
                int oldCapacity = data.length;
                int newCapacity = oldCapacity + (oldCapacity >> 1);
                System.out.println("масив заповнено (size = " + size + ") розширюємо capacity: "
                        + oldCapacity + " -> " + newCapacity);
                Object[] newData = new Object[newCapacity];
                System.arraycopy(data, 0, newData, 0, oldCapacity);
                data = newData;
            }
            data[size++] = element;
        }
        public Object get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("індекс: " + index + ", розмір: " + size);
            }
            return data[index];
        }
        public int size() {
            return size;
        }
        public int getCapacity() {
            return data.length;
        }
    }

    //завдання 15
    public static void demonstrateCapacity() {
        ArrayList<String> logs = new ArrayList<>(500);
        System.out.println("Створено список logs із початковою ємністю 500.");
        logs.add("INFO: System started");
        logs.add("DEBUG: Initializing components");
        logs.add("INFO: Ready for requests");
        System.out.println("Поточний розмір (size): " + logs.size());
        logs.ensureCapacity(1000);
        System.out.println("Викликано ensureCapacity(1000) — тепер внутрішній масив гарантовано вміщує 1000 елементів.");
    }

    //завдання 16
    public static ArrayList<Integer> extractPassedScores(List<Integer> allScores, int minPassScore) {
        ArrayList<Integer> passedList = new ArrayList<>();
        for (int i = 0; i < allScores.size(); i++) {
            Integer currentScore = allScores.get(i);
            if (currentScore >= minPassScore) {
                passedList.add(currentScore);
            }
        }
        return passedList;
    }

    //завдання 17
    public static void demonstrateRemoveMethods() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 1, 40, 2));
        System.out.println("Початковий список: " + numbers);
        numbers.remove(1);
        System.out.println("Після виклику numbers.remove(1): " + numbers);
        System.out.println("Пояснення: зникло число 20, яке стояло під індексом 1. Число 1 залишилося на місці.");
        numbers.remove(Integer.valueOf(1));
        numbers.remove(Integer.valueOf(2));
        System.out.println("\nПісля виклику remove(Integer.valueOf(1)) та remove(Integer.valueOf(2)): " + numbers);
        System.out.println("Пояснення: тепер елементи зі значеннями 1 та 2 успішно видалені за значенням.");
    }

    //завдання 18
    public static int countOccurrences(List<String> list, String target) {
        int count = 0;
        for (String item : list) {
            if (item != null && item.equals(target)) {
                count++;
            }
        }
        return count;
    }

    //завдання 19
    public static void testCartMethods() {
        ArrayList<String> cart = new ArrayList<>();
        System.out.println(cart.isEmpty() + " | " + cart.size());
        cart.add("миша");
        cart.add("риба");
        cart.add("морква");
        cart.add("миша капуста");
        System.out.println(cart.isEmpty() + " | " + cart.size() + "\n" + cart);
        cart.clear();
        System.out.println(cart.isEmpty() + " | " + cart.size() + "\n" + cart);
    }

    //завдання 20
    public static void demonstrateToArray() {
        ArrayList<String> cities = new ArrayList<>(List.of("Київ", "Львів", "Одеса", "Харків", "Дніпро"));
        String[] strArray = cities.toArray(new String[0]);
        System.out.println("Отриманий масив String[]: " + Arrays.toString(strArray));
        Object[] objArray = cities.toArray();
        System.out.println("Отриманий масив Object[]: " + Arrays.toString(objArray));
        ArrayList<String> restoredList = new ArrayList<>(Arrays.asList(strArray));
        System.out.println("Відновлений ArrayList: " + restoredList);
        System.out.println("Чи ідентичні списки? " + cities.equals(restoredList));
    }

    //завдання 21
    public static void manageTaskList() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Написати звіт");
        tasks.add("Провести рев'ю коду");
        tasks.add("Оновити документацію");
        tasks.add("Зробити коміт у Git");
        tasks.add("Підготувати презентацію");
        tasks.add(0, "Виправити критичний баг");
        System.out.println("Після додавання задач " + tasks);
        System.out.println("Поточний розмір (size) " + tasks.size());
        String firstTask = tasks.get(0);
        String oldTaskText = tasks.set(2, "Провести рев'ю пулл-реквесту");
        System.out.println("Оновлений список " + tasks);
        boolean hasGitCommit = tasks.contains("Зробити коміт у Git");
        boolean hasDocker = tasks.contains("Налаштувати Docker");
        System.out.println("Чи є задача \"Зробити коміт у Git\"? " + hasGitCommit);
        System.out.println("Чи є задача \"Налаштувати Docker\"? " + hasDocker);
        tasks.remove("Написати звіт");
        String removedByIndex = tasks.remove(0);
        System.out.println("Поточний список: " + tasks);
        String[] taskArray = tasks.toArray(new String[0]);
        System.out.println("Експортовано у звичайний масив: " + Arrays.toString(taskArray));
        tasks.clear();
        System.out.println("Після виклику clear() — чи порожній список (isEmpty)? " + tasks.isEmpty() + " (size = " + tasks.size() + ")");
    }
    //завдання 22

    public static <T> ArrayList<T> deduplicate(List<T> source) {
        ArrayList<T> unique = new ArrayList<>();
        if (source == null) {
            return unique;
        }
        for (T item : source) {
            if (!unique.contains(item)) {
                unique.add(item);
            }
        }
        return unique;
    }

    //завдання 23
    public static ArrayList<String> findIntersection(List<String> first, List<String> second) {
        ArrayList<String> intersection = new ArrayList<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public static ArrayList<String> findOnlyFirstExam(List<String> first, List<String> second) {
        ArrayList<String> difference = new ArrayList<>(first);
        difference.removeAll(second);
        return difference;
    }

    //завдання 24
    public static int replaceAllValues(List<String> list, String oldValue, String newValue) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String currentItem = list.get(i);
            if (Objects.equals(currentItem, oldValue)) {
                list.set(i, newValue);
                count++;
            }
        }
        return count;
    }

    public static int replaceAllValuesWithCount(List<String> list, String oldValue, String newValue) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), oldValue)) {
                list.set(i, newValue);
                count++;
            }
        }
        return count;
    }

    //завдання 25
    public static void demonstrateTypeInference() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        System.out.println("Список 1 (Diamond Operator <>): " + list1);
        var list2 = new ArrayList<Integer>();
        list2.add(30);
        list2.add(40);
        System.out.println("Список 2 (var із явним типом праворуч): " + list2);
        var names = new ArrayList<String>(List.of("Анна", "Богдан"));
        names.add("Олена");
        System.out.println("Список 3 (var для рядків): " + names);
    }

    //завдання 26
    public static void demonstrateVarDiamondDanger() {
        var unsafeList = new ArrayList<>();
        unsafeList.add(42);
        unsafeList.add("Java");
        unsafeList.add(true);
        try {
            Integer firstNum = (Integer) unsafeList.get(0);
            System.out.println("успішно |" + firstNum);
            Integer brokenNum = (Integer) unsafeList.get(1);
            System.out.println("Елемент 1: " + brokenNum);
        } catch (ClassCastException e) {
            System.out.println("ПЕРЕХОПЛЕНО ПОМИЛКУ: ClassCastException! " + e.getMessage());
            System.out.println("Пояснення: через поєднання var та <> втрачено сувору типізацію, що призвело до аварії в рантаймі.");
        }
        var safeList = new ArrayList<Integer>();
        safeList.add(100);
        System.out.println("успішно |" + safeList);
    }

    //завдання 27
    public static void exploreCollectionHierarchy() {
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collection<String> linkedList = new LinkedList<>();
        Collection<String> vector = new Vector<>();
        Collection<String> stack = new Stack<>();
        Collection<String> arrayDeque = new ArrayDeque<>();
        Object[] collections = {arrayList, linkedList, vector, stack, hashSet, arrayDeque};
        String[] names = {"ArrayList", "LinkedList", "Vector", "Stack", "HashSet", "ArrayDeque"};
        for (int i = 0; i < collections.length; i++) {
            Object col = collections[i];
            String name = names[i];
            System.out.println("  Є екземпляром Iterable " + (col instanceof Iterable));
            System.out.println("  Є екземпляром Collection " + (col instanceof Collection));
            System.out.println("  Є екземпляром List " + (col instanceof List));
            System.out.println("  Є екземпляром Set " + (col instanceof Set));
            System.out.println("  Є екземпляром Queue " + (col instanceof Queue));
        }
    }

    //завдання 28
    public static <E> void printElements(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static <E> void printSummary(Collection<E> collection, String name) {
        System.out.println("Колекція [" + name + "] -> size: " + collection.size() + ", isEmpty: " + collection.isEmpty());
    }

    public static class FirstAndLast<E> {
        public E first;
        public E last;

        public FirstAndLast(E first, E last) {
            this.first = first;
            this.last = last;
        }
    }

    public static <E> FirstAndLast<E> getFirstAndLast(List<E> list) {
        if (list == null || list.isEmpty()) {
            return new FirstAndLast<>(null, null);
        }
        E first = list.get(0);
        E last = list.get(list.size() - 1);
        return new FirstAndLast<>(first, last);
    }

    //завдання 29
    public static void exploreListBranchClasses() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Елемент А");
        arrayList.add("Елемент Б");
        System.out.println("   Елемент під індексом 1: " + arrayList.get(1));
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Центр");
        linkedList.addFirst("Початок (додано через addFirst)");
        linkedList.addLast("Кінець (додано через addLast)");
        System.out.println("   Список: " + linkedList);
        Vector<String> vector = new Vector<>();
        vector.addElement("Перший елемент Vector");
        vector.add("Другий елемент Vector");
        System.out.println("   Елемент на позиції 0 (elementAt) " + vector.elementAt(0));
        Stack<String> stack = new Stack<>();
        stack.push("Книга 1: Java Core");
        stack.push("Книга 2: Algorithms");
        stack.push("Книга 3: Design Patterns");
        System.out.println("Верхній елемент на стеку без видалення (peek) " + stack.peek());
        System.out.println("Витягуємо елементи зі стеку в зворотному порядку (pop)");
        while (!stack.isEmpty()) {
            System.out.println("- Дістали " + stack.pop());
        }
    }

    //завдання 30
    public static void demonstrateIteratorTraversal() {
        ArrayList<String> modules = new ArrayList<>(List.of("Core Java", "OOP", "Collections", "Streams", "Multithreading"));
        System.out.println("Список модулів: " + modules);
        Iterator<String> it = modules.iterator();
        int totalLength = 0;
        System.out.println("Покроковий обхід через ітератор:");
        while (it.hasNext()) {
            String currentModule = it.next();
            System.out.println("  - Знайдено модуль: \"" + currentModule + "\" (довжина назви: " + currentModule.length() + " символів)");
            totalLength += currentModule.length();

        }
        System.out.println("\nСумарна кількість символів у назвах усіх модулів: " + totalLength);
    }

    //завдання 31
    public static void demonstrateConcurrentModification() {
        ArrayList<Integer> data = new ArrayList<>(List.of(15, -3, 42, -10, 8, -1, 25));
        System.out.println("список " + data);
        try {
            for (Integer x : data) {
                if (x < 0) {
                    data.remove(x);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println(" Перехоплено виняток: " + e.getClass().getName());
            System.out.println("Причина: Колекція веде внутрішній лічильник modCount. Коли ви викликаєте data.remove(x) напряму, " +
                    "модифікація стає невідомою для активного ітератора циклу for-each, що й призводить до падіння програми.");
        }
        ArrayList<Integer> safeData = new ArrayList<>(List.of(15, -3, 42, -10, 8, -1, 25));
        removeNegativesWithIterator(safeData);
        System.out.println("Очищений список без від'ємних чисел: " + safeData);
    }

    public static void removeNegativesWithIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer current = it.next();
            if (current < 0) {
                it.remove();
            }
        }
    }

    //завдання 32
    public static void demonstrateIteratorAndListIterator() {
        ArrayList<String> logs = new ArrayList<>(List.of(
                "INFO: Start",
                "DEBUG: Init",
                "ERROR: Timeout",
                "DEBUG: Retry",
                "INFO: Done"
        ));
        System.out.println("Початковий список логів: " + logs);
        Iterator<String> it = logs.iterator();
        while (it.hasNext()) {
            String log = it.next();
            if (log.startsWith("DEBUG:")) {
                it.remove();
            }
        }
        System.out.println("Після видалення 'DEBUG:' логів: " + logs);
        ListIterator<String> listIt = logs.listIterator();
        while (listIt.hasNext()) {
            String current = listIt.next();
            if (current.contains("ERROR")) {
                listIt.set("CRITICAL ERROR: Timeout");
            }
        }
        System.out.println("Після заміни ERROR через ListIterator вперед: " + logs);
        System.out.println("Рух ітератора у зворотному напрямку (від кінця до початку)");
        while (listIt.hasPrevious()) {
            System.out.println("  Попередній елемент: " + listIt.previous());
        }
    }

    //задвання 33
    public static void splitEvenAndOddDemo() {
        ArrayList<Integer> source = new ArrayList<>(List.of(15, 8, 42, 7, 10, 23, 4, 19, 6));
        System.out.println("Вихідний список чисел: " + source);
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        splitEvenAndOdd(source, evens, odds);
        System.out.println("Парні числа (evens): " + evens);
        System.out.println("  - Розмір (size): " + evens.size());
        System.out.println("  - Максимальний елемент: " + findMax(evens));
        System.out.println("Непарні числа (odds): " + odds);
        System.out.println("  - Розмір (size): " + odds.size());
        System.out.println("  - Максимальний елемент: " + findMax(odds));
    }

    public static void splitEvenAndOdd(List<Integer> source, List<Integer> evens, List<Integer> odds) {
        if (source == null) return;
        Iterator<Integer> it = source.iterator();
        while (it.hasNext()) {
            Integer number = it.next();
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }
    }

    public static int findMax(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (Integer num : list) {
            if (num != null && num > max) {
                max = num;
            }
        }
        return max;
    }

    //завдання 34
    public static int removeInRange(List<Integer> list, int min, int max) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int count = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer current = it.next();
            if (current != null && current >= min && current <= max) {
                it.remove();
                count++;
            }
        }
        return count;
    }

    //задвання 35
    public static <T> void reverseInPlace(List<T> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int oppositeIndex = size - 1 - i;
            T temp = list.get(i);
            list.set(i, list.get(oppositeIndex));
            list.set(oppositeIndex, temp);
        }
    }

    //завдання 36
    public static String[] mergeUniqueToArray(List<String> first, List<String> second) {
        var merged = new ArrayList<String>();
        if (first != null) {
            for (String item : first) {
                if (!merged.contains(item)) {
                    merged.add(item);
                }
            }
        }
        if (second != null) {
            for (String item : second) {
                if (!merged.contains(item)) {
                    merged.add(item);
                }
            }
        }
        return merged.toArray(new String[0]);
    }
    //завадання 37
    public static <T> void rotateRight(List<T> list, int k){
        if (list == null || list.isEmpty() || k <= 0) {
            return;
        }
        int size = list.size();
        int effectiveK = k % size;
        for (int i = 0; i < effectiveK; i++) {
            T lastElement = list.remove(list.size() - 1);
            list.add(0, lastElement);
        }
    }
    //завдання 38
    public static void analyzeReceiptReport(List<String> lines) {
        var prices = new ArrayList<Integer>();
        for (String line : lines) {
            int colonIndex = line.indexOf(':');
            if (colonIndex != -1) {
                String pricePart = line.substring(colonIndex + 1).trim();
                try {
                    int price = Integer.parseInt(pricePart);
                    prices.add(price);
                } catch (NumberFormatException e) {
                    System.out.println("Пропущено некоректний рядок ціни: \"" + line + "\"");
                }
            }
        }
        System.out.println("\nРозпарсені ціни до фільтрації: " + prices);
        Iterator<Integer> it = prices.iterator();
        while (it.hasNext()) {
            Integer currentPrice = it.next();
            if (currentPrice < 40) {
                it.remove();
            }
        }
        System.out.println("Ціни після фільтрації ( >= 40 грн ): " + prices);
        int totalSum = 0;
        for (Integer price : prices) {
            if (price != null) {
                totalSum += price;
            }
        }
        System.out.println("Підсумкова сума до сплати: " + totalSum + " грн");
    }
    //завдання 39
    public static void comparePerformance() {
        int elementsCount = 20_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long startTimeAL = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            arrayList.add(0, i);
        }
        long endTimeAL = System.nanoTime();
        long durationAL = endTimeAL - startTimeAL;
        System.out.println("ArrayList час вставки:   " + (durationAL / 1_000_000) + " мс");
        long startTimeLL = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            linkedList.add(0, i);
        }
        long endTimeLL = System.nanoTime();
        long durationLL = endTimeLL - startTimeLL;
        System.out.println("LinkedList час вставки: " + (durationLL / 1_000_000) + " мс");
        System.out.println("Висновок: LinkedList виконує вставку на початок миттєво O(1), тоді як ArrayList витрачає багато часу, " +
                "оскільки при кожній вставці на індекс 0 змушений зсувати весь масив праворуч через System.arraycopy.");
        int iterations = 10_000;
        int middleIndex = arrayList.size() / 2;
        long startGetAL = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.get(middleIndex);
        }
        long endGetAL = System.nanoTime();
        long durationGetAL = endGetAL - startGetAL;
        System.out.println("ArrayList час читання:   " + (durationGetAL / 1_000_000) + " мс");
        long startGetLL = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.get(middleIndex);
        }
        long endGetLL = System.nanoTime();
        long durationGetLL = endGetLL - startGetLL;
        System.out.println("LinkedList час читання: " + (durationGetLL / 1_000_000) + " мс");
        System.out.println("Висновок: ArrayList виконує довільний доступ за індексом миттєво O(1) завдяки внутрішньому масиву Object, " +
                "тоді як LinkedList змушений щоразу проходити половину списку по посиланнях вузлів (Node) O(N), що значно повільніше.");
    }
}