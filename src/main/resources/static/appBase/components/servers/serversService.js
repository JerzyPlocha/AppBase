angular.module('serversModule').factory('ServersResource', ['$resource', function ($resource) {
    return $resource('api/servers/:serverId', {serverId: '@serverId'});
}])

