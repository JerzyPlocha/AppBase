package com.jp.base.web;

import com.jp.base.model.Server;
import com.jp.base.service.ServerService;
import com.jp.base.web.dto.ServerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServerController {

    @Autowired
    ServerService serverService;

    @RequestMapping(value = "/api/servers", method = RequestMethod.GET)
    public List<Server> listServers() {
        return serverService.listServers();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/api/servers", method = RequestMethod.POST)
    public void addServer(@RequestBody ServerDTO serverDTO) {
        Server server = new Server();
        server.setName(serverDTO.getName());
        serverService.saveServer(server);
    }

    @RequestMapping(value = "/api/servers", method = RequestMethod.DELETE)
    public void deleteServer(@RequestParam Long id) {
        serverService.deleteServerById(id);
    }
}
