package cohesion;

import java.util.UUID;

public class DatabaseClient {

    Database database = new Database();
    Player player = new Player();
    Ranking ranking = new Ranking();

    public void connectDatabase() {
        database.connect();
    }

    public void printAllPlayersInfo() {
        player.printAllPlayersInfo();
    }

    public void printSinglePlayerInfo(UUID playerId) {
        player.printSinglePlayerInfo(playerId);
    }

    public void printRankings() {
        ranking.printRankings();
    }

    public void closeDatabase() {
        database.close();
    }
}

class Database {

    public void connect() {
        //connecting to database.
    }

    public void close() {
        //closing the database connection.
    }
}

class Player {

    public void printAllPlayersInfo() {
        //printing all the players information.
    }

    public void printSinglePlayerInfo(UUID playerId) {
        //printing a single player information.
    }
}

class Ranking {

    public void printRankings() {
        //printing the players current rankings.
    }
}