// Handle form submission
document.getElementById("submitButton").addEventListener("click", function () {
    // Get form values
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const gender = document.querySelectorAll('input[name="gender"]:checked').length > 0 ? "Male" : "Female";
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    // Display the summary in the popup
    const popupContent = document.getElementById("popupContent");
    popupContent.innerHTML = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    // Show the popup
    document.getElementById("popup").style.display = "block";

    // Reset the form
    document.getElementById("surveyForm").reset();
});

// Handle popup close button
document.getElementById("closePopup").addEventListener("click", function () {
    // Hide the popup
    document.getElementById("popup").style.display = "none";
});

// Handle reset button
document.getElementById("resetButton").addEventListener("click", function () {
    // Reset the form
    document.getElementById("surveyForm").reset();
});
