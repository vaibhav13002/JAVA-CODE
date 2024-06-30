// Authorization token that must have been created previously. See : https://developer.spotify.com/documentation/web-api/concepts/authorization
const token = 'BQDWID1DIMjzovMYN7mVXSTsyf2Z5eMidxuCassj_JxJYINDhz-sSTzc6HeHJQE6ie2KYjaDnZVfx2Wl9RUVMHfAR7vwedYTVTwlkOdDmh9o5Szy172lkHd1u4NAYY48eejINRAD9BA-r_8PHX0R7RDyZiOc9czlyfDekKcQf3s9kkkuJWvcOb68EUB_GVE1XqjVdGr3neL_WWV0mWWjPR9zG4RctSA8-E2MKhKA1ZTKhbq4p3yLcOlyy1Xf_9f7wUq7YBatWPzNaDtMjkyh';
async function fetchWebApi(endpoint, method, body) {
  const res = await fetch(`https://api.spotify.com/${endpoint}`, {
    headers: {
      Authorization: `Bearer ${token}`,
    },
    method,
    body:JSON.stringify(body)
  });
  return await res.json();
}

async function getTopTracks(){
  // Endpoint reference : https://developer.spotify.com/documentation/web-api/reference/get-users-top-artists-and-tracks
  return (await fetchWebApi(
    'v1/me/top/tracks?time_range=long_term&limit=5', 'GET'
  )).items;
}

const topTracks = await getTopTracks();
console.log(
  topTracks?.map(
    ({name, artists}) =>
      `${name} by ${artists.map(artist => artist.name).join(', ')}`
  )
);