<template>
<div class="main">

<!-- HTML -->
<h2>Product Reviews for {{ productName }}</h2> <!-- one way data binding -->
<p class="description"> {{ description }}</p> <!-- from the data to the view -->

<div class="well-display">
    <div class="well">
        <span class="amount">{{ averageRating }}</span>
        Average Rating
    </div>

    <div class="well">
        <span class="amount">{{ numberOFOneStars}}</span>
        1 Star Review{{ numberOfOneStar === 1 ? '' : 's'}}
    </div>

    <div class="well">
        <span class="amount">{{ numberOFTwoStars}}</span>
        2 Star Review
    </div>

    <div class="well">
        <span class="amount">{{ numberOFThreeStars}}</span>
        3 Star Review
    </div>

    <div class="well">
        <span class="amount">{{ numberOFFourtars}}</span>
        4 Star Review
    </div>

    <div class="well">
        <span class="amount">{{ numberOFFiveStars}}</span>
        5 Star Review
    </div>
</div>

<div class="review" v-bind:class="{ favorited : r.favorited }" v-for="r in reviews" v-bind:key="r.id"> 
<h4>{{ r.reviewer }}</h4>
<div class="rating">
    <img class="ratingStar" v-for="n in r.rating "  v-bind:key="n" src="src\assets\star.png" />

</div>

<h3> {{ r.title }}</h3>
<p> {{ r.review }}</p>
<p>Favorite? <inout tpye="checbox" v-model="r.favorited"/></p>
</div>

</div>

</template>


<script>

// JavaScript goes here
export default {
    data() {
        return {
            productName: 'Cigar parties for dummies',
            description: 'host and plan blah blah blah',
            reviews: [ 
                {
                reviewer: 'malcom gladwell',
                title: 'what a book',
                review: "its a book",
                rating: 3,
                favorited: true
                },

                {
                    reviewer:'tom',
                    title:'what a book',
                    review:"nice book",
                    rating: 5,
                    favorited: false

                }
            ]
        };
        
        },
        computed: {
            averageRating() {
                const sum = this.reviews.reduce((currentSum, review) => { return review.rating + currentSum;}, 0);
                return sum /  this.reviews.length;
            },
            numberOfOneStars() {
                let oneStars = 0;
                for (let i = 0; i < this.review.length; i++) {
                    if(this.review[i].rating === 1) {
                        oneStars++;
                    }

                }
                return oneStar;
            },
            numberOfTwoStars() {
                let twoStars = 0;
                for (let i = 0; i < this.review.length; i++) {
                    if(this.review[i].rating === 2) {
                        twoStars++;
                    }

                }
                return twoStars;
            },
            numberOfThreeStars() {
                // let threeStacks = 0;
                // this.reviews.forEach((review) => {
                //     if (review.rating === 3)
            },
            numberOfFourStars() {},
            numberOfFiveStars() {},
    }

}


</script>

<style scoped>

/* css goes here */
div.main div.well-display {
        display: flex;
    justify-content: space-around;
}

div.main div.well-display div.well {
    display: inline-block;
    width: 15%;
    border: 1px black solid;
    border-radius: 6px;
    text-align: center;
    margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
    color: darkslategray;
    display: block;
    font-size: 2.5rem;
}

div.main div.review {
    border: 1px black solid;
    border-radius: 6px;
    padding: 1rem;
    margin: 10px;
}

div.main div.review div.rating {
    height: 2rem;
    display: inline-block;
    vertical-align: top;
    margin: 0 0.5rem;
}

div.main div.review div.rating img {
    height: 100%;
}

div.main div.review p {
    margin: 20px;
}

div.main div.review h3 {
    display: inline-block;
}

div.main div.review h4 {
    font-size: 1rem;
}
div.main div.review.favorited {
    background-color: lightyellow;
}
</style>