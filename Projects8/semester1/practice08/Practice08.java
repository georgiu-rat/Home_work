package semester1.practice08;

public class Practice08 {
    public static void main(String[] args) {
        System.out.println("Завдання 1: Інкапсульований студент із методом toString()");
        Student student1 = new Student("Олексій", 3, 85.5);
        System.out.println("Студент 1: " + student1);
        Student student2 = new Student("Марія", 10, -5.0);
        System.out.println("Студент 2 (з валідацією): " + student2);
        student1.setCourse(5);
        student1.setGpa(120.0);
        System.out.println("Після оновлення студента 1: " + student1);

        System.out.println("\n\nЗавдання 2: Продукт магазину з форматованим toString()");
        Product p1 = new Product("A-101", " Монітор", 6499.50, 4);
        System.out.println(p1);
        Product p2 = new Product("A-111", " Мишка", 649.50, 1);
        System.out.println(p2);

        System.out.println("\n\nЗавдання 3: Геометричне коло з інваріантом радіуса");
        Circle c1 = new Circle(5.0);
        System.out.println("Коло 1: " + c1);
        Circle c2 = new Circle(-3.5);
        System.out.println("Коло 2 (має стати 1.0): " + c2);
        System.out.println("Спробуємо зламати Коло 1:");
        c1.setRadius(0.0);
        System.out.println("Після c1.setRadius(0.0): " + c1);

        System.out.println("\n\nЗавдання 4: Безпечний банківський гаманець з маскуванням картки в toString()");
        CardWallet wallet = new CardWallet("4441114422334589", "1111", 12500.00);
        System.out.println("Інформація про гаманець:");
        System.out.println(wallet);
        System.out.println("\nСпробуємо змінити ПІН з неправильним старим кодом (0000):");
        boolean isChanged1 = wallet.changePin("0000", "5555");
        System.out.println("Результат зміни: " + isChanged1); // поверне false

        System.out.println("Спробуємо змінити ПІН з ПРАВИЛЬНИМ старим кодом (1111):");
        boolean isChanged2 = wallet.changePin("1111", "9999");
        System.out.println("Результат зміни: " + isChanged2);

        System.out.println("\n\nЗавдання 5: Прихована координата та модифікатор protected");
        SensorNode sensor = new SensorNode("SN-01", 2.5, 18.0);
        System.out.println(sensor);
        sensor.calibrationOffset = -1.2;
        System.out.println("Після прямої зміни protected-поля calibrationOffset:");
        System.out.println(sensor);

        System.out.println("\n\nЗавдання 6: Інкапсуляція одновимірного масиву температур (WeatherDay)");
        double[] temps = {10.5, 14.0, 16.5, 12.0};
        WeatherDay day = new WeatherDay("2026-10-24", temps);
        System.out.println("Оригінальний об'єкт: " + day);
        System.out.printf("Min: %.1f | Max: %.1f\n", day.getMinTemp(), day.getMaxTemp());
        temps[0] = 99.9;
        System.out.println("Після спроби змінити масив ззовні:");
        System.out.println(day);

        System.out.println("\n\nЗавдання 7: Діапазон чисел (IntRange) та захист меж");
        IntRange range = new IntRange(13, 256);
        System.out.println("Створений діапазон: " + range);
        System.out.println("Довжина діапазону: " + range.getLength());
        int testValue1 = 29;
        int testValue2 = 300;
        System.out.println("Чи входить число " + testValue1 + "? " + range.contains(testValue1));
        System.out.println("Чи входить число " + testValue2 + "? " + range.contains(testValue2));

        System.out.println("\n\nЗавдання 8: Рахунок-фактура (InvoiceItem) з автоматичним викликом toString() при конкатенації");
        InvoiceItem item = new InvoiceItem("USB Флеш-накопичувач 64GB", 3, 400.0, 10.0);
        System.out.println("Позиція чека: " + item);
        InvoiceItem fakeItem = new InvoiceItem("Смартфон", 1, 10000.0, 80.0);
        System.out.println("Позиція з фейковою знижкою: " + fakeItem);

        System.out.println("\n\nБлок 2\nЗавдання 9: Класична ієрархія Employee $\\to$ Developer (База ІТ-компанії)");
        Employee emp = new Employee("Іван", 15000.0);
        System.out.println(emp);
        Developer dev = new Developer("Олена", 45000.0, "Java");
        System.out.println(dev);

        System.out.println("\n\nЗавдання 10: Ієрархія Animal -> Dog та Cat");
        Dog dog = new Dog("Сірко", 3, 12.5, "Вівчарка");
        Cat cat = new Cat("Мурчик", 2, 4.2, true);
        System.out.println(dog.fetchStick());
        System.out.println(cat.purr());

        System.out.println("\n\nЗавдання 11: Транспортні засоби: Vehicle $\\to$ Car та Truck");
        PassengerCar car = new PassengerCar(5, "Toyota", 200, 55.0);
        System.out.println("Легкове авто -> " + car);
        CargoTruck truck = new CargoTruck(10.5, "MAN", 110, 300.0);
        System.out.println("Вантажівка -> " + truck);

        System.out.println("\n\nЗавдання 12: Геометрія фігур: Rectangle $\\to$ Box3D (Паралелепіпед)");
        Rectangle rect = new Rectangle(5.0, 4.0);
        System.out.println(rect);
        Box3D box = new Box3D(5.0, 4.0, 3.0);
        System.out.println(box);

        System.out.println("\n\nЗавдання 13: Персонажі університету: Person $\\to$ UniversityStudent та Professor");
        UniversityStudent student = new UniversityStudent("Дмитро Коваленко", 2006, "КН-24-05", "Комп'ютерні науки", 2000);
        Professor professor = new Professor("Олександр Петрович", 1975, "Доцент", 45);
        System.out.println("Перевірка роботи методу getAge():");
        System.out.println("Вік студента у 2026 році: " + student.getAge(2026) + " років"); // 2026 - 2006 = 20
        System.out.println("Вік професора у 2026 році: " + professor.getAge(2026) + " років"); // 2026 - 1975 = 51
        System.out.println("\nПовний вивід об'єктів:");
        System.out.println(student);
        System.out.println(professor);

        System.out.println("\n\nЗавдання 14: Перевантаження конструкторів у спадкоємці (this(...) + super(...))");
        Smartphone ph1 = new Smartphone("Apple", 45000.0, 256, true);
        System.out.println("Случай 1 (Повний): " + ph1);
        Smartphone ph2 = new Smartphone("Samsung", 32000.0, 512);
        System.out.println("Случай 2 (Середній): " + ph2);
        Smartphone ph3 = new Smartphone("Xiaomi");
        System.out.println("Случай 3 (Мінімальний): " + ph3);

        System.out.println("\n\nЗавдання 15: Книжковий фонд: Publication $\\to$ PrintedBook та AudioBook");
        PrintedBook book = new PrintedBook("Кобзар", "Тарас Шевченко", 1840, 400, "Тверда");
        System.out.println(book);
        AudioBook audio = new AudioBook("Маруся Чурай", "Ліна Костенко", 1979, 145, "Ольга Сумська");
        System.out.println(audio);

        System.out.println("\n\nЗавдання 16: Кіберспортивний гравець: Gamer $\\to$ ProEsportsPlayer");
        Gamer casualGamer = new Gamer("CyberX", 250);
        System.out.println(casualGamer);
        ProEsportsPlayer pro = new ProEsportsPlayer("s1mple", 15000, "NAVI", 1200000.0, 15);
        System.out.println(pro);
        ProEsportsPlayer rookiePro = new ProEsportsPlayer("NoobPro", 800, "FreeAgents", 0.0, 0);
        System.out.println(rookiePro);

        System.out.println("\n\nБлок 3\nЗавдання 17: Розрахунок зарплати: StaffMember $\\to$ Manager та SalesPerson");
        StaffMember staff = new StaffMember("Ігор", 20000.0);
        System.out.println(staff);
        Manager mgr = new Manager("Катерина", 30000.0, 5000.0);
        System.out.println(mgr);
        SalesPerson sales = new SalesPerson("Максим", 15000.0, 100000.0, 5.0);
        System.out.println(sales);

        System.out.println("\n\nЗавдання 18: Банківські комісії: StandardTransfer $\\to$ InternationalTransfer");
        StandardTransfer local = new StandardTransfer(1000.0);
        System.out.println(local);
        InternationalTransfer inter = new InternationalTransfer(1000.0, "USA");
        System.out.println(inter);

        System.out.println("\n\nЗавдання 19: Квитки на подію: Ticket $\\to$ StudentTicket та VipTicket");
        Ticket regular = new Ticket("Концерт Океан Ельзи", 1200.0);
        System.out.println(regular);
        StudentTicket student0 = new StudentTicket("Концерт Океан Ельзи", 1200.0, "KB-112233");
        System.out.println(student0);
        VipTicket vip = new VipTicket("Концерт Океан Ельзи", 1200.0, true, 800.0);
        System.out.println(vip);

        System.out.println("\n\nЗавдання 20: Ігрова зброя: Weapon $\\to$ EnchantedSword");
        Weapon ironSword = new Weapon("Залізний меч", 50);
        System.out.println(ironSword);
        EnchantedSword fireSword = new EnchantedSword("Меч Дракона", 60, 15, "Вогонь", 3);
        System.out.println(fireSword);

        System.out.println("\n\nЗавдання 21: Відправлення пошти: Parcel $\\to$ FragileParcel (Крихка посилка)");
        Parcel p11 = new Parcel("20450011223344", 5.0);
        System.out.println(p1);
        FragileParcel p21 = new FragileParcel(true, 10.0, "20450099887766", 20000.0);
        System.out.println(p2);

        System.out.println("\n\nЗавдання 22: Електроспоживання приладів: Appliance $\\to$ Heater та AirConditioner");
        EcoHeater heaterNormal = new EcoHeater("UFO-2000", 2000.0, false);
        System.out.println(heaterNormal);
        System.out.printf("Споживання за 5 годин роботи: %.2f кВт·год", heaterNormal.getDailyConsumptionKWh(5));
        EcoHeater heaterEco = new EcoHeater("UFO-2000-Eco", 2000.0, true);
        System.out.println(heaterEco);
        System.out.printf("Споживання за 5 годин роботи (Еко): %.2f кВт·год", heaterEco.getDailyConsumptionKWh(5));

        System.out.println("\n\nЗавдання 23: Координатна точка: Point2D $\\to$ Point3D (Перевизначення відстані до початку координат)");
        Point2D p2d = new Point2D(3.0, 4.0);
        System.out.println("Точка 2D: " + p2d);
        System.out.printf("Відстань до початку координат у 2D: %.2f\n\n", p2d.distanceToOrigin());
        Point3D p3d = new Point3D(3.0, 4.0, 12.0);
        System.out.println("Точка 3D: " + p3d);
        System.out.printf("Відстань до початку координат у 3D: %.2f\n", p3d.distanceToOrigin());

        System.out.println("\n\nЗавдання 24: Кавовий напій: Coffee $\\to$ LatteWithAddons");
        Coffee americano = new Coffee("Темне", 180, 40.0);
        System.out.println(americano);
        System.out.println("Калорії: " + americano.calculateCalories() + " ккал");
        LatteWithAddons customLatte = new LatteWithAddons("Світле", 340, 60.0, "кокосове", 2);
        System.out.println(customLatte);

        System.out.println("\n\nБлок 5\nЗавдання 25: Трирівнева ієрархія Dota 2: Hero $\\to$ AttributeHero $\\to$ ConcreteHero");

        System.out.println("\n\nЗавдання 26: Трирівнева ієрархія транспорту: Vehicle $\\to$ Car $\\to$ ElectricCar");
        ElectricCar tesla = new ElectricCar("Tesla Model S", 2023, 670, 4, 100.0, 650);
        System.out.println(tesla);

        System.out.println("\n\nЗавдання 27: Трирівнева банківська карта: PaymentCard $\\to$ DebitCard $\\to$ CashbackPlatinumCard");
        CashbackPlatinumCard myCard = new CashbackPlatinumCard("Polina",10000.0, 5000.0, 2.0);
        System.out.println("Початковий стан: " + myCard);
        myCard.pay(2000.0);
        System.out.println("Після покупки: " + myCard);

        System.out.println("\n\nЗавдання 28: Захищений від перевизначення final метод безпеки");
        CustomTerminal terminal = new CustomTerminal();
        System.out.println(terminal.getWelcomeBanner());

        System.out.println("\n\nЗавдання 30: Геометрична еволюція: Shape1D (Відрізок) $\\to$ Square2D (Квадрат) $\\to$ Cube3D (Куб)");
        Cube3D cube = new Cube3D(3.0);
        System.out.println(cube);

        System.out.println("\n\nЗавдання 31: Академічна ієрархія: User $\\to$ StudentUser $\\to$ PostgraduateStudent (Аспірант)");
        PostgraduateStudent postGrad = new PostgraduateStudent(101, "aspirant@uni.ua", "CS-PHD-26", 92.5, "Алгоритми штучного інтелекту в робототехніці", "Проф. Ковальчук");
        System.out.println(postGrad);

        System.out.println("\n\nЗавдання 32: Ієрархія медичних препаратів: Medicine $\\to$ PrescriptionMedicine $\\to$ ControlledSubstance");
        ControlledSubstance drug = new ControlledSubstance("Сильний знеболювальний препарат", 350.0, false, "DOC-998877", 20);
        System.out.println(drug);
        System.out.println("Чи можна продати пацієнту (з рецептом): " + drug.canSell(true));

        System.out.println("\n\nБлок 5\nЗавдання 33: Математична прогресія: Progression $\\to$ ArithmeticProgression та GeometricProgression");
        ArithmeticProgression ap = new ArithmeticProgression(2.0, 3.0); // початковий член 2, крок 3
        System.out.println(ap);
        GeometricProgression gp = new GeometricProgression(3.0, 2.0); // початковий член 3, знаменник 2
        System.out.println(gp);

        System.out.println("\n\nЗавдання 34: Статистика оцінок: GradeSheet $\\to$ WeightedGradeSheet (Зважений рейтинг)");
        int[] studentGrades = {90, 85, 95};
        double[] subjectWeights = {0.2, 0.3, 0.5};
        WeightedGradeSheet sheet = new WeightedGradeSheet("Олексій", studentGrades, subjectWeights);
        System.out.println(sheet);

        System.out.println("\n\nЗавдання 35: Многочлени: LinearFunction ($kx + b$) $\\to$ QuadraticFunction ($ax^2 + kx + b$)");
        QuadraticFunction parabola = new QuadraticFunction(1.0, -4.0, 3.0); // f(x) = 1*x^2 - 4*x + 3
        System.out.println(parabola);
        System.out.println("Значення функції при x = 2.0: " + parabola.evaluate(2.0));

        System.out.println("\n\nЗавдання 36: Складський облік з історією цін: WarehouseItem $\\to$ DiscountedWarehouseItem");
        double[] history = {1200.0, 1250.0, 1180.0};
        DiscountedWarehouseItem item1 = new DiscountedWarehouseItem("Планшет", 15, history, "Пошкоджена упаковка", 20.0);
        System.out.println(item1);

        System.out.println("\n\nЗавдання 37: Кінотеатр: CinemaHall $\\to$ VipCinemaHall (Інкапсуляція 2D-масиву місць)");
        VipCinemaHall vipHall = new VipCinemaHall("IMAX VIP", 4, 5, 200.0, 100.0);
        vipHall.bookSeat(0, 1);
        vipHall.bookSeat(3, 2);
        System.out.println(vipHall);

        System.out.println("\n\nЗавдання 38: Командний проєкт в ІТ: Employee $\\to$ TeamLead (Наслідування + Масив підлеглих)");
        TeamLead lead = new TeamLead("Олександр", 45000.0, "Java", 3);
        lead.addTeamMember(new Developer("Максим", 25000.0, "Java"));
        lead.addTeamMember(new Developer("Софія", 28000.0, "Kotlin"));
        System.out.println(lead);

        System.out.println("\n\nЗавдання 39: Енергетичний щит у RPG: CharacterUnit $\\to$ ShieldedPaladin");
        ShieldedPaladin paladin = new ShieldedPaladin("Артур", 100, 100, 5, 40);
        System.out.println("Початковий стан: " + paladin);
        paladin.takeDamage(30);
        System.out.println("Після атаки 30: " + paladin);
        paladin.takeDamage(50);
        System.out.println("Після атаки 50: " + paladin);
        paladin.takeDamage(999);
        System.out.println("Після атаки 999: " + paladin);
    }
}