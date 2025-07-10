package org.example.demodb.advice;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.example.demodb.exception.UsuarioException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class HandleException {

    @ExceptionHandler(
            value = { MethodArgumentNotValidException.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> getException(MethodArgumentNotValidException ex) {
         Map<String,String> map = new HashMap<>();
         ex.getBindingResult()
                 .getFieldErrors().forEach(error->
                         map.put(error.getField()
                                 ,error.getDefaultMessage()));
         return map;
    }

    @ExceptionHandler(value={Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,String> getException(Exception ex) {
        Map<String,String> map = new HashMap<>();
        map.put("error",ex.getMessage());
        return map;
    }

    public String extractUsername(String token) {
        try {
            return Jwts.parserBuilder().setSigningKey(getKey()).build()
                    .parseClaimsJws(token).getBody().getSubject();
        } catch (JwtException e) {
            return null;
        }
    }

    private String getKey() {
        return null;
    }

    public boolean validateToken(String token, UserDetails user) {
        String username = extractUsername(token);
        if (username == null) return false;
        return username.equals(user.getUsername()) && !isExpired(token);
    }

    private boolean isExpired(String token) {
        return false;
    }


}
