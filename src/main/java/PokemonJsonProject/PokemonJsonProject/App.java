package PokemonJsonProject.PokemonJsonProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONTokener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws URISyntaxException, MalformedURLException, IOException {
    	InputStream stream = new FileInputStream(new File("Pokedex.json"));
    	JSONTokener tokener = new JSONTokener(stream);
    	JSONArray array = new JSONArray(tokener);
    	
    	List<Pokemon> pokemonList = new ArrayList<Pokemon>();
    	for(int i = 0; i < array.length(); i++){
    		Pokemon pokemon = new Pokemon();
    		pokemon.setName(array.getJSONObject(i).getString("ename"));
    		pokemon.setId(array.getJSONObject(i).getString("id"));
    		
    		List<Skill> skillList = new ArrayList<>();
//    		for(int j = 0; j < array.getJSONObject(i).getJSONObject("skills").getJSONArray("egg").length(); j++){
//    			
//    		}
    		
    		
    		pokemonList.add(pokemon);
    		
    	}
    	
    	pokemonList.forEach(pokemon -> System.out.println("Id: " + pokemon.getId() + " Name: " + pokemon.getName()));
    	
    }
}
