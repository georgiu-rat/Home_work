package semester1.practice10;

import semester1.practice10.task_13.EmergencyBeacon;
import semester1.practice10.task_12.DataValidator;
import semester1.practice10.task_12.EmailValidator;
import semester1.practice10.task_12.PositiveNumberValidator;
import semester1.practice10.task_14.EscrowSmartContract;
import semester1.practice10.task_15.BoundingBox;
import semester1.practice10.task_15.CircleRegion;
import semester1.practice10.task_15.Transformable2D;
import semester1.practice10.task_16.DataExportable;
import semester1.practice10.task_16.StudentGradeRecord;
import semester1.practice10.task_16.WeatherObservation;
import semester1.practice10.task_17.*;
import semester1.practice10.task_18.AbstractSmartAppliance;
import semester1.practice10.task_18.SmartLedChandelier;
import semester1.practice10.task_18.SmartUnderfloorHeating;
import semester1.practice10.task_19.*;
import semester1.practice10.task_20.*;
import semester1.practice10.task_21.*;
import semester1.practice10.task_22.*;
import semester1.practice10.task_23.*;
import semester1.practice10.task_24.CaesarCipherProcessor;
import semester1.practice10.task_24.ReversibleProcessor;
import semester1.practice10.task_24.TextProcessor;
import semester1.practice10.task_24.WhitespaceTrimmerProcessor;
import semester1.practice10.task_26.*;
import semester1.practice10.task_27.*;
import semester1.practice10.task_28.LifeSupportModule;
import semester1.practice10.task_28.ShieldGenerator;
import semester1.practice10.task_28.ShipModule;
import semester1.practice10.task_28.WarpDrive;
import semester1.practice10.task_29.AudioFile;
import semester1.practice10.task_29.EBookFile;
import semester1.practice10.task_29.MediaItem;
import semester1.practice10.task_29.VideoFile;
import semester1.practice10.task_30.AbstractCustomer;
import semester1.practice10.task_30.StudentCustomer;
import semester1.practice10.task_30.VipCustomer;
import semester1.practice10.task_31.*;
import semester1.practice10.task_32.*;
import semester1.practice10.task_33.FinalCalibrationTable;
import semester1.practice10.task_34.AbstractSecurityProtocol;
import semester1.practice10.task_34.ApiKeySecurityProtocol;
import semester1.practice10.task_34.JwtSecurityProtocol;
import semester1.practice10.task_35.ImmutableVector3D;
import semester1.practice10.task_35.MetricSpaceElement;
import semester1.practice10.task_36.FiscalReceipt;
import semester1.practice10.task_36.PrintableDocument;
import semester1.practice10.task_37.*;
import semester1.practice10.task_38.CubicFunction;
import semester1.practice10.task_39.*;
import semester1.practice10.task_6.DifferentiableFunction;
import semester1.practice10.task_6.ExponentialGrowth;
import semester1.practice10.task_6.NaturalLogFunction;
import semester1.practice10.task_6.QuadraticParabola;
import semester1.practice10.task_10.BatteryCell;
import semester1.practice10.task_10.EnergyConvertible;
import semester1.practice10.task_10.KineticBody;
import semester1.practice10.task_11.AmphibiousRescueDrone;
import semester1.practice10.task_11.Flyable;
import semester1.practice10.task_11.GpsTrackable;
import semester1.practice10.task_11.Swimmable;
import semester1.practice10.task_8.DecliningBalanceAsset;
import semester1.practice10.task_8.IndustrialAsset;
import semester1.practice10.task_8.LinearDepreciationAsset;
import semester1.practice10.task_9.BankVault;
import semester1.practice10.task_9.CpuCore;
import semester1.practice10.task_9.Measurable;
import semester1.practice10.task_9.HighwayRoute;
import semester1.practice10.task_4.EmailSender;
import semester1.practice10.task_4.NotificationSender;
import semester1.practice10.task_4.SmsSender;
import semester1.practice10.task_4.TelegramBotSender;
import semester1.practice10.task_1.BankCardInstrument;
import semester1.practice10.task_1.CryptoTokenInstrument;
import semester1.practice10.task_1.IbanDirectInstrument;
import semester1.practice10.task_1.PaymentInstrument;
import semester1.practice10.task_2.CircleShape;
import semester1.practice10.task_2.EquilateralTriangleShape;
import semester1.practice10.task_2.RectangleShape;
import semester1.practice10.task_2.Shape2D;
import semester1.practice10.task_5.AirCargoTariff;
import semester1.practice10.task_5.RailFreightTariff;
import semester1.practice10.task_5.RoadTruckTariff;
import semester1.practice10.task_5.ShippingTariff;
import semester1.practice10.task_7.ButtonWidget;
import semester1.practice10.task_7.ProgressBarWidget;
import semester1.practice10.task_7.TextInputWidget;
import semester1.practice10.task_7.UiWidget;
import semester1.practice10.task_3.*;

import java.util.Arrays;

