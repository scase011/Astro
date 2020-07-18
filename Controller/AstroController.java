package Application.Controller;

import Application.Domain.AstroDate;
import Application.Domain.OrbitBulletin;
import Application.Service.AstroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AstroController {

    AstroService astroService = new AstroService();

    @RequestMapping(value= "/orbit/convert", method = RequestMethod.GET)
    public ResponseEntity<OrbitBulletin> convertOrbit(@RequestBody OrbitBulletin bulletin){
        try{
            return ResponseEntity.ok(astroService.convertOrbit(bulletin));
        }
        catch(Exception e){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/date-time/scale/convert", method = RequestMethod.GET)
    public ResponseEntity<String> convertTime(@RequestBody AstroDate astroDate){
        try{
            return ResponseEntity.ok(astroService.convertTime(astroDate));
        }
        catch(Exception e){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
