package dto;

import lombok.Builder;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
@MutableStateSubsetConstraint
@Builder(toBuilder = true)
public record PlayerDto(
        @JsonProperty("player_id") Integer playerId,
        @JsonProperty("birth_year") Integer birthYear,
        @JsonProperty("birth_month") Integer birthMonth,
        @JsonProperty("birth_day") Integer birthDay,
        @JsonProperty("birth_country") String birthCountry,
        @JsonProperty("birth_state") String birthState,
        @JsonProperty("birth_city") String birthCity,
        @JsonProperty("death_year") Integer deathYear,
        @JsonProperty("death_month") Integer deathMonth,
        @JsonProperty("death_day") Integer deathDay,
        @JsonProperty("death_country") String deathCountry,
        @JsonProperty("death_state") String deathState,
        @JsonProperty("death_city") String deathCity,
        @JsonProperty("name_first") String nameFirst,
        @JsonProperty("name_last") String nameLast,
        @JsonProperty("name_given") String nameGiven,
        @JsonProperty("weight") Float weight,
        @JsonProperty("height") Float height,
        @JsonProperty("bats") String bats,
        @JsonProperty("throwsw") String throwsw,
        @JsonProperty("debut") Date debut,
        @JsonProperty("final_game") Date finalGame,
        @JsonProperty("retro_iD") String retroID,
        @JsonProperty("bbref_iD") String bbrefID
) {
}
