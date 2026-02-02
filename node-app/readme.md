I want to build a backend with node and typescript. I will use mongodb as the database.

stack: NodeJS, ExpressJS, MongoDB, TypeScript 

I will have 2 tables for now, User -> for login and signup, and one booking table -> for booking details. No vendor APIs for now, just for user. 

booking will contain these -> Title, Location, Genre, Date, Venue, Timings, bookingId, movieId 


User will contain these -> username, encrypted password, email, session details, and past bookings(bookingIds which are in the booking table) 



