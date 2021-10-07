package com.works.restcontroller;

import com.works.dto.rest.ConstantRestDto;
import com.works.utils.REnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/rest/constant")
@Api(value = "Constant Rest Controller", authorizations = {@Authorization(value = "basicAuth")})
public class ConstantRestController {

    final ConstantRestDto constantRestDto;

    public ConstantRestController(ConstantRestDto constantRestDto) {
        this.constantRestDto = constantRestDto;
    }

    @ApiOperation(value = "Şehirleri Listeleme Servisi")
    @GetMapping("/getCities")
    public Map<REnum, Object> getCities() {
        return constantRestDto.getCities();
    }

    @ApiOperation(value = "Redis İl Ekleme Servisi")
    @PostMapping("/addCitiesRedis")
    public Map<REnum, Object> addCitiesRedis() {
        return constantRestDto.addCitiesRedis();
    }

    @ApiOperation(value = "Redis İl Getirme Servisi")
    @GetMapping("/getCitiesRedis")
    public Map<REnum, Object> getCitiesRedis() {
        return constantRestDto.getCitiesRedis();
    }

    @ApiOperation(value = "İllere Göre İlçe Getirme Servisi")
    @GetMapping("/getXDistricts/{stIndex}")
    public Map<REnum, Object> getXDistricts(@PathVariable String stIndex) {
        return constantRestDto.getXDistricts(stIndex);
    }

    @ApiOperation(value = "Redis İlçe Ekleme Servisi")
    @PostMapping("/addDistrictsRedis")
    public Map<REnum, Object> addDistrictsRedis() {
        return constantRestDto.addDistrictsRedis();
    }

    @ApiOperation(value = "Redis İllere Göre İlçe Getirme Servisi")
    @GetMapping("/getXDistrictsRedis/{stIndex}")
    public Map<REnum, Object> getXDistrictsRedis(@PathVariable String stIndex) {
        return constantRestDto.getXDistrictsRedis(stIndex);
    }

    @ApiOperation(value = "Pet Renklerini Getirme Servisi")
    @GetMapping("/getColors/")
    public Map<REnum, Object> getColors() {
        return constantRestDto.getColors();
    }

    @ApiOperation(value = "Pet Türleri Getirme Servisi")
    @GetMapping("/getTypes/")
    public Map<REnum, Object> getTypes() {
        return constantRestDto.getTypes();
    }

    @ApiOperation(value = "Seçilen Türe Göre Irkları Getirme Servisi")
    @GetMapping("/getXBreeds/{stIndex}")
    public Map<REnum, Object> getXBreeds(@PathVariable String stIndex) {
        return constantRestDto.getXBreeds(stIndex);
    }

}
