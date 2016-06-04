// PERSONAL INFORMATION
$(document).ready(function() {
	$('#form1').formValidation({
		framework: 'bootstrap',
		fields: {
			ApplicantPicture: {
				validators: {
					notEmpty: {
						message: 'Please upload an image'
					},
					file: {
                        extension: 'jpeg,jpg,png',
                        type: 'image/jpeg,image/png',
                        maxSize: 2097152,
                        message: 'The selected file is not valid'
                    }
				}
			},
			LastName: {
				validators: {
					notEmpty: {
						message: 'Last name is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'The last name can consist of alphabetical characters and spaces only'
					}
				}
			},
			FirstName: {
				validators: {
					notEmpty: {
						message: 'First name is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'The first name can consist of alphabetical characters and spaces only'
					}
				}
			},
			MiddleName: {
				validators: {
					notEmpty: {
						message: 'Middle name is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'The middle name can consist of alphabetical characters and spaces only'
					}
				}
			},
			CityAddress1: {
				validators: {
					notEmpty: {
						message: 'House no. is required'
					},
					regexp: {
						regexp: /^\d/i,
						message: 'Invalid house no.'
					}
				}
			},
			CityAddress2: {
				validators: {
					notEmpty: {
						message: 'Street/Barangay is required'
					}
				}
			},
			CityAddress3: {
				validators: {
					notEmpty: {
						message: 'Municipality/City, Province is required'
					}
				}
			},
			ProvincialAddress1: {
				validators: {
					notEmpty: {
						message: 'House no. is required'
					},
					regexp: {
						regexp: /^\d/i,
						message: 'Invalid house no.'
					}
				}
			},
			ProvincialAddress2: {
				validators: {
					notEmpty: {
						message: 'Street/Barangay is required'
					}
				}
			},
			ProvincialAddress3: {
				validators: {
					notEmpty: {
						message: 'Municipality/City, Province is required'
					}
				}
			},
			ContactNumber: {
				validators: {
					notEmpty: {
						message: 'Contact no. is required'
					},
					regexp: {
						regexp: /^\d{4}-\d{3}-\d{4}$/i,
						message: 'Invalid contact number. Format: 09XX-XXX-XXXX'
					}
				}
			},
			CountryCode: {
				validators: {
					notEmpty: {
						message: 'Country code is required'
					},
					regexp: {
						regexp: /^\d/i,
						message: 'Invalid country code'
					}
				}
			},
			DateOfBirth: {
				validators: {
					notEmpty: {
						message: 'Date of birth is required'
					}
				}
			},
			PlaceOfBirth: {
				validators: {
					notEmpty: {
						message: 'Place of birth is required'
					}
				}
			},
			CivilStatus: {
				validators: {
					notEmpty: {
						message: 'Civil status is required'
					}
				}
			},
			Citizenship: {
				validators: {
					notEmpty: {
						message: 'Citizenship is required'
					}
				}
			},
			Height1: {
				validators: {
					notEmpty: {
						message: 'Height is required'
					},
					integer: {
						message: 'Invalid height'
					}
				}
			},
			Height2: {
				validators: {
					integer: {
						message: 'Invalid height'
					},
					
				}
			},
			Weight: {
				validators: {
					notEmpty: {
						message: 'Weight is required'
					},
					integer: {
						message: 'Invalid height'
					}
				}
			},
			Religion: {
				validators: {
					notEmpty: {
						message: 'Religion is required'
					}
				}
			},
			Sex: {
				validators: {
					notEmpty: {
						message: 'Sex is required'
					}
				}
			},
			Language: {
				validators: {
					notEmpty: {
						message: 'Language/Dialects is required'
					}
				}
			},
			CivilStatus: {
				validators: {
					notEmpty: {
						message: 'Please choose one'
					}
				}
			},
			FatherName: {
				validators: {
					notEmpty: {
						message: 'Father\'s name is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'The father\'s name can consist of alphabetical characters and spaces only'
					}
				}
			},
			FatherOccupation: {
				validators: {
					notEmpty: {
						message: 'Father\'s occupation is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'The father\'s occupation can consist of alphabetical characters and spaces only'
					}
				}
			},
			MotherName: {
				validators: {
					notEmpty: {
						message: 'Mother\'s name is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'The mother\'s name can consist of alphabetical characters and spaces only'
					}
				}
			},
			MotherOccupation: {
				validators: {
					notEmpty: {
						message: 'Mother\'s occupation is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'The mother\'s occupation can consist of alphabetical characters and spaces only'
					}
				}
			},
			ParentAddress1: {
				validators: {
					notEmpty: {
						message: 'House no. is required'
					},
					regexp: {
						regexp: /^\d/i,
						message: 'Invalid house no.'
					}
				}
			},
			ParentAddress2: {
				validators: {
					notEmpty: {
						message: 'Street/Barangay is required'
					}
				}
			},
			ParentAddress3: {
				validators: {
					notEmpty: {
						message: 'Municipality/City, Province is required'
					}
				}
			},
			EmgPerson: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					}
				}
			},
			EmgRelation: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					}
				}
			},
			EmgAddress1: {
				validators: {
					notEmpty: {
						message: 'House no. is required'
					}
				},
					regexp: {
						regexp: /^\d/i,
						message: 'Invalid house no.'
					}
			},
			EmgAddress2: {
				validators: {
					notEmpty: {
						message: 'Street/Barangay is required'
					}
				}
			},
			EmgAddress3: {
				validators: {
					notEmpty: {
						message: 'Municipality/City, Province is required'
					}
				}
			},
			EmgContactNumber: {
				validators: {
					notEmpty: {
						message: 'Contact no. is required'
					},
					regexp: {
						regexp: /^\d{4}-\d{3}-\d{4}$/i,
						message: 'Invalid contact number. Format: 09XX-XXX-XXXX'
					}
				}
			}
		}
	});
});



