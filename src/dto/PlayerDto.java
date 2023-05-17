package dto;

import lombok.Builder;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
@MutableStateSubsetConstraint
@Builder(toBuilder = true)
public record PlayerDto(
        @JsonProperty("player_id") @NotNull Integer playerId,
        @JsonProperty("birth_year") @NotNull Integer birthYear,
        @JsonProperty("birth_month") @NotNull Integer birthMonth,
        @JsonProperty("birth_day") @NotNull Integer birthDay,
        @JsonProperty("birth_country") @NotBlank String birthCountry,
        @JsonProperty("birth_state") @NotBlank String birthState,
        @JsonProperty("birth_city") @NotBlank String birthCity,
        @JsonProperty("death_year") Integer deathYear,
        @JsonProperty("death_month") Integer deathMonth,
        @JsonProperty("death_day") Integer deathDay,
        @JsonProperty("death_country") String deathCountry,
        @JsonProperty("death_state") String deathState,
        @JsonProperty("death_city") String deathCity,
        @JsonProperty("name_first") @NotBlank String nameFirst,
        @JsonProperty("name_last") @NotBlank String nameLast,
        @JsonProperty("name_given") @NotBlank String nameGiven,
        @JsonProperty("weight") @NotNull Float weight,
        @JsonProperty("height") @NotNull Float height,
        @JsonProperty("bats") String bats,
        @JsonProperty("throwsw") String throwsw,
        @JsonProperty("debut") Date debut,
        @JsonProperty("final_game") Date finalGame,
        @JsonProperty("retro_iD") String retroID,
        @JsonProperty("bbref_iD") String bbrefID
) {
}
