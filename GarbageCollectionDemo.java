public class GarbageCollectionDemo {
    static class HeapObject {
        private int[] largeArray;
        private String name;

        public HeapObject(String name) {
            this.name = name;
            // Allocating memory on the heap
            this.largeArray = new int[1000000]; 
            System.out.println(name + " created!");
        }

        @Override
        protected void finalize() throws Throwable {
            // This method gets called when the object is garbage collected
            System.out.println(name + " is being garbage collected!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating objects...");
        
        // Creating objects and consuming heap memory
        HeapObject obj1 = new HeapObject("Object 1");
        HeapObject obj2 = new HeapObject("Object 2");
        HeapObject obj3 = new HeapObject("Object 3");

        System.out.println("Removing references...");
        
        // Removing references to make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;
        obj3 = null;

        // Suggesting garbage collection
        System.gc();

        // Giving GC some time to execute
        // try {
            // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        System.out.println("End of program.");
    }
}
