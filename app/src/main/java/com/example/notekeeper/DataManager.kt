package com.example.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    //You need this "init" block of code to initialize a function immediate the application runs
    init{
        //This is where you initialize the function by declaring it's name
        initializeCourses()
    }

    private fun initializeCourses() {
        var course= CourseInfo("android_intents", "Android programming with Intents")
        //The ".set" works with "Hashmaps" and it helps in mapping the parameters declared
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo("Java Fundamentals: The Java Language", "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "The Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }
}