// EDUCATIONAL BACKGROUND

$(document).ready(function() {
	$('#form2').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			ElemSchool: {
				validators: {
					notEmpty: {
						message: 'Elementary school is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			ElemYear: {
				validators: {
					notEmpty: {
						message: 'Year is required'
					},
					integer: {
						message: 'Year is invalid'
					},
					stringLength: {
						min: 4,
						max: 4,
						message: 'Year is invalid'
					}
				}
			},
			Course: {
				validators: {
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			CollegeSchool: {
				validators: {
					notEmpty: {
						message: 'Elementary school is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			CollegeYear: {
				validators: {
					integer: {
						message: 'Year is invalid'
					},
					stringLength: {
						min: 4,
						max: 4,
						message: 'Year is invalid'
					}
				}
			},
			HighSchool: {
				validators: {
					notEmpty: {
						message: 'Highschool is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			HighYear: {
				validators: {
					notEmpty: {
						message: 'Year is required'
					},
					integer: {
						message: 'Year is invalid'
					},
					stringLength: {
						min: 4,
						max: 4,
						message: 'Year is invalid'
					}
				}
			},
			VocationalSchool: {
				validators: {
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			VocationalYear: {
				validators: {
					integer: {
						message: 'Year is invalid'
					},
					stringLength: {
						min: 4,
						max: 4,
						message: 'Year is invalid'
					}
				}
			}
		}
	});
});



// EMPLOYMENT RECORD

$(document).ready(function() {
	$('#form3').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			'EmpTotalExp': {
				validators: {
					notEmpty: {
						message: 'This field is required'
					},
					integer: {
						message: 'Invalid field value'
					}
				}
			}
		}
	});
});


// CHARACTER REFERENCES

$(document).ready(function() {
	$('#form4').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			RefName1: {
				validators: {
					notEmpty: {
						message: 'Name is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			RefOccupation1: {
				validators: {
					notEmpty: {
						message: 'Address is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			RefContact1: {
				validators: {
					notEmpty: {
						message: 'Contact is required'
					},
					regexp: {
						regexp: /^\d{4}-\d{3}-\d{4}$/i,
						message: 'Invalid contact number. Format: 09XX-XXX-XXXX'
					}
				}
			},
			RefName2: {
				validators: {
					notEmpty: {
						message: 'Name is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			RefOccupation2: {
				validators: {
					notEmpty: {
						message: 'Address is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			RefContact2: {
				validators: {
					notEmpty: {
						message: 'Contact is required'
					},
					regexp: {
						regexp: /^\d{4}-\d{3}-\d{4}$/i,
						message: 'Invalid contact number. Format: 09XX-XXX-XXXX'
					}
				}
			},
			RefName3: {
				validators: {
					notEmpty: {
						message: 'Name is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			RefOccupation3: {
				validators: {
					notEmpty: {
						message: 'Address is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			RefContact3: {
				validators: {
					notEmpty: {
						message: 'Contact is required'
					},
					regexp: {
						regexp: /^\d{4}-\d{3}-\d{4}$/i,
						message: 'Invalid contact number. Format: 09XX-XXX-XXXX'
					}
				}
			}
		}
	});
});

///////////////////////////////

function radioFunc(val) {
	if(val == "Yes") {
		document.getElementById("z").style.visibility="visible";
		document.getElementById("x").style.visibility="visible";
		document.getElementById("w").style.visibility="visible";
		document.getElementById("u").style.visibility="visible";
		return false;
	} else {
		document.getElementById("z").style.visibility="hidden";
		document.getElementById("x").style.visibility="hidden";
		document.getElementById("w").style.visibility="hidden";
		document.getElementById("u").style.visibility="hidden";
	}
}

function radioFunc2(val) {
	if(val == "Married") {
		document.getElementById("a").style.visibility="visible";
		document.getElementById("b").style.visibility="visible";
		document.getElementById("c").style.visibility="visible";
		document.getElementById("d").style.visibility="visible";
		document.getElementById("e").style.visibility="visible";
		document.getElementById("f").style.visibility="visible";
		document.getElementById("g").style.visibility="visible";
		document.getElementById("h").style.visibility="visible";
		return false;
	} else {
		
		document.getElementById("a").style.visibility="hidden";
		document.getElementById("b").style.visibility="hidden";
		document.getElementById("c").style.visibility="hidden";
		document.getElementById("d").style.visibility="hidden";
		document.getElementById("e").style.visibility="hidden";
		document.getElementById("f").style.visibility="hidden";
		document.getElementById("g").style.visibility="hidden";
		document.getElementById("h").style.visibility="hidden";
	}
}

// OTHERS
$(document).ready(function() {
	$('#form5').formValidation({
		
		fields: {
			SSSNumber: {
				validators: {
					notEmpty: {
						message: 'SSS Number is required'
					},
					regexp: {
						regexp: /^\d{3}-\d{2}-\d{4}$/i,
						message: 'Invalid SSS Number. Format: XXX-XX-XXXX'
					}
				}
			},
			LatestResCert: {
				validators: {
					notEmpty: {
						message: 'Latest Res. Cert. is required'
					},
					regexp: {
						regexp: /^\d{3}-\d{3}-\d{3}$/i,
						message: 'Invalid Latest Res. Cert. Number. Format: XXX-XXX-XXX'
					}
				}
			},
			TIN: {
				validators: {
					notEmpty: {
						message: 'TIN is required'
					},
					regexp: {
						regexp: /^\d{3}-\d{3}-\d{3}-\d{3}$/i,
						message: 'Invalid TIN. Format: XXX-XXX-XXX-XXX'
					}
				}
			},
			DateIssued: {
				validators: {
					notEmpty: {
						message: 'Date Issued is required'
					}
				}
			},
			PagIbigNumber: {
				validators: {
					notEmpty: {
						message: 'Pag-ibig number is required'
					},
					regexp: {
						regexp: /^\d{4}-\d{4}-\d{4}$/i,
						message: 'Invalid Pag-ibig number. Format: XXXX-XXXX-XXXX'
					}
				}
			},
			PlaceIssued: {
				validators: {
					notEmpty: {
						message: 'Place Issued is required'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			Position: {
				validators: {
					notEmpty: {
						message: 'Position Required'
					}
				}
			},
			Q1: {
				validators: {
					notEmpty: {
						message: 'This filed is not required but if no one referred you, type none'
					}
				}
			}
		}
	});
});


// UN & PW

$(document).ready(function() {
	function randomNumber(min, max) {
		return Math.floor(Math.random() * (max - min + 1) + min);
	};
	$('#captchaOperation').html([randomNumber(1, 10), '+', randomNumber(1, 10), '='].join(' '));

	$('#form6').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			Username: {
				validators: {
					notEmpty: {
						message: 'The username is required'
					},
					stringLength: {
						min: 6,
						max: 30,
						message: 'The username must be at least 8 characters'
					}
				}
			},
			Password: {
				validators: {
					notEmpty: {
						message: 'The password is required'
					},
					stringLength: {
						min: 8,
						max: 30,
						message: 'The username must be at least 6 characters'
					}
				}
			},
			ConfirmPassword: {
				validators: {
					notEmpty: {
						message: 'The password is required'
					},
					identical: {
						field: 'Password',
						message: 'Passwords do not match'
					}
				}
			},
			captcha: {
				validators: {
					callback: {
						message: 'Wrong answer',
						callback: function(value, validator, $field) {
							var items = $('#captchaOperation').html().split(' '), sum = parseInt(items[0]) + parseInt(items[2]);
							return value == sum;
						}
					}
				}
			}
		}
	});
});


$(document).ready(function() {
	$('#loginForm').formValidation({
		framework: 'bootstrap',
		fields: {
			loginUsername: {
				validators: {
					notEmpty: {
						message: 'The username is required'
					}
				}
			},
			loginPassword: {
				validators: {
					notEmpty: {
						message: 'The password is required'
					}
				}
			}
		}
	});
});


$(document).ready(function() {
	$('#adminForm2').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			currentPassword: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					}
				}
			},
			newPassword: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					},
					stringLength: {
						min: 8,
						max: 30,
						message: 'The password must be 8-30 characters'
					}
				}
			},
			confirmPassword: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					},
					identical: {
						field: 'newPassword',
						message: 'Passwords do not match'
					}
				}
			}
		}
	});
});


$(document).ready(function() {
	$('#adminForm3').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			adminPassword: {
				validators: {
					notEmpty: {
						message: 'Please type your password.'
					}
				}
			}
		}
	});
});


