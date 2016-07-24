(function(){

    var appBase = angular.module('appBase', [
        'ngRoute',
        'ngResource',
        'signupModule',
        'serversModule',
        'userModule'
    ]);

    appBase.config(function($routeProvider){
        $routeProvider
            .when('/', {
                templateUrl: 'appBase/components/servers/serversTemplate.html',
                controller: 'serversController'
            })
            .otherwise({redirectTo:'/'})
    });

}());
