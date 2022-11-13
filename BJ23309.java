import java.io.*;
import java.util.*;

public class BJ23309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        Map<Integer, Node> nodePointer = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        Node head = new Node(Integer.parseInt(st.nextToken()));
        head.next = head;
        head.prev = head;
        Node curr = head;
        nodePointer.put(head.val,head);


        for (int i = 0; i < N-1; i++) {
            Node newStation = new Node(Integer.parseInt(st.nextToken()));
            newStation.next = curr.next;
            newStation.next.prev = newStation;
            curr.next = newStation;
            newStation.prev = curr;

            nodePointer.put(newStation.val, newStation);
            curr = newStation;
        }


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int stationNo = Integer.parseInt(st.nextToken());
            Node currStation = nodePointer.get(stationNo);

            switch (cmd) {
                case "BN":
                    bw.write(currStation.next.val + "\n");
                    Node newStation = new Node(Integer.parseInt(st.nextToken()));

                    newStation.next = currStation.next;
                    newStation.next.prev = newStation;
                    currStation.next = newStation;
                    newStation.prev = currStation;

                    nodePointer.put(newStation.val, newStation);
                    break;

                case "BP":
                    bw.write(currStation.prev.val + "\n");
                    newStation = new Node(Integer.parseInt(st.nextToken()));

                    newStation.prev = currStation.prev;
                    newStation.prev.next = newStation;
                    currStation.prev = newStation;
                    newStation.next = currStation;

                    nodePointer.put(newStation.val, newStation);
                    break;

                case "CN":
                    bw.write(currStation.next.val + "\n");
                    nodePointer.remove(currStation.next.val);

                    currStation.next = currStation.next.next;
                    currStation.next.prev = currStation;
                    break;

                case "CP":
                    bw.write(currStation.prev.val + "\n");
                    nodePointer.remove(currStation.prev.val);

                    currStation.prev = currStation.prev.prev;
                    currStation.prev.next = currStation;
                    break;
            }
        }

        bw.flush();
        bw.close();
    }

    public static class Node {
        Node prev;
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
}