$(document).ready(function() {
	$('#adminForm4').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			name: {
				validators: {
					notEmpty: {
						message: 'Please type your name.'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			position: {
				validators: {
					notEmpty: {
						message: 'Please type your position.'
					},
					regexp: {
						regexp: /^[a-z\s]+$/i,
						message: 'This field can only consist of alphabetical characters and spaces only'
					}
				}
			},
			contact: {
				validators: {
					notEmpty: {
						message: 'Contact no. is required'
					},
					regexp: {
						regexp: /^\d{4}-\d{3}-\d{4}$/i,
						message: 'Invalid contact number. Format: 09XX-XXX-XXXX'
					}
				}
			},
			age: {
				validators: {
					notEmpty: {
						message: 'Age is required'
					},
					integer: {
						message: 'Invalid age'
					}
				}
			},
			picture: {
				validators: {
					notEmpty: {
						message: 'Please upload an image'
					},
					file: {
                        extension: 'jpeg,jpg,png',
                        type: 'image/jpeg,image/png',
                        maxSize: 2097152,
                        message: 'The selected file is not valid'
                    }
				}
			}
		}
	});
});


$(document).ready(function() {
	$('#forgotPwForm').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			answer1: {
				validators: {
					notEmpty: {
						message: 'Please type your answer.'
					}
				}
			},
			answer2: {
				validators: {
					notEmpty: {
						message: 'Please type your answer.'
					}
				}
			},
			answer3: {
				validators: {
					notEmpty: {
						message: 'Please type your answer.'
					}
				}
			}
		}
	});
});


$(document).ready(function() {
	$('#forgotPwForm2').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			newPassword: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					},
					stringLength: {
						min: 8,
						max: 30,
						message: 'The password must be 8-30 characters'
					}
				}
			},
			confirmPassword: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					},
					identical: {
						field: 'newPassword',
						message: 'Passwords do not match'
					}
				}
			}
		}
	});
});


$(document).ready(function() {
	$('#applicantForm1').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			currentPassword: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					}
				}
			},
			newPassword: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					},
					stringLength: {
						min: 8,
						max: 30,
						message: 'The password must be 8-30 characters'
					}
				}
			},
			confirmPassword: {
				validators: {
					notEmpty: {
						message: 'This field is required'
					},
					identical: {
						field: 'newPassword',
						message: 'Passwords do not match'
					}
				}
			}
		}
	});
});


$(document).ready(function() {
	$('#applicantForm2').formValidation({
		framework: 'bootstrap',
		icon: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			applicantPassword: {
				validators: {
					notEmpty: {
						message: 'Please type your password.'
					}
				}
			}
		}
	});
});