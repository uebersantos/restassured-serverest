import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testLoginComSucesso() {
        String requestBody = "{ \"email\": \"fulano@qa.com\", \"password\": \"teste\" }";

        Response response =
                given()
                        .contentType("application/json")
                        .body(requestBody)
                        .when()
                        .post("https://serverest.dev/login")
                        .then()
                        .statusCode(200) // Valida se retorna 200 OK
                        .extract()
                        .response();

        String token = response.jsonPath().getString("authorization");

        // O token não pode ser nulo ou vazio
        assertNotNull(token, "O token de autenticação deve ser retornado");
        assertFalse(token.isEmpty(), "O token não pode estar vazio");
    }

    @Test
    public void testLoginComCredenciaisInvalidas() {
        String requestBody = "{ \"email\": \"usuario@invalido.com\", \"password\": \"senhaErrada\" }";

        Response response =
                given()
                        .contentType("application/json")
                        .body(requestBody)
                        .when()
                        .post("https://serverest.dev/login")
                        .then()
                        .statusCode(401) // Valida se retorna 401 Unauthorized
                        .extract()
                        .response();

        String message = response.jsonPath().getString("message");

        // Verifica se a mensagem de erro está correta
        assertEquals("Email e/ou senha inválidos", message);
    }

    @Test
    public void testLoginSemInformarCredenciais() {
        String requestBody = "{}"; // Corpo vazio

        Response response =
                given()
                        .contentType("application/json")
                        .body(requestBody)
                        .when()
                        .post("https://serverest.dev/login")
                        .then()
                        .statusCode(400) // Valida se retorna 400 Bad Request
                        .extract()
                        .response();

        String message = response.jsonPath().getString("email");

        // Valida que a API retorna a mensagem de erro esperada
        assertEquals("email é obrigatório", message);
    }

}
