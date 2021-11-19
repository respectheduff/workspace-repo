// add pageTitle

// add groceries

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle(pageTitle, groceries) {
   pageTitle = 'My Shopping List';
   groceries = [walnuts, peanuts, ground_beef, buns, eggs, milk, butter, water, bags, bread];
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  for(i = 0 ; i < groceries.length ; i++)
  item = groceries[i];
  console.out(item + ",");
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
