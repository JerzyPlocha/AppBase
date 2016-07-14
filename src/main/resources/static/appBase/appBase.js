(function(){

    var appBase = angular.module("appBase", ["signupModule", "userModule", "ngRoute"]);

    appBase.config(function($routeProvider){
        $routeProvider
            .when("/", {
                templateUrl: "appBase/components/main/main.html",
                controller: "signupController"
            })
            .otherwise({redirectTo:"/"})
    });

}());
