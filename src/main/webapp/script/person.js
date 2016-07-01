
// Define the `phonecatApp` module
var phonecatApp = angular.module('phonecatApp', []);

// Define the `PhoneListController` controller on the `phonecatApp` module
phonecatApp.controller('Hello', function Hello($scope, $http) {
    $http.get('http://rest-service.guides.spring.io/greeting').
    success(function(data) {
        $scope.greeting = data;
    });
});
