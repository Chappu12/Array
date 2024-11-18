public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread();

        // Get the name of the thread.
        String name = thread.getName();
        System.out.println("The name of the thread is: " + name);

        // Get the priority of the thread.
        int priority = thread.getPriority();
        System.out.println("The priority of the thread is: " + priority);

        // Get the state of the thread.
        Thread.State state = thread.getState();
        System.out.println("The state of the thread is: " + state);

        // Check if the thread is a daemon thread.
        boolean isDaemon = thread.isDaemon();
        System.out.println("Is the thread a daemon thread? " + isDaemon);

        // Check if the thread has been interrupted.
        boolean isInterrupted = thread.isInterrupted();
        System.out.println("Has the thread been interrupted? " + isInterrupted);

        // Get the stack trace of the thread.
        StackTraceElement[] stackTrace = thread.getStackTrace();
        System.out.println("The stack trace of the thread is:");
        for (StackTraceElement element : stackTrace) {
            System.out.println(element);
        }

        // Get the context class loader of the thread.
        ClassLoader contextClassLoader = thread.getContextClassLoader();
        System.out.println("The context class loader of the thread is: " + contextClassLoader);
    }
}