angular.module("AppMod", [])
	.controller("AppCtrl", ["$http", function($http){
		var self = this;

		$http.get("http://localhost:8080/student")
				.then(function(resp) {
					self.students = resp.data;

				}, function(err) {
				});

		// function studentController($scope) { Sample1
		// 			 $scope.reset = function(){
		// 					$scope.first_name = " ";
		// 					$scope.last_name = " ";
		// 					$scope.gpa = " ";
		// 			 }
		// 			 $scope.reset();
		// 		}
	}]); //end controller
