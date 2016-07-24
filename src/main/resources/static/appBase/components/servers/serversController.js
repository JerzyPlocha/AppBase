var serversModule = angular.module('serversModule');

serversModule.controller('serversController', ['$scope', 'ServersResource', function ($scope, ServersResource) {

    getServers = function(){
        ServersResource.query(function (data) {
            $scope.servers = data;
        });
    }

    ServersResource.query(function (data) {
        $scope.servers = data;
    });

    $scope.saveServer = function (serverName) {
        ServersResource.save({name: serverName});
        setTimeout(getServers, 200);
    };

    $scope.deleteServer = function (server) {
        ServersResource.delete({ id : server.id });
        $scope.servers.forEach( function(s, index){
            if(s.id == server.id) $scope.servers.splice(index, 1);
        })
    };
}]);


