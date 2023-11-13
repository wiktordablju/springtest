package pl.meritum.WebApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SampleController {


//    ResponseEntity odpowiada za latwiejsze przetwarzanie i zwracanie wartosci metod http, np wlasnie .ok czy .body
    @GetMapping("/get")
    public ResponseEntity<String> getTest() {
//        .ok = status to 200 => nie ma bledu
        return ResponseEntity.ok("TO JEST METODA GET");
    }

    @PostMapping("/post")
    public ResponseEntity<String> postTest(@RequestBody String resource) {
//      httpstatus.created = kod http 201 czyli ze zostal utworzony pomyslnie
//      .body to po prostu co ci zwraca
        return ResponseEntity.status(HttpStatus.CREATED).body("Podesłałeś ten zasób POSTem: " + resource);
    }

    @PutMapping("/put")
    public ResponseEntity<String> putTest(@RequestBody String resource) {
        return ResponseEntity.ok("Podesłałeś ten zasób PUTem: " + resource);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteTest(@RequestBody String resource) {
        return ResponseEntity.ok("Tutaj testuje DELETE: " + resource);
    }

    @PatchMapping("/patch")
    public ResponseEntity<String> patchTest(@RequestBody String resource) {
        return ResponseEntity.ok("Tutaj testuje PATCH: " + resource) ;
    }



}
