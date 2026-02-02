import mongoose from 'mongoose'

export async function connectDB() {
    const uri: any = process.env.MONGO_URI;

    if (!uri) {
        throw new Error("MONGO_URI is not defined in the .env file");
    }

    try {
        await mongoose.connect(uri);
        console.log("MongoDB Connected!")
    } catch (error) {
        console.error("MongoDB Connection Error:", error)
        throw error;
    }

}