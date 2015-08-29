$(document).ready(
		function() {
			$('#create-course').unbind();
			$('#create-course').bind('click', function() {
				$('.body-center').load('/CASCS/page/teacher/addCourse.jsp');

			});

			$('#BtnaddCourse').unbind();
			$('#BtnaddCourse').bind('click', function() {
				$.ajax({
					type : 'GET',
					data : $('#form').serializeArray(),
					url : '/CASCS/teacher/addCourse.action',
					success : function() {
						alert('Add course success.');
					}
				});
			});

			$('#list-course').click(function() {
				$('.body-center').load('/CASCS/teacher/listCourse.action');
			});

			$('.delete-course').unbind();
			$('.delete-course').bind(
					'click',
					function() {
						alert("s" + $(this).next().val());
						$.ajax({
							type : 'GET',
							data : 'courseId=' + $(this).next().val(),
							url : '/CASCS/teacher/removeCourse.action',
							success : function() {
								$('.body-center').load(
										'/CASCS/teacher/listCourse.action');
							}
						});
					});

			$('.teacher-choose-course').unbind();
			$('.teacher-choose-course').bind(
					'click',
					function() {
						var rtId = $(this).parent().siblings().find(
								'.teacher-choose-room').val();
						var courseId = $(this).next().val();
						alert(rtId + "," + courseId);

						$.ajax({
							type : 'GET',
							data : 'courseId=' + courseId + "&rtMessage="
									+ rtId,
							url : '/CASCS/teacher/addTeaching.action',
							success : function() {
								$('.body-center').load(
										'/CASCS/teacher/listCourse.action');
							}
						});
					});

			$('#teaching-manage').unbind();
			$('#teaching-manage').bind('click', function() {
				$('.body-center').load('/CASCS/teacher/listTeaching.action');
			});

			$('.teaching-delete').unbind();
			$('.teaching-delete').bind(
					'click',
					function() {
						var teachingId = $(this).next().val();
						alert(teachingId);
						$.ajax({
							type : 'GET',
							data : 'teachingId=' + teachingId,
							url : '/CASCS/teacher/deleteTeaching.action',
							success : function() {
								$('.body-center').load(
										'/CASCS/teacher/listTeaching.action');
							}
						});
					});

			$('#list-room').unbind();
			$('#list-room').bind(
					'click',
					function() {
						$.ajax({
							type : 'GET',
							url : '/CASCS/teacher/listRoom.action',
							success : function() {
								$('.body-center').load(
										'/CASCS/teacher/listRoom.action');
							}
						});
					});

			// add room
			$('#teacher-add-page').hide();

			$('#teacher-add-room').unbind();
			$('#teacher-add-room').bind('click', function() {
				$('#teacher-rooms').hide('slow');
				$('#teacher-add-page').show('slow');
			});

			$('#room-ok').unbind();
			$('#room-ok').bind(
					'click',
					function() {
						$.ajax({
							type : 'GET',
							data : $('#add-room-form').serializeArray(),
							url : '/CASCS/teacher/addRoom.action',
							success : function() {
								$('.body-center').load(
										'/CASCS/teacher/listRoom.action');
							}
						});
					});
			$('#room-cancel').unbind();
			$('#room-cancel').bind('click', function() {
				$('#teacher-rooms').show('slow');
				$('#teacher-add-page').hide('slow');
			});

			//Lists student
			$('#student-manage').unbind();
			$('#student-manage').bind('click', function() {
				$('.body-center').load('/CASCS/teacher/listStudent.action');
			});
			
			//Adds student.
			$('#teacher-add-student-page').hide();
			
			$('#teacher-add-student').unbind();
			$('#teacher-add-student').bind('click', function(){
				$('#teacher-list-student').hide();
				$('#teacher-add-student-page').show();
			});

			$('#teacher-cancel-student').unbind();
			$('#teacher-cancel-student').bind('click', function(){
				$('#teacher-list-student').show();
				$('#teacher-add-student-page').hide();
			});
			
			//Adds student button.
			$('#teacher-form-add-student').unbind();
			$('#teacher-form-add-student').bind('click', function(){
				$.ajax({
					type : 'GET',
					data : $('#teacher-form-student').serializeArray(),
					url : '/CASCS/teacher/addStudent.action',
					success : function() {
						$('.body-center').load('/CASCS/teacher/listStudent.action');
					}
				});
			});
			
			//List teacher
			$('#teacher-manage').unbind();
			$('#teacher-manage').bind('click', function(){
				$('.body-center').load('/CASCS/teacher/listTeacher.action');
			});
			
			
			$('#teacher-add-teacher-page').hide();
			//Adds teacher
			$('#teacher-add-teacher').unbind();
			$('#teacher-add-teacher').bind('click', function(){
				$('#teacher-add-teacher-page').show();
				$('#list-teacher').hide();
				
			});
			
			$("#teacher-create-cancel").unbind();
			$('#teacher-create-cancel').bind('click', function(){
				$('#teacher-add-teacher-page').hide();
				$('#list-teacher').show();
			});
			
			$('#teacher-create-add').unbind();
			$('#teacher-create-add').bind('click', function(){
				$.ajax({
					type : 'GET',
					data : $('#teacher-form-teacher').serializeArray(),
					url : '/CASCS/teacher/addTeacher.action',
					success : function() {
						$('.body-center').load('/CASCS/teacher/listTeacher.action');
					}
				});
			});
			
			//update teacher.
			$('#update-teacher-profile').unbind();
			$('#update-teacher-profile').bind('click', function(){
				$('.body-center').load('/CASCS/page/teacher/teacherManage/updateTeacher.jsp');
			});
			
			$('#teacher-profile-cancel').unbind();
			$('#teacher-profile-cancel').bind('click', function(){
				$('.body-center').load('/CASCS/teacher/listTeacher.action');
			});
			
			$('#teacher-update-ok').unbind();
			$('#teacher-update-ok').bind('click', function(){
				$.ajax({
					type : 'GET',
					data : $('#teacher-form-update').serializeArray(),
					url : '/CASCS/teacher/updateTeacher.action',
					success : function() {
						$('.body-center').load('/CASCS/teacher/listTeacher.action');
					}
				});
			});
			
			$('#teacher-change-password-page').hide();
			$('#teacher-change-password-btn').unbind();
			$('#teacher-change-password-btn').bind('click', function(){
				$('#teacher-change-password-page').show();
				$('#teacher-update').hide();
			});
			
			$('#teacher-change-password-cancel').unbind();
			$('#teacher-change-password-cancel').bind('click', function(){
				$('#teacher-change-password-page').hide();
				$('#teacher-update').show();
			});
			
			$('#teacher-change-password-ok').unbind();
			$('#teacher-change-password-ok').bind('click',function(){
				$.ajax({
					type : 'GET',
					data : $('#teacher-form-password').serializeArray(),
					url : '/CASCS/teacher/changePassword.action',
					success : function() {
						$('.body-center').load('/CASCS/teacher/listTeacher.action');
					}
				});
			});
			
			
			//student
			
			$('#student-course-manage').unbind();
			$('#student-course-manage').bind('click', function(){
				$('.body-center').load('/CASCS/student/listCourse.action');
			});
			
			$('.student-choose-choose-btn').unbind();
			$('.student-choose-choose-btn').bind('click', function(){
				alert($(this).next().val());
				$.ajax({
					type : 'GET',
					data : 'courseId='+$(this).next().val(),
					url : '/CASCS/student/chooseCourse.action',
					success : function() {
						$('.body-center').load('/CASCS/student/listCourse.action');
					}
				});
			});
		});
