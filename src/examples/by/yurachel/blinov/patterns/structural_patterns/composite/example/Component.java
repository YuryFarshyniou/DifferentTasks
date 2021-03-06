package examples.by.yurachel.blinov.patterns.structural_patterns.composite.example;

/*Пусть необходимо разработать элементы организации набора каналов для
загрузки больших информационных файлов, где пулы каналов могут состоять
как из отдельных соединений разных видов, так и из пулов, которые, в свою
очередь, могут состоять из отдельных каналов и других пулов. В этом случае
явно необходима реализация рекурсивного включения одного пула в другой.*/

/*В интерфейсе Component отсутствуют объявления методв add() и remove(),
что исключает необходимость для классов типа Leaf предоствлять их реализацию.
Каналы могут собираться в CompositTool. Сам CompositTool может быть ча-
стью другого экземпляра CompositTool. Каналы и экземпляры CompositTool мо-
гут удаляться и добавляться в набор в любой момент по требованию пользователя.*/

public interface Component {
    void send();

    void receive();

    int countChannels();
}
