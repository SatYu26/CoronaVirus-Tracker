package com.example.coronavirustracker.services;

import com.example.coronavirustracker.models.LocationStats;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoronaVirusDataServiceTest {

    @Test
    void getAllStats() throws IOException, InterruptedException {
        // Arrange
        CoronaVirusDataService stats = new CoronaVirusDataService();

        // Act
        stats.fetchVirusData();
        List<LocationStats> response = stats.getAllStats();

        // Assert
        List<LocationStats> arr = new ArrayList<>();
        assertEquals(arr, response);
    }

    @Test
    void fetchVirusData() throws IOException, InterruptedException {
        // Arrange
        CoronaVirusDataService stats = new CoronaVirusDataService();

        // Act
        stats.fetchVirusData();
    }
}