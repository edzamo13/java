package com.pluralsight.rxjava2.nitrite.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LetterPair {

    private String greekLetter;
    private String englishRepresentation;


}
