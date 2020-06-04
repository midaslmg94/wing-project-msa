package wing.api.user.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;
import wing.api.user.domain.User;
import wing.api.user.service.UserService;
import wing.api.user.web.dto.UserRequestDto;

import java.util.List;


@Api(tags = "User Controller")
@AllArgsConstructor
@RequestMapping(value = "/api/user")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
    private final UserService userService;

    @ApiOperation(value = "유저 정보 등록")
    @PostMapping("/save")
    public String saveUser(@RequestBody UserRequestDto userRequestDto){
        return userService.save(userRequestDto);
    }

    @ApiOperation(value = "모든 유저 정보 가져오기")
    @GetMapping("/")
    public List<User> getAllUserById(){
        return userService.findAll();
    }


    @ApiOperation(value = "개별 유저 정보 가져오기")
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String userId){
        return userService.findByUserId(userId);
    }




}