public class Practice10 {
    public static void main(String[] args) {
        System.out.println("\n\nЗавдання 1: Поліморфний шлюз електронних платежів (PaymentInstrument)");
        PaymentInstrument[] payments = {
                new BankCardInstrument("Олександр"),
                new CryptoTokenInstrument("Марія", 25.0),
                new IbanDirectInstrument("Іван")};
        double testAmount = 10000.0;
        for (PaymentInstrument p : payments) {
            double fee = p.calculateFee(testAmount);
            double total = p.processPayment(testAmount);
            System.out.printf("Платник: %s | Інструмент: %s | Комісія: %.2f грн | Всього до списання: %.2f грн%n",
                    p.getPayerName(),
                    p.getClass().getSimpleName(),
                    fee,
                    total);
        }

        System.out.println("\n\nЗавдання 2: Поліморфне обчислення площі та периметра 2D-фігур (Shape2D)");
        Shape2D[] shapes = {
                new CircleShape(5.0),
                new RectangleShape(4.0, 10.0),
                new EquilateralTriangleShape(8.0)};
        for (Shape2D s : shapes) {
            System.out.printf("Фігура: %s | Площа: %.2f | Периметр: %.2f%n",
                    s.getClass().getSimpleName(),
                    s.getArea(),
                    s.getPerimeter());
        }

        System.out.println("\n\nЗавдання 3: Статичний проти Динамічного поліморфізму (MathCalculator vs OperationNode)");
        System.out.println("--- Статичний поліморфізм (Overloading) ---");
        System.out.printf("Норма 1D (5.0) = %.2f%n", VectorMathOverload.norm(5.0));
        System.out.printf("Норма 2D (3.0, 4.0) = %.2f%n", VectorMathOverload.norm(3.0, 4.0));
        System.out.printf("Норма масиву {1, 2, 2} = %.2f%n", VectorMathOverload.norm(new double[]{1.0, 2.0, 2.0}));
        System.out.println("--- Динамічний поліморфізм (Overriding / Dynamic Dispatch) ---");
        BinaryOperation[] operations = {
                new AddOp(),
                new MultiplyOp(),
                new HypotenuseOp()};
        double x = 3.0;
        double y = 4.0;
        for (BinaryOperation op : operations) {
            System.out.printf("Операція (%s) над числами %.1f та %.1f = %.2f%n",
                    op.getClass().getSimpleName(),
                    x, y,
                    op.apply(x, y));
        }

        System.out.println("\n\nЗавдання 4: Поліморфна система сповіщень (NotificationSender)");
        NotificationSender[] senders = {
                new EmailSender("admin@university.ua", "Звіт безпеки"),
                new SmsSender("+380501234567"),
                new TelegramBotSender("ID12345", "it_student_ua")};
        String alertMessage = "Увага! Зафіксовано спробу несанкціонованого входу до лабораторного серверу мережі.";
        broadcastAlert(senders, alertMessage);

        System.out.println("\n\nЗавдання 5: Поліморфний розрахунок вартості логістичної доставки (ShippingTariff)");
        ShippingTariff[] tariffs = {
                new RoadTruckTariff(),
                new AirCargoTariff(),
                new RailFreightTariff()};
        double cargoWeight = 250.0; // 250 кг
        double cargoDistance = 600.0; // 600 км
        for (ShippingTariff t : tariffs) {
            double cost = t.calculateCost(cargoWeight, cargoDistance);
            System.out.printf("Тариф (%s): %.2f грн%n", t.getClass().getSimpleName(), cost);
        }
        ShippingTariff bestTariff = findCheapestTariff(tariffs, cargoWeight, cargoDistance);
        if (bestTariff != null) {
            System.out.printf("Найвигідніший тариф: %s з вартістю %.2f грн%n",
                    bestTariff.getClass().getSimpleName(),
                    bestTariff.calculateCost(cargoWeight, cargoDistance));
        }

        System.out.println("\n\nЗавдання 6: Чисельне диференціювання поліморфних математичних функцій (DifferentiableFunction)");
        DifferentiableFunction[] functions = {
                new QuadraticParabola(2.0, -3.0, 1.0),
                new NaturalLogFunction(1.5),
                new ExponentialGrowth(1.0, 0.5)};
        double pointX = 2.0;
        for (DifferentiableFunction func : functions) {
            double val = func.f(pointX);
            double deriv = func.derivativeAt(pointX);
            System.out.printf("Функція: %-22s | f(%.1f) = %9.4f | f'(%.1f) = %9.4f%n",
                    func.getClass().getSimpleName(),
                    pointX, val,
                    pointX, deriv);
        }

        System.out.println("\n\nЗавдання 7: Поліморфний рендеринг UI-компонентів (UiWidget)");
        UiWidget[] pageElements = {
                new TextInputWidget("username_input", 250, 40, "Введіть логін..."),
                new ButtonWidget("submit_btn", 120, 40, "Увійти"),
                new ProgressBarWidget("loading_bar", 300, 20, 75)};
        System.out.println("Згенерована HTML-сторінка з віджетів:");
        for (UiWidget widget : pageElements) {
            System.out.println(widget.renderHtml());
        }

        System.out.println("\n\nЗавдання 8: Поліморфний розрахунок амортизації промислового обладнання (IndustrialAsset)");
        IndustrialAsset[] assets = {
                new LinearDepreciationAsset("Верстат ЧПК (Львів)", 500000.0, 10),
                new DecliningBalanceAsset("Промисловий робот-маніпулятор", 850000.0, 8, 0.25)};
        int targetYears = 3;
        double totalBookValue = 0.0;
        for (IndustrialAsset asset : assets) {
            double bookVal = asset.getBookValueAfterYears(targetYears);
            totalBookValue += bookVal;
            System.out.printf("Актив: %-30s | Початкова: %10.2f грн | Через %d роки: %10.2f грн (%s)%n",
                    asset.getName(),
                    asset.getInitialCost(),
                    targetYears,
                    bookVal,
                    asset.getClass().getSimpleName());
        }
        System.out.printf("Сумарна залишкова вартість усього цеху: %.2f грн%n", totalBookValue);

        System.out.println("\n\nБлок 2\nЗавдання 9: Перший контракт здатності: Інтерфейс Measurable для різнорідних сутностей");
        Measurable[] diverseItems = {
                new BankVault("Сховище №1", 1250.5),
                new HighwayRoute("Київ-Чоп", 842.3),
                new CpuCore("Intel Core i9", 5.2)};
        for (Measurable m : diverseItems) {
            System.out.printf("Об'єкт: %-20s | Вимірюваний показник: %.2f%n",
                    m.getClass().getSimpleName(),
                    m.getMeasure());}
        double avgValue = computeAverage(diverseItems);
        System.out.printf("Середнє арифметичне значення різнорідних сутностей: %.2f%n", avgValue);

        System.out.println("\n\nЗавдання 10: Константи в інтерфейсі та фізична конвертація (PhysicalConstants & EnergyConvertible)");
        EnergyConvertible[] energyItems = {
                new KineticBody("Спорткар (на швидкості 100 м/с)", 1500.0, 100.0),
                new BatteryCell("Tesla Powerwall", 13.5)};
        for (EnergyConvertible item : energyItems) {
            double joules = item.getEnergyJoules();
            double kwh = item.getEnergyKwh();
            System.out.printf("Об'єкт: %-35s | Енергія: %15.2f Дж | %8.2f кВт·год%n",
                    item.getClass().getSimpleName(),
                    joules,
                    kwh);}

        System.out.println("\n\nЗавдання 11: Множинна реалізація інтерфейсів: Універсальний Амфібійний Дрон (Flyable, Swimmable, GpsTrackable)");
        AmphibiousRescueDrone rescueDrone = new AmphibiousRescueDrone("Poseidon-X1");
        System.out.println("--- Тест польоту ---");
        testFlight(rescueDrone);
        System.out.println("--- Тест занурення ---");
        testDiving(rescueDrone);
        System.out.println("--- Тест позиціонування ---");
        logPosition(rescueDrone);

        System.out.println("\n\nЗавдання 12: default та static методи в інтерфейсі (DataValidator)");
        DataValidator emailVal = new EmailValidator();
        DataValidator numVal = new PositiveNumberValidator();
        String testEmail1 = "student@university.ua";
        String testEmail2 = "invalid-email-format";
        System.out.println("--- Перевірка Email ---");
        System.out.printf("Email '%s' валідний? %b%n", testEmail1, emailVal.isValid(testEmail1));
        System.out.printf("Email '%s' з fallback: %s%n",
                testEmail2,
                emailVal.validateOrDefault(testEmail2, "default@ukr.net"));
        String testNum1 = "150.5";
        String testNum2 = "-25";
        System.out.println("--- Перевірка Чисел ---");
        System.out.printf("Число '%s' додатне? %b%n", testNum1, numVal.isValid(testNum1));
        System.out.printf("Число '%s' з fallback: %s%n",
                testNum2,
                numVal.validateOrDefault(testNum2, "1.0"));
        System.out.println("--- Перевірка static-методу інтерфейсу ---");
        System.out.printf("Чи рядок не порожній? %b%n", DataValidator.isNotNullOrBlank("   "));

        System.out.println("\n\nЗавдання 13: Вирішення конфлікту default-методів (Diamond Problem)");
        EmergencyBeacon beacon = new EmergencyBeacon("Сектор Б (Головний шлюз)");
        String alertOutput = beacon.emitAlert();
        System.out.println(alertOutput);

        System.out.println("\n\nЗавдання 14: Спадкування інтерфейсів (interface SmartContract extends Authenticatable, Auditable)");
        EscrowSmartContract escrow = new EscrowSmartContract("ESCROW-9988", "SECURE_KEY_2026");
        String testKey = "SECURE_KEY_2026";
        System.out.printf("Перевірка підпису: %b%n", escrow.verifySignature(testKey));
        System.out.printf("Спроба виконання контракту (газ 25000): %b%n", escrow.executeContract(25000.0));
        System.out.println("Аудит-звіт: " + escrow.getAuditTrail());

        System.out.println("\n\nЗавдання 15: Інтерфейс геометричних перетворень (Transformable2D)");
        Transformable2D[] sceneObjects = {
                new BoundingBox(10.0, 20.0, 50.0, 30.0),
                new CircleRegion(0.0, 0.0, 15.0)};
        System.out.println("--- Стан до трансформації ---");
        for (Transformable2D obj : sceneObjects) {
            System.out.println(obj);}
        applyGlobalTransform(sceneObjects, 5.0, -2.0, 2.0);
        System.out.println("--- Стан після трансформації ---");
        for (Transformable2D obj : sceneObjects) {
            System.out.println(obj);}

        System.out.println("\n\nЗавдання 16: Інтерфейс серіалізації у формати JSON та CSV (DataExportable)");
        DataExportable[] records = {
                new StudentGradeRecord("Олександр Шевченко", 301, 94.5),
                new WeatherObservation("Київ", 12.5, 76)};
        System.out.println("--- JSON Дамп об'єктів ---");
        for (DataExportable record : records) {
            System.out.println(record.toJson());}
        System.out.println("--- CSV Таблиця ---");
        System.out.println("Type,Field1,Field2,Field3");
        for (DataExportable record : records) {
            System.out.println(record.toCsvRow());}

        System.out.println("\n\nБлок 3\nЗавдання 17: Архітектурний поділ IS-A та CAN-DO: Птахи, Літаки та Плавання");
        AbstractBird[] birds = {
                new Falcon("Сокіл-сапсан", 1.2, 320.0),
                new EmperorPenguin("Імператорський пінгвін", 35.0, 564.0)};
        System.out.println("--- Масив птахів (AbstractBird) ---");
        for (AbstractBird bird : birds) {
            System.out.printf("Вид: %-25s | Вага: %.1f кг | Звук: %s%n",
                    bird.getSpecies(), bird.getWeightKg(), bird.makeSound());}
        FlyableUnit[] flyingUnits = {
                new Falcon("Сокіл-сапсан (у польоті)", 1.2, 320.0),
                new CargoPlane("Boeing 747 Freighter", 900.0)};
        System.out.println("--- Масив об'єктів з інтерфейсом FlyableUnit ---");
        for (FlyableUnit flyer : flyingUnits) {
            System.out.printf("Об'єкт: %-30s | Швидкість польоту: %.1f км/год%n",
                    flyer.getClass().getSimpleName(),
                    flyer.getFlightSpeedKmh());}

        System.out.println("\n\nЗавдання 18: Розумний будинок: AbstractSmartAppliance + інтерфейси Switchable, Dimmable, TemperatureControllable");
        SmartLedChandelier chandelier = new SmartLedChandelier("Вітальня", "Philips Hue Chandelier", 60.0);
        chandelier.setBrightness(50);
        SmartUnderfloorHeating heating = new SmartUnderfloorHeating("Ванна кімната", "DEVI Smart Heat", 15.0);
        heating.setTargetTemperature(25.0); // встановлюємо 25°C
        AbstractSmartAppliance[] appliances = { chandelier, heating };
        double totalWatts = 0.0;
        for (AbstractSmartAppliance app : appliances) {
            double watts = app.getCurrentWatts();
            totalWatts += watts;
            System.out.printf("Кімната: %-15s | Модель: %-22s | Споживання: %6.1f Вт%n",
                    app.getRoom(), app.getModel(), watts);}
        System.out.printf("Загальне енергоспоживання розумного будинку: %.1f Вт%n", totalWatts);

        System.out.println("\n\nЗавдання 19: Фінансова біржа: AbstractFinancialInstrument + інтерфейси Tradable, DividendPaying");
        AbstractFinancialInstrument[] portfolio = {
                new TechGrowthStock("NVDA", 15, 4500.0),
                new BlueChipStock("MSFT", 10, 16000.0, 350.0),
                new FixedTermDeposit("DEPOSIT-USD", 100000.0, 0.14)};
        double totalPortfolioValue = 0.0;
        for (AbstractFinancialInstrument inst : portfolio) {
            double val = inst.getMarketValueUah();
            totalPortfolioValue += val;
            System.out.printf("Тікер: %-12s | Клас: %-22s | Ринкова вартість: %12.2f грн%n",
                    inst.getTicker(),
                    inst.getClass().getSimpleName(),
                    val);
            if (inst instanceof DividendPaying div) {
                System.out.printf("   └─ Річні дивіденди/відсотки: %.2f грн%n", div.calculateAnnualDividend());}
        }System.out.printf("Загальна вартість портфеля: %.2f грн%n", totalPortfolioValue);

        System.out.println("\n\nЗавдання 20: Лінійні оператори: AbstractVectorOperator + інтерфейс InvertibleOperator");
        Vec2D initialVector = new Vec2D(3.0, 4.0);
        System.out.println("Початковий вектор: " + initialVector);
        AbstractVectorOperator[] operators = {
                new Rotation2DOperator("Поворот на 90° (π/2)", Math.PI / 2.0),
                new ProjectionXOperator("Проєкція на вісь OX")};
        for (AbstractVectorOperator op : operators) {
            Vec2D transformed = op.transform(initialVector);
            System.out.printf("Оператор: %-25s | Результат: %s%n", op.getName(), transformed);
            if (op instanceof InvertibleOperator invertible) {
                Vec2D restored = invertible.inverseTransform(transformed);
                System.out.printf("   └─ Зворотне перетворення (скидання до витоків): %s%n", restored);
            } else {
                System.out.println("   └─ Оператор незворотний (інформація втрачена безповоротно).");}}

        System.out.println("\n\nЗавдання 21: Автопарк спецтехніки: AbstractVehicle + CargoCarrier, PassengerCarrier, ElectricPowered");
        AbstractVehicle[] fleet = {
                new ElectricCityBus("AA 1234 EE", 45000.0, 32, 350.0),
                new DieselDumpTruck("KB 9876 CT", 120000.0, 25.0),
                new CargoPassengerVan("BI 5555 AX", 18000.0, 1.5, 6)};
        for (AbstractVehicle vehicle : fleet) {
            System.out.printf("ТЗ: номер [%-10s] | Клас: %-22s | Пробіг: %.1f км%n",
                    vehicle.getPlateNumber(),
                    vehicle.getClass().getSimpleName(),
                    vehicle.getMileageKm());
            if (vehicle instanceof PassengerCarrier pass) {
                System.out.printf("   └─ Пасажирських місць: %d%n", pass.getSeatCount());}
            if (vehicle instanceof CargoCarrier cargo) {
                System.out.printf("   └─ Вантажопідйомність: %.1f тонн%n", cargo.getMaxPayloadTons());}
            if (vehicle instanceof ElectricPowered elec) {
                System.out.printf("   └─ Ємність акумулятора: %.1f кВт·год%n", elec.getBatteryCapacityKwh());}
        }

        System.out.println("\n\nЗавдання 22: Бойові одиниці стратегії: AbstractMilitaryUnit + Armored, RangedAttacker, Healer");
        AbstractMilitaryUnit[] army = {
                new HeavySniper("Ghost-1", 100, 1500),
                new CombatMedic("Doc-Alpha", 80),
                new PaladinCaptain("Sir Arthur", 250, 600)};
        for (AbstractMilitaryUnit unit : army) {
            System.out.printf("Боєць: [%-12s] | Клас: %-18s | HP: %3d | Швидкість: %d%n",
                    unit.getUnitName(),
                    unit.getClass().getSimpleName(),
                    unit.getHp(),
                    unit.getMoveSpeed());
            if (unit instanceof RangedAttacker attacker) {
                System.out.printf("   └─ Дальність атаки: %4d м | Шкода: %d%n",
                        attacker.getAttackRange(), attacker.fireShot());}
            if (unit instanceof FieldHealer healer) {
                System.out.printf("   └─ Потужність лікування союзників: +%d HP%n", healer.healAlly());}}

        System.out.println("\n\nЗавдання 23: Лабораторні прилади: AbstractLabDevice + Calibratable, SelfDiagnostic");
        AbstractLabDevice[] labDevices = {
                new ElectronicScale("SCALE-2026-X"),
                new GlassThermometer("THERMO-GLASS-01")};
        for (AbstractLabDevice device : labDevices) {
            System.out.printf("Прилад: інвентарний код [%-15s] | Тип: %s%n",
                    device.getInventoryCode(),
                    device.getClass().getSimpleName());
            device.performMeasurement();
            if (device instanceof SelfDiagnostic diagnostic) {
                diagnostic.runSelfCheck();
            } else {
                System.out.println("   └─ [Самодіагностика] Не підтримується (механічний пристрій).");}
            if (device instanceof Calibratable calibratable) {
                calibratable.calibrate(100.0);
            } else {
                System.out.println("   └─ [Калібрування] Не підтримується (ручне налаштування відсутнє).");}
            System.out.println();}

        System.out.println("\n\nЗавдання 24: Поліморфна конвеєрна фільтрація тексту (TextProcessor & Reversible)");
        String rawText = "   Це   тестовий   рядок   для   конвеєра   обробки   тексту!   ";
        System.out.println("Оригінал:    [" + rawText + "]");
        TextProcessor[] pipeline = {
                new WhitespaceTrimmerProcessor(),
                new CaesarCipherProcessor(3)};
        String currentText = rawText;
        for (TextProcessor processor : pipeline) {
            currentText = processor.process(currentText);
            System.out.printf("Після %-25s: [%s]%n", processor.getClass().getSimpleName(), currentText);
            if (processor instanceof ReversibleProcessor reversible) {
                String restored = reversible.reverseProcess(currentText);
                System.out.printf("   └─ Зворотний дешифрований крок: [%s]%n", restored);}
        }

        System.out.println("\n\nБлок 4\nЗавдання 25: Безпечна перевірка типу та захист від ClassCastException");
        Shape2D[] figures = {
                new CircleShape(5.0),
                new RectangleShape(4.0, 4.0),
                new RectangleShape(3.0, 6.0)};
        for (Shape2D fig : figures) {
            System.out.printf("Фігура: %-22s | Площа: %6.2f | Периметр: %6.2f%n",
                    fig.getClass().getSimpleName(),
                    fig.getArea(),
                    fig.getPerimeter());
            if (fig instanceof CircleShape c) {
                System.out.printf("   └─ [Коло] Діаметр: %.2f%n", c.getDiameter());
            } else if (fig instanceof RectangleShape rect) {
                System.out.printf("   └─ [Прямокутник] Діагональ: %.2f | Чи є квадратом? %b%n",
                        rect.getDiagonal(), rect.isSquare());}
        }Shape2D nullShape = null;
        boolean isNullCircle = nullShape instanceof CircleShape;
        System.out.println("\nПеревірка: чи є null колом? " + isNullCircle);

        System.out.println("\n\nЗавдання 26: Автоматична зарядна станція з фільтрацією через instanceof Rechargeable");
        Object[] warehouse = {
                new Laptop(),
                new DesktopMonitor("Dell UltraSharp 27"),
                new ElectricScooter(),
                new WiredPrinter("HP LaserJet Pro")};
        int chargedCount = chargeAllPossible(warehouse);
        System.out.printf("Успішно відправлено на зарядку пристроїв: %d%n", chargedCount);

        System.out.println("\n\nЗавдання 27: Податковий аудитор: сортування доходів за ролями (Taxable, SocialInsured, BonusEligible)");
        System.out.println("\n\nЗавдання 27: Податковий аудитор (сортування доходів за ролями BonusEligible, MedicalInsured)");
        AbstractWorker[] staff = {
                new FullTimeDeveloper("Олександр Коваленко", 65000.0),
                new FopContractor("Іван Петренко (ФОП)", 80000.0),
                new InternStudent("Марія Сидорчук", 15000.0)};
        runTaxAudit(staff);

        System.out.println("\n\nЗавдання 28: Діагностика космічного корабля за типами модулів (HullModule, ShieldGenerator, WarpDrive)");
        ShipModule[] shipModules = {
                new ShieldGenerator("Головний щит Mk-II", false),
                new WarpDrive("Гіпердрайв класу A", true),
                new LifeSupportModule("Сектор житлових відсіків", false)};
        runShipInspection(shipModules);

        System.out.println("\n\nЗавдання 29: Аналізатор медіатеки (AudioFile, VideoFile, EBookFile)");
        MediaItem[] mediaLibrary = {
                new VideoFile("Interstellar_IMAX.mkv", 14500.0, 2160, 169),
                new VideoFile("Short_Clip_1080p.mp4", 450.0, 1080, 120),
                new AudioFile("Pink_Floyd_FLAC.flac", 120.0, 1411),
                new AudioFile("Podcast_Normal.mp3", 45.0, 128),
                new EBookFile("Java_Concurrency_In_Practice.pdf", 15.0, 384)};
        double specialMediaSizeSum = 0.0;
        for (MediaItem item : mediaLibrary) {
            System.out.printf("Файл: %-35s | Розмір: %8.1f МБ | Тип: %s%n",
                    item.getTitle(), item.getSizeMb(), item.getClass().getSimpleName());
            if (item instanceof VideoFile video && video.is4K()) {
                specialMediaSizeSum += video.getSizeMb();
                System.out.println("   └─ [Знайдено 4K відео!] Додано до сумарного обсягу.");
            } else if (item instanceof AudioFile audio && audio.isLossless()) {
                specialMediaSizeSum += audio.getSizeMb();
                System.out.println("   └─ [Знайдено Lossless аудіо!] Додано до сумарного обсягу.");}
        }System.out.printf("Сумарний обсяг 4K-відео та Lossless-аудіо: %.1f МБ%n", specialMediaSizeSum);

        System.out.println("\n\nЗавдання 30: Рефакторинг антипатерна instanceof на чистий Поліморфізм!");
        AbstractCustomer[] customers = {
                new VipCustomer("Ольга Мельник"),
                new StudentCustomer("Андрій Шевченко")};
        double basePrice = 1000.0;
        System.out.printf("Базова ціна товару: %.2f грн%n%n", basePrice);
        for (AbstractCustomer customer : customers) {
            double discountPct = customer.getDiscountPercent();
            double finalPrice = basePrice * (1.0 - discountPct / 100.0);
            System.out.printf("Покупець: %-20s | Категорія: %-18s | Знижка: %4.1f%% | Ціна до сплати: %6.2f грн%n",
                    customer.getFullName(),
                    customer.getClass().getSimpleName(),
                    discountPct,
                    finalPrice);}

        System.out.println("\n\nЗавдання 31: Перевірка матричних властивостей через інтерфейси (Symmetric, Orthogonal, Invertible)");
        Matrix2x2[] matrices = {
                new RotationMatrix2x2(),
                new SingularMatrix2x2()};
        for (Matrix2x2 mat : matrices) {
            System.out.printf("Матриця: %-30s | Визначник (det): %6.2f%n",
                    mat.toString(), mat.determinant());
            if (mat instanceof InvertibleMatrix inv) {
                System.out.println("   └─ [Invertible] Матриця має обернену матрицю.");
                Matrix2x2 invMat = inv.inverse();
                System.out.println("      Обернена: " + invMat);
            } else {
                System.out.println("   └─ [Invertible] Відсутня (вироджена матриця, det = 0).");}
            if (mat instanceof OrthogonalMatrix orth) {
                System.out.printf("   └─ [Orthogonal] Чи є ортогональною? %b%n", orth.checkOrthogonality());}
        }

        System.out.println("\n\nЗавдання 32: Митний термінал: перевірка вантажів (HazardousCargo, FragileCargo, PerishableCargo)");
        CargoContainer[] containers = {
                new ChemicalContainer("CHEM-991", 1200.0, 3),
                new FrozenFoodContainer("FOOD-404", 3500.0, -18.5),
                new ElectronicsContainer("ELEC-777", 800.0)};
        for (CargoContainer c : containers) {
            System.out.printf("Контейнер: %-12s | Вага: %6.1f кг | Тип: %s%n",
                    c.getTrackingNumber(), c.getWeightKg(), c.getClass().getSimpleName());
            if (c instanceof HazardousCargo haz) {
                System.out.printf("   └─ [Хімікати] Надіслано у спецбокс. Клас небезпеки: %d%n", haz.getHazardClass());
            } else if (c instanceof RefrigeratedCargo ref) {
                System.out.printf("   └─ [Рефрижератор] Підключено до живлення термінала. Режим: %.1f °C%n", ref.getRequiredTempC());
            } else {
                System.out.println("   └─ [Звичайний вантаж] Направлено на загальний склад митниці.");}
        }

        System.out.println("\n\nБлок 5\nЗавдання 33: Три обличчя final: Поля, Посилання на масив та Незмінні константи (FinalMechanicsDemo)");
        System.out.println("Константа прискорення вільного падіння (GRAVITY_G): " + FinalCalibrationTable.GRAVITY_G);
        double[] rawData = {1.1, 2.2, 3.3};
        FinalCalibrationTable calibration = new FinalCalibrationTable("SN-9988-X", rawData);
        System.out.println("Серійний номер датчика (blank final поле): " + calibration.getSensorSerial());
        System.out.println("Початкові коефіцієнти калібрування: " + Arrays.toString(calibration.getCoefficients()));
        rawData[0] = 999.9;
        System.out.println("Коефіцієнти всередині об'єкта після зміни зовнішнього масиву: " +
                Arrays.toString(calibration.getCoefficients()));

        System.out.println("\n\nЗавдання 34: final метод як броня Шаблонного методу (AbstractSecurityProtocol)");
        AbstractSecurityProtocol jwtProtocol = new JwtSecurityProtocol();
        AbstractSecurityProtocol apiKeyProtocol = new ApiKeySecurityProtocol();
        String res1 = jwtProtocol.runSecureCommand("INVALID_TOKEN", "DELETE FROM users;");
        System.out.println("Тест 1 (Хіт з недійсним токеном): " + res1);
        String res2 = jwtProtocol.runSecureCommand("JWT-admin-token-xyz", "RESTART_SERVER");
        System.out.println("Тест 2 (JWT успіх): " + res2);
        String res3 = apiKeyProtocol.runSecureCommand("SECRET-API-KEY-2026", "SELECT * FROM metrics");
        System.out.println("Тест 3 (API Key успіх): " + res3);

        System.out.println("\n\nЗавдання 35: final клас у поліморфізмі через інтерфейс (final class ImmutableVector3D implements MetricSpaceElement)");
        MetricSpaceElement[] spacePoints = {
                new ImmutableVector3D(0.0, 0.0, 0.0),
                new ImmutableVector3D(3.0, 4.0, 0.0),
                new ImmutableVector3D(1.0, 2.0, 2.0)};
        for (int i = 0; i < spacePoints.length; i++) {
            MetricSpaceElement pt = spacePoints[i];
            System.out.printf("Точка %d (%s) | Норма (довжина): %.2f%n",
                    i, pt.toString(), pt.getNorm());}
        double distance = spacePoints[0].distanceTo(spacePoints[1]);
        System.out.printf("Відстань між точкою 0 та точкою 1: %.2f%n", distance);

        System.out.println("\n\nЗавдання 36: Фінальний платіжний чек та заборона підробки (final class FiscalReceipt)");
        PrintableDocument[] documents = {
                new FiscalReceipt("UA-99887766", 3600.0),
                new FiscalReceipt("UA-55443322", 1200.0)};
        for (PrintableDocument doc : documents) {
            System.out.println(doc.formatForPrinter());
            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n\nЗавдання 37: Складна інженерна система: Автономна Енергомережа (SmartGridController)");
        PowerProducer[] gridStations = {
                new NuclearStation("NUC-Zaporizhzhia-1", 1000.0),
                new SolarFarmStation("SOLAR-South-2", 400.0),
                new HydroDamStation("HYDRO-Dnipro-1", 600.0)};
        System.out.println("Оновлення погодних умов для метеозалежних станцій...");
        for (PowerProducer producer : gridStations) {
            if (producer instanceof WeatherDependent weatherStation) {
                if (weatherStation instanceof SolarFarmStation) {
                    weatherStation.updateWeatherCondition(0.7);
                    System.out.println("   └─ [Сонячна панель] Коефіцієнт сонячного світла встановлено на 0.7");
                } else if (weatherStation instanceof HydroDamStation) {
                    weatherStation.updateWeatherCondition(1.1);
                    System.out.println("   └─ [ГЕС] Коефіцієнт рівня води встановлено на 1.1");}
            }}
        System.out.println("\n--- ЗВІТ ЕНЕРГОМЕРЕЖІ (Чиста генерація мінус 5% втрат) ---");
        double totalNetPower = 0.0;
        for (PowerProducer producer : gridStations) {
            if (producer instanceof AbstractPowerStation station) {
                double net = station.getNetOutputMw();
                totalNetPower += net;
                System.out.printf("Станція: %-22s | Тип: %-18s | Чиста генерація: %8.2f МВт%n",
                        station.getStationId(), station.getClass().getSimpleName(), net);}
        }System.out.printf("Сумарна чиста потужність енергомережі: %.2f МВт%n", totalNetPower);

        System.out.println("\n\nЗавдання 38: Математичний процесор поліномів та функцій (FunctionAnalyzer)");
        CubicFunction cubic = new CubicFunction();
        double integralResult = cubic.integrateTrapezoid(0.0, 3.0, 1000);
        System.out.printf("(x^3 - 2x - 5) dx на відрізку [0; 3] = %.4f%n", integralResult);
        double root = cubic.findRootBisection(2.0, 3.0, 1e-6);
        System.out.printf("Знайдений корінь рівняння x^3 - 2x - 5 = 0 на [2; 3]: x = %.6f%n", root);
        System.out.printf("Перевірка f(root) = %.6f (має бути близьким до 0)%n", cubic.evaluate(root));

        System.out.println("\n\nЗавдання 39: Ігровий Рушій Бою: Синергія AbstractUnit, Інтерфейсів, instanceof та final");
        AbstractCombatUnit[] arenaUnits = {
                new BerserkerAssasin("Тіньовий Асасин", 120),
                new TrollWarlord("Троль-Воєначальник", 200),
                new RoyalPaladin("Королівський Паладин", 180)};
        System.out.println("Початок симуляції бойового раунду на арені!");
        for (AbstractCombatUnit unit : arenaUnits) {
            System.out.printf("Бєць: %-22s | HP: %3d | Клас: %s%n",
                    unit.getName(), unit.getHp(), unit.getClass().getSimpleName());
            if (unit instanceof SelfRegenerating reg) {
                int healed = reg.regenerateHp();
                System.out.printf("   └─ [Регенерація] Відновлено %d HP. Поточне HP: %d%n", healed, unit.getHp());}
            int baseDmg = unit.calculateDamage();
            int finalDmg = baseDmg;
            if (unit instanceof CriticalStriker crit) {
                finalDmg = (int)(baseDmg * crit.getCritMultiplier());
                System.out.printf("   └─ [Крит!] Завдано критичної шкоди: %d (базова: %d)%n", finalDmg, baseDmg);
            } else {
                System.out.printf("   └─ [Атака] Завдано звичайної шкоди: %d%n", finalDmg);}
            int incomingTestDmg = 50;
            if (unit instanceof ShieldBearer shield) {
                int mitigated = shield.absorbDamage(incomingTestDmg);
                System.out.printf("   └─ [Щит] Заблоковано шкоду. Отримано всього: %d замість %d%n", mitigated, incomingTestDmg);}
        }

    }

    //завдання 2
    public static Shape2D findMaxAreaShape(Shape2D[] shapes) {
        if (shapes == null || shapes.length == 0) {
            return null;
        }
        Shape2D maxShape = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].getArea() > maxShape.getArea()) {
                maxShape = shapes[i];
            }
        }
        return maxShape;
    }

    //завдання 4
    public static void broadcastAlert(NotificationSender[] senders, String alertText) {
        for (NotificationSender sender : senders) {
            String result = sender.send(alertText);
            System.out.println(result);
        }
    }

    //завдання 5
    public static ShippingTariff findCheapestTariff(ShippingTariff[] tariffs, double weight, double distance) {
        if (tariffs == null || tariffs.length == 0) {
            return null;
        }
        ShippingTariff cheapest = tariffs[0];
        double minCost = cheapest.calculateCost(weight, distance);

        for (int i = 1; i < tariffs.length; i++) {
            double cost = tariffs[i].calculateCost(weight, distance);
            if (cost < minCost) {
                minCost = cost;
                cheapest = tariffs[i];
            }
        }
        return cheapest;
    }

    //завдання 9
    public static double computeAverage(Measurable[] items) {
        if (items == null || items.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (Measurable item : items) {
            sum += item.getMeasure();
        }
        return sum / items.length;
    }
    //завдання 11
    public static void testFlight(Flyable f) {
        f.takeOff();
        System.out.printf("   Максимальна висота польоту: %.1f м%n", f.getMaxAltitude());
    }

    public static void testDiving(Swimmable s) {
        s.dive(25.0);
        System.out.printf("   Гранична глибина занурення: %.1f м%n", s.getMaxDepth());
    }

    public static void logPosition(GpsTrackable g) {
        System.out.printf("   Поточні GPS-координати: %s%n", g.getCoordinates());
    }
    //завдання 15
    public static void applyGlobalTransform(Transformable2D[] objects, double dx, double dy, double scaleFactor) {
        if (objects == null) return;
        for (Transformable2D obj : objects) {
            obj.translate(dx, dy);
            obj.scale(scaleFactor);
        }
    }
    //завдання 26
    public static int chargeAllPossible(Object[] items) {
        if (items == null) return 0;
        int count = 0;
        for (Object item : items) {
            if (item instanceof Rechargeable r) {
                System.out.printf("Початковий заряд: %d%%. ", r.getBatteryLevel());
                r.chargeToFull();
                count++;
            } else {
                System.out.println("Пропущено (пристрій працює від мережі або не підтримує зарядку).");
            }
        }
        return count;
    }
        //завдання 27
        public static void runTaxAudit(AbstractWorker[] staff) {
            if (staff == null) return;

            double totalBasicPayroll = 0.0;
            double totalBonuses = 0.0;
            int insuredCount = 0;

            for (AbstractWorker worker : staff) {
                totalBasicPayroll += worker.getBaseSalaryUah();
                System.out.printf("Працівник: %-22s | База: %10.2f грн | Тип: %s%n",
                        worker.getFullName(), worker.getBaseSalaryUah(), worker.getClass().getSimpleName());
                if (worker instanceof BonusEligible bonusUser) {
                    double bonus = bonusUser.calculateQuarterBonus();
                    totalBonuses += bonus;
                    System.out.printf("   └─ [Премія] Квартальна виплата: %.2f грн%n", bonus);
                }

                if (worker instanceof MedicalInsured) {
                    insuredCount++;
                    System.out.println("   └─ [Страховка] Застрахований співробітник компанії.");
                }
            }

            System.out.println("--- ПІДСУМКОВИЙ ЗВІТ АУДИТОРУ ---");
            System.out.printf("Базовий фонд оплати праці: %.2f грн%n", totalBasicPayroll);
            System.out.printf("Загальна сума квартальних премій: %.2f грн%n", totalBonuses);
            System.out.printf("Загальна кількість застрахованих осіб: %d%n", insuredCount);
        }
    //завдання 28
    public static void runShipInspection(ShipModule[] modules) {
        if (modules == null) return;

        for (ShipModule mod : modules) {
            System.out.printf("Модуль: %-22s | Клас: %-22s | Пошкоджений? %b%n",
                    mod.getName(), mod.getClass().getSimpleName(), mod.isDamaged());
            if (mod instanceof ShieldGenerator shield) {
                shield.rechargeShields(400);
            } else if (mod instanceof WarpDrive warp) {
                warp.checkAntimatterContainment();
            } else if (mod instanceof LifeSupportModule life) {
                System.out.printf("   └─ [Життя] Рівень кисню: %.1f%%%n", life.getOxygenPercent());
            }
        }
    }
}