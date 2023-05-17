package controllers;


import dto.PlayerDto;
import lombok.RequiredArgsConstructor;
import services.PlayersService;

import java.util.List;

@RestController
@RequestMapping(value = "api/players")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayersService playersService;

    @GetMapping
    public ResponseEntity<?> getPlayers() {
        try {
            List<PlayerDto> players = playersService.getPlayersDto();
            return new ResponseEntity<>(players, HttpStatus.OK);
        }
      catch(IllegalArgumentException e)
    {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    } catch(Exception e)
    {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

    @GetMapping("/{playerID}")
    public ResponseEntity<?> getPlayers(@PathVariable("playerID") Long playerID) {
        try {
            PlayerDto player = playersService.getPlayerById(playerID);
            return new ResponseEntity<>(player, HttpStatus.OK);
        }
      catch(IllegalArgumentException e)
    {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    } catch(Exception e)
    {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
}
