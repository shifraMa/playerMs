package services;

import dto.PlayerDto;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayersService {
    public List<PlayerDto> getPlayersDto() {
        List<PlayerDto> players = new ArrayList<>();
//      I would have used the getPlayers method and converted it to PlayerDto
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("data/player.csv"));
//          skipping on the headers line
            String[] nextLine = reader.readNext();
//          reads one line at a time
            while ((nextLine = reader.readNext()) != null) {
//              handle all basic fields
                PlayerDto.PlayerDtoBuilder playerDtoBuilder =
                        PlayerDto.builder()
                                .playerId(Integer.valueOf(nextLine[0]))
                                .birthYear(Integer.valueOf(nextLine[1]))
                                .birthMonth(Integer.valueOf(nextLine[2]))
                                .birthDay(Integer.valueOf(nextLine[3]));
//              handle all fields that can be null
                Optional.ofNullable(nextLine[7]).ifPresent(d ->
                        playerDtoBuilder.deathYear(Integer.valueOf(d)));
//                      and so on...

                players.add(playerDtoBuilder.build());
            }
        } catch (Exception e) {
            throw new RuntimeException("failed to read player.csv");
        }
        return players;
    }

    public PlayerDto getPlayerById(Long playerID) {
        //      I would have used the getPlayer method and converted it to PlayerDto
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("data/player.csv"));
//          skipping on the headers line
            String[] nextLine = reader.readNext();
//          reads one line at a time
            while ((nextLine = reader.readNext()) != null) {
                if (reader.nextLine[0] == playerID) {
                    PlayerDto.PlayerDtoBuilder playerDtoBuilder =
                            PlayerDto.builder()
                                    .playerId(Integer.valueOf(nextLine[0]))
                                    .birthYear(Integer.valueOf(nextLine[1]))
                                    .birthMonth(Integer.valueOf(nextLine[2]))
                                    .birthDay(Integer.valueOf(nextLine[3]));
//                  handle all fields that can be null
                    Optional.ofNullable(nextLine[7]).ifPresent(d ->
                            playerDtoBuilder.deathYear(Integer.valueOf(d)));
//                  and so on...
                    return playerDtoBuilder.build();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("failed to read player.csv");
        }
        return PlayerDto.builder().build();
    }

//    public List<Player> getPlayers() {
//
//      if I had time - I would fetch here the players as a list of a different Player object
//    }

//    public List<Player> getPlayer() {
//
//      if I had time - I would fetch here the player as a different Player object
//    }
}
