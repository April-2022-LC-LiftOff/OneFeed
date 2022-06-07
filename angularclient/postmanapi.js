var {bearer} = require('./tokens.json')
var axios = require('axios');

var config = {
  method: 'get',
  url: 'https://api.twitter.com/2/tweets/1533596594888581120?tweet.fields=created_at,attachments&expansions=author_id',
  headers: {
    'Authorization': bearer,
    'Cookie': 'guest_id=v1%3A165457756791835585; guest_id_ads=v1%3A165457756791835585; guest_id_marketing=v1%3A165457756791835585; personalization_id="v1_6zDcf3UQOvkVhSidzEHtJg=="'
  }
};

axios(config)
.then(function (response) {
  console.log(JSON.stringify(response.data));
})
.catch(function (error) {
  console.log(error);
});
