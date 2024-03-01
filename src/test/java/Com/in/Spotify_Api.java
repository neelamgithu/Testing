package Com.in;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response. Response;
import static io.restassured.RestAssured.given;
public class Spotify_Api {
String token ="BQAg1l5Uo6edBx2xziEVFICtDTYb0mdWAHr0yeaIoo3-uupa-TsnGjaDZpoJAEzvX4IE2jhg0_fZd4CtQG8nTrKzlm0Sw9jgZ1br2Lk_uAyv4QGT5EtYUoZs1zf7Fa6jSLQ7n-65jaHyes4sWeKwmKjVu46-cIjlJlJNFD8cpkmo3dnyyaRQtijWostvzY-uXav6nEvtMtFZGwL2G94Abl4Y_4smGRVi0xf8ZaRB_p8_YxyvzlLHhqeCQgyuvuSj_tWW51KGQls3EePJFsTlbXAKtlwtMULwAcas_7afpfNGiA";
//@Test
//public void Getusers() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.when()
//			.get("https://api.spotify.com/v1/me");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	String username= res.path("display_name");
//	Assert.assertEquals(username, "neelam mujawar");
//}
//@Test
//public void CreatePlayList() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.body("{\r\n"
//					+ "			    \"name\": \"New one\",\r\n"
//					+ "			    \"description\": \"New playlist description\",\r\n"
//					+ "			    \"public\": false\r\n"
//					+ "			}")
//			.when()
//			.post("https://api.spotify.com/v1/users/312x3zewxc2nw4vilvgthmlled5a/playlists");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(201);
//	
//}
//@Test
//public void Additems() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.body("{\r\n"
//					+ "    \"uris\": [\r\n"
//					+ "        \"spotify:track:0TL0LFcwIBF5eX7arDIKxY\"\r\n"
//					+ "    ],\r\n"
//					+ "    \"position\": 0\r\n"
//					+ "}")
//
//		.when()
//			.post("https://api.spotify.com/v1/playlists/3nADZOgGkPMamAR7VcNyQT/tracks");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}

//@Test
//public void UpdatePlayList() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.body("{"\"tracks\": [\r\n"
				//		+ "        {\r\n"
			//+ "            \"uri\": \"string\"\r\n"
			//+ "    \"range_start\": 1,\r\n"
//+ "    \"insert_before\": 3,\r\n"
//+ "    \"range_length\": 4\r\n"

//+ "        }\r\n"
//+ "    ],\r\n";

//					
//  			.when()
//			.post("https://api.spotify.com/v1/playlists/3nADZOgGkPMamAR7VcNyQT/tracks");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//}
@Test
public void RemoveItem() {
	
	Response res =given()
			.header("accept","application/json")
			.header("Content-Type", "application/json")
			.header("Authorization", "Bearer " +token)
			.body("{\r\n"
					+ "    \"tracks\": [\r\n"
					+ "        {\r\n"
					+ "            \"uri\": \"spotify:track:1301WleyT98MSxVHPZCA6M\"\r\n"
					+ "        }\r\n"
					+ "    ],\r\n"
					+ "    \"snapshot_id\": \"AAAADI6v/LANEszj6zdlL8AT3XfVhs2w\"\r\n"
					+ "}")
  			.when()
			.post("https://api.spotify.com/v1/playlists/3nADZOgGkPMamAR7VcNyQT/tracks");
	
	res.prettyPrint();
	res.then().assertThat().statusCode(200);
}

}
//@Test
//public void GetCurrentUserPlaylists() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.when()
//			.get("https://api.spotify.com/v1/me/playlists");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}

//@Test
//public void GetUserPlaylists() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.when()
//			.get("https://api.spotify.com/v1/users/312x3zewxc2nw4vilvgthmlled5a/playlists");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}
//@Test
//public void GetUserPlaylists() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.when()
//			.get("\r\n"
//					+ "https://api.spotify.com/v1/browse/featured-playlists");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}
//@Test
//public void GetCategoryPlaylists() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.when()
//			.get("https://api.spotify.com/v1/browse/categories/dinner/playlists");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}
//@Test
//public void GetCategoryPlaylists() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.when()
//			.get("https://api.spotify.com/v1/playlists/3nADZOgGkPMamAR7VcNyQT/images");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}

//================================================================================================

//@Test
//public void GetCurrentUserProfile() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.when()
//			.get("https://api.spotify.com/v1/me\r\n"
//					+ "");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}
//@Test
//public void UsersTopRead() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			
//			.when()
//			.get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/tracks");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}
//@Test
//public void GettUserTopItem() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.when()
//			.get("https://api.spotify.com/v1/me/top/artists");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}


//@Test
//public void GettUserProfile() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.when()
//			.get("https://api.spotify.com/v1/me");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}



//@Test
//public void FollowPlayList() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.body("{\r\n"
//					+ "    \"public\": false\r\n"
//					+ "}")
//			.when()
//			.put("https://api.spotify.com/v1/playlists/3nADZOgGkPMamAR7VcNyQT/followers");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}

//@Test
//public void UnFollowPlayList() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.body("{\r\n"
//					+ "    \"public\": false\r\n"
//					+ "}")
//			.when()
//			.put("https://api.spotify.com/v1/playlists/3nADZOgGkPMamAR7VcNyQT/followers");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}

//@Test
//public void GetfolledArtist() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			
//			.when()
//			.get("https://api.spotify.com/v1/me/following?type=artist");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}


//@Test
//public void FollowArtistsorUsers() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.body("{\r\n"
//					+ "			    \"ids\": [\r\n"
//					+ "			        \"2CIMQHirSU0MQqyYHq0eOx\"\r\n"
//					+ "			    ]\r\n"
//					+ "			}")
//			.when()
//			.put("https://api.spotify.com/v1/me/following?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(204);
//	
//}}

//
//@Test
//public void UnFollowArtistsorUsers() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			.body("{\r\n"
//					+ "			    \"ids\": [\r\n"
//					+ "			        \"2CIMQHirSU0MQqyYHq0eOx\"\r\n"
//					+ "			    ]\r\n"
//					+ "			}")
//			.when()
//			.delete("https://api.spotify.com/v1/me/following?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(204);
//	
//}}


//@Test
//public void CheckIfUserFollowsArtistsorUsers() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			
//			.when()
//			.get("https://api.spotify.com/v1/me/following/contains?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}


//@Test
//public void CheckIfUserFollowsPlaylist() {
//	
//	Response res =given()
//			.header("accept","application/json")
//			.header("Content-Type", "application/json")
//			.header("Authorization", "Bearer " +token)
//			
//			.when()
//			.get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/followers/contains?ids=jmperezperez");
//	
//	res.prettyPrint();
//	res.then().assertThat().statusCode(200);
//	
//}}
//
//


