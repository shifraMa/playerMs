package services;

import dto.PlayerDto;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PlayersServiceTest {

    @InjectMocks
    private PlayersService service;
    @Captor
    private ArgumentCaptor<List<PlayerDto>> capture;

    @Test
    public void testGetListIsNotEmpty() {
        List<PlayerDto> playersDto = service.getPlayersDto();
//        assertThat(playersDto.size(), is(size of csv))
    }

//    add tests:  - check empty list handling;
//                - check when there ae special chars
//                - check handling of no player with given id
//                - check when id is empty
//                - check handling of empty or null fields


}