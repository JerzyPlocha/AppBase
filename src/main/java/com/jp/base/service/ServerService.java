package com.jp.base.service;

import com.jp.base.model.Server;
import com.jp.base.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerService {

    @Autowired
    ServerRepository serverRepository;

    public Server saveServer(Server server){
        return serverRepository.save(server);
    }

    public List<Server> listServers() {
        return serverRepository.findAll();
    }

    public void deleteServerById(Long id){ serverRepository.delete(id);}
}
