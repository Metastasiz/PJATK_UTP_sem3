package Task;

import java.util.Random;

public enum TaskPriority {
    High("High priority"), Med("Medium priority"), Low("Low priority");
    private final String name;
    TaskPriority(String a){name=a;}
    public static TaskPriority getRandomPriority(){
        TaskPriority[] out = TaskPriority.values();
        Random tmp = new Random();
        int tmp2 = tmp.nextInt(out.length);
        return out[tmp2];
    }
    public String toString(){return name;}
    public static void main(String[] arg){
        for (int i = 0; i < 10; i++) {
            Task test = new Task();
            Task test2 = new Task();
            System.out.println(test + " " + test2);
            System.out.println(test.compareTo(test2));
            TaskQueue q = new TaskQueue();
            q.addTask(test2);
            q.addTask(test);
            for (Task e : q.getQueue()){
                System.out.println(e);
            }
            //
            System.out.println();
        }

    }
}

