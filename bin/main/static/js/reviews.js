const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		const res = JSON.parse(xhr.response)
		const container = document.querySelector('.container')

		console.log({res})

		res.forEach(function(review) {
			const reviewItem = document.createElement('div')

			const name = document.createElement('h2')
			name.innerText = review.name;

			const description = document.createElement('p')
			description.innerText = review.description

			const categories = [];
			review.categoriesUrls.forEach(categoryUrl => {
				const categoryUrlElement = document.createElement('li')
				categoryUrlElement.innerHTML = `review topics: <a href="${categoryUrl}">${categoryUrl}</a>`
				categories.push(categoryUrlElement)
			})

			container.appendChild(reviewItem)
			courseItem.appendChild(name)
			courseItem.appendChild(description)

			categories.forEach(categoryUrl => reviewItem.appendChild(categoryUrl))

		});
	}
}

xhr.open('GET', 'http://localhost:8080/reviews', true)
xhr.send()