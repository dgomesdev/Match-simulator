package br.com.myfirstapp.data;

import java.util.List;

import br.com.myfirstapp.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();

}
