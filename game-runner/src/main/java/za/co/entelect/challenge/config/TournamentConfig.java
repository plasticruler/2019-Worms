package za.co.entelect.challenge.config;

import com.google.gson.annotations.SerializedName;

public class TournamentConfig {

    @SerializedName("connection-string")
    public String connectionString;

    @SerializedName("bots-container")
    public String botsContainer;

    @SerializedName("match-logs-container")
    public String matchLogsContainer;

    @SerializedName("game-engine-container")
    public String gameEngineContainer;

    @SerializedName("match-result-queue")
    public String matchResultQueue;

    @SerializedName("dead-match-queue")
    public String deadMatchQueue;

    @SerializedName("api-endpoint")
    public String apiEndpoint;
}
