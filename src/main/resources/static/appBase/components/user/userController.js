var userModule = angular.module('userModule')

userModule.controller("userController", ["$scope", "$http", function($scope, $http){

    $scope.addUser = function(name, pass){
        var newUser = { username: name, password: pass};
        $http.post("http://localhost:8080/users", newUser);
    };

}]);