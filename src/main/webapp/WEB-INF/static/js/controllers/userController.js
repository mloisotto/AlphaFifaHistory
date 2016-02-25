/**
 * Created by mariano.loisotto on 2/25/2016.
 */


fifaHistoryApp.controller('userController', ['$scope','$http', function($scope,$http) {

    $scope.users = [];


    $http.get('user/listAll').then(function(response){
        $scope.users = response.data;
    });
}]);
