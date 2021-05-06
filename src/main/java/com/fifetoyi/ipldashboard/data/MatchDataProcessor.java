package com.fifetoyi.ipldashboard.data;

import java.time.LocalDate;

import com.fifetoyi.ipldashboard.model.Match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

  private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

  @Override
  public Match process(final MatchInput matchInput) throws Exception {
      Match match = new Match();
      match.setId(Long.parseLong(matchInput.getId()));
      match.setCity(matchInput.getCity());
      match.setDate(LocalDate.parse(matchInput.getDate()));
      match.setPlayerOfMatch(matchInput.getPlayer_of_match());
      match.setVenue(matchInput.getVenue()); 

      // Set team 1 and team 2 depending on the innings order
      String firstInningsTeam, secondInningsTeam;

      return match;
  }

